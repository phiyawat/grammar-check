import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class AdjustSimpleSQLMessage extends SimpleSQLBaseVisitor<String> {
    public static String identifier = "";
    public static String bool = "";

    @Override
    public String visitR(SimpleSQLParser.RContext ctx) {
        //System.out.println("start");
        return visitChildren(ctx);
    }

    @Override
    public String visitStatement(SimpleSQLParser.StatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitLetter(SimpleSQLParser.LetterContext ctx) {
        identifier += ctx.identifier().getText() + " ";
        bool += ctx.relational_operators().getText() + " ";
        return visitChildren(ctx);
    }

} // end class AdjustHelloMessage

public class SimpleSQLEval {
    public static void main(String[] args) throws Exception {

        ANTLRInputStream input = new ANTLRInputStream(System.in);
        SimpleSQLLexer lexer = new SimpleSQLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SimpleSQLParser parser = new SimpleSQLParser(tokens);
        ParseTree tree = parser.r(); // begin parsing at rule 'r'
        AdjustSimpleSQLMessage newmsg = new AdjustSimpleSQLMessage();
        System.out.println(newmsg.visit(tree));

        //System.out.println(newmsg.identifier);
        String[] s = newmsg.bool.split(" ");

        String set = s[1];
        //System.out.println("set: " + set);

        String csvFile = "people.csv";
        BufferedReader br = null;
        String line = "";

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] select = line.split(",");
                //System.out.println("select0: "+select[0]);
                // System.out.println("set: "+set[0]);
                if (select[0].equals(set)) {
                    System.out.println(select[0] + ", " + select[1] + ", " + select[2]);
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

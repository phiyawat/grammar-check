// Generated from SimpleSQL.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleSQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, INTEGER=13, REAL=14, ID=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "INTEGER", "REAL", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "' \"'", "'\"'", "' OR '", "' AND '", "'>'", "'>='", 
		"'<'", "'<='", "'='", "'<>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "INTEGER", "REAL", "ID", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SimpleSQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleSQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u00a4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3"+
		"\16\7\16H\n\16\f\16\16\16K\13\16\3\16\6\16N\n\16\r\16\16\16O\3\16\7\16"+
		"S\n\16\f\16\16\16V\13\16\3\17\7\17Y\n\17\f\17\16\17\\\13\17\3\17\6\17"+
		"_\n\17\r\17\16\17`\3\17\3\17\6\17e\n\17\r\17\16\17f\3\17\7\17j\n\17\f"+
		"\17\16\17m\13\17\3\20\7\20p\n\20\f\20\16\20s\13\20\3\20\6\20v\n\20\r\20"+
		"\16\20w\3\20\6\20{\n\20\r\20\16\20|\7\20\177\n\20\f\20\16\20\u0082\13"+
		"\20\3\20\7\20\u0085\n\20\f\20\16\20\u0088\13\20\3\20\3\20\3\20\7\20\u008d"+
		"\n\20\f\20\16\20\u0090\13\20\6\20\u0092\n\20\r\20\16\20\u0093\5\20\u0096"+
		"\n\20\3\21\7\21\u0099\n\21\f\21\16\21\u009c\13\21\3\21\6\21\u009f\n\21"+
		"\r\21\16\21\u00a0\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\6\3\2\62;\4\2C\\c|\5"+
		"\2\62;C\\c|\4\2\13\f\17\17\2\u00b4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7\'\3\2\2\2\t*\3\2\2"+
		"\2\13,\3\2\2\2\r\61\3\2\2\2\17\67\3\2\2\2\219\3\2\2\2\23<\3\2\2\2\25>"+
		"\3\2\2\2\27A\3\2\2\2\31C\3\2\2\2\33I\3\2\2\2\35Z\3\2\2\2\37\u0095\3\2"+
		"\2\2!\u009a\3\2\2\2#$\7*\2\2$\4\3\2\2\2%&\7+\2\2&\6\3\2\2\2\'(\7\"\2\2"+
		"()\7$\2\2)\b\3\2\2\2*+\7$\2\2+\n\3\2\2\2,-\7\"\2\2-.\7Q\2\2./\7T\2\2/"+
		"\60\7\"\2\2\60\f\3\2\2\2\61\62\7\"\2\2\62\63\7C\2\2\63\64\7P\2\2\64\65"+
		"\7F\2\2\65\66\7\"\2\2\66\16\3\2\2\2\678\7@\2\28\20\3\2\2\29:\7@\2\2:;"+
		"\7?\2\2;\22\3\2\2\2<=\7>\2\2=\24\3\2\2\2>?\7>\2\2?@\7?\2\2@\26\3\2\2\2"+
		"AB\7?\2\2B\30\3\2\2\2CD\7>\2\2DE\7@\2\2E\32\3\2\2\2FH\7\"\2\2GF\3\2\2"+
		"\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JM\3\2\2\2KI\3\2\2\2LN\t\2\2\2ML\3\2\2"+
		"\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PT\3\2\2\2QS\7\"\2\2RQ\3\2\2\2SV\3\2\2"+
		"\2TR\3\2\2\2TU\3\2\2\2U\34\3\2\2\2VT\3\2\2\2WY\7\"\2\2XW\3\2\2\2Y\\\3"+
		"\2\2\2ZX\3\2\2\2Z[\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2]_\t\2\2\2^]\3\2\2\2_`"+
		"\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bd\7\60\2\2ce\t\2\2\2dc\3\2\2\2"+
		"ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gk\3\2\2\2hj\7\"\2\2ih\3\2\2\2jm\3\2\2\2"+
		"ki\3\2\2\2kl\3\2\2\2l\36\3\2\2\2mk\3\2\2\2np\7\"\2\2on\3\2\2\2ps\3\2\2"+
		"\2qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2sq\3\2\2\2tv\t\3\2\2ut\3\2\2\2vw\3\2\2"+
		"\2wu\3\2\2\2wx\3\2\2\2x\u0080\3\2\2\2y{\t\2\2\2zy\3\2\2\2{|\3\2\2\2|z"+
		"\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~z\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2"+
		"\2\2\u0080\u0081\3\2\2\2\u0081\u0086\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0085\7\"\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u0096\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u0091\7a\2\2\u008a\u008e\t\4\2\2\u008b\u008d\7\"\2\2\u008c\u008b\3\2"+
		"\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u008a\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095"+
		"q\3\2\2\2\u0095\u0089\3\2\2\2\u0096 \3\2\2\2\u0097\u0099\7\"\2\2\u0098"+
		"\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009f\t\5\2\2\u009e"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\b\21\2\2\u00a3\"\3\2\2\2\24\2IOT"+
		"Z`fkqw|\u0080\u0086\u008e\u0093\u0095\u009a\u00a0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
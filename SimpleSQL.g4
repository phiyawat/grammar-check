grammar SimpleSQL;

r: (statement)* ;
statement:	statement and_operator statement  | statement or_operator statement | bracket | (letter)+;
bracket: '(' statement ')' ;

letter: identifier relational_operators ;
identifier: (string)+ ;
inputString: (' "'|'"') (string)+ '"';
inputNumberic: (INTEGER)+;
inputReal: (REAL)+;
string: ID;

or_operator: ' OR ';
and_operator: ' AND ';
relational_operators: ('>'|'>='|'<'|'<=') (inputNumberic | inputReal) | ('='|'<>') inputString ;

INTEGER: (' ')* [0-9]+ (' ')* ;
REAL: (' ')* [0-9]+('.')[0-9]+ (' ')* ;
ID: ((' ') * [a-zA-Z]+ ([0-9]+)*) (' ')*  | '_'([0-9a-zA-Z] (' ')* )+ ; 
WS: (' ') * [\t\r\n]+ -> skip ;  // skip spaces, tabs, newlines 



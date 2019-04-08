grammar Pascalet;

program
    : PROGRAM identifier SEMI block DOT
    ;

block
    :   (varDefBlock|constDefBlock|procAndFuncDefBlock)* compoundStatement
    ;

simpleStatement
    :   assignmentStatement
    |   procedureStatement
    |   builtInFuncStatement
    |   functionDesignator
    |   emptyStatement
    |   mathFuncStatement
    |   ordFuncStatement
    ;

builtInFuncStatement
    :   WRITELN LPAREN (variable|unsignedConstant|expression) RPAREN
    |   WRITE LPAREN (variable|unsignedConstant|expression) RPAREN
    |   READLN LPAREN variable RPAREN
    ;

mathFuncStatement
    :   ABS LPAREN (variable|unsignedConstant|expression) RPAREN
    |   INC LPAREN (variable|unsignedConstant|expression) RPAREN
    |   DEC LPAREN (variable|unsignedConstant|expression) RPAREN
    |   ARCTAN LPAREN (variable|unsignedConstant|expression) RPAREN
    |   COS LPAREN (variable|unsignedConstant|expression) RPAREN
    |   LN LPAREN (variable|unsignedConstant|expression) RPAREN
    |   ROUND LPAREN (variable|unsignedConstant|expression) RPAREN
    |   SIN LPAREN (variable|unsignedConstant|expression) RPAREN
    |   SQR LPAREN (variable|unsignedConstant|expression) RPAREN
    |   SQRT LPAREN (variable|unsignedConstant|expression) RPAREN
    |   TRUNC LPAREN (variable|unsignedConstant|expression) RPAREN
    |   EXP LPAREN (variable|unsignedConstant|expression) RPAREN
    ;

ordFuncStatement
    :   CHR LPAREN (variable|unsignedConstant|expression) RPAREN
    |   ORD LPAREN (variable|unsignedConstant|expression) RPAREN
    |   PRED LPAREN (variable|unsignedConstant|expression) RPAREN
    |   SUCC LPAREN (variable|unsignedConstant|expression) RPAREN
    ;

structuredStatement
    :    compoundStatement
    |    ifStatement
    |    forStatement
    |    whileStatement
    |    repeatStatement
    ;

ifStatement
    :   IF expression THEN statement (: ELSE statement)?
    ;

forStatement
    :   FOR variable ASSIGN forList DO statement
    ;

whileStatement
   :    WHILE expression DO statement
   ;

repeatStatement
  :     REPEAT statements UNTIL expression
  ;

forList
    :   initialValue op=(TO | DOWNTO) finalValue
    ;

initialValue
    :   expression
    ;

finalValue
    :   expression
    ;

compoundStatement
    :   BEGIN statements END
    ;

statements
    :   statement (SEMI statement)*
    ;

statement
    :   INT COLON unlabelledStatement
    |   unlabelledStatement
    ;

unlabelledStatement
    :   simpleStatement
    |   structuredStatement
    ;

emptyStatement
    :
    ;

varDefBlock
    :   VAR varDef (SEMI varDef)* SEMI
    ;

varDef
    :   identifier (COMMA identifier)* COLON type
    ;

variable
    :   IDENT
    |   IDENT LBRACK constant RBRACK
    ;

constDefBlock
    :   CONST (constDef SEMI) +
    ;

constDef
    :    variable EQUAL constant
    ;

procAndFuncDefBlock
    :   procAndFuncDef SEMI
    ;

procAndFuncDef
    :   procedureDeclaration
    |   functionDeclaration
    ;

procedureDeclaration
    :   PROCEDURE variable (formalParameterList)? SEMI block
    ;

procedureStatement
    :   variable (LPAREN parameterList RPAREN)?
    ;

formalParameterList
    :   LPAREN parameterGroup (SEMI parameterGroup)* RPAREN
    ;

parameterGroup
    :   identifier (COMMA identifier)* COLON type
    ;

functionDeclaration
    :   FUNCTION identifier (formalParameterList)? COLON resultType SEMI block
    ;

resultType
    :   type
    ;

arrayType
    :   ARRAY LBRACK constant DOTDOT constant RBRACK OF type
    ;

type
    :   (DOUBLE | CHARACTER | BOOLEAN | INTEGER | STRING)
    |   arrayType
    ;

multiplicativeoperator
   :    STAR
   |    SLASH
   |    DIV
   |    MOD
   |    AND
   ;

additiveoperator
   :    PLUS
   |    MINUS
   |    OR
   ;

relationaloperator
   : EQUAL
   | NOT_EQUAL
   | LT
   | LE
   | GE
   | GT
   ;

assignmentStatement
    :     variable ASSIGN expression
    ;

expression
    :   simpleExpression (relationaloperator expression)?
    ;

simpleExpression
    :   term (additiveoperator simpleExpression)?
    ;

term
    :   signedFactor (multiplicativeoperator term)?
    ;

signedFactor
    :   op=(PLUS | MINUS)? factor
    ;

factor
    :   variable
    |   LPAREN expression RPAREN
    |   functionDesignator
    |   unsignedConstant
    |   NOT factor
    |   BOOL
    |   mathFuncStatement
    |   ordFuncStatement
    ;

unsignedConstant
    :   unsignedNumber
    |   CHAR
    |   STR
    |   NIL
    ;

functionDesignator
    :   variable LPAREN parameterList RPAREN
    ;

parameterList
    :   actualParameter (COMMA actualParameter)*
    ;

parameterwidth
    :   COLON expression
    ;

actualParameter
    :    expression parameterwidth*
    ;

constant
    :    unsignedNumber
    |    op=(PLUS|MINUS) unsignedNumber
    |    variable
    |    op=(PLUS|MINUS) variable
    |    STR
    |    CHAR
    ;

unsignedNumber
    :   INT
    |   RNUM
    ;

identifier
    :   IDENT
    ;
//    Lexical rules
INC
    :   I N C
    ;
DEC
    :   D E C
    ;
ABS
    :  A B S
    ;
CHR
    :   C H R
    ;
ARCTAN
    :   A R C T A N
    ;
COS
    :   C O S
    ;
LN
    :   L N
    ;
ROUND
    :   R O U N D
    ;
SIN
    :   S I N
    ;
SQR
    :   S Q R
    ;
SQRT
    :   S Q R T
    ;
TRUNC
    :   T R U N C
    ;
EXP
    :   E X P
    ;
ORD
    :   O R D
    ;
PRED
    :   P R E D
    ;
SUCC
    :   S U C C
    ;
DOUBLE
    :   R E A L
    ;
WRITELN
    :   W R I T E L N
    ;
WRITE
    :   W R I T E
    ;
READLN
    :   R E A D L N
    ;
PROGRAM
    :   P R O G R A M
    ;
FUNCTION
    :   F U N C T I O N
    ;
PROCEDURE
    :   P R O C E D U R E
    ;
BEGIN
    :   B E G I N
    ;
END
    :   E N D
    ;
IF
    :   I F
    ;
OF
    :   O F
    ;
THEN
    :   T H E N
    ;
ELSE
    :   E L S E
    ;
TO
    :   T O
    ;
FOR
    :   F O R
    ;
WHILE
    :   W H I L E
    ;
REPEAT
    :   R E P E A T
    ;
UNTIL
    :   U N T I L
    ;
DOWNTO
    :   D O W N T O
    ;
DO
    :   D O
    ;
CONST
    :   C O N S T
    ;
VAR
    :   V A R
    ;
NIL
    :   N I L
    ;
NOT
    :   N O T
    ;
CHARACTER
    :   C H A R
    ;
BOOLEAN
    :   B O O L E A N
    ;
BOOL
    :   T R U E
    |   F A L S E
    ;
INTEGER
    :   I N T E G E R
    ;
ARRAY
    :   A R R A Y
    ;
STRING
    :   S T R I N G
    ;
DIV
    :   D I V
    ;
MOD
    :   M O D
    ;
AND
    :   A N D
    ;
OR
    :   O R
    ;
IDENT
    :   [a-zA-Z] [a-zA-Z0-9_]*
    ;
STR
    :   '\'' ('\'\'' | ~ ('\''))* '\''
    ;
CHAR
    :   '\'' ('\'\'' | ~ ('\'')) '\''
    ;
INT
    :   [0-9]+
    ;
RNUM
    :   ('0' .. '9') + (('.' ('0' .. '9') + (EXPONENT)?)? | EXPONENT)
    ;
EQUAL
    :   '='
    ;
NOT_EQUAL
    :   '<>'
    ;
LT
    :   '<'
    ;
LE
    :   '<='
    ;
GE
    :   '>='
    ;
GT
    :   '>'
    ;
PLUS
    :   '+'
    ;
MINUS
    :   '-'
    ;
STAR
    :   '*'
    ;
SLASH
    :   '/'
    ;
ASSIGN
    :   ':='
    ;
SEMI
    :   ';'
    ;
COMMA
    :   ','
    ;
COLON
    :   ':'
    ;
DOT
    :   '.'
    ;
DOTDOT
    :   '..'
    ;
LPAREN
    :   '('
    ;
RPAREN
    :   ')'
    ;
LBRACK
    :   '['
    ;
RBRACK
    :   ']'
    ;
LBRACK2
    :   '(.'
    ;
RBRACK2
    :   '.)'
    ;
fragment EXPONENT
    :   ('e') ('+' | '-')? ('0' .. '9')
    ;
fragment A :   [aA] ;
fragment B :   [bB] ;
fragment C :   [cC] ;
fragment D :   [dD] ;
fragment E :   [eE] ;
fragment F :   [fF] ;
fragment G :   [gG] ;
fragment H :   [hH] ;
fragment I :   [iI] ;
fragment J :   [jJ] ;
fragment K :   [kK] ;
fragment L :   [lL] ;
fragment M :   [mM] ;
fragment N :   [nN] ;
fragment O :   [oO] ;
fragment P :   [pP] ;
fragment Q :   [qQ] ;
fragment R :   [rR] ;
fragment S :   [sS] ;
fragment T :   [tT] ;
fragment U :   [uU] ;
fragment V :   [vV] ;
fragment W :   [wW] ;
fragment X :   [xX] ;
fragment Y :   [yY] ;
fragment Z :   [zZ] ;

COMMENT_1
    :   '(*' .*? '*)' -> skip
    ;

COMMENT_2
    :    '{' .*? '}' -> skip
    ;

COMMENT_3
    :   '//' .*? -> skip
    ;
WS
    :   [ \t\r\n] -> skip
    ;
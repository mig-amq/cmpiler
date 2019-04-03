grammar Pascalet;

program
    : PROGRAM identifier SEMI block DOT
    ;

block
    :   (varDefBlock|constDefBlock|procAndFuncDefBlock)* compoundStatement
    ;

simpleStatement
    :   assignmentStatement
    |   builtInFuncStatement
    |   emptyStatement
    ;

builtInFuncStatement
    :   WRITELN LPAREN (unsignedConstant|expression|variable) RPAREN
    |   WRITE LPAREN (unsignedConstant|expression|variable) RPAREN
    |   READLN LPAREN variable RPAREN
    ;

structuredStatement
    :    compoundStatement
    |    ifStatement
    |    forStatement
    ;

ifStatement
    :   IF expression THEN statement (: ELSE statement)?
    ;

forStatement
    :   FOR variable ASSIGN forList DO statement
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
    :   IDENT #regularVar
    |   IDENT LBRACK constant RBRACK #arrayVar
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
    :   (CHARACTER | BOOLEAN | INTEGER | STRING | REAL)
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
    ;

unsignedConstant
    :   unsignedNumber
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
    ;

unsignedNumber
    :   INT
    |   REAL_NUM
    ;
identifier
    :   IDENT
    ;
//    Lexical rules
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
CHAR
    :   '\'' [a-zA-Z0-9] '\''
    ;
INT
    :   [0-9]+
    ;
STR
    :   '\''.*?'\''
    ;
REAL
    :   R E A L
    ;
REAL_NUM
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

WS
    :   [ \t\r\n] -> skip
    ;
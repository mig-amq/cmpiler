// Generated from C:\Users\Miguel\Desktop\Pascalet\src\com\cmpiler\grammar\Pascalet.g4 by ANTLR 4.7.2
package com.cmpiler.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascaletParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INC=1, DEC=2, ABS=3, CHR=4, ARCTAN=5, COS=6, LN=7, ROUND=8, SIN=9, SQR=10, 
		SQRT=11, TRUNC=12, EXP=13, ORD=14, PRED=15, SUCC=16, DOUBLE=17, WRITELN=18, 
		WRITE=19, READLN=20, PROGRAM=21, FUNCTION=22, PROCEDURE=23, BEGIN=24, 
		END=25, IF=26, OF=27, THEN=28, ELSE=29, TO=30, FOR=31, WHILE=32, REPEAT=33, 
		UNTIL=34, DOWNTO=35, DO=36, CONST=37, VAR=38, NIL=39, NOT=40, CHARACTER=41, 
		BOOLEAN=42, BOOL=43, INTEGER=44, ARRAY=45, STRING=46, DIV=47, MOD=48, 
		AND=49, OR=50, IDENT=51, STR=52, CHAR=53, INT=54, RNUM=55, EQUAL=56, NOT_EQUAL=57, 
		LT=58, LE=59, GE=60, GT=61, PLUS=62, MINUS=63, STAR=64, SLASH=65, ASSIGN=66, 
		SEMI=67, COMMA=68, COLON=69, DOT=70, DOTDOT=71, LPAREN=72, RPAREN=73, 
		LBRACK=74, RBRACK=75, LBRACK2=76, RBRACK2=77, COMMENT_1=78, COMMENT_2=79, 
		COMMENT_3=80, WS=81;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_simpleStatement = 2, RULE_builtInFuncStatement = 3, 
		RULE_mathFuncStatement = 4, RULE_ordFuncStatement = 5, RULE_structuredStatement = 6, 
		RULE_ifStatement = 7, RULE_forStatement = 8, RULE_whileStatement = 9, 
		RULE_repeatStatement = 10, RULE_forList = 11, RULE_initialValue = 12, 
		RULE_finalValue = 13, RULE_compoundStatement = 14, RULE_statements = 15, 
		RULE_statement = 16, RULE_unlabelledStatement = 17, RULE_emptyStatement = 18, 
		RULE_varDefBlock = 19, RULE_varDef = 20, RULE_variable = 21, RULE_constDefBlock = 22, 
		RULE_constDef = 23, RULE_procAndFuncDefBlock = 24, RULE_procAndFuncDef = 25, 
		RULE_procedureDeclaration = 26, RULE_procedureStatement = 27, RULE_formalParameterList = 28, 
		RULE_parameterGroup = 29, RULE_functionDeclaration = 30, RULE_resultType = 31, 
		RULE_arrayType = 32, RULE_type = 33, RULE_multiplicativeoperator = 34, 
		RULE_additiveoperator = 35, RULE_relationaloperator = 36, RULE_assignmentStatement = 37, 
		RULE_expression = 38, RULE_simpleExpression = 39, RULE_term = 40, RULE_signedFactor = 41, 
		RULE_factor = 42, RULE_unsignedConstant = 43, RULE_functionDesignator = 44, 
		RULE_parameterList = 45, RULE_parameterwidth = 46, RULE_actualParameter = 47, 
		RULE_constant = 48, RULE_unsignedNumber = 49, RULE_identifier = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "simpleStatement", "builtInFuncStatement", "mathFuncStatement", 
			"ordFuncStatement", "structuredStatement", "ifStatement", "forStatement", 
			"whileStatement", "repeatStatement", "forList", "initialValue", "finalValue", 
			"compoundStatement", "statements", "statement", "unlabelledStatement", 
			"emptyStatement", "varDefBlock", "varDef", "variable", "constDefBlock", 
			"constDef", "procAndFuncDefBlock", "procAndFuncDef", "procedureDeclaration", 
			"procedureStatement", "formalParameterList", "parameterGroup", "functionDeclaration", 
			"resultType", "arrayType", "type", "multiplicativeoperator", "additiveoperator", 
			"relationaloperator", "assignmentStatement", "expression", "simpleExpression", 
			"term", "signedFactor", "factor", "unsignedConstant", "functionDesignator", 
			"parameterList", "parameterwidth", "actualParameter", "constant", "unsignedNumber", 
			"identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'='", "'<>'", "'<'", 
			"'<='", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "':='", "';'", "','", 
			"':'", "'.'", "'..'", "'('", "')'", "'['", "']'", "'(.'", "'.)'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INC", "DEC", "ABS", "CHR", "ARCTAN", "COS", "LN", "ROUND", "SIN", 
			"SQR", "SQRT", "TRUNC", "EXP", "ORD", "PRED", "SUCC", "DOUBLE", "WRITELN", 
			"WRITE", "READLN", "PROGRAM", "FUNCTION", "PROCEDURE", "BEGIN", "END", 
			"IF", "OF", "THEN", "ELSE", "TO", "FOR", "WHILE", "REPEAT", "UNTIL", 
			"DOWNTO", "DO", "CONST", "VAR", "NIL", "NOT", "CHARACTER", "BOOLEAN", 
			"BOOL", "INTEGER", "ARRAY", "STRING", "DIV", "MOD", "AND", "OR", "IDENT", 
			"STR", "CHAR", "INT", "RNUM", "EQUAL", "NOT_EQUAL", "LT", "LE", "GE", 
			"GT", "PLUS", "MINUS", "STAR", "SLASH", "ASSIGN", "SEMI", "COMMA", "COLON", 
			"DOT", "DOTDOT", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "LBRACK2", "RBRACK2", 
			"COMMENT_1", "COMMENT_2", "COMMENT_3", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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

	@Override
	public String getGrammarFileName() { return "Pascalet.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PascaletParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(PascaletParser.PROGRAM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PascaletParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PascaletParser.DOT, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(PROGRAM);
			setState(103);
			identifier();
			setState(104);
			match(SEMI);
			setState(105);
			block();
			setState(106);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public List<VarDefBlockContext> varDefBlock() {
			return getRuleContexts(VarDefBlockContext.class);
		}
		public VarDefBlockContext varDefBlock(int i) {
			return getRuleContext(VarDefBlockContext.class,i);
		}
		public List<ConstDefBlockContext> constDefBlock() {
			return getRuleContexts(ConstDefBlockContext.class);
		}
		public ConstDefBlockContext constDefBlock(int i) {
			return getRuleContext(ConstDefBlockContext.class,i);
		}
		public List<ProcAndFuncDefBlockContext> procAndFuncDefBlock() {
			return getRuleContexts(ProcAndFuncDefBlockContext.class);
		}
		public ProcAndFuncDefBlockContext procAndFuncDefBlock(int i) {
			return getRuleContext(ProcAndFuncDefBlockContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << PROCEDURE) | (1L << CONST) | (1L << VAR))) != 0)) {
				{
				setState(111);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(108);
					varDefBlock();
					}
					break;
				case CONST:
					{
					setState(109);
					constDefBlock();
					}
					break;
				case FUNCTION:
				case PROCEDURE:
					{
					setState(110);
					procAndFuncDefBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleStatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public ProcedureStatementContext procedureStatement() {
			return getRuleContext(ProcedureStatementContext.class,0);
		}
		public BuiltInFuncStatementContext builtInFuncStatement() {
			return getRuleContext(BuiltInFuncStatementContext.class,0);
		}
		public FunctionDesignatorContext functionDesignator() {
			return getRuleContext(FunctionDesignatorContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public MathFuncStatementContext mathFuncStatement() {
			return getRuleContext(MathFuncStatementContext.class,0);
		}
		public OrdFuncStatementContext ordFuncStatement() {
			return getRuleContext(OrdFuncStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitSimpleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitSimpleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simpleStatement);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				procedureStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				builtInFuncStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				functionDesignator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
				emptyStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(123);
				mathFuncStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(124);
				ordFuncStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuiltInFuncStatementContext extends ParserRuleContext {
		public TerminalNode WRITELN() { return getToken(PascaletParser.WRITELN, 0); }
		public TerminalNode LPAREN() { return getToken(PascaletParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PascaletParser.RPAREN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public UnsignedConstantContext unsignedConstant() {
			return getRuleContext(UnsignedConstantContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode WRITE() { return getToken(PascaletParser.WRITE, 0); }
		public TerminalNode READLN() { return getToken(PascaletParser.READLN, 0); }
		public BuiltInFuncStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInFuncStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterBuiltInFuncStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitBuiltInFuncStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitBuiltInFuncStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuiltInFuncStatementContext builtInFuncStatement() throws RecognitionException {
		BuiltInFuncStatementContext _localctx = new BuiltInFuncStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_builtInFuncStatement);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WRITELN:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(WRITELN);
				setState(128);
				match(LPAREN);
				setState(132);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(129);
					variable();
					}
					break;
				case 2:
					{
					setState(130);
					unsignedConstant();
					}
					break;
				case 3:
					{
					setState(131);
					expression();
					}
					break;
				}
				setState(134);
				match(RPAREN);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(WRITE);
				setState(137);
				match(LPAREN);
				setState(141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(138);
					variable();
					}
					break;
				case 2:
					{
					setState(139);
					unsignedConstant();
					}
					break;
				case 3:
					{
					setState(140);
					expression();
					}
					break;
				}
				setState(143);
				match(RPAREN);
				}
				break;
			case READLN:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				match(READLN);
				setState(146);
				match(LPAREN);
				setState(147);
				variable();
				setState(148);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathFuncStatementContext extends ParserRuleContext {
		public TerminalNode ABS() { return getToken(PascaletParser.ABS, 0); }
		public TerminalNode LPAREN() { return getToken(PascaletParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PascaletParser.RPAREN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public UnsignedConstantContext unsignedConstant() {
			return getRuleContext(UnsignedConstantContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(PascaletParser.INC, 0); }
		public TerminalNode DEC() { return getToken(PascaletParser.DEC, 0); }
		public TerminalNode ARCTAN() { return getToken(PascaletParser.ARCTAN, 0); }
		public TerminalNode COS() { return getToken(PascaletParser.COS, 0); }
		public TerminalNode LN() { return getToken(PascaletParser.LN, 0); }
		public TerminalNode ROUND() { return getToken(PascaletParser.ROUND, 0); }
		public TerminalNode SIN() { return getToken(PascaletParser.SIN, 0); }
		public TerminalNode SQR() { return getToken(PascaletParser.SQR, 0); }
		public TerminalNode SQRT() { return getToken(PascaletParser.SQRT, 0); }
		public TerminalNode TRUNC() { return getToken(PascaletParser.TRUNC, 0); }
		public TerminalNode EXP() { return getToken(PascaletParser.EXP, 0); }
		public MathFuncStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathFuncStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterMathFuncStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitMathFuncStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitMathFuncStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathFuncStatementContext mathFuncStatement() throws RecognitionException {
		MathFuncStatementContext _localctx = new MathFuncStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mathFuncStatement);
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABS:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(ABS);
				setState(153);
				match(LPAREN);
				setState(157);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(154);
					variable();
					}
					break;
				case 2:
					{
					setState(155);
					unsignedConstant();
					}
					break;
				case 3:
					{
					setState(156);
					expression();
					}
					break;
				}
				setState(159);
				match(RPAREN);
				}
				break;
			case INC:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(INC);
				setState(162);
				match(LPAREN);
				setState(166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(163);
					variable();
					}
					break;
				case 2:
					{
					setState(164);
					unsignedConstant();
					}
					break;
				case 3:
					{
					setState(165);
					expression();
					}
					break;
				}
				setState(168);
				match(RPAREN);
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(DEC);
				setState(171);
				match(LPAREN);
				setState(175);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(172);
					variable();
					}
					break;
				case 2:
					{
					setState(173);
					unsignedConstant();
					}
					break;
				case 3:
					{
					setState(174);
					expression();
					}
					break;
				}
				setState(177);
				match(RPAREN);
				}
				break;
			case ARCTAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				match(ARCTAN);
				setState(180);
				match(LPAREN);
				setState(184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(181);
					variable();
					}
					break;
				case 2:
					{
					setState(182);
					unsignedConstant();
					}
					break;
				case 3:
					{
					setState(183);
					expression();
					}
					break;
				}
				setState(186);
				match(RPAREN);
				}
				break;
			case COS:
				enterOuterAlt(_localctx, 5);
				{
				setState(188);
				match(COS);
				setState(189);
				match(LPAREN);
				setState(193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(190);
					variable();
					}
					break;
				case 2:
					{
					setState(191);
					unsignedConstant();
					}
					break;
				case 3:
					{
					setState(192);
					expression();
					}
					break;
				}
				setState(195);
				match(RPAREN);
				}
				break;
			case LN:
				enterOuterAlt(_localctx, 6);
				{
				setState(197);
				match(LN);
				setState(198);
				match(LPAREN);
				setState(202);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(199);
					variable();
					}
					break;
				case 2:
					{
					setState(200);
					unsignedConstant();
					}
					break;
				case 3:
					{
					setState(201);
					expression();
					}
					break;
				}
				setState(204);
				match(RPAREN);
				}
				break;
			case ROUND:
				enterOuterAlt(_localctx, 7);
				{
				setState(206);
				match(ROUND);
				setState(207);
				match(LPAREN);
				setState(211);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(208);
					variable();
					}
					break;
				case 2:
					{
					setState(209);
					unsignedConstant();
					}
					break;
				case 3:
					{
					setState(210);
					expression();
					}
					break;
				}
				setState(213);
				match(RPAREN);
				}
				break;
			case SIN:
				enterOuterAlt(_localctx, 8);
				{
				setState(215);
				match(SIN);
				setState(216);
				match(LPAREN);
				setState(220);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(217);
					variable();
					}
					break;
				case 2:
					{
					setState(218);
					unsignedConstant();
					}
					break;
				case 3:
					{
					setState(219);
					expression();
					}
					break;
				}
				setState(222);
				match(RPAREN);
				}
				break;
			case SQR:
				enterOuterAlt(_localctx, 9);
				{
				setState(224);
				match(SQR);
				setState(225);
				match(LPAREN);
				setState(229);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(226);
					variable();
					}
					break;
				case 2:
					{
					setState(227);
					unsignedConstant();
					}
					break;
				case 3:
					{
					setState(228);
					expression();
					}
					break;
				}
				setState(231);
				match(RPAREN);
				}
				break;
			case SQRT:
				enterOuterAlt(_localctx, 10);
				{
				setState(233);
				match(SQRT);
				setState(234);
				match(LPAREN);
				setState(238);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(235);
					variable();
					}
					break;
				case 2:
					{
					setState(236);
					unsignedConstant();
					}
					break;
				case 3:
					{
					setState(237);
					expression();
					}
					break;
				}
				setState(240);
				match(RPAREN);
				}
				break;
			case TRUNC:
				enterOuterAlt(_localctx, 11);
				{
				setState(242);
				match(TRUNC);
				setState(243);
				match(LPAREN);
				setState(247);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(244);
					variable();
					}
					break;
				case 2:
					{
					setState(245);
					unsignedConstant();
					}
					break;
				case 3:
					{
					setState(246);
					expression();
					}
					break;
				}
				setState(249);
				match(RPAREN);
				}
				break;
			case EXP:
				enterOuterAlt(_localctx, 12);
				{
				setState(251);
				match(EXP);
				setState(252);
				match(LPAREN);
				setState(256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(253);
					variable();
					}
					break;
				case 2:
					{
					setState(254);
					unsignedConstant();
					}
					break;
				case 3:
					{
					setState(255);
					expression();
					}
					break;
				}
				setState(258);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrdFuncStatementContext extends ParserRuleContext {
		public TerminalNode CHR() { return getToken(PascaletParser.CHR, 0); }
		public TerminalNode LPAREN() { return getToken(PascaletParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PascaletParser.RPAREN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public UnsignedConstantContext unsignedConstant() {
			return getRuleContext(UnsignedConstantContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ORD() { return getToken(PascaletParser.ORD, 0); }
		public TerminalNode PRED() { return getToken(PascaletParser.PRED, 0); }
		public TerminalNode SUCC() { return getToken(PascaletParser.SUCC, 0); }
		public OrdFuncStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordFuncStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterOrdFuncStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitOrdFuncStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitOrdFuncStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrdFuncStatementContext ordFuncStatement() throws RecognitionException {
		OrdFuncStatementContext _localctx = new OrdFuncStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ordFuncStatement);
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHR:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(CHR);
				setState(263);
				match(LPAREN);
				setState(267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(264);
					variable();
					}
					break;
				case 2:
					{
					setState(265);
					unsignedConstant();
					}
					break;
				case 3:
					{
					setState(266);
					expression();
					}
					break;
				}
				setState(269);
				match(RPAREN);
				}
				break;
			case ORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(ORD);
				setState(272);
				match(LPAREN);
				setState(276);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(273);
					variable();
					}
					break;
				case 2:
					{
					setState(274);
					unsignedConstant();
					}
					break;
				case 3:
					{
					setState(275);
					expression();
					}
					break;
				}
				setState(278);
				match(RPAREN);
				}
				break;
			case PRED:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				match(PRED);
				setState(281);
				match(LPAREN);
				setState(285);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(282);
					variable();
					}
					break;
				case 2:
					{
					setState(283);
					unsignedConstant();
					}
					break;
				case 3:
					{
					setState(284);
					expression();
					}
					break;
				}
				setState(287);
				match(RPAREN);
				}
				break;
			case SUCC:
				enterOuterAlt(_localctx, 4);
				{
				setState(289);
				match(SUCC);
				setState(290);
				match(LPAREN);
				setState(294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(291);
					variable();
					}
					break;
				case 2:
					{
					setState(292);
					unsignedConstant();
					}
					break;
				case 3:
					{
					setState(293);
					expression();
					}
					break;
				}
				setState(296);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructuredStatementContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public RepeatStatementContext repeatStatement() {
			return getRuleContext(RepeatStatementContext.class,0);
		}
		public StructuredStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterStructuredStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitStructuredStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitStructuredStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructuredStatementContext structuredStatement() throws RecognitionException {
		StructuredStatementContext _localctx = new StructuredStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_structuredStatement);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				compoundStatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				ifStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				forStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(303);
				whileStatement();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(304);
				repeatStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PascaletParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PascaletParser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PascaletParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(IF);
			setState(308);
			expression();
			setState(309);
			match(THEN);
			setState(310);
			statement();
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(311);
				match(ELSE);
				setState(312);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PascaletParser.FOR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PascaletParser.ASSIGN, 0); }
		public ForListContext forList() {
			return getRuleContext(ForListContext.class,0);
		}
		public TerminalNode DO() { return getToken(PascaletParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(FOR);
			setState(316);
			variable();
			setState(317);
			match(ASSIGN);
			setState(318);
			forList();
			setState(319);
			match(DO);
			setState(320);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PascaletParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(PascaletParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(WHILE);
			setState(323);
			expression();
			setState(324);
			match(DO);
			setState(325);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatStatementContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(PascaletParser.REPEAT, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(PascaletParser.UNTIL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RepeatStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterRepeatStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitRepeatStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitRepeatStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatStatementContext repeatStatement() throws RecognitionException {
		RepeatStatementContext _localctx = new RepeatStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_repeatStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(REPEAT);
			setState(328);
			statements();
			setState(329);
			match(UNTIL);
			setState(330);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForListContext extends ParserRuleContext {
		public Token op;
		public InitialValueContext initialValue() {
			return getRuleContext(InitialValueContext.class,0);
		}
		public FinalValueContext finalValue() {
			return getRuleContext(FinalValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(PascaletParser.TO, 0); }
		public TerminalNode DOWNTO() { return getToken(PascaletParser.DOWNTO, 0); }
		public ForListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterForList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitForList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitForList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForListContext forList() throws RecognitionException {
		ForListContext _localctx = new ForListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			initialValue();
			setState(333);
			((ForListContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==TO || _la==DOWNTO) ) {
				((ForListContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(334);
			finalValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitialValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitialValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterInitialValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitInitialValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitInitialValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialValueContext initialValue() throws RecognitionException {
		InitialValueContext _localctx = new InitialValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_initialValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinalValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FinalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterFinalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitFinalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitFinalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalValueContext finalValue() throws RecognitionException {
		FinalValueContext _localctx = new FinalValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_finalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(PascaletParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(PascaletParser.END, 0); }
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(BEGIN);
			setState(341);
			statements();
			setState(342);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PascaletParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascaletParser.SEMI, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			statement();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(345);
				match(SEMI);
				setState(346);
				statement();
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PascaletParser.INT, 0); }
		public TerminalNode COLON() { return getToken(PascaletParser.COLON, 0); }
		public UnlabelledStatementContext unlabelledStatement() {
			return getRuleContext(UnlabelledStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement);
		try {
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(INT);
				setState(353);
				match(COLON);
				setState(354);
				unlabelledStatement();
				}
				break;
			case INC:
			case DEC:
			case ABS:
			case CHR:
			case ARCTAN:
			case COS:
			case LN:
			case ROUND:
			case SIN:
			case SQR:
			case SQRT:
			case TRUNC:
			case EXP:
			case ORD:
			case PRED:
			case SUCC:
			case WRITELN:
			case WRITE:
			case READLN:
			case BEGIN:
			case END:
			case IF:
			case ELSE:
			case FOR:
			case WHILE:
			case REPEAT:
			case UNTIL:
			case IDENT:
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				unlabelledStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnlabelledStatementContext extends ParserRuleContext {
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public StructuredStatementContext structuredStatement() {
			return getRuleContext(StructuredStatementContext.class,0);
		}
		public UnlabelledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unlabelledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterUnlabelledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitUnlabelledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitUnlabelledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnlabelledStatementContext unlabelledStatement() throws RecognitionException {
		UnlabelledStatementContext _localctx = new UnlabelledStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unlabelledStatement);
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
			case DEC:
			case ABS:
			case CHR:
			case ARCTAN:
			case COS:
			case LN:
			case ROUND:
			case SIN:
			case SQR:
			case SQRT:
			case TRUNC:
			case EXP:
			case ORD:
			case PRED:
			case SUCC:
			case WRITELN:
			case WRITE:
			case READLN:
			case END:
			case ELSE:
			case UNTIL:
			case IDENT:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				simpleStatement();
				}
				break;
			case BEGIN:
			case IF:
			case FOR:
			case WHILE:
			case REPEAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				structuredStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefBlockContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(PascaletParser.VAR, 0); }
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PascaletParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascaletParser.SEMI, i);
		}
		public VarDefBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterVarDefBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitVarDefBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitVarDefBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefBlockContext varDefBlock() throws RecognitionException {
		VarDefBlockContext _localctx = new VarDefBlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_varDefBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(VAR);
			setState(365);
			varDef();
			setState(370);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(366);
					match(SEMI);
					setState(367);
					varDef();
					}
					} 
				}
				setState(372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(373);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode COLON() { return getToken(PascaletParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascaletParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascaletParser.COMMA, i);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_varDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			identifier();
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(376);
				match(COMMA);
				setState(377);
				identifier();
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(383);
			match(COLON);
			setState(384);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(PascaletParser.IDENT, 0); }
		public TerminalNode LBRACK() { return getToken(PascaletParser.LBRACK, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(PascaletParser.RBRACK, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variable);
		try {
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				match(IDENT);
				setState(388);
				match(LBRACK);
				setState(389);
				constant();
				setState(390);
				match(RBRACK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDefBlockContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(PascaletParser.CONST, 0); }
		public List<ConstDefContext> constDef() {
			return getRuleContexts(ConstDefContext.class);
		}
		public ConstDefContext constDef(int i) {
			return getRuleContext(ConstDefContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PascaletParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascaletParser.SEMI, i);
		}
		public ConstDefBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDefBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterConstDefBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitConstDefBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitConstDefBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDefBlockContext constDefBlock() throws RecognitionException {
		ConstDefBlockContext _localctx = new ConstDefBlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_constDefBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(CONST);
			setState(398); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(395);
				constDef();
				setState(396);
				match(SEMI);
				}
				}
				setState(400); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDefContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(PascaletParser.EQUAL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterConstDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitConstDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitConstDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDefContext constDef() throws RecognitionException {
		ConstDefContext _localctx = new ConstDefContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			variable();
			setState(403);
			match(EQUAL);
			setState(404);
			constant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcAndFuncDefBlockContext extends ParserRuleContext {
		public ProcAndFuncDefContext procAndFuncDef() {
			return getRuleContext(ProcAndFuncDefContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PascaletParser.SEMI, 0); }
		public ProcAndFuncDefBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procAndFuncDefBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterProcAndFuncDefBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitProcAndFuncDefBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitProcAndFuncDefBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcAndFuncDefBlockContext procAndFuncDefBlock() throws RecognitionException {
		ProcAndFuncDefBlockContext _localctx = new ProcAndFuncDefBlockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_procAndFuncDefBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			procAndFuncDef();
			setState(407);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcAndFuncDefContext extends ParserRuleContext {
		public ProcedureDeclarationContext procedureDeclaration() {
			return getRuleContext(ProcedureDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ProcAndFuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procAndFuncDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterProcAndFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitProcAndFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitProcAndFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcAndFuncDefContext procAndFuncDef() throws RecognitionException {
		ProcAndFuncDefContext _localctx = new ProcAndFuncDefContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_procAndFuncDef);
		try {
			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				procedureDeclaration();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				functionDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureDeclarationContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(PascaletParser.PROCEDURE, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PascaletParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ProcedureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterProcedureDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitProcedureDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitProcedureDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureDeclarationContext procedureDeclaration() throws RecognitionException {
		ProcedureDeclarationContext _localctx = new ProcedureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_procedureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(PROCEDURE);
			setState(414);
			variable();
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(415);
				formalParameterList();
				}
			}

			setState(418);
			match(SEMI);
			setState(419);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureStatementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PascaletParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascaletParser.RPAREN, 0); }
		public ProcedureStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterProcedureStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitProcedureStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitProcedureStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureStatementContext procedureStatement() throws RecognitionException {
		ProcedureStatementContext _localctx = new ProcedureStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_procedureStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			variable();
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(422);
				match(LPAREN);
				setState(423);
				parameterList();
				setState(424);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PascaletParser.LPAREN, 0); }
		public List<ParameterGroupContext> parameterGroup() {
			return getRuleContexts(ParameterGroupContext.class);
		}
		public ParameterGroupContext parameterGroup(int i) {
			return getRuleContext(ParameterGroupContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PascaletParser.RPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(PascaletParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascaletParser.SEMI, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(LPAREN);
			setState(429);
			parameterGroup();
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(430);
				match(SEMI);
				setState(431);
				parameterGroup();
				}
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(437);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterGroupContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode COLON() { return getToken(PascaletParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascaletParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascaletParser.COMMA, i);
		}
		public ParameterGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterParameterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitParameterGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitParameterGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterGroupContext parameterGroup() throws RecognitionException {
		ParameterGroupContext _localctx = new ParameterGroupContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_parameterGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			identifier();
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(440);
				match(COMMA);
				setState(441);
				identifier();
				}
				}
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(447);
			match(COLON);
			setState(448);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(PascaletParser.FUNCTION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascaletParser.COLON, 0); }
		public ResultTypeContext resultType() {
			return getRuleContext(ResultTypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PascaletParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(FUNCTION);
			setState(451);
			identifier();
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(452);
				formalParameterList();
				}
			}

			setState(455);
			match(COLON);
			setState(456);
			resultType();
			setState(457);
			match(SEMI);
			setState(458);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ResultTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterResultType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitResultType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitResultType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultTypeContext resultType() throws RecognitionException {
		ResultTypeContext _localctx = new ResultTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_resultType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(PascaletParser.ARRAY, 0); }
		public TerminalNode LBRACK() { return getToken(PascaletParser.LBRACK, 0); }
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(PascaletParser.DOTDOT, 0); }
		public TerminalNode RBRACK() { return getToken(PascaletParser.RBRACK, 0); }
		public TerminalNode OF() { return getToken(PascaletParser.OF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(ARRAY);
			setState(463);
			match(LBRACK);
			setState(464);
			constant();
			setState(465);
			match(DOTDOT);
			setState(466);
			constant();
			setState(467);
			match(RBRACK);
			setState(468);
			match(OF);
			setState(469);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(PascaletParser.DOUBLE, 0); }
		public TerminalNode CHARACTER() { return getToken(PascaletParser.CHARACTER, 0); }
		public TerminalNode BOOLEAN() { return getToken(PascaletParser.BOOLEAN, 0); }
		public TerminalNode INTEGER() { return getToken(PascaletParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(PascaletParser.STRING, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_type);
		int _la;
		try {
			setState(473);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE:
			case CHARACTER:
			case BOOLEAN:
			case INTEGER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE) | (1L << CHARACTER) | (1L << BOOLEAN) | (1L << INTEGER) | (1L << STRING))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				arrayType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeoperatorContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(PascaletParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(PascaletParser.SLASH, 0); }
		public TerminalNode DIV() { return getToken(PascaletParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(PascaletParser.MOD, 0); }
		public TerminalNode AND() { return getToken(PascaletParser.AND, 0); }
		public MultiplicativeoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterMultiplicativeoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitMultiplicativeoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitMultiplicativeoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeoperatorContext multiplicativeoperator() throws RecognitionException {
		MultiplicativeoperatorContext _localctx = new MultiplicativeoperatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_multiplicativeoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			_la = _input.LA(1);
			if ( !(((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (DIV - 47)) | (1L << (MOD - 47)) | (1L << (AND - 47)) | (1L << (STAR - 47)) | (1L << (SLASH - 47)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveoperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(PascaletParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PascaletParser.MINUS, 0); }
		public TerminalNode OR() { return getToken(PascaletParser.OR, 0); }
		public AdditiveoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterAdditiveoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitAdditiveoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitAdditiveoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveoperatorContext additiveoperator() throws RecognitionException {
		AdditiveoperatorContext _localctx = new AdditiveoperatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_additiveoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationaloperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(PascaletParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(PascaletParser.NOT_EQUAL, 0); }
		public TerminalNode LT() { return getToken(PascaletParser.LT, 0); }
		public TerminalNode LE() { return getToken(PascaletParser.LE, 0); }
		public TerminalNode GE() { return getToken(PascaletParser.GE, 0); }
		public TerminalNode GT() { return getToken(PascaletParser.GT, 0); }
		public RelationaloperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationaloperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterRelationaloperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitRelationaloperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitRelationaloperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationaloperatorContext relationaloperator() throws RecognitionException {
		RelationaloperatorContext _localctx = new RelationaloperatorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_relationaloperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << GT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStatementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PascaletParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			variable();
			setState(482);
			match(ASSIGN);
			setState(483);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public RelationaloperatorContext relationaloperator() {
			return getRuleContext(RelationaloperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			simpleExpression();
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << GT))) != 0)) {
				{
				setState(486);
				relationaloperator();
				setState(487);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExpressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AdditiveoperatorContext additiveoperator() {
			return getRuleContext(AdditiveoperatorContext.class,0);
		}
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitSimpleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			term();
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				setState(492);
				additiveoperator();
				setState(493);
				simpleExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public SignedFactorContext signedFactor() {
			return getRuleContext(SignedFactorContext.class,0);
		}
		public MultiplicativeoperatorContext multiplicativeoperator() {
			return getRuleContext(MultiplicativeoperatorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			signedFactor();
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (DIV - 47)) | (1L << (MOD - 47)) | (1L << (AND - 47)) | (1L << (STAR - 47)) | (1L << (SLASH - 47)))) != 0)) {
				{
				setState(498);
				multiplicativeoperator();
				setState(499);
				term();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignedFactorContext extends ParserRuleContext {
		public Token op;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(PascaletParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PascaletParser.MINUS, 0); }
		public SignedFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterSignedFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitSignedFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitSignedFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedFactorContext signedFactor() throws RecognitionException {
		SignedFactorContext _localctx = new SignedFactorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_signedFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(503);
				((SignedFactorContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((SignedFactorContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(506);
			factor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PascaletParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascaletParser.RPAREN, 0); }
		public FunctionDesignatorContext functionDesignator() {
			return getRuleContext(FunctionDesignatorContext.class,0);
		}
		public UnsignedConstantContext unsignedConstant() {
			return getRuleContext(UnsignedConstantContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PascaletParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(PascaletParser.BOOL, 0); }
		public MathFuncStatementContext mathFuncStatement() {
			return getRuleContext(MathFuncStatementContext.class,0);
		}
		public OrdFuncStatementContext ordFuncStatement() {
			return getRuleContext(OrdFuncStatementContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_factor);
		try {
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				match(LPAREN);
				setState(510);
				expression();
				setState(511);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(513);
				functionDesignator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(514);
				unsignedConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(515);
				match(NOT);
				setState(516);
				factor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(517);
				match(BOOL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(518);
				mathFuncStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(519);
				ordFuncStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedConstantContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(PascaletParser.CHAR, 0); }
		public TerminalNode STR() { return getToken(PascaletParser.STR, 0); }
		public TerminalNode NIL() { return getToken(PascaletParser.NIL, 0); }
		public UnsignedConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterUnsignedConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitUnsignedConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitUnsignedConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedConstantContext unsignedConstant() throws RecognitionException {
		UnsignedConstantContext _localctx = new UnsignedConstantContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_unsignedConstant);
		try {
			setState(526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case RNUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				unsignedNumber();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				match(CHAR);
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(524);
				match(STR);
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 4);
				{
				setState(525);
				match(NIL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDesignatorContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PascaletParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascaletParser.RPAREN, 0); }
		public FunctionDesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDesignator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterFunctionDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitFunctionDesignator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitFunctionDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDesignatorContext functionDesignator() throws RecognitionException {
		FunctionDesignatorContext _localctx = new FunctionDesignatorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_functionDesignator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			variable();
			setState(529);
			match(LPAREN);
			setState(530);
			parameterList();
			setState(531);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<ActualParameterContext> actualParameter() {
			return getRuleContexts(ActualParameterContext.class);
		}
		public ActualParameterContext actualParameter(int i) {
			return getRuleContext(ActualParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascaletParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascaletParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			actualParameter();
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(534);
				match(COMMA);
				setState(535);
				actualParameter();
				}
				}
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterwidthContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(PascaletParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterwidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterwidth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterParameterwidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitParameterwidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitParameterwidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterwidthContext parameterwidth() throws RecognitionException {
		ParameterwidthContext _localctx = new ParameterwidthContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_parameterwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(COLON);
			setState(542);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActualParameterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ParameterwidthContext> parameterwidth() {
			return getRuleContexts(ParameterwidthContext.class);
		}
		public ParameterwidthContext parameterwidth(int i) {
			return getRuleContext(ParameterwidthContext.class,i);
		}
		public ActualParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterActualParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitActualParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitActualParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualParameterContext actualParameter() throws RecognitionException {
		ActualParameterContext _localctx = new ActualParameterContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_actualParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			expression();
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(545);
				parameterwidth();
				}
				}
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public Token op;
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(PascaletParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PascaletParser.MINUS, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode STR() { return getToken(PascaletParser.STR, 0); }
		public TerminalNode CHAR() { return getToken(PascaletParser.CHAR, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_constant);
		int _la;
		try {
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				unsignedNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
				((ConstantContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ConstantContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(553);
				unsignedNumber();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(554);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(555);
				((ConstantContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ConstantContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(556);
				variable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(557);
				match(STR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(558);
				match(CHAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedNumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PascaletParser.INT, 0); }
		public TerminalNode RNUM() { return getToken(PascaletParser.RNUM, 0); }
		public UnsignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterUnsignedNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitUnsignedNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitUnsignedNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedNumberContext unsignedNumber() throws RecognitionException {
		UnsignedNumberContext _localctx = new UnsignedNumberContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_unsignedNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==RNUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(PascaletParser.IDENT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3S\u0238\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3r\n\3\f\3\16\3u\13\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0080\n\4\3\5\3\5\3\5\3\5\3\5\5\5\u0087"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0090\n\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\u0099\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u00a0\n\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u00a9\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00b2\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00bb\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u00c4\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00cd\n\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u00d6\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00df\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00e8\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u00f1\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00fa\n\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u0103\n\6\3\6\3\6\5\6\u0107\n\6\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u010e\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0117\n\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u0120\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0129\n\7\3\7"+
		"\3\7\5\7\u012d\n\7\3\b\3\b\3\b\3\b\3\b\5\b\u0134\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u013c\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\7\21\u015e\n\21\f\21\16\21\u0161\13\21\3\22"+
		"\3\22\3\22\3\22\5\22\u0167\n\22\3\23\3\23\5\23\u016b\n\23\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\7\25\u0173\n\25\f\25\16\25\u0176\13\25\3\25\3\25\3"+
		"\26\3\26\3\26\7\26\u017d\n\26\f\26\16\26\u0180\13\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\5\27\u018b\n\27\3\30\3\30\3\30\3\30\6\30"+
		"\u0191\n\30\r\30\16\30\u0192\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3"+
		"\33\5\33\u019e\n\33\3\34\3\34\3\34\5\34\u01a3\n\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u01ad\n\35\3\36\3\36\3\36\3\36\7\36\u01b3\n"+
		"\36\f\36\16\36\u01b6\13\36\3\36\3\36\3\37\3\37\3\37\7\37\u01bd\n\37\f"+
		"\37\16\37\u01c0\13\37\3\37\3\37\3\37\3 \3 \3 \5 \u01c8\n \3 \3 \3 \3 "+
		"\3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\5#\u01dc\n#\3$\3$"+
		"\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\5(\u01ec\n(\3)\3)\3)\3)\5)\u01f2"+
		"\n)\3*\3*\3*\3*\5*\u01f8\n*\3+\5+\u01fb\n+\3+\3+\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\5,\u020b\n,\3-\3-\3-\3-\5-\u0211\n-\3.\3.\3.\3.\3.\3/"+
		"\3/\3/\7/\u021b\n/\f/\16/\u021e\13/\3\60\3\60\3\60\3\61\3\61\7\61\u0225"+
		"\n\61\f\61\16\61\u0228\13\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5"+
		"\62\u0232\n\62\3\63\3\63\3\64\3\64\3\64\2\2\65\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdf\2\t\4\2"+
		"  %%\6\2\23\23+,..\60\60\4\2\61\63BC\4\2\64\64@A\3\2:?\3\2@A\3\289\2\u0269"+
		"\2h\3\2\2\2\4s\3\2\2\2\6\177\3\2\2\2\b\u0098\3\2\2\2\n\u0106\3\2\2\2\f"+
		"\u012c\3\2\2\2\16\u0133\3\2\2\2\20\u0135\3\2\2\2\22\u013d\3\2\2\2\24\u0144"+
		"\3\2\2\2\26\u0149\3\2\2\2\30\u014e\3\2\2\2\32\u0152\3\2\2\2\34\u0154\3"+
		"\2\2\2\36\u0156\3\2\2\2 \u015a\3\2\2\2\"\u0166\3\2\2\2$\u016a\3\2\2\2"+
		"&\u016c\3\2\2\2(\u016e\3\2\2\2*\u0179\3\2\2\2,\u018a\3\2\2\2.\u018c\3"+
		"\2\2\2\60\u0194\3\2\2\2\62\u0198\3\2\2\2\64\u019d\3\2\2\2\66\u019f\3\2"+
		"\2\28\u01a7\3\2\2\2:\u01ae\3\2\2\2<\u01b9\3\2\2\2>\u01c4\3\2\2\2@\u01ce"+
		"\3\2\2\2B\u01d0\3\2\2\2D\u01db\3\2\2\2F\u01dd\3\2\2\2H\u01df\3\2\2\2J"+
		"\u01e1\3\2\2\2L\u01e3\3\2\2\2N\u01e7\3\2\2\2P\u01ed\3\2\2\2R\u01f3\3\2"+
		"\2\2T\u01fa\3\2\2\2V\u020a\3\2\2\2X\u0210\3\2\2\2Z\u0212\3\2\2\2\\\u0217"+
		"\3\2\2\2^\u021f\3\2\2\2`\u0222\3\2\2\2b\u0231\3\2\2\2d\u0233\3\2\2\2f"+
		"\u0235\3\2\2\2hi\7\27\2\2ij\5f\64\2jk\7E\2\2kl\5\4\3\2lm\7H\2\2m\3\3\2"+
		"\2\2nr\5(\25\2or\5.\30\2pr\5\62\32\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2ru\3"+
		"\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\5\36\20\2w\5\3\2\2\2"+
		"x\u0080\5L\'\2y\u0080\58\35\2z\u0080\5\b\5\2{\u0080\5Z.\2|\u0080\5&\24"+
		"\2}\u0080\5\n\6\2~\u0080\5\f\7\2\177x\3\2\2\2\177y\3\2\2\2\177z\3\2\2"+
		"\2\177{\3\2\2\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\7\3\2\2\2"+
		"\u0081\u0082\7\24\2\2\u0082\u0086\7J\2\2\u0083\u0087\5,\27\2\u0084\u0087"+
		"\5X-\2\u0085\u0087\5N(\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7K\2\2\u0089\u0099\3\2"+
		"\2\2\u008a\u008b\7\25\2\2\u008b\u008f\7J\2\2\u008c\u0090\5,\27\2\u008d"+
		"\u0090\5X-\2\u008e\u0090\5N(\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2\2\2"+
		"\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7K\2\2\u0092\u0099"+
		"\3\2\2\2\u0093\u0094\7\26\2\2\u0094\u0095\7J\2\2\u0095\u0096\5,\27\2\u0096"+
		"\u0097\7K\2\2\u0097\u0099\3\2\2\2\u0098\u0081\3\2\2\2\u0098\u008a\3\2"+
		"\2\2\u0098\u0093\3\2\2\2\u0099\t\3\2\2\2\u009a\u009b\7\5\2\2\u009b\u009f"+
		"\7J\2\2\u009c\u00a0\5,\27\2\u009d\u00a0\5X-\2\u009e\u00a0\5N(\2\u009f"+
		"\u009c\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a2\7K\2\2\u00a2\u0107\3\2\2\2\u00a3\u00a4\7\3\2\2\u00a4"+
		"\u00a8\7J\2\2\u00a5\u00a9\5,\27\2\u00a6\u00a9\5X-\2\u00a7\u00a9\5N(\2"+
		"\u00a8\u00a5\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\u00ab\7K\2\2\u00ab\u0107\3\2\2\2\u00ac\u00ad\7\4\2\2\u00ad"+
		"\u00b1\7J\2\2\u00ae\u00b2\5,\27\2\u00af\u00b2\5X-\2\u00b0\u00b2\5N(\2"+
		"\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\u00b4\7K\2\2\u00b4\u0107\3\2\2\2\u00b5\u00b6\7\7\2\2\u00b6"+
		"\u00ba\7J\2\2\u00b7\u00bb\5,\27\2\u00b8\u00bb\5X-\2\u00b9\u00bb\5N(\2"+
		"\u00ba\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00bd\7K\2\2\u00bd\u0107\3\2\2\2\u00be\u00bf\7\b\2\2\u00bf"+
		"\u00c3\7J\2\2\u00c0\u00c4\5,\27\2\u00c1\u00c4\5X-\2\u00c2\u00c4\5N(\2"+
		"\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c6\7K\2\2\u00c6\u0107\3\2\2\2\u00c7\u00c8\7\t\2\2\u00c8"+
		"\u00cc\7J\2\2\u00c9\u00cd\5,\27\2\u00ca\u00cd\5X-\2\u00cb\u00cd\5N(\2"+
		"\u00cc\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\u00cf\7K\2\2\u00cf\u0107\3\2\2\2\u00d0\u00d1\7\n\2\2\u00d1"+
		"\u00d5\7J\2\2\u00d2\u00d6\5,\27\2\u00d3\u00d6\5X-\2\u00d4\u00d6\5N(\2"+
		"\u00d5\u00d2\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7\u00d8\7K\2\2\u00d8\u0107\3\2\2\2\u00d9\u00da\7\13\2\2\u00da"+
		"\u00de\7J\2\2\u00db\u00df\5,\27\2\u00dc\u00df\5X-\2\u00dd\u00df\5N(\2"+
		"\u00de\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e0"+
		"\3\2\2\2\u00e0\u00e1\7K\2\2\u00e1\u0107\3\2\2\2\u00e2\u00e3\7\f\2\2\u00e3"+
		"\u00e7\7J\2\2\u00e4\u00e8\5,\27\2\u00e5\u00e8\5X-\2\u00e6\u00e8\5N(\2"+
		"\u00e7\u00e4\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9\u00ea\7K\2\2\u00ea\u0107\3\2\2\2\u00eb\u00ec\7\r\2\2\u00ec"+
		"\u00f0\7J\2\2\u00ed\u00f1\5,\27\2\u00ee\u00f1\5X-\2\u00ef\u00f1\5N(\2"+
		"\u00f0\u00ed\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2\u00f3\7K\2\2\u00f3\u0107\3\2\2\2\u00f4\u00f5\7\16\2\2\u00f5"+
		"\u00f9\7J\2\2\u00f6\u00fa\5,\27\2\u00f7\u00fa\5X-\2\u00f8\u00fa\5N(\2"+
		"\u00f9\u00f6\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u00fc\7K\2\2\u00fc\u0107\3\2\2\2\u00fd\u00fe\7\17\2\2\u00fe"+
		"\u0102\7J\2\2\u00ff\u0103\5,\27\2\u0100\u0103\5X-\2\u0101\u0103\5N(\2"+
		"\u0102\u00ff\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0105\7K\2\2\u0105\u0107\3\2\2\2\u0106\u009a\3\2\2\2\u0106"+
		"\u00a3\3\2\2\2\u0106\u00ac\3\2\2\2\u0106\u00b5\3\2\2\2\u0106\u00be\3\2"+
		"\2\2\u0106\u00c7\3\2\2\2\u0106\u00d0\3\2\2\2\u0106\u00d9\3\2\2\2\u0106"+
		"\u00e2\3\2\2\2\u0106\u00eb\3\2\2\2\u0106\u00f4\3\2\2\2\u0106\u00fd\3\2"+
		"\2\2\u0107\13\3\2\2\2\u0108\u0109\7\6\2\2\u0109\u010d\7J\2\2\u010a\u010e"+
		"\5,\27\2\u010b\u010e\5X-\2\u010c\u010e\5N(\2\u010d\u010a\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\7K"+
		"\2\2\u0110\u012d\3\2\2\2\u0111\u0112\7\20\2\2\u0112\u0116\7J\2\2\u0113"+
		"\u0117\5,\27\2\u0114\u0117\5X-\2\u0115\u0117\5N(\2\u0116\u0113\3\2\2\2"+
		"\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119"+
		"\7K\2\2\u0119\u012d\3\2\2\2\u011a\u011b\7\21\2\2\u011b\u011f\7J\2\2\u011c"+
		"\u0120\5,\27\2\u011d\u0120\5X-\2\u011e\u0120\5N(\2\u011f\u011c\3\2\2\2"+
		"\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122"+
		"\7K\2\2\u0122\u012d\3\2\2\2\u0123\u0124\7\22\2\2\u0124\u0128\7J\2\2\u0125"+
		"\u0129\5,\27\2\u0126\u0129\5X-\2\u0127\u0129\5N(\2\u0128\u0125\3\2\2\2"+
		"\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b"+
		"\7K\2\2\u012b\u012d\3\2\2\2\u012c\u0108\3\2\2\2\u012c\u0111\3\2\2\2\u012c"+
		"\u011a\3\2\2\2\u012c\u0123\3\2\2\2\u012d\r\3\2\2\2\u012e\u0134\5\36\20"+
		"\2\u012f\u0134\5\20\t\2\u0130\u0134\5\22\n\2\u0131\u0134\5\24\13\2\u0132"+
		"\u0134\5\26\f\2\u0133\u012e\3\2\2\2\u0133\u012f\3\2\2\2\u0133\u0130\3"+
		"\2\2\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134\17\3\2\2\2\u0135"+
		"\u0136\7\34\2\2\u0136\u0137\5N(\2\u0137\u0138\7\36\2\2\u0138\u013b\5\""+
		"\22\2\u0139\u013a\7\37\2\2\u013a\u013c\5\"\22\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\21\3\2\2\2\u013d\u013e\7!\2\2\u013e\u013f\5,\27\2"+
		"\u013f\u0140\7D\2\2\u0140\u0141\5\30\r\2\u0141\u0142\7&\2\2\u0142\u0143"+
		"\5\"\22\2\u0143\23\3\2\2\2\u0144\u0145\7\"\2\2\u0145\u0146\5N(\2\u0146"+
		"\u0147\7&\2\2\u0147\u0148\5\"\22\2\u0148\25\3\2\2\2\u0149\u014a\7#\2\2"+
		"\u014a\u014b\5 \21\2\u014b\u014c\7$\2\2\u014c\u014d\5N(\2\u014d\27\3\2"+
		"\2\2\u014e\u014f\5\32\16\2\u014f\u0150\t\2\2\2\u0150\u0151\5\34\17\2\u0151"+
		"\31\3\2\2\2\u0152\u0153\5N(\2\u0153\33\3\2\2\2\u0154\u0155\5N(\2\u0155"+
		"\35\3\2\2\2\u0156\u0157\7\32\2\2\u0157\u0158\5 \21\2\u0158\u0159\7\33"+
		"\2\2\u0159\37\3\2\2\2\u015a\u015f\5\"\22\2\u015b\u015c\7E\2\2\u015c\u015e"+
		"\5\"\22\2\u015d\u015b\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2"+
		"\u015f\u0160\3\2\2\2\u0160!\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163\7"+
		"8\2\2\u0163\u0164\7G\2\2\u0164\u0167\5$\23\2\u0165\u0167\5$\23\2\u0166"+
		"\u0162\3\2\2\2\u0166\u0165\3\2\2\2\u0167#\3\2\2\2\u0168\u016b\5\6\4\2"+
		"\u0169\u016b\5\16\b\2\u016a\u0168\3\2\2\2\u016a\u0169\3\2\2\2\u016b%\3"+
		"\2\2\2\u016c\u016d\3\2\2\2\u016d\'\3\2\2\2\u016e\u016f\7(\2\2\u016f\u0174"+
		"\5*\26\2\u0170\u0171\7E\2\2\u0171\u0173\5*\26\2\u0172\u0170\3\2\2\2\u0173"+
		"\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2"+
		"\2\2\u0176\u0174\3\2\2\2\u0177\u0178\7E\2\2\u0178)\3\2\2\2\u0179\u017e"+
		"\5f\64\2\u017a\u017b\7F\2\2\u017b\u017d\5f\64\2\u017c\u017a\3\2\2\2\u017d"+
		"\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2"+
		"\2\2\u0180\u017e\3\2\2\2\u0181\u0182\7G\2\2\u0182\u0183\5D#\2\u0183+\3"+
		"\2\2\2\u0184\u018b\7\65\2\2\u0185\u0186\7\65\2\2\u0186\u0187\7L\2\2\u0187"+
		"\u0188\5b\62\2\u0188\u0189\7M\2\2\u0189\u018b\3\2\2\2\u018a\u0184\3\2"+
		"\2\2\u018a\u0185\3\2\2\2\u018b-\3\2\2\2\u018c\u0190\7\'\2\2\u018d\u018e"+
		"\5\60\31\2\u018e\u018f\7E\2\2\u018f\u0191\3\2\2\2\u0190\u018d\3\2\2\2"+
		"\u0191\u0192\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193/\3"+
		"\2\2\2\u0194\u0195\5,\27\2\u0195\u0196\7:\2\2\u0196\u0197\5b\62\2\u0197"+
		"\61\3\2\2\2\u0198\u0199\5\64\33\2\u0199\u019a\7E\2\2\u019a\63\3\2\2\2"+
		"\u019b\u019e\5\66\34\2\u019c\u019e\5> \2\u019d\u019b\3\2\2\2\u019d\u019c"+
		"\3\2\2\2\u019e\65\3\2\2\2\u019f\u01a0\7\31\2\2\u01a0\u01a2\5,\27\2\u01a1"+
		"\u01a3\5:\36\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2"+
		"\2\2\u01a4\u01a5\7E\2\2\u01a5\u01a6\5\4\3\2\u01a6\67\3\2\2\2\u01a7\u01ac"+
		"\5,\27\2\u01a8\u01a9\7J\2\2\u01a9\u01aa\5\\/\2\u01aa\u01ab\7K\2\2\u01ab"+
		"\u01ad\3\2\2\2\u01ac\u01a8\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad9\3\2\2\2"+
		"\u01ae\u01af\7J\2\2\u01af\u01b4\5<\37\2\u01b0\u01b1\7E\2\2\u01b1\u01b3"+
		"\5<\37\2\u01b2\u01b0\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b8\7K"+
		"\2\2\u01b8;\3\2\2\2\u01b9\u01be\5f\64\2\u01ba\u01bb\7F\2\2\u01bb\u01bd"+
		"\5f\64\2\u01bc\u01ba\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c2\7G"+
		"\2\2\u01c2\u01c3\5D#\2\u01c3=\3\2\2\2\u01c4\u01c5\7\30\2\2\u01c5\u01c7"+
		"\5f\64\2\u01c6\u01c8\5:\36\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01c9\3\2\2\2\u01c9\u01ca\7G\2\2\u01ca\u01cb\5@!\2\u01cb\u01cc\7E\2\2"+
		"\u01cc\u01cd\5\4\3\2\u01cd?\3\2\2\2\u01ce\u01cf\5D#\2\u01cfA\3\2\2\2\u01d0"+
		"\u01d1\7/\2\2\u01d1\u01d2\7L\2\2\u01d2\u01d3\5b\62\2\u01d3\u01d4\7I\2"+
		"\2\u01d4\u01d5\5b\62\2\u01d5\u01d6\7M\2\2\u01d6\u01d7\7\35\2\2\u01d7\u01d8"+
		"\5D#\2\u01d8C\3\2\2\2\u01d9\u01dc\t\3\2\2\u01da\u01dc\5B\"\2\u01db\u01d9"+
		"\3\2\2\2\u01db\u01da\3\2\2\2\u01dcE\3\2\2\2\u01dd\u01de\t\4\2\2\u01de"+
		"G\3\2\2\2\u01df\u01e0\t\5\2\2\u01e0I\3\2\2\2\u01e1\u01e2\t\6\2\2\u01e2"+
		"K\3\2\2\2\u01e3\u01e4\5,\27\2\u01e4\u01e5\7D\2\2\u01e5\u01e6\5N(\2\u01e6"+
		"M\3\2\2\2\u01e7\u01eb\5P)\2\u01e8\u01e9\5J&\2\u01e9\u01ea\5N(\2\u01ea"+
		"\u01ec\3\2\2\2\u01eb\u01e8\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ecO\3\2\2\2"+
		"\u01ed\u01f1\5R*\2\u01ee\u01ef\5H%\2\u01ef\u01f0\5P)\2\u01f0\u01f2\3\2"+
		"\2\2\u01f1\u01ee\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2Q\3\2\2\2\u01f3\u01f7"+
		"\5T+\2\u01f4\u01f5\5F$\2\u01f5\u01f6\5R*\2\u01f6\u01f8\3\2\2\2\u01f7\u01f4"+
		"\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8S\3\2\2\2\u01f9\u01fb\t\7\2\2\u01fa"+
		"\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\5V"+
		",\2\u01fdU\3\2\2\2\u01fe\u020b\5,\27\2\u01ff\u0200\7J\2\2\u0200\u0201"+
		"\5N(\2\u0201\u0202\7K\2\2\u0202\u020b\3\2\2\2\u0203\u020b\5Z.\2\u0204"+
		"\u020b\5X-\2\u0205\u0206\7*\2\2\u0206\u020b\5V,\2\u0207\u020b\7-\2\2\u0208"+
		"\u020b\5\n\6\2\u0209\u020b\5\f\7\2\u020a\u01fe\3\2\2\2\u020a\u01ff\3\2"+
		"\2\2\u020a\u0203\3\2\2\2\u020a\u0204\3\2\2\2\u020a\u0205\3\2\2\2\u020a"+
		"\u0207\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u0209\3\2\2\2\u020bW\3\2\2\2"+
		"\u020c\u0211\5d\63\2\u020d\u0211\7\67\2\2\u020e\u0211\7\66\2\2\u020f\u0211"+
		"\7)\2\2\u0210\u020c\3\2\2\2\u0210\u020d\3\2\2\2\u0210\u020e\3\2\2\2\u0210"+
		"\u020f\3\2\2\2\u0211Y\3\2\2\2\u0212\u0213\5,\27\2\u0213\u0214\7J\2\2\u0214"+
		"\u0215\5\\/\2\u0215\u0216\7K\2\2\u0216[\3\2\2\2\u0217\u021c\5`\61\2\u0218"+
		"\u0219\7F\2\2\u0219\u021b\5`\61\2\u021a\u0218\3\2\2\2\u021b\u021e\3\2"+
		"\2\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d]\3\2\2\2\u021e\u021c"+
		"\3\2\2\2\u021f\u0220\7G\2\2\u0220\u0221\5N(\2\u0221_\3\2\2\2\u0222\u0226"+
		"\5N(\2\u0223\u0225\5^\60\2\u0224\u0223\3\2\2\2\u0225\u0228\3\2\2\2\u0226"+
		"\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227a\3\2\2\2\u0228\u0226\3\2\2\2"+
		"\u0229\u0232\5d\63\2\u022a\u022b\t\7\2\2\u022b\u0232\5d\63\2\u022c\u0232"+
		"\5,\27\2\u022d\u022e\t\7\2\2\u022e\u0232\5,\27\2\u022f\u0232\7\66\2\2"+
		"\u0230\u0232\7\67\2\2\u0231\u0229\3\2\2\2\u0231\u022a\3\2\2\2\u0231\u022c"+
		"\3\2\2\2\u0231\u022d\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0230\3\2\2\2\u0232"+
		"c\3\2\2\2\u0233\u0234\t\b\2\2\u0234e\3\2\2\2\u0235\u0236\7\65\2\2\u0236"+
		"g\3\2\2\2\63qs\177\u0086\u008f\u0098\u009f\u00a8\u00b1\u00ba\u00c3\u00cc"+
		"\u00d5\u00de\u00e7\u00f0\u00f9\u0102\u0106\u010d\u0116\u011f\u0128\u012c"+
		"\u0133\u013b\u015f\u0166\u016a\u0174\u017e\u018a\u0192\u019d\u01a2\u01ac"+
		"\u01b4\u01be\u01c7\u01db\u01eb\u01f1\u01f7\u01fa\u020a\u0210\u021c\u0226"+
		"\u0231";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
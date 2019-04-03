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
		WRITELN=1, WRITE=2, READLN=3, PROGRAM=4, FUNCTION=5, PROCEDURE=6, BEGIN=7, 
		END=8, IF=9, THEN=10, ELSE=11, TO=12, FOR=13, DOWNTO=14, DO=15, CONST=16, 
		VAR=17, NIL=18, NOT=19, CHARACTER=20, BOOLEAN=21, BOOL=22, INTEGER=23, 
		STRING=24, DIV=25, MOD=26, AND=27, OR=28, IDENT=29, CHAR=30, INT=31, STR=32, 
		REAL=33, REAL_NUM=34, EQUAL=35, NOT_EQUAL=36, LT=37, LE=38, GE=39, GT=40, 
		PLUS=41, MINUS=42, STAR=43, SLASH=44, ASSIGN=45, SEMI=46, COMMA=47, COLON=48, 
		DOT=49, LPAREN=50, RPAREN=51, COMMENT_1=52, COMMENT_2=53, WS=54;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_simpleStatement = 2, RULE_builtInFuncStatement = 3, 
		RULE_structuredStatement = 4, RULE_ifStatement = 5, RULE_forStatement = 6, 
		RULE_forList = 7, RULE_initialValue = 8, RULE_finalValue = 9, RULE_compoundStatement = 10, 
		RULE_statements = 11, RULE_statement = 12, RULE_unlabelledStatement = 13, 
		RULE_emptyStatement = 14, RULE_varDefBlock = 15, RULE_varDef = 16, RULE_variable = 17, 
		RULE_constDefBlock = 18, RULE_constDef = 19, RULE_procAndFuncDefBlock = 20, 
		RULE_procAndFuncDef = 21, RULE_procedureDeclaration = 22, RULE_formalParameterList = 23, 
		RULE_parameterGroup = 24, RULE_functionDeclaration = 25, RULE_resultType = 26, 
		RULE_type = 27, RULE_multiplicativeoperator = 28, RULE_additiveoperator = 29, 
		RULE_relationaloperator = 30, RULE_assignmentStatement = 31, RULE_expression = 32, 
		RULE_simpleExpression = 33, RULE_term = 34, RULE_signedFactor = 35, RULE_factor = 36, 
		RULE_unsignedConstant = 37, RULE_functionDesignator = 38, RULE_parameterList = 39, 
		RULE_parameterwidth = 40, RULE_actualParameter = 41, RULE_constant = 42, 
		RULE_unsignedNumber = 43, RULE_identifier = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "simpleStatement", "builtInFuncStatement", "structuredStatement", 
			"ifStatement", "forStatement", "forList", "initialValue", "finalValue", 
			"compoundStatement", "statements", "statement", "unlabelledStatement", 
			"emptyStatement", "varDefBlock", "varDef", "variable", "constDefBlock", 
			"constDef", "procAndFuncDefBlock", "procAndFuncDef", "procedureDeclaration", 
			"formalParameterList", "parameterGroup", "functionDeclaration", "resultType", 
			"type", "multiplicativeoperator", "additiveoperator", "relationaloperator", 
			"assignmentStatement", "expression", "simpleExpression", "term", "signedFactor", 
			"factor", "unsignedConstant", "functionDesignator", "parameterList", 
			"parameterwidth", "actualParameter", "constant", "unsignedNumber", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'='", 
			"'<>'", "'<'", "'<='", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "':='", 
			"';'", "','", "':'", "'.'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WRITELN", "WRITE", "READLN", "PROGRAM", "FUNCTION", "PROCEDURE", 
			"BEGIN", "END", "IF", "THEN", "ELSE", "TO", "FOR", "DOWNTO", "DO", "CONST", 
			"VAR", "NIL", "NOT", "CHARACTER", "BOOLEAN", "BOOL", "INTEGER", "STRING", 
			"DIV", "MOD", "AND", "OR", "IDENT", "CHAR", "INT", "STR", "REAL", "REAL_NUM", 
			"EQUAL", "NOT_EQUAL", "LT", "LE", "GE", "GT", "PLUS", "MINUS", "STAR", 
			"SLASH", "ASSIGN", "SEMI", "COMMA", "COLON", "DOT", "LPAREN", "RPAREN", 
			"COMMENT_1", "COMMENT_2", "WS"
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
			setState(90);
			match(PROGRAM);
			setState(91);
			identifier();
			setState(92);
			match(SEMI);
			setState(93);
			block();
			setState(94);
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
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << PROCEDURE) | (1L << CONST) | (1L << VAR))) != 0)) {
				{
				setState(99);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(96);
					varDefBlock();
					}
					break;
				case CONST:
					{
					setState(97);
					constDefBlock();
					}
					break;
				case FUNCTION:
				case PROCEDURE:
					{
					setState(98);
					procAndFuncDefBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
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
		public BuiltInFuncStatementContext builtInFuncStatement() {
			return getRuleContext(BuiltInFuncStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
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
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				assignmentStatement();
				}
				break;
			case WRITELN:
			case WRITE:
			case READLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				builtInFuncStatement();
				}
				break;
			case END:
			case ELSE:
			case SEMI:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				emptyStatement();
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

	public static class BuiltInFuncStatementContext extends ParserRuleContext {
		public TerminalNode WRITELN() { return getToken(PascaletParser.WRITELN, 0); }
		public TerminalNode LPAREN() { return getToken(PascaletParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PascaletParser.RPAREN, 0); }
		public UnsignedConstantContext unsignedConstant() {
			return getRuleContext(UnsignedConstantContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
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
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WRITELN:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(WRITELN);
				setState(112);
				match(LPAREN);
				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(113);
					unsignedConstant();
					}
					break;
				case 2:
					{
					setState(114);
					expression();
					}
					break;
				case 3:
					{
					setState(115);
					variable();
					}
					break;
				}
				setState(118);
				match(RPAREN);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(WRITE);
				setState(121);
				match(LPAREN);
				setState(125);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(122);
					unsignedConstant();
					}
					break;
				case 2:
					{
					setState(123);
					expression();
					}
					break;
				case 3:
					{
					setState(124);
					variable();
					}
					break;
				}
				setState(127);
				match(RPAREN);
				}
				break;
			case READLN:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				match(READLN);
				setState(130);
				match(LPAREN);
				setState(131);
				variable();
				setState(132);
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
		enterRule(_localctx, 8, RULE_structuredStatement);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				compoundStatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				ifStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				forStatement();
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
		enterRule(_localctx, 10, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(IF);
			setState(142);
			expression();
			setState(143);
			match(THEN);
			setState(144);
			statement();
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(145);
				match(ELSE);
				setState(146);
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
		enterRule(_localctx, 12, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(FOR);
			setState(150);
			variable();
			setState(151);
			match(ASSIGN);
			setState(152);
			forList();
			setState(153);
			match(DO);
			setState(154);
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
		enterRule(_localctx, 14, RULE_forList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			initialValue();
			setState(157);
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
			setState(158);
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
		enterRule(_localctx, 16, RULE_initialValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
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
		enterRule(_localctx, 18, RULE_finalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
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
		enterRule(_localctx, 20, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(BEGIN);
			setState(165);
			statements();
			setState(166);
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
		enterRule(_localctx, 22, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			statement();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(169);
				match(SEMI);
				setState(170);
				statement();
				}
				}
				setState(175);
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
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(INT);
				setState(177);
				match(COLON);
				setState(178);
				unlabelledStatement();
				}
				break;
			case WRITELN:
			case WRITE:
			case READLN:
			case BEGIN:
			case END:
			case IF:
			case ELSE:
			case FOR:
			case IDENT:
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
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
		enterRule(_localctx, 26, RULE_unlabelledStatement);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WRITELN:
			case WRITE:
			case READLN:
			case END:
			case ELSE:
			case IDENT:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				simpleStatement();
				}
				break;
			case BEGIN:
			case IF:
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
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
		enterRule(_localctx, 28, RULE_emptyStatement);
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
		enterRule(_localctx, 30, RULE_varDefBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(VAR);
			setState(189);
			varDef();
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(190);
					match(SEMI);
					setState(191);
					varDef();
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(197);
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
		enterRule(_localctx, 32, RULE_varDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			identifier();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(200);
				match(COMMA);
				setState(201);
				identifier();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			match(COLON);
			setState(208);
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
		enterRule(_localctx, 34, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
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
		enterRule(_localctx, 36, RULE_constDefBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(CONST);
			setState(216); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(213);
				constDef();
				setState(214);
				match(SEMI);
				}
				}
				setState(218); 
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
		enterRule(_localctx, 38, RULE_constDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			variable();
			setState(221);
			match(EQUAL);
			setState(222);
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
		enterRule(_localctx, 40, RULE_procAndFuncDefBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			procAndFuncDef();
			setState(225);
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
		enterRule(_localctx, 42, RULE_procAndFuncDef);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				procedureDeclaration();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
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
		enterRule(_localctx, 44, RULE_procedureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(PROCEDURE);
			setState(232);
			variable();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(233);
				formalParameterList();
				}
			}

			setState(236);
			match(SEMI);
			setState(237);
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
		enterRule(_localctx, 46, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(LPAREN);
			setState(240);
			parameterGroup();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(241);
				match(SEMI);
				setState(242);
				parameterGroup();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
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
		enterRule(_localctx, 48, RULE_parameterGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			identifier();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(251);
				match(COMMA);
				setState(252);
				identifier();
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			match(COLON);
			setState(259);
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
		enterRule(_localctx, 50, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(FUNCTION);
			setState(262);
			identifier();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(263);
				formalParameterList();
				}
			}

			setState(266);
			match(COLON);
			setState(267);
			resultType();
			setState(268);
			match(SEMI);
			setState(269);
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
		enterRule(_localctx, 52, RULE_resultType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
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
		public TerminalNode CHARACTER() { return getToken(PascaletParser.CHARACTER, 0); }
		public TerminalNode BOOLEAN() { return getToken(PascaletParser.BOOLEAN, 0); }
		public TerminalNode INTEGER() { return getToken(PascaletParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(PascaletParser.STRING, 0); }
		public TerminalNode REAL() { return getToken(PascaletParser.REAL, 0); }
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
		enterRule(_localctx, 54, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHARACTER) | (1L << BOOLEAN) | (1L << INTEGER) | (1L << STRING) | (1L << REAL))) != 0)) ) {
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
		enterRule(_localctx, 56, RULE_multiplicativeoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MOD) | (1L << AND) | (1L << STAR) | (1L << SLASH))) != 0)) ) {
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
		enterRule(_localctx, 58, RULE_additiveoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
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
		enterRule(_localctx, 60, RULE_relationaloperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
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
		enterRule(_localctx, 62, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			variable();
			setState(282);
			match(ASSIGN);
			setState(283);
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
		enterRule(_localctx, 64, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			simpleExpression();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << GT))) != 0)) {
				{
				setState(286);
				relationaloperator();
				setState(287);
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
		enterRule(_localctx, 66, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			term();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				setState(292);
				additiveoperator();
				setState(293);
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
		enterRule(_localctx, 68, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			signedFactor();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MOD) | (1L << AND) | (1L << STAR) | (1L << SLASH))) != 0)) {
				{
				setState(298);
				multiplicativeoperator();
				setState(299);
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
		enterRule(_localctx, 70, RULE_signedFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(303);
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

			setState(306);
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
		enterRule(_localctx, 72, RULE_factor);
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(LPAREN);
				setState(310);
				expression();
				setState(311);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				functionDesignator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(314);
				unsignedConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(315);
				match(NOT);
				setState(316);
				factor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(317);
				match(BOOL);
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
		enterRule(_localctx, 74, RULE_unsignedConstant);
		try {
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case REAL_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				unsignedNumber();
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(STR);
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
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
		enterRule(_localctx, 76, RULE_functionDesignator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			variable();
			setState(326);
			match(LPAREN);
			setState(327);
			parameterList();
			setState(328);
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
		enterRule(_localctx, 78, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			actualParameter();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(331);
				match(COMMA);
				setState(332);
				actualParameter();
				}
				}
				setState(337);
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
		enterRule(_localctx, 80, RULE_parameterwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(COLON);
			setState(339);
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
		enterRule(_localctx, 82, RULE_actualParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			expression();
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(342);
				parameterwidth();
				}
				}
				setState(347);
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
		enterRule(_localctx, 84, RULE_constant);
		int _la;
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				unsignedNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
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
				setState(350);
				unsignedNumber();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(352);
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
				setState(353);
				variable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(354);
				match(STR);
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
		public TerminalNode REAL_NUM() { return getToken(PascaletParser.REAL_NUM, 0); }
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
		enterRule(_localctx, 86, RULE_unsignedNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==REAL_NUM) ) {
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
		enterRule(_localctx, 88, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u016c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3f\n\3\f\3\16\3"+
		"i\13\3\3\3\3\3\3\4\3\4\3\4\5\4p\n\4\3\5\3\5\3\5\3\5\3\5\5\5w\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5\u0080\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0089"+
		"\n\5\3\6\3\6\3\6\5\6\u008e\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0096\n\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\7\r\u00ae\n\r\f\r\16\r\u00b1\13\r\3\16\3\16\3\16\3"+
		"\16\5\16\u00b7\n\16\3\17\3\17\5\17\u00bb\n\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\7\21\u00c3\n\21\f\21\16\21\u00c6\13\21\3\21\3\21\3\22\3\22\3\22"+
		"\7\22\u00cd\n\22\f\22\16\22\u00d0\13\22\3\22\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\6\24\u00db\n\24\r\24\16\24\u00dc\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\27\3\27\5\27\u00e8\n\27\3\30\3\30\3\30\5\30\u00ed\n\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u00f6\n\31\f\31\16\31\u00f9\13"+
		"\31\3\31\3\31\3\32\3\32\3\32\7\32\u0100\n\32\f\32\16\32\u0103\13\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\5\33\u010b\n\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\5\"\u0124\n\"\3#\3#\3#\3#\5#\u012a\n#\3$\3$\3$\3$\5$\u0130\n$\3%"+
		"\5%\u0133\n%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0141\n&\3\'\3\'\3"+
		"\'\5\'\u0146\n\'\3(\3(\3(\3(\3(\3)\3)\3)\7)\u0150\n)\f)\16)\u0153\13)"+
		"\3*\3*\3*\3+\3+\7+\u015a\n+\f+\16+\u015d\13+\3,\3,\3,\3,\3,\3,\3,\5,\u0166"+
		"\n,\3-\3-\3.\3.\3.\2\2/\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BDFHJLNPRTVXZ\2\t\4\2\16\16\20\20\5\2\26\27\31\32#"+
		"#\4\2\33\35-.\4\2\36\36+,\3\2%*\3\2+,\4\2!!$$\2\u0168\2\\\3\2\2\2\4g\3"+
		"\2\2\2\6o\3\2\2\2\b\u0088\3\2\2\2\n\u008d\3\2\2\2\f\u008f\3\2\2\2\16\u0097"+
		"\3\2\2\2\20\u009e\3\2\2\2\22\u00a2\3\2\2\2\24\u00a4\3\2\2\2\26\u00a6\3"+
		"\2\2\2\30\u00aa\3\2\2\2\32\u00b6\3\2\2\2\34\u00ba\3\2\2\2\36\u00bc\3\2"+
		"\2\2 \u00be\3\2\2\2\"\u00c9\3\2\2\2$\u00d4\3\2\2\2&\u00d6\3\2\2\2(\u00de"+
		"\3\2\2\2*\u00e2\3\2\2\2,\u00e7\3\2\2\2.\u00e9\3\2\2\2\60\u00f1\3\2\2\2"+
		"\62\u00fc\3\2\2\2\64\u0107\3\2\2\2\66\u0111\3\2\2\28\u0113\3\2\2\2:\u0115"+
		"\3\2\2\2<\u0117\3\2\2\2>\u0119\3\2\2\2@\u011b\3\2\2\2B\u011f\3\2\2\2D"+
		"\u0125\3\2\2\2F\u012b\3\2\2\2H\u0132\3\2\2\2J\u0140\3\2\2\2L\u0145\3\2"+
		"\2\2N\u0147\3\2\2\2P\u014c\3\2\2\2R\u0154\3\2\2\2T\u0157\3\2\2\2V\u0165"+
		"\3\2\2\2X\u0167\3\2\2\2Z\u0169\3\2\2\2\\]\7\6\2\2]^\5Z.\2^_\7\60\2\2_"+
		"`\5\4\3\2`a\7\63\2\2a\3\3\2\2\2bf\5 \21\2cf\5&\24\2df\5*\26\2eb\3\2\2"+
		"\2ec\3\2\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2"+
		"\2jk\5\26\f\2k\5\3\2\2\2lp\5@!\2mp\5\b\5\2np\5\36\20\2ol\3\2\2\2om\3\2"+
		"\2\2on\3\2\2\2p\7\3\2\2\2qr\7\3\2\2rv\7\64\2\2sw\5L\'\2tw\5B\"\2uw\5$"+
		"\23\2vs\3\2\2\2vt\3\2\2\2vu\3\2\2\2wx\3\2\2\2xy\7\65\2\2y\u0089\3\2\2"+
		"\2z{\7\4\2\2{\177\7\64\2\2|\u0080\5L\'\2}\u0080\5B\"\2~\u0080\5$\23\2"+
		"\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082"+
		"\7\65\2\2\u0082\u0089\3\2\2\2\u0083\u0084\7\5\2\2\u0084\u0085\7\64\2\2"+
		"\u0085\u0086\5$\23\2\u0086\u0087\7\65\2\2\u0087\u0089\3\2\2\2\u0088q\3"+
		"\2\2\2\u0088z\3\2\2\2\u0088\u0083\3\2\2\2\u0089\t\3\2\2\2\u008a\u008e"+
		"\5\26\f\2\u008b\u008e\5\f\7\2\u008c\u008e\5\16\b\2\u008d\u008a\3\2\2\2"+
		"\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\13\3\2\2\2\u008f\u0090"+
		"\7\13\2\2\u0090\u0091\5B\"\2\u0091\u0092\7\f\2\2\u0092\u0095\5\32\16\2"+
		"\u0093\u0094\7\r\2\2\u0094\u0096\5\32\16\2\u0095\u0093\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\r\3\2\2\2\u0097\u0098\7\17\2\2\u0098\u0099\5$\23\2\u0099"+
		"\u009a\7/\2\2\u009a\u009b\5\20\t\2\u009b\u009c\7\21\2\2\u009c\u009d\5"+
		"\32\16\2\u009d\17\3\2\2\2\u009e\u009f\5\22\n\2\u009f\u00a0\t\2\2\2\u00a0"+
		"\u00a1\5\24\13\2\u00a1\21\3\2\2\2\u00a2\u00a3\5B\"\2\u00a3\23\3\2\2\2"+
		"\u00a4\u00a5\5B\"\2\u00a5\25\3\2\2\2\u00a6\u00a7\7\t\2\2\u00a7\u00a8\5"+
		"\30\r\2\u00a8\u00a9\7\n\2\2\u00a9\27\3\2\2\2\u00aa\u00af\5\32\16\2\u00ab"+
		"\u00ac\7\60\2\2\u00ac\u00ae\5\32\16\2\u00ad\u00ab\3\2\2\2\u00ae\u00b1"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\31\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b3\7!\2\2\u00b3\u00b4\7\62\2\2\u00b4\u00b7\5\34"+
		"\17\2\u00b5\u00b7\5\34\17\2\u00b6\u00b2\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7"+
		"\33\3\2\2\2\u00b8\u00bb\5\6\4\2\u00b9\u00bb\5\n\6\2\u00ba\u00b8\3\2\2"+
		"\2\u00ba\u00b9\3\2\2\2\u00bb\35\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\37\3"+
		"\2\2\2\u00be\u00bf\7\23\2\2\u00bf\u00c4\5\"\22\2\u00c0\u00c1\7\60\2\2"+
		"\u00c1\u00c3\5\"\22\2\u00c2\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7"+
		"\u00c8\7\60\2\2\u00c8!\3\2\2\2\u00c9\u00ce\5Z.\2\u00ca\u00cb\7\61\2\2"+
		"\u00cb\u00cd\5Z.\2\u00cc\u00ca\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\u00d2\7\62\2\2\u00d2\u00d3\58\35\2\u00d3#\3\2\2\2\u00d4\u00d5\7\37\2"+
		"\2\u00d5%\3\2\2\2\u00d6\u00da\7\22\2\2\u00d7\u00d8\5(\25\2\u00d8\u00d9"+
		"\7\60\2\2\u00d9\u00db\3\2\2\2\u00da\u00d7\3\2\2\2\u00db\u00dc\3\2\2\2"+
		"\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\'\3\2\2\2\u00de\u00df\5"+
		"$\23\2\u00df\u00e0\7%\2\2\u00e0\u00e1\5V,\2\u00e1)\3\2\2\2\u00e2\u00e3"+
		"\5,\27\2\u00e3\u00e4\7\60\2\2\u00e4+\3\2\2\2\u00e5\u00e8\5.\30\2\u00e6"+
		"\u00e8\5\64\33\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8-\3\2\2"+
		"\2\u00e9\u00ea\7\b\2\2\u00ea\u00ec\5$\23\2\u00eb\u00ed\5\60\31\2\u00ec"+
		"\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\7\60"+
		"\2\2\u00ef\u00f0\5\4\3\2\u00f0/\3\2\2\2\u00f1\u00f2\7\64\2\2\u00f2\u00f7"+
		"\5\62\32\2\u00f3\u00f4\7\60\2\2\u00f4\u00f6\5\62\32\2\u00f5\u00f3\3\2"+
		"\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7\65\2\2\u00fb\61\3\2\2"+
		"\2\u00fc\u0101\5Z.\2\u00fd\u00fe\7\61\2\2\u00fe\u0100\5Z.\2\u00ff\u00fd"+
		"\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\7\62\2\2\u0105\u0106\5"+
		"8\35\2\u0106\63\3\2\2\2\u0107\u0108\7\7\2\2\u0108\u010a\5Z.\2\u0109\u010b"+
		"\5\60\31\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2"+
		"\u010c\u010d\7\62\2\2\u010d\u010e\5\66\34\2\u010e\u010f\7\60\2\2\u010f"+
		"\u0110\5\4\3\2\u0110\65\3\2\2\2\u0111\u0112\58\35\2\u0112\67\3\2\2\2\u0113"+
		"\u0114\t\3\2\2\u01149\3\2\2\2\u0115\u0116\t\4\2\2\u0116;\3\2\2\2\u0117"+
		"\u0118\t\5\2\2\u0118=\3\2\2\2\u0119\u011a\t\6\2\2\u011a?\3\2\2\2\u011b"+
		"\u011c\5$\23\2\u011c\u011d\7/\2\2\u011d\u011e\5B\"\2\u011eA\3\2\2\2\u011f"+
		"\u0123\5D#\2\u0120\u0121\5> \2\u0121\u0122\5B\"\2\u0122\u0124\3\2\2\2"+
		"\u0123\u0120\3\2\2\2\u0123\u0124\3\2\2\2\u0124C\3\2\2\2\u0125\u0129\5"+
		"F$\2\u0126\u0127\5<\37\2\u0127\u0128\5D#\2\u0128\u012a\3\2\2\2\u0129\u0126"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012aE\3\2\2\2\u012b\u012f\5H%\2\u012c\u012d"+
		"\5:\36\2\u012d\u012e\5F$\2\u012e\u0130\3\2\2\2\u012f\u012c\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130G\3\2\2\2\u0131\u0133\t\7\2\2\u0132\u0131\3\2\2\2"+
		"\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\5J&\2\u0135I\3\2"+
		"\2\2\u0136\u0141\5$\23\2\u0137\u0138\7\64\2\2\u0138\u0139\5B\"\2\u0139"+
		"\u013a\7\65\2\2\u013a\u0141\3\2\2\2\u013b\u0141\5N(\2\u013c\u0141\5L\'"+
		"\2\u013d\u013e\7\25\2\2\u013e\u0141\5J&\2\u013f\u0141\7\30\2\2\u0140\u0136"+
		"\3\2\2\2\u0140\u0137\3\2\2\2\u0140\u013b\3\2\2\2\u0140\u013c\3\2\2\2\u0140"+
		"\u013d\3\2\2\2\u0140\u013f\3\2\2\2\u0141K\3\2\2\2\u0142\u0146\5X-\2\u0143"+
		"\u0146\7\"\2\2\u0144\u0146\7\24\2\2\u0145\u0142\3\2\2\2\u0145\u0143\3"+
		"\2\2\2\u0145\u0144\3\2\2\2\u0146M\3\2\2\2\u0147\u0148\5$\23\2\u0148\u0149"+
		"\7\64\2\2\u0149\u014a\5P)\2\u014a\u014b\7\65\2\2\u014bO\3\2\2\2\u014c"+
		"\u0151\5T+\2\u014d\u014e\7\61\2\2\u014e\u0150\5T+\2\u014f\u014d\3\2\2"+
		"\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152Q"+
		"\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\7\62\2\2\u0155\u0156\5B\"\2\u0156"+
		"S\3\2\2\2\u0157\u015b\5B\"\2\u0158\u015a\5R*\2\u0159\u0158\3\2\2\2\u015a"+
		"\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015cU\3\2\2\2"+
		"\u015d\u015b\3\2\2\2\u015e\u0166\5X-\2\u015f\u0160\t\7\2\2\u0160\u0166"+
		"\5X-\2\u0161\u0166\5$\23\2\u0162\u0163\t\7\2\2\u0163\u0166\5$\23\2\u0164"+
		"\u0166\7\"\2\2\u0165\u015e\3\2\2\2\u0165\u015f\3\2\2\2\u0165\u0161\3\2"+
		"\2\2\u0165\u0162\3\2\2\2\u0165\u0164\3\2\2\2\u0166W\3\2\2\2\u0167\u0168"+
		"\t\b\2\2\u0168Y\3\2\2\2\u0169\u016a\7\37\2\2\u016a[\3\2\2\2\36egov\177"+
		"\u0088\u008d\u0095\u00af\u00b6\u00ba\u00c4\u00ce\u00dc\u00e7\u00ec\u00f7"+
		"\u0101\u010a\u0123\u0129\u012f\u0132\u0140\u0145\u0151\u015b\u0165";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
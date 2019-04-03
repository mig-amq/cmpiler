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
		RULE_parameterGroup = 24, RULE_functionDeclaration = 25, RULE_identifierList = 26, 
		RULE_resultType = 27, RULE_type = 28, RULE_multiplicativeoperator = 29, 
		RULE_additiveoperator = 30, RULE_relationaloperator = 31, RULE_assignmentStatement = 32, 
		RULE_expression = 33, RULE_simpleExpression = 34, RULE_term = 35, RULE_signedFactor = 36, 
		RULE_factor = 37, RULE_unsignedConstant = 38, RULE_functionDesignator = 39, 
		RULE_parameterList = 40, RULE_parameterwidth = 41, RULE_actualParameter = 42, 
		RULE_constant = 43, RULE_unsignedNumber = 44, RULE_identifier = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "simpleStatement", "builtInFuncStatement", "structuredStatement", 
			"ifStatement", "forStatement", "forList", "initialValue", "finalValue", 
			"compoundStatement", "statements", "statement", "unlabelledStatement", 
			"emptyStatement", "varDefBlock", "varDef", "variable", "constDefBlock", 
			"constDef", "procAndFuncDefBlock", "procAndFuncDef", "procedureDeclaration", 
			"formalParameterList", "parameterGroup", "functionDeclaration", "identifierList", 
			"resultType", "type", "multiplicativeoperator", "additiveoperator", "relationaloperator", 
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
			setState(92);
			match(PROGRAM);
			setState(93);
			identifier();
			setState(94);
			match(SEMI);
			setState(95);
			block();
			setState(96);
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
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << PROCEDURE) | (1L << CONST) | (1L << VAR))) != 0)) {
				{
				setState(101);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(98);
					varDefBlock();
					}
					break;
				case CONST:
					{
					setState(99);
					constDefBlock();
					}
					break;
				case FUNCTION:
				case PROCEDURE:
					{
					setState(100);
					procAndFuncDefBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
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
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				assignmentStatement();
				}
				break;
			case WRITELN:
			case WRITE:
			case READLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				builtInFuncStatement();
				}
				break;
			case END:
			case ELSE:
			case SEMI:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
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
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WRITELN:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(WRITELN);
				setState(114);
				match(LPAREN);
				setState(118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(115);
					unsignedConstant();
					}
					break;
				case 2:
					{
					setState(116);
					expression();
					}
					break;
				case 3:
					{
					setState(117);
					variable();
					}
					break;
				}
				setState(120);
				match(RPAREN);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(WRITE);
				setState(123);
				match(LPAREN);
				setState(127);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(124);
					unsignedConstant();
					}
					break;
				case 2:
					{
					setState(125);
					expression();
					}
					break;
				case 3:
					{
					setState(126);
					variable();
					}
					break;
				}
				setState(129);
				match(RPAREN);
				}
				break;
			case READLN:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(READLN);
				setState(132);
				match(LPAREN);
				setState(133);
				variable();
				setState(134);
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
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				compoundStatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				ifStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
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
			setState(143);
			match(IF);
			setState(144);
			expression();
			setState(145);
			match(THEN);
			setState(146);
			statement();
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(147);
				match(ELSE);
				setState(148);
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
			setState(151);
			match(FOR);
			setState(152);
			variable();
			setState(153);
			match(ASSIGN);
			setState(154);
			forList();
			setState(155);
			match(DO);
			setState(156);
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
			setState(158);
			initialValue();
			setState(159);
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
			setState(160);
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
			setState(164);
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
			setState(166);
			match(BEGIN);
			setState(167);
			statements();
			setState(168);
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
			setState(170);
			statement();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(171);
				match(SEMI);
				setState(172);
				statement();
				}
				}
				setState(177);
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
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(INT);
				setState(179);
				match(COLON);
				setState(180);
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
				setState(181);
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
			setState(186);
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
				setState(184);
				simpleStatement();
				}
				break;
			case BEGIN:
			case IF:
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
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
			setState(190);
			match(VAR);
			setState(191);
			varDef();
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(192);
					match(SEMI);
					setState(193);
					varDef();
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(199);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascaletParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
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
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				identifier();
				setState(202);
				match(COLON);
				setState(203);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				identifierList();
				setState(206);
				match(COLON);
				setState(207);
				type();
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
			setState(211);
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
			setState(213);
			match(CONST);
			setState(217); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(214);
				constDef();
				setState(215);
				match(SEMI);
				}
				}
				setState(219); 
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
			setState(221);
			variable();
			setState(222);
			match(EQUAL);
			setState(223);
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
			setState(225);
			procAndFuncDef();
			setState(226);
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
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				procedureDeclaration();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
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
			setState(232);
			match(PROCEDURE);
			setState(233);
			variable();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(234);
				formalParameterList();
				}
			}

			setState(237);
			match(SEMI);
			setState(238);
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
			setState(240);
			match(LPAREN);
			setState(241);
			parameterGroup();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(242);
				match(SEMI);
				setState(243);
				parameterGroup();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
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
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascaletParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			identifierList();
			setState(252);
			match(COLON);
			setState(253);
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
			setState(255);
			match(FUNCTION);
			setState(256);
			identifier();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(257);
				formalParameterList();
				}
			}

			setState(260);
			match(COLON);
			setState(261);
			resultType();
			setState(262);
			match(SEMI);
			setState(263);
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascaletParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascaletParser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascaletListener ) ((PascaletListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascaletVisitor ) return ((PascaletVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			identifier();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(266);
				match(COMMA);
				setState(267);
				identifier();
				}
				}
				setState(272);
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
		enterRule(_localctx, 54, RULE_resultType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
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
		enterRule(_localctx, 56, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
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
		enterRule(_localctx, 58, RULE_multiplicativeoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
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
		enterRule(_localctx, 60, RULE_additiveoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
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
		enterRule(_localctx, 62, RULE_relationaloperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
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
		enterRule(_localctx, 64, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			variable();
			setState(284);
			match(ASSIGN);
			setState(285);
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
		enterRule(_localctx, 66, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			simpleExpression();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << GT))) != 0)) {
				{
				setState(288);
				relationaloperator();
				setState(289);
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
		enterRule(_localctx, 68, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			term();
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				setState(294);
				additiveoperator();
				setState(295);
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
		enterRule(_localctx, 70, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			signedFactor();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MOD) | (1L << AND) | (1L << STAR) | (1L << SLASH))) != 0)) {
				{
				setState(300);
				multiplicativeoperator();
				setState(301);
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
		enterRule(_localctx, 72, RULE_signedFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(305);
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

			setState(308);
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
		enterRule(_localctx, 74, RULE_factor);
		try {
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(LPAREN);
				setState(312);
				expression();
				setState(313);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				functionDesignator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(316);
				unsignedConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(317);
				match(NOT);
				setState(318);
				factor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(319);
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
		enterRule(_localctx, 76, RULE_unsignedConstant);
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case REAL_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				unsignedNumber();
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(STR);
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
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
		enterRule(_localctx, 78, RULE_functionDesignator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			variable();
			setState(328);
			match(LPAREN);
			setState(329);
			parameterList();
			setState(330);
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
		enterRule(_localctx, 80, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			actualParameter();
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(333);
				match(COMMA);
				setState(334);
				actualParameter();
				}
				}
				setState(339);
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
		enterRule(_localctx, 82, RULE_parameterwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(COLON);
			setState(341);
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
		enterRule(_localctx, 84, RULE_actualParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			expression();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(344);
				parameterwidth();
				}
				}
				setState(349);
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
		enterRule(_localctx, 86, RULE_constant);
		int _la;
		try {
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				unsignedNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
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
				setState(352);
				unsignedNumber();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(354);
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
				setState(355);
				variable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(356);
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
		enterRule(_localctx, 88, RULE_unsignedNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
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
		enterRule(_localctx, 90, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u016e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3h\n\3\f"+
		"\3\16\3k\13\3\3\3\3\3\3\4\3\4\3\4\5\4r\n\4\3\5\3\5\3\5\3\5\3\5\5\5y\n"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0082\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\u008b\n\5\3\6\3\6\3\6\5\6\u0090\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u0098\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u00b0\n\r\f\r\16\r\u00b3\13\r\3\16"+
		"\3\16\3\16\3\16\5\16\u00b9\n\16\3\17\3\17\5\17\u00bd\n\17\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\7\21\u00c5\n\21\f\21\16\21\u00c8\13\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d4\n\22\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\6\24\u00dc\n\24\r\24\16\24\u00dd\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\27\3\27\5\27\u00e9\n\27\3\30\3\30\3\30\5\30\u00ee\n\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u00f7\n\31\f\31\16\31\u00fa\13"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\5\33\u0105\n\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\7\34\u010f\n\34\f\34\16\34\u0112\13"+
		"\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\5#\u0126\n#\3$\3$\3$\3$\5$\u012c\n$\3%\3%\3%\3%\5%\u0132\n%\3&\5"+
		"&\u0135\n&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0143\n\'"+
		"\3(\3(\3(\5(\u0148\n(\3)\3)\3)\3)\3)\3*\3*\3*\7*\u0152\n*\f*\16*\u0155"+
		"\13*\3+\3+\3+\3,\3,\7,\u015c\n,\f,\16,\u015f\13,\3-\3-\3-\3-\3-\3-\3-"+
		"\5-\u0168\n-\3.\3.\3/\3/\3/\2\2\60\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\t\4\2\16\16\20\20\5\2\26"+
		"\27\31\32##\4\2\33\35-.\4\2\36\36+,\3\2%*\3\2+,\4\2!!$$\2\u0169\2^\3\2"+
		"\2\2\4i\3\2\2\2\6q\3\2\2\2\b\u008a\3\2\2\2\n\u008f\3\2\2\2\f\u0091\3\2"+
		"\2\2\16\u0099\3\2\2\2\20\u00a0\3\2\2\2\22\u00a4\3\2\2\2\24\u00a6\3\2\2"+
		"\2\26\u00a8\3\2\2\2\30\u00ac\3\2\2\2\32\u00b8\3\2\2\2\34\u00bc\3\2\2\2"+
		"\36\u00be\3\2\2\2 \u00c0\3\2\2\2\"\u00d3\3\2\2\2$\u00d5\3\2\2\2&\u00d7"+
		"\3\2\2\2(\u00df\3\2\2\2*\u00e3\3\2\2\2,\u00e8\3\2\2\2.\u00ea\3\2\2\2\60"+
		"\u00f2\3\2\2\2\62\u00fd\3\2\2\2\64\u0101\3\2\2\2\66\u010b\3\2\2\28\u0113"+
		"\3\2\2\2:\u0115\3\2\2\2<\u0117\3\2\2\2>\u0119\3\2\2\2@\u011b\3\2\2\2B"+
		"\u011d\3\2\2\2D\u0121\3\2\2\2F\u0127\3\2\2\2H\u012d\3\2\2\2J\u0134\3\2"+
		"\2\2L\u0142\3\2\2\2N\u0147\3\2\2\2P\u0149\3\2\2\2R\u014e\3\2\2\2T\u0156"+
		"\3\2\2\2V\u0159\3\2\2\2X\u0167\3\2\2\2Z\u0169\3\2\2\2\\\u016b\3\2\2\2"+
		"^_\7\6\2\2_`\5\\/\2`a\7\60\2\2ab\5\4\3\2bc\7\63\2\2c\3\3\2\2\2dh\5 \21"+
		"\2eh\5&\24\2fh\5*\26\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2"+
		"\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\5\26\f\2m\5\3\2\2\2nr\5B\"\2or\5\b"+
		"\5\2pr\5\36\20\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2r\7\3\2\2\2st\7\3\2\2tx"+
		"\7\64\2\2uy\5N(\2vy\5D#\2wy\5$\23\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2yz\3"+
		"\2\2\2z{\7\65\2\2{\u008b\3\2\2\2|}\7\4\2\2}\u0081\7\64\2\2~\u0082\5N("+
		"\2\177\u0082\5D#\2\u0080\u0082\5$\23\2\u0081~\3\2\2\2\u0081\177\3\2\2"+
		"\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\7\65\2\2\u0084"+
		"\u008b\3\2\2\2\u0085\u0086\7\5\2\2\u0086\u0087\7\64\2\2\u0087\u0088\5"+
		"$\23\2\u0088\u0089\7\65\2\2\u0089\u008b\3\2\2\2\u008as\3\2\2\2\u008a|"+
		"\3\2\2\2\u008a\u0085\3\2\2\2\u008b\t\3\2\2\2\u008c\u0090\5\26\f\2\u008d"+
		"\u0090\5\f\7\2\u008e\u0090\5\16\b\2\u008f\u008c\3\2\2\2\u008f\u008d\3"+
		"\2\2\2\u008f\u008e\3\2\2\2\u0090\13\3\2\2\2\u0091\u0092\7\13\2\2\u0092"+
		"\u0093\5D#\2\u0093\u0094\7\f\2\2\u0094\u0097\5\32\16\2\u0095\u0096\7\r"+
		"\2\2\u0096\u0098\5\32\16\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\r\3\2\2\2\u0099\u009a\7\17\2\2\u009a\u009b\5$\23\2\u009b\u009c\7/\2\2"+
		"\u009c\u009d\5\20\t\2\u009d\u009e\7\21\2\2\u009e\u009f\5\32\16\2\u009f"+
		"\17\3\2\2\2\u00a0\u00a1\5\22\n\2\u00a1\u00a2\t\2\2\2\u00a2\u00a3\5\24"+
		"\13\2\u00a3\21\3\2\2\2\u00a4\u00a5\5D#\2\u00a5\23\3\2\2\2\u00a6\u00a7"+
		"\5D#\2\u00a7\25\3\2\2\2\u00a8\u00a9\7\t\2\2\u00a9\u00aa\5\30\r\2\u00aa"+
		"\u00ab\7\n\2\2\u00ab\27\3\2\2\2\u00ac\u00b1\5\32\16\2\u00ad\u00ae\7\60"+
		"\2\2\u00ae\u00b0\5\32\16\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\31\3\2\2\2\u00b3\u00b1\3\2\2"+
		"\2\u00b4\u00b5\7!\2\2\u00b5\u00b6\7\62\2\2\u00b6\u00b9\5\34\17\2\u00b7"+
		"\u00b9\5\34\17\2\u00b8\u00b4\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\33\3\2"+
		"\2\2\u00ba\u00bd\5\6\4\2\u00bb\u00bd\5\n\6\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bb\3\2\2\2\u00bd\35\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\37\3\2\2\2\u00c0"+
		"\u00c1\7\23\2\2\u00c1\u00c6\5\"\22\2\u00c2\u00c3\7\60\2\2\u00c3\u00c5"+
		"\5\"\22\2\u00c4\u00c2\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2"+
		"\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca"+
		"\7\60\2\2\u00ca!\3\2\2\2\u00cb\u00cc\5\\/\2\u00cc\u00cd\7\62\2\2\u00cd"+
		"\u00ce\5:\36\2\u00ce\u00d4\3\2\2\2\u00cf\u00d0\5\66\34\2\u00d0\u00d1\7"+
		"\62\2\2\u00d1\u00d2\5:\36\2\u00d2\u00d4\3\2\2\2\u00d3\u00cb\3\2\2\2\u00d3"+
		"\u00cf\3\2\2\2\u00d4#\3\2\2\2\u00d5\u00d6\7\37\2\2\u00d6%\3\2\2\2\u00d7"+
		"\u00db\7\22\2\2\u00d8\u00d9\5(\25\2\u00d9\u00da\7\60\2\2\u00da\u00dc\3"+
		"\2\2\2\u00db\u00d8\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\'\3\2\2\2\u00df\u00e0\5$\23\2\u00e0\u00e1\7%\2\2"+
		"\u00e1\u00e2\5X-\2\u00e2)\3\2\2\2\u00e3\u00e4\5,\27\2\u00e4\u00e5\7\60"+
		"\2\2\u00e5+\3\2\2\2\u00e6\u00e9\5.\30\2\u00e7\u00e9\5\64\33\2\u00e8\u00e6"+
		"\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9-\3\2\2\2\u00ea\u00eb\7\b\2\2\u00eb"+
		"\u00ed\5$\23\2\u00ec\u00ee\5\60\31\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3"+
		"\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\7\60\2\2\u00f0\u00f1\5\4\3\2\u00f1"+
		"/\3\2\2\2\u00f2\u00f3\7\64\2\2\u00f3\u00f8\5\62\32\2\u00f4\u00f5\7\60"+
		"\2\2\u00f5\u00f7\5\62\32\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fb\u00fc\7\65\2\2\u00fc\61\3\2\2\2\u00fd\u00fe\5\66\34\2\u00fe"+
		"\u00ff\7\62\2\2\u00ff\u0100\5:\36\2\u0100\63\3\2\2\2\u0101\u0102\7\7\2"+
		"\2\u0102\u0104\5\\/\2\u0103\u0105\5\60\31\2\u0104\u0103\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\7\62\2\2\u0107\u0108\5"+
		"8\35\2\u0108\u0109\7\60\2\2\u0109\u010a\5\4\3\2\u010a\65\3\2\2\2\u010b"+
		"\u0110\5\\/\2\u010c\u010d\7\61\2\2\u010d\u010f\5\\/\2\u010e\u010c\3\2"+
		"\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\67\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\5:\36\2\u01149\3\2\2\2\u0115"+
		"\u0116\t\3\2\2\u0116;\3\2\2\2\u0117\u0118\t\4\2\2\u0118=\3\2\2\2\u0119"+
		"\u011a\t\5\2\2\u011a?\3\2\2\2\u011b\u011c\t\6\2\2\u011cA\3\2\2\2\u011d"+
		"\u011e\5$\23\2\u011e\u011f\7/\2\2\u011f\u0120\5D#\2\u0120C\3\2\2\2\u0121"+
		"\u0125\5F$\2\u0122\u0123\5@!\2\u0123\u0124\5D#\2\u0124\u0126\3\2\2\2\u0125"+
		"\u0122\3\2\2\2\u0125\u0126\3\2\2\2\u0126E\3\2\2\2\u0127\u012b\5H%\2\u0128"+
		"\u0129\5> \2\u0129\u012a\5F$\2\u012a\u012c\3\2\2\2\u012b\u0128\3\2\2\2"+
		"\u012b\u012c\3\2\2\2\u012cG\3\2\2\2\u012d\u0131\5J&\2\u012e\u012f\5<\37"+
		"\2\u012f\u0130\5H%\2\u0130\u0132\3\2\2\2\u0131\u012e\3\2\2\2\u0131\u0132"+
		"\3\2\2\2\u0132I\3\2\2\2\u0133\u0135\t\7\2\2\u0134\u0133\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\5L\'\2\u0137K\3\2\2\2\u0138"+
		"\u0143\5$\23\2\u0139\u013a\7\64\2\2\u013a\u013b\5D#\2\u013b\u013c\7\65"+
		"\2\2\u013c\u0143\3\2\2\2\u013d\u0143\5P)\2\u013e\u0143\5N(\2\u013f\u0140"+
		"\7\25\2\2\u0140\u0143\5L\'\2\u0141\u0143\7\30\2\2\u0142\u0138\3\2\2\2"+
		"\u0142\u0139\3\2\2\2\u0142\u013d\3\2\2\2\u0142\u013e\3\2\2\2\u0142\u013f"+
		"\3\2\2\2\u0142\u0141\3\2\2\2\u0143M\3\2\2\2\u0144\u0148\5Z.\2\u0145\u0148"+
		"\7\"\2\2\u0146\u0148\7\24\2\2\u0147\u0144\3\2\2\2\u0147\u0145\3\2\2\2"+
		"\u0147\u0146\3\2\2\2\u0148O\3\2\2\2\u0149\u014a\5$\23\2\u014a\u014b\7"+
		"\64\2\2\u014b\u014c\5R*\2\u014c\u014d\7\65\2\2\u014dQ\3\2\2\2\u014e\u0153"+
		"\5V,\2\u014f\u0150\7\61\2\2\u0150\u0152\5V,\2\u0151\u014f\3\2\2\2\u0152"+
		"\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154S\3\2\2\2"+
		"\u0155\u0153\3\2\2\2\u0156\u0157\7\62\2\2\u0157\u0158\5D#\2\u0158U\3\2"+
		"\2\2\u0159\u015d\5D#\2\u015a\u015c\5T+\2\u015b\u015a\3\2\2\2\u015c\u015f"+
		"\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015eW\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u0160\u0168\5Z.\2\u0161\u0162\t\7\2\2\u0162\u0168\5Z.\2"+
		"\u0163\u0168\5$\23\2\u0164\u0165\t\7\2\2\u0165\u0168\5$\23\2\u0166\u0168"+
		"\7\"\2\2\u0167\u0160\3\2\2\2\u0167\u0161\3\2\2\2\u0167\u0163\3\2\2\2\u0167"+
		"\u0164\3\2\2\2\u0167\u0166\3\2\2\2\u0168Y\3\2\2\2\u0169\u016a\t\b\2\2"+
		"\u016a[\3\2\2\2\u016b\u016c\7\37\2\2\u016c]\3\2\2\2\36giqx\u0081\u008a"+
		"\u008f\u0097\u00b1\u00b8\u00bc\u00c6\u00d3\u00dd\u00e8\u00ed\u00f8\u0104"+
		"\u0110\u0125\u012b\u0131\u0134\u0142\u0147\u0153\u015d\u0167";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
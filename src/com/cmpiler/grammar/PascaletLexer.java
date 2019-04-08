// Generated from C:\Users\Miguel\Desktop\Pascalet\src\com\cmpiler\grammar\Pascalet.g4 by ANTLR 4.7.2
package com.cmpiler.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascaletLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INC", "DEC", "ABS", "CHR", "ARCTAN", "COS", "LN", "ROUND", "SIN", "SQR", 
			"SQRT", "TRUNC", "EXP", "ORD", "PRED", "SUCC", "DOUBLE", "WRITELN", "WRITE", 
			"READLN", "PROGRAM", "FUNCTION", "PROCEDURE", "BEGIN", "END", "IF", "OF", 
			"THEN", "ELSE", "TO", "FOR", "WHILE", "REPEAT", "UNTIL", "DOWNTO", "DO", 
			"CONST", "VAR", "NIL", "NOT", "CHARACTER", "BOOLEAN", "BOOL", "INTEGER", 
			"ARRAY", "STRING", "DIV", "MOD", "AND", "OR", "IDENT", "STR", "CHAR", 
			"INT", "RNUM", "EQUAL", "NOT_EQUAL", "LT", "LE", "GE", "GT", "PLUS", 
			"MINUS", "STAR", "SLASH", "ASSIGN", "SEMI", "COMMA", "COLON", "DOT", 
			"DOTDOT", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "LBRACK2", "RBRACK2", 
			"EXPONENT", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", 
			"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", 
			"COMMENT_1", "COMMENT_2", "COMMENT_3", "WS"
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


	public PascaletLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pascalet.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2S\u02ae\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3"+
		"*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u01c2"+
		"\n,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\64\3\64\7\64\u01ea\n\64\f\64\16\64\u01ed\13\64\3\65\3\65\3\65\3\65"+
		"\7\65\u01f3\n\65\f\65\16\65\u01f6\13\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\5\66\u01fe\n\66\3\66\3\66\3\67\6\67\u0203\n\67\r\67\16\67\u0204\38\6"+
		"8\u0208\n8\r8\168\u0209\38\38\68\u020e\n8\r8\168\u020f\38\58\u0213\n8"+
		"\58\u0215\n8\38\58\u0218\n8\39\39\3:\3:\3:\3;\3;\3<\3<\3<\3=\3=\3=\3>"+
		"\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3H"+
		"\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3M\3N\3N\3N\3O\3O\5O\u024f\nO\3O\3O\3P"+
		"\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3["+
		"\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\3a\3b\3b\3c\3c\3d\3d\3e\3e\3f\3f\3"+
		"g\3g\3h\3h\3i\3i\3j\3j\3j\3j\7j\u028b\nj\fj\16j\u028e\13j\3j\3j\3j\3j"+
		"\3j\3k\3k\7k\u0297\nk\fk\16k\u029a\13k\3k\3k\3k\3k\3l\3l\3l\3l\7l\u02a4"+
		"\nl\fl\16l\u02a7\13l\3l\3l\3m\3m\3m\3m\5\u028c\u0298\u02a5\2n\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w"+
		"=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091"+
		"J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5"+
		"\2\u00a7\2\u00a9\2\u00ab\2\u00ad\2\u00af\2\u00b1\2\u00b3\2\u00b5\2\u00b7"+
		"\2\u00b9\2\u00bb\2\u00bd\2\u00bf\2\u00c1\2\u00c3\2\u00c5\2\u00c7\2\u00c9"+
		"\2\u00cb\2\u00cd\2\u00cf\2\u00d1\2\u00d3P\u00d5Q\u00d7R\u00d9S\3\2\"\4"+
		"\2C\\c|\6\2\62;C\\aac|\3\2))\3\2\62;\4\2--//\4\2CCcc\4\2DDdd\4\2EEee\4"+
		"\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNn"+
		"n\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2"+
		"WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\5\2\13\f\17\17\"\"\2\u02a1"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2"+
		"\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\3\u00db\3\2\2\2\5\u00df\3\2\2\2\7\u00e3"+
		"\3\2\2\2\t\u00e7\3\2\2\2\13\u00eb\3\2\2\2\r\u00f2\3\2\2\2\17\u00f6\3\2"+
		"\2\2\21\u00f9\3\2\2\2\23\u00ff\3\2\2\2\25\u0103\3\2\2\2\27\u0107\3\2\2"+
		"\2\31\u010c\3\2\2\2\33\u0112\3\2\2\2\35\u0116\3\2\2\2\37\u011a\3\2\2\2"+
		"!\u011f\3\2\2\2#\u0124\3\2\2\2%\u0129\3\2\2\2\'\u0131\3\2\2\2)\u0137\3"+
		"\2\2\2+\u013e\3\2\2\2-\u0146\3\2\2\2/\u014f\3\2\2\2\61\u0159\3\2\2\2\63"+
		"\u015f\3\2\2\2\65\u0163\3\2\2\2\67\u0166\3\2\2\29\u0169\3\2\2\2;\u016e"+
		"\3\2\2\2=\u0173\3\2\2\2?\u0176\3\2\2\2A\u017a\3\2\2\2C\u0180\3\2\2\2E"+
		"\u0187\3\2\2\2G\u018d\3\2\2\2I\u0194\3\2\2\2K\u0197\3\2\2\2M\u019d\3\2"+
		"\2\2O\u01a1\3\2\2\2Q\u01a5\3\2\2\2S\u01a9\3\2\2\2U\u01ae\3\2\2\2W\u01c1"+
		"\3\2\2\2Y\u01c3\3\2\2\2[\u01cb\3\2\2\2]\u01d1\3\2\2\2_\u01d8\3\2\2\2a"+
		"\u01dc\3\2\2\2c\u01e0\3\2\2\2e\u01e4\3\2\2\2g\u01e7\3\2\2\2i\u01ee\3\2"+
		"\2\2k\u01f9\3\2\2\2m\u0202\3\2\2\2o\u0207\3\2\2\2q\u0219\3\2\2\2s\u021b"+
		"\3\2\2\2u\u021e\3\2\2\2w\u0220\3\2\2\2y\u0223\3\2\2\2{\u0226\3\2\2\2}"+
		"\u0228\3\2\2\2\177\u022a\3\2\2\2\u0081\u022c\3\2\2\2\u0083\u022e\3\2\2"+
		"\2\u0085\u0230\3\2\2\2\u0087\u0233\3\2\2\2\u0089\u0235\3\2\2\2\u008b\u0237"+
		"\3\2\2\2\u008d\u0239\3\2\2\2\u008f\u023b\3\2\2\2\u0091\u023e\3\2\2\2\u0093"+
		"\u0240\3\2\2\2\u0095\u0242\3\2\2\2\u0097\u0244\3\2\2\2\u0099\u0246\3\2"+
		"\2\2\u009b\u0249\3\2\2\2\u009d\u024c\3\2\2\2\u009f\u0252\3\2\2\2\u00a1"+
		"\u0254\3\2\2\2\u00a3\u0256\3\2\2\2\u00a5\u0258\3\2\2\2\u00a7\u025a\3\2"+
		"\2\2\u00a9\u025c\3\2\2\2\u00ab\u025e\3\2\2\2\u00ad\u0260\3\2\2\2\u00af"+
		"\u0262\3\2\2\2\u00b1\u0264\3\2\2\2\u00b3\u0266\3\2\2\2\u00b5\u0268\3\2"+
		"\2\2\u00b7\u026a\3\2\2\2\u00b9\u026c\3\2\2\2\u00bb\u026e\3\2\2\2\u00bd"+
		"\u0270\3\2\2\2\u00bf\u0272\3\2\2\2\u00c1\u0274\3\2\2\2\u00c3\u0276\3\2"+
		"\2\2\u00c5\u0278\3\2\2\2\u00c7\u027a\3\2\2\2\u00c9\u027c\3\2\2\2\u00cb"+
		"\u027e\3\2\2\2\u00cd\u0280\3\2\2\2\u00cf\u0282\3\2\2\2\u00d1\u0284\3\2"+
		"\2\2\u00d3\u0286\3\2\2\2\u00d5\u0294\3\2\2\2\u00d7\u029f\3\2\2\2\u00d9"+
		"\u02aa\3\2\2\2\u00db\u00dc\5\u00afX\2\u00dc\u00dd\5\u00b9]\2\u00dd\u00de"+
		"\5\u00a3R\2\u00de\4\3\2\2\2\u00df\u00e0\5\u00a5S\2\u00e0\u00e1\5\u00a7"+
		"T\2\u00e1\u00e2\5\u00a3R\2\u00e2\6\3\2\2\2\u00e3\u00e4\5\u009fP\2\u00e4"+
		"\u00e5\5\u00a1Q\2\u00e5\u00e6\5\u00c3b\2\u00e6\b\3\2\2\2\u00e7\u00e8\5"+
		"\u00a3R\2\u00e8\u00e9\5\u00adW\2\u00e9\u00ea\5\u00c1a\2\u00ea\n\3\2\2"+
		"\2\u00eb\u00ec\5\u009fP\2\u00ec\u00ed\5\u00c1a\2\u00ed\u00ee\5\u00a3R"+
		"\2\u00ee\u00ef\5\u00c5c\2\u00ef\u00f0\5\u009fP\2\u00f0\u00f1\5\u00b9]"+
		"\2\u00f1\f\3\2\2\2\u00f2\u00f3\5\u00a3R\2\u00f3\u00f4\5\u00bb^\2\u00f4"+
		"\u00f5\5\u00c3b\2\u00f5\16\3\2\2\2\u00f6\u00f7\5\u00b5[\2\u00f7\u00f8"+
		"\5\u00b9]\2\u00f8\20\3\2\2\2\u00f9\u00fa\5\u00c1a\2\u00fa\u00fb\5\u00bb"+
		"^\2\u00fb\u00fc\5\u00c7d\2\u00fc\u00fd\5\u00b9]\2\u00fd\u00fe\5\u00a5"+
		"S\2\u00fe\22\3\2\2\2\u00ff\u0100\5\u00c3b\2\u0100\u0101\5\u00afX\2\u0101"+
		"\u0102\5\u00b9]\2\u0102\24\3\2\2\2\u0103\u0104\5\u00c3b\2\u0104\u0105"+
		"\5\u00bf`\2\u0105\u0106\5\u00c1a\2\u0106\26\3\2\2\2\u0107\u0108\5\u00c3"+
		"b\2\u0108\u0109\5\u00bf`\2\u0109\u010a\5\u00c1a\2\u010a\u010b\5\u00c5"+
		"c\2\u010b\30\3\2\2\2\u010c\u010d\5\u00c5c\2\u010d\u010e\5\u00c1a\2\u010e"+
		"\u010f\5\u00c7d\2\u010f\u0110\5\u00b9]\2\u0110\u0111\5\u00a3R\2\u0111"+
		"\32\3\2\2\2\u0112\u0113\5\u00a7T\2\u0113\u0114\5\u00cdg\2\u0114\u0115"+
		"\5\u00bd_\2\u0115\34\3\2\2\2\u0116\u0117\5\u00bb^\2\u0117\u0118\5\u00c1"+
		"a\2\u0118\u0119\5\u00a5S\2\u0119\36\3\2\2\2\u011a\u011b\5\u00bd_\2\u011b"+
		"\u011c\5\u00c1a\2\u011c\u011d\5\u00a7T\2\u011d\u011e\5\u00a5S\2\u011e"+
		" \3\2\2\2\u011f\u0120\5\u00c3b\2\u0120\u0121\5\u00c7d\2\u0121\u0122\5"+
		"\u00a3R\2\u0122\u0123\5\u00a3R\2\u0123\"\3\2\2\2\u0124\u0125\5\u00c1a"+
		"\2\u0125\u0126\5\u00a7T\2\u0126\u0127\5\u009fP\2\u0127\u0128\5\u00b5["+
		"\2\u0128$\3\2\2\2\u0129\u012a\5\u00cbf\2\u012a\u012b\5\u00c1a\2\u012b"+
		"\u012c\5\u00afX\2\u012c\u012d\5\u00c5c\2\u012d\u012e\5\u00a7T\2\u012e"+
		"\u012f\5\u00b5[\2\u012f\u0130\5\u00b9]\2\u0130&\3\2\2\2\u0131\u0132\5"+
		"\u00cbf\2\u0132\u0133\5\u00c1a\2\u0133\u0134\5\u00afX\2\u0134\u0135\5"+
		"\u00c5c\2\u0135\u0136\5\u00a7T\2\u0136(\3\2\2\2\u0137\u0138\5\u00c1a\2"+
		"\u0138\u0139\5\u00a7T\2\u0139\u013a\5\u009fP\2\u013a\u013b\5\u00a5S\2"+
		"\u013b\u013c\5\u00b5[\2\u013c\u013d\5\u00b9]\2\u013d*\3\2\2\2\u013e\u013f"+
		"\5\u00bd_\2\u013f\u0140\5\u00c1a\2\u0140\u0141\5\u00bb^\2\u0141\u0142"+
		"\5\u00abV\2\u0142\u0143\5\u00c1a\2\u0143\u0144\5\u009fP\2\u0144\u0145"+
		"\5\u00b7\\\2\u0145,\3\2\2\2\u0146\u0147\5\u00a9U\2\u0147\u0148\5\u00c7"+
		"d\2\u0148\u0149\5\u00b9]\2\u0149\u014a\5\u00a3R\2\u014a\u014b\5\u00c5"+
		"c\2\u014b\u014c\5\u00afX\2\u014c\u014d\5\u00bb^\2\u014d\u014e\5\u00b9"+
		"]\2\u014e.\3\2\2\2\u014f\u0150\5\u00bd_\2\u0150\u0151\5\u00c1a\2\u0151"+
		"\u0152\5\u00bb^\2\u0152\u0153\5\u00a3R\2\u0153\u0154\5\u00a7T\2\u0154"+
		"\u0155\5\u00a5S\2\u0155\u0156\5\u00c7d\2\u0156\u0157\5\u00c1a\2\u0157"+
		"\u0158\5\u00a7T\2\u0158\60\3\2\2\2\u0159\u015a\5\u00a1Q\2\u015a\u015b"+
		"\5\u00a7T\2\u015b\u015c\5\u00abV\2\u015c\u015d\5\u00afX\2\u015d\u015e"+
		"\5\u00b9]\2\u015e\62\3\2\2\2\u015f\u0160\5\u00a7T\2\u0160\u0161\5\u00b9"+
		"]\2\u0161\u0162\5\u00a5S\2\u0162\64\3\2\2\2\u0163\u0164\5\u00afX\2\u0164"+
		"\u0165\5\u00a9U\2\u0165\66\3\2\2\2\u0166\u0167\5\u00bb^\2\u0167\u0168"+
		"\5\u00a9U\2\u01688\3\2\2\2\u0169\u016a\5\u00c5c\2\u016a\u016b\5\u00ad"+
		"W\2\u016b\u016c\5\u00a7T\2\u016c\u016d\5\u00b9]\2\u016d:\3\2\2\2\u016e"+
		"\u016f\5\u00a7T\2\u016f\u0170\5\u00b5[\2\u0170\u0171\5\u00c3b\2\u0171"+
		"\u0172\5\u00a7T\2\u0172<\3\2\2\2\u0173\u0174\5\u00c5c\2\u0174\u0175\5"+
		"\u00bb^\2\u0175>\3\2\2\2\u0176\u0177\5\u00a9U\2\u0177\u0178\5\u00bb^\2"+
		"\u0178\u0179\5\u00c1a\2\u0179@\3\2\2\2\u017a\u017b\5\u00cbf\2\u017b\u017c"+
		"\5\u00adW\2\u017c\u017d\5\u00afX\2\u017d\u017e\5\u00b5[\2\u017e\u017f"+
		"\5\u00a7T\2\u017fB\3\2\2\2\u0180\u0181\5\u00c1a\2\u0181\u0182\5\u00a7"+
		"T\2\u0182\u0183\5\u00bd_\2\u0183\u0184\5\u00a7T\2\u0184\u0185\5\u009f"+
		"P\2\u0185\u0186\5\u00c5c\2\u0186D\3\2\2\2\u0187\u0188\5\u00c7d\2\u0188"+
		"\u0189\5\u00b9]\2\u0189\u018a\5\u00c5c\2\u018a\u018b\5\u00afX\2\u018b"+
		"\u018c\5\u00b5[\2\u018cF\3\2\2\2\u018d\u018e\5\u00a5S\2\u018e\u018f\5"+
		"\u00bb^\2\u018f\u0190\5\u00cbf\2\u0190\u0191\5\u00b9]\2\u0191\u0192\5"+
		"\u00c5c\2\u0192\u0193\5\u00bb^\2\u0193H\3\2\2\2\u0194\u0195\5\u00a5S\2"+
		"\u0195\u0196\5\u00bb^\2\u0196J\3\2\2\2\u0197\u0198\5\u00a3R\2\u0198\u0199"+
		"\5\u00bb^\2\u0199\u019a\5\u00b9]\2\u019a\u019b\5\u00c3b\2\u019b\u019c"+
		"\5\u00c5c\2\u019cL\3\2\2\2\u019d\u019e\5\u00c9e\2\u019e\u019f\5\u009f"+
		"P\2\u019f\u01a0\5\u00c1a\2\u01a0N\3\2\2\2\u01a1\u01a2\5\u00b9]\2\u01a2"+
		"\u01a3\5\u00afX\2\u01a3\u01a4\5\u00b5[\2\u01a4P\3\2\2\2\u01a5\u01a6\5"+
		"\u00b9]\2\u01a6\u01a7\5\u00bb^\2\u01a7\u01a8\5\u00c5c\2\u01a8R\3\2\2\2"+
		"\u01a9\u01aa\5\u00a3R\2\u01aa\u01ab\5\u00adW\2\u01ab\u01ac\5\u009fP\2"+
		"\u01ac\u01ad\5\u00c1a\2\u01adT\3\2\2\2\u01ae\u01af\5\u00a1Q\2\u01af\u01b0"+
		"\5\u00bb^\2\u01b0\u01b1\5\u00bb^\2\u01b1\u01b2\5\u00b5[\2\u01b2\u01b3"+
		"\5\u00a7T\2\u01b3\u01b4\5\u009fP\2\u01b4\u01b5\5\u00b9]\2\u01b5V\3\2\2"+
		"\2\u01b6\u01b7\5\u00c5c\2\u01b7\u01b8\5\u00c1a\2\u01b8\u01b9\5\u00c7d"+
		"\2\u01b9\u01ba\5\u00a7T\2\u01ba\u01c2\3\2\2\2\u01bb\u01bc\5\u00a9U\2\u01bc"+
		"\u01bd\5\u009fP\2\u01bd\u01be\5\u00b5[\2\u01be\u01bf\5\u00c3b\2\u01bf"+
		"\u01c0\5\u00a7T\2\u01c0\u01c2\3\2\2\2\u01c1\u01b6\3\2\2\2\u01c1\u01bb"+
		"\3\2\2\2\u01c2X\3\2\2\2\u01c3\u01c4\5\u00afX\2\u01c4\u01c5\5\u00b9]\2"+
		"\u01c5\u01c6\5\u00c5c\2\u01c6\u01c7\5\u00a7T\2\u01c7\u01c8\5\u00abV\2"+
		"\u01c8\u01c9\5\u00a7T\2\u01c9\u01ca\5\u00c1a\2\u01caZ\3\2\2\2\u01cb\u01cc"+
		"\5\u009fP\2\u01cc\u01cd\5\u00c1a\2\u01cd\u01ce\5\u00c1a\2\u01ce\u01cf"+
		"\5\u009fP\2\u01cf\u01d0\5\u00cfh\2\u01d0\\\3\2\2\2\u01d1\u01d2\5\u00c3"+
		"b\2\u01d2\u01d3\5\u00c5c\2\u01d3\u01d4\5\u00c1a\2\u01d4\u01d5\5\u00af"+
		"X\2\u01d5\u01d6\5\u00b9]\2\u01d6\u01d7\5\u00abV\2\u01d7^\3\2\2\2\u01d8"+
		"\u01d9\5\u00a5S\2\u01d9\u01da\5\u00afX\2\u01da\u01db\5\u00c9e\2\u01db"+
		"`\3\2\2\2\u01dc\u01dd\5\u00b7\\\2\u01dd\u01de\5\u00bb^\2\u01de\u01df\5"+
		"\u00a5S\2\u01dfb\3\2\2\2\u01e0\u01e1\5\u009fP\2\u01e1\u01e2\5\u00b9]\2"+
		"\u01e2\u01e3\5\u00a5S\2\u01e3d\3\2\2\2\u01e4\u01e5\5\u00bb^\2\u01e5\u01e6"+
		"\5\u00c1a\2\u01e6f\3\2\2\2\u01e7\u01eb\t\2\2\2\u01e8\u01ea\t\3\2\2\u01e9"+
		"\u01e8\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2"+
		"\2\2\u01ech\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01f4\7)\2\2\u01ef\u01f0"+
		"\7)\2\2\u01f0\u01f3\7)\2\2\u01f1\u01f3\n\4\2\2\u01f2\u01ef\3\2\2\2\u01f2"+
		"\u01f1\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2"+
		"\2\2\u01f5\u01f7\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f8\7)\2\2\u01f8"+
		"j\3\2\2\2\u01f9\u01fd\7)\2\2\u01fa\u01fb\7)\2\2\u01fb\u01fe\7)\2\2\u01fc"+
		"\u01fe\n\4\2\2\u01fd\u01fa\3\2\2\2\u01fd\u01fc\3\2\2\2\u01fe\u01ff\3\2"+
		"\2\2\u01ff\u0200\7)\2\2\u0200l\3\2\2\2\u0201\u0203\t\5\2\2\u0202\u0201"+
		"\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"n\3\2\2\2\u0206\u0208\4\62;\2\u0207\u0206\3\2\2\2\u0208\u0209\3\2\2\2"+
		"\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u0217\3\2\2\2\u020b\u020d"+
		"\7\60\2\2\u020c\u020e\4\62;\2\u020d\u020c\3\2\2\2\u020e\u020f\3\2\2\2"+
		"\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0212\3\2\2\2\u0211\u0213"+
		"\5\u009dO\2\u0212\u0211\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0215\3\2\2"+
		"\2\u0214\u020b\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0218"+
		"\5\u009dO\2\u0217\u0214\3\2\2\2\u0217\u0216\3\2\2\2\u0218p\3\2\2\2\u0219"+
		"\u021a\7?\2\2\u021ar\3\2\2\2\u021b\u021c\7>\2\2\u021c\u021d\7@\2\2\u021d"+
		"t\3\2\2\2\u021e\u021f\7>\2\2\u021fv\3\2\2\2\u0220\u0221\7>\2\2\u0221\u0222"+
		"\7?\2\2\u0222x\3\2\2\2\u0223\u0224\7@\2\2\u0224\u0225\7?\2\2\u0225z\3"+
		"\2\2\2\u0226\u0227\7@\2\2\u0227|\3\2\2\2\u0228\u0229\7-\2\2\u0229~\3\2"+
		"\2\2\u022a\u022b\7/\2\2\u022b\u0080\3\2\2\2\u022c\u022d\7,\2\2\u022d\u0082"+
		"\3\2\2\2\u022e\u022f\7\61\2\2\u022f\u0084\3\2\2\2\u0230\u0231\7<\2\2\u0231"+
		"\u0232\7?\2\2\u0232\u0086\3\2\2\2\u0233\u0234\7=\2\2\u0234\u0088\3\2\2"+
		"\2\u0235\u0236\7.\2\2\u0236\u008a\3\2\2\2\u0237\u0238\7<\2\2\u0238\u008c"+
		"\3\2\2\2\u0239\u023a\7\60\2\2\u023a\u008e\3\2\2\2\u023b\u023c\7\60\2\2"+
		"\u023c\u023d\7\60\2\2\u023d\u0090\3\2\2\2\u023e\u023f\7*\2\2\u023f\u0092"+
		"\3\2\2\2\u0240\u0241\7+\2\2\u0241\u0094\3\2\2\2\u0242\u0243\7]\2\2\u0243"+
		"\u0096\3\2\2\2\u0244\u0245\7_\2\2\u0245\u0098\3\2\2\2\u0246\u0247\7*\2"+
		"\2\u0247\u0248\7\60\2\2\u0248\u009a\3\2\2\2\u0249\u024a\7\60\2\2\u024a"+
		"\u024b\7+\2\2\u024b\u009c\3\2\2\2\u024c\u024e\7g\2\2\u024d\u024f\t\6\2"+
		"\2\u024e\u024d\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251"+
		"\4\62;\2\u0251\u009e\3\2\2\2\u0252\u0253\t\7\2\2\u0253\u00a0\3\2\2\2\u0254"+
		"\u0255\t\b\2\2\u0255\u00a2\3\2\2\2\u0256\u0257\t\t\2\2\u0257\u00a4\3\2"+
		"\2\2\u0258\u0259\t\n\2\2\u0259\u00a6\3\2\2\2\u025a\u025b\t\13\2\2\u025b"+
		"\u00a8\3\2\2\2\u025c\u025d\t\f\2\2\u025d\u00aa\3\2\2\2\u025e\u025f\t\r"+
		"\2\2\u025f\u00ac\3\2\2\2\u0260\u0261\t\16\2\2\u0261\u00ae\3\2\2\2\u0262"+
		"\u0263\t\17\2\2\u0263\u00b0\3\2\2\2\u0264\u0265\t\20\2\2\u0265\u00b2\3"+
		"\2\2\2\u0266\u0267\t\21\2\2\u0267\u00b4\3\2\2\2\u0268\u0269\t\22\2\2\u0269"+
		"\u00b6\3\2\2\2\u026a\u026b\t\23\2\2\u026b\u00b8\3\2\2\2\u026c\u026d\t"+
		"\24\2\2\u026d\u00ba\3\2\2\2\u026e\u026f\t\25\2\2\u026f\u00bc\3\2\2\2\u0270"+
		"\u0271\t\26\2\2\u0271\u00be\3\2\2\2\u0272\u0273\t\27\2\2\u0273\u00c0\3"+
		"\2\2\2\u0274\u0275\t\30\2\2\u0275\u00c2\3\2\2\2\u0276\u0277\t\31\2\2\u0277"+
		"\u00c4\3\2\2\2\u0278\u0279\t\32\2\2\u0279\u00c6\3\2\2\2\u027a\u027b\t"+
		"\33\2\2\u027b\u00c8\3\2\2\2\u027c\u027d\t\34\2\2\u027d\u00ca\3\2\2\2\u027e"+
		"\u027f\t\35\2\2\u027f\u00cc\3\2\2\2\u0280\u0281\t\36\2\2\u0281\u00ce\3"+
		"\2\2\2\u0282\u0283\t\37\2\2\u0283\u00d0\3\2\2\2\u0284\u0285\t \2\2\u0285"+
		"\u00d2\3\2\2\2\u0286\u0287\7*\2\2\u0287\u0288\7,\2\2\u0288\u028c\3\2\2"+
		"\2\u0289\u028b\13\2\2\2\u028a\u0289\3\2\2\2\u028b\u028e\3\2\2\2\u028c"+
		"\u028d\3\2\2\2\u028c\u028a\3\2\2\2\u028d\u028f\3\2\2\2\u028e\u028c\3\2"+
		"\2\2\u028f\u0290\7,\2\2\u0290\u0291\7+\2\2\u0291\u0292\3\2\2\2\u0292\u0293"+
		"\bj\2\2\u0293\u00d4\3\2\2\2\u0294\u0298\7}\2\2\u0295\u0297\13\2\2\2\u0296"+
		"\u0295\3\2\2\2\u0297\u029a\3\2\2\2\u0298\u0299\3\2\2\2\u0298\u0296\3\2"+
		"\2\2\u0299\u029b\3\2\2\2\u029a\u0298\3\2\2\2\u029b\u029c\7\177\2\2\u029c"+
		"\u029d\3\2\2\2\u029d\u029e\bk\2\2\u029e\u00d6\3\2\2\2\u029f\u02a0\7\61"+
		"\2\2\u02a0\u02a1\7\61\2\2\u02a1\u02a5\3\2\2\2\u02a2\u02a4\13\2\2\2\u02a3"+
		"\u02a2\3\2\2\2\u02a4\u02a7\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a5\u02a3\3\2"+
		"\2\2\u02a6\u02a8\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02a9\bl\2\2\u02a9"+
		"\u00d8\3\2\2\2\u02aa\u02ab\t!\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ad\bm\2"+
		"\2\u02ad\u00da\3\2\2\2\22\2\u01c1\u01eb\u01f2\u01f4\u01fd\u0204\u0209"+
		"\u020f\u0212\u0214\u0217\u024e\u028c\u0298\u02a5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
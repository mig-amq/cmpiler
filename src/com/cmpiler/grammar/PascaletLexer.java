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
		WRITELN=1, WRITE=2, READLN=3, PROGRAM=4, FUNCTION=5, PROCEDURE=6, BEGIN=7, 
		END=8, IF=9, OF=10, THEN=11, ELSE=12, TO=13, FOR=14, DOWNTO=15, DO=16, 
		CONST=17, VAR=18, NIL=19, NOT=20, CHARACTER=21, BOOLEAN=22, BOOL=23, INTEGER=24, 
		ARRAY=25, STRING=26, DIV=27, MOD=28, AND=29, OR=30, IDENT=31, CHAR=32, 
		INT=33, STR=34, REAL=35, REAL_NUM=36, EQUAL=37, NOT_EQUAL=38, LT=39, LE=40, 
		GE=41, GT=42, PLUS=43, MINUS=44, STAR=45, SLASH=46, ASSIGN=47, SEMI=48, 
		COMMA=49, COLON=50, DOT=51, DOTDOT=52, LPAREN=53, RPAREN=54, LBRACK=55, 
		RBRACK=56, LBRACK2=57, RBRACK2=58, COMMENT_1=59, COMMENT_2=60, WS=61;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WRITELN", "WRITE", "READLN", "PROGRAM", "FUNCTION", "PROCEDURE", "BEGIN", 
			"END", "IF", "OF", "THEN", "ELSE", "TO", "FOR", "DOWNTO", "DO", "CONST", 
			"VAR", "NIL", "NOT", "CHARACTER", "BOOLEAN", "BOOL", "INTEGER", "ARRAY", 
			"STRING", "DIV", "MOD", "AND", "OR", "IDENT", "CHAR", "INT", "STR", "REAL", 
			"REAL_NUM", "EQUAL", "NOT_EQUAL", "LT", "LE", "GE", "GT", "PLUS", "MINUS", 
			"STAR", "SLASH", "ASSIGN", "SEMI", "COMMA", "COLON", "DOT", "DOTDOT", 
			"LPAREN", "RPAREN", "LBRACK", "RBRACK", "LBRACK2", "RBRACK2", "EXPONENT", 
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "COMMENT_1", 
			"COMMENT_2", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'='", "'<>'", "'<'", "'<='", "'>='", "'>'", "'+'", "'-'", "'*'", 
			"'/'", "':='", "';'", "','", "':'", "'.'", "'..'", "'('", "')'", "'['", 
			"']'", "'(.'", "'.)'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WRITELN", "WRITE", "READLN", "PROGRAM", "FUNCTION", "PROCEDURE", 
			"BEGIN", "END", "IF", "OF", "THEN", "ELSE", "TO", "FOR", "DOWNTO", "DO", 
			"CONST", "VAR", "NIL", "NOT", "CHARACTER", "BOOLEAN", "BOOL", "INTEGER", 
			"ARRAY", "STRING", "DIV", "MOD", "AND", "OR", "IDENT", "CHAR", "INT", 
			"STR", "REAL", "REAL_NUM", "EQUAL", "NOT_EQUAL", "LT", "LE", "GE", "GT", 
			"PLUS", "MINUS", "STAR", "SLASH", "ASSIGN", "SEMI", "COMMA", "COLON", 
			"DOT", "DOTDOT", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "LBRACK2", "RBRACK2", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2?\u0219\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u0139\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \7 \u0161\n \f"+
		" \16 \u0164\13 \3!\3!\3!\3!\3\"\6\"\u016b\n\"\r\"\16\"\u016c\3#\3#\7#"+
		"\u0171\n#\f#\16#\u0174\13#\3#\3#\3$\3$\3$\3$\3$\3%\6%\u017e\n%\r%\16%"+
		"\u017f\3%\3%\6%\u0184\n%\r%\16%\u0185\3%\5%\u0189\n%\5%\u018b\n%\3%\5"+
		"%\u018e\n%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3-\3"+
		"-\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3"+
		"\65\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3:\3;\3;\3;\3<\3<"+
		"\5<\u01c5\n<\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E"+
		"\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P"+
		"\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3W\3W\7W\u0201\nW\fW\16W\u0204"+
		"\13W\3W\3W\3W\3W\3W\3X\3X\7X\u020d\nX\fX\16X\u0210\13X\3X\3X\3X\3X\3Y"+
		"\3Y\3Y\3Y\5\u0172\u0202\u020e\2Z\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w\2y\2{\2}\2\177\2\u0081\2\u0083"+
		"\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095"+
		"\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5\2\u00a7"+
		"\2\u00a9\2\u00ab\2\u00ad=\u00af>\u00b1?\3\2\"\4\2C\\c|\6\2\62;C\\aac|"+
		"\5\2\62;C\\c|\3\2\62;\4\2--//\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg"+
		"\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2P"+
		"Ppp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4"+
		"\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\5\2\13\f\17\17\"\"\2\u0209\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2"+
		"\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2"+
		"\u00b1\3\2\2\2\3\u00b3\3\2\2\2\5\u00bb\3\2\2\2\7\u00c1\3\2\2\2\t\u00c8"+
		"\3\2\2\2\13\u00d0\3\2\2\2\r\u00d9\3\2\2\2\17\u00e3\3\2\2\2\21\u00e9\3"+
		"\2\2\2\23\u00ed\3\2\2\2\25\u00f0\3\2\2\2\27\u00f3\3\2\2\2\31\u00f8\3\2"+
		"\2\2\33\u00fd\3\2\2\2\35\u0100\3\2\2\2\37\u0104\3\2\2\2!\u010b\3\2\2\2"+
		"#\u010e\3\2\2\2%\u0114\3\2\2\2\'\u0118\3\2\2\2)\u011c\3\2\2\2+\u0120\3"+
		"\2\2\2-\u0125\3\2\2\2/\u0138\3\2\2\2\61\u013a\3\2\2\2\63\u0142\3\2\2\2"+
		"\65\u0148\3\2\2\2\67\u014f\3\2\2\29\u0153\3\2\2\2;\u0157\3\2\2\2=\u015b"+
		"\3\2\2\2?\u015e\3\2\2\2A\u0165\3\2\2\2C\u016a\3\2\2\2E\u016e\3\2\2\2G"+
		"\u0177\3\2\2\2I\u017d\3\2\2\2K\u018f\3\2\2\2M\u0191\3\2\2\2O\u0194\3\2"+
		"\2\2Q\u0196\3\2\2\2S\u0199\3\2\2\2U\u019c\3\2\2\2W\u019e\3\2\2\2Y\u01a0"+
		"\3\2\2\2[\u01a2\3\2\2\2]\u01a4\3\2\2\2_\u01a6\3\2\2\2a\u01a9\3\2\2\2c"+
		"\u01ab\3\2\2\2e\u01ad\3\2\2\2g\u01af\3\2\2\2i\u01b1\3\2\2\2k\u01b4\3\2"+
		"\2\2m\u01b6\3\2\2\2o\u01b8\3\2\2\2q\u01ba\3\2\2\2s\u01bc\3\2\2\2u\u01bf"+
		"\3\2\2\2w\u01c2\3\2\2\2y\u01c8\3\2\2\2{\u01ca\3\2\2\2}\u01cc\3\2\2\2\177"+
		"\u01ce\3\2\2\2\u0081\u01d0\3\2\2\2\u0083\u01d2\3\2\2\2\u0085\u01d4\3\2"+
		"\2\2\u0087\u01d6\3\2\2\2\u0089\u01d8\3\2\2\2\u008b\u01da\3\2\2\2\u008d"+
		"\u01dc\3\2\2\2\u008f\u01de\3\2\2\2\u0091\u01e0\3\2\2\2\u0093\u01e2\3\2"+
		"\2\2\u0095\u01e4\3\2\2\2\u0097\u01e6\3\2\2\2\u0099\u01e8\3\2\2\2\u009b"+
		"\u01ea\3\2\2\2\u009d\u01ec\3\2\2\2\u009f\u01ee\3\2\2\2\u00a1\u01f0\3\2"+
		"\2\2\u00a3\u01f2\3\2\2\2\u00a5\u01f4\3\2\2\2\u00a7\u01f6\3\2\2\2\u00a9"+
		"\u01f8\3\2\2\2\u00ab\u01fa\3\2\2\2\u00ad\u01fc\3\2\2\2\u00af\u020a\3\2"+
		"\2\2\u00b1\u0215\3\2\2\2\u00b3\u00b4\5\u00a5S\2\u00b4\u00b5\5\u009bN\2"+
		"\u00b5\u00b6\5\u0089E\2\u00b6\u00b7\5\u009fP\2\u00b7\u00b8\5\u0081A\2"+
		"\u00b8\u00b9\5\u008fH\2\u00b9\u00ba\5\u0093J\2\u00ba\4\3\2\2\2\u00bb\u00bc"+
		"\5\u00a5S\2\u00bc\u00bd\5\u009bN\2\u00bd\u00be\5\u0089E\2\u00be\u00bf"+
		"\5\u009fP\2\u00bf\u00c0\5\u0081A\2\u00c0\6\3\2\2\2\u00c1\u00c2\5\u009b"+
		"N\2\u00c2\u00c3\5\u0081A\2\u00c3\u00c4\5y=\2\u00c4\u00c5\5\177@\2\u00c5"+
		"\u00c6\5\u008fH\2\u00c6\u00c7\5\u0093J\2\u00c7\b\3\2\2\2\u00c8\u00c9\5"+
		"\u0097L\2\u00c9\u00ca\5\u009bN\2\u00ca\u00cb\5\u0095K\2\u00cb\u00cc\5"+
		"\u0085C\2\u00cc\u00cd\5\u009bN\2\u00cd\u00ce\5y=\2\u00ce\u00cf\5\u0091"+
		"I\2\u00cf\n\3\2\2\2\u00d0\u00d1\5\u0083B\2\u00d1\u00d2\5\u00a1Q\2\u00d2"+
		"\u00d3\5\u0093J\2\u00d3\u00d4\5}?\2\u00d4\u00d5\5\u009fP\2\u00d5\u00d6"+
		"\5\u0089E\2\u00d6\u00d7\5\u0095K\2\u00d7\u00d8\5\u0093J\2\u00d8\f\3\2"+
		"\2\2\u00d9\u00da\5\u0097L\2\u00da\u00db\5\u009bN\2\u00db\u00dc\5\u0095"+
		"K\2\u00dc\u00dd\5}?\2\u00dd\u00de\5\u0081A\2\u00de\u00df\5\177@\2\u00df"+
		"\u00e0\5\u00a1Q\2\u00e0\u00e1\5\u009bN\2\u00e1\u00e2\5\u0081A\2\u00e2"+
		"\16\3\2\2\2\u00e3\u00e4\5{>\2\u00e4\u00e5\5\u0081A\2\u00e5\u00e6\5\u0085"+
		"C\2\u00e6\u00e7\5\u0089E\2\u00e7\u00e8\5\u0093J\2\u00e8\20\3\2\2\2\u00e9"+
		"\u00ea\5\u0081A\2\u00ea\u00eb\5\u0093J\2\u00eb\u00ec\5\177@\2\u00ec\22"+
		"\3\2\2\2\u00ed\u00ee\5\u0089E\2\u00ee\u00ef\5\u0083B\2\u00ef\24\3\2\2"+
		"\2\u00f0\u00f1\5\u0095K\2\u00f1\u00f2\5\u0083B\2\u00f2\26\3\2\2\2\u00f3"+
		"\u00f4\5\u009fP\2\u00f4\u00f5\5\u0087D\2\u00f5\u00f6\5\u0081A\2\u00f6"+
		"\u00f7\5\u0093J\2\u00f7\30\3\2\2\2\u00f8\u00f9\5\u0081A\2\u00f9\u00fa"+
		"\5\u008fH\2\u00fa\u00fb\5\u009dO\2\u00fb\u00fc\5\u0081A\2\u00fc\32\3\2"+
		"\2\2\u00fd\u00fe\5\u009fP\2\u00fe\u00ff\5\u0095K\2\u00ff\34\3\2\2\2\u0100"+
		"\u0101\5\u0083B\2\u0101\u0102\5\u0095K\2\u0102\u0103\5\u009bN\2\u0103"+
		"\36\3\2\2\2\u0104\u0105\5\177@\2\u0105\u0106\5\u0095K\2\u0106\u0107\5"+
		"\u00a5S\2\u0107\u0108\5\u0093J\2\u0108\u0109\5\u009fP\2\u0109\u010a\5"+
		"\u0095K\2\u010a \3\2\2\2\u010b\u010c\5\177@\2\u010c\u010d\5\u0095K\2\u010d"+
		"\"\3\2\2\2\u010e\u010f\5}?\2\u010f\u0110\5\u0095K\2\u0110\u0111\5\u0093"+
		"J\2\u0111\u0112\5\u009dO\2\u0112\u0113\5\u009fP\2\u0113$\3\2\2\2\u0114"+
		"\u0115\5\u00a3R\2\u0115\u0116\5y=\2\u0116\u0117\5\u009bN\2\u0117&\3\2"+
		"\2\2\u0118\u0119\5\u0093J\2\u0119\u011a\5\u0089E\2\u011a\u011b\5\u008f"+
		"H\2\u011b(\3\2\2\2\u011c\u011d\5\u0093J\2\u011d\u011e\5\u0095K\2\u011e"+
		"\u011f\5\u009fP\2\u011f*\3\2\2\2\u0120\u0121\5}?\2\u0121\u0122\5\u0087"+
		"D\2\u0122\u0123\5y=\2\u0123\u0124\5\u009bN\2\u0124,\3\2\2\2\u0125\u0126"+
		"\5{>\2\u0126\u0127\5\u0095K\2\u0127\u0128\5\u0095K\2\u0128\u0129\5\u008f"+
		"H\2\u0129\u012a\5\u0081A\2\u012a\u012b\5y=\2\u012b\u012c\5\u0093J\2\u012c"+
		".\3\2\2\2\u012d\u012e\5\u009fP\2\u012e\u012f\5\u009bN\2\u012f\u0130\5"+
		"\u00a1Q\2\u0130\u0131\5\u0081A\2\u0131\u0139\3\2\2\2\u0132\u0133\5\u0083"+
		"B\2\u0133\u0134\5y=\2\u0134\u0135\5\u008fH\2\u0135\u0136\5\u009dO\2\u0136"+
		"\u0137\5\u0081A\2\u0137\u0139\3\2\2\2\u0138\u012d\3\2\2\2\u0138\u0132"+
		"\3\2\2\2\u0139\60\3\2\2\2\u013a\u013b\5\u0089E\2\u013b\u013c\5\u0093J"+
		"\2\u013c\u013d\5\u009fP\2\u013d\u013e\5\u0081A\2\u013e\u013f\5\u0085C"+
		"\2\u013f\u0140\5\u0081A\2\u0140\u0141\5\u009bN\2\u0141\62\3\2\2\2\u0142"+
		"\u0143\5y=\2\u0143\u0144\5\u009bN\2\u0144\u0145\5\u009bN\2\u0145\u0146"+
		"\5y=\2\u0146\u0147\5\u00a9U\2\u0147\64\3\2\2\2\u0148\u0149\5\u009dO\2"+
		"\u0149\u014a\5\u009fP\2\u014a\u014b\5\u009bN\2\u014b\u014c\5\u0089E\2"+
		"\u014c\u014d\5\u0093J\2\u014d\u014e\5\u0085C\2\u014e\66\3\2\2\2\u014f"+
		"\u0150\5\177@\2\u0150\u0151\5\u0089E\2\u0151\u0152\5\u00a3R\2\u01528\3"+
		"\2\2\2\u0153\u0154\5\u0091I\2\u0154\u0155\5\u0095K\2\u0155\u0156\5\177"+
		"@\2\u0156:\3\2\2\2\u0157\u0158\5y=\2\u0158\u0159\5\u0093J\2\u0159\u015a"+
		"\5\177@\2\u015a<\3\2\2\2\u015b\u015c\5\u0095K\2\u015c\u015d\5\u009bN\2"+
		"\u015d>\3\2\2\2\u015e\u0162\t\2\2\2\u015f\u0161\t\3\2\2\u0160\u015f\3"+
		"\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"@\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166\7)\2\2\u0166\u0167\t\4\2\2\u0167"+
		"\u0168\7)\2\2\u0168B\3\2\2\2\u0169\u016b\t\5\2\2\u016a\u0169\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016dD\3\2\2\2"+
		"\u016e\u0172\7)\2\2\u016f\u0171\13\2\2\2\u0170\u016f\3\2\2\2\u0171\u0174"+
		"\3\2\2\2\u0172\u0173\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0175\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0175\u0176\7)\2\2\u0176F\3\2\2\2\u0177\u0178\5\u009bN"+
		"\2\u0178\u0179\5\u0081A\2\u0179\u017a\5y=\2\u017a\u017b\5\u008fH\2\u017b"+
		"H\3\2\2\2\u017c\u017e\4\62;\2\u017d\u017c\3\2\2\2\u017e\u017f\3\2\2\2"+
		"\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u018d\3\2\2\2\u0181\u0183"+
		"\7\60\2\2\u0182\u0184\4\62;\2\u0183\u0182\3\2\2\2\u0184\u0185\3\2\2\2"+
		"\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187\u0189"+
		"\5w<\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a"+
		"\u0181\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018e\5w"+
		"<\2\u018d\u018a\3\2\2\2\u018d\u018c\3\2\2\2\u018eJ\3\2\2\2\u018f\u0190"+
		"\7?\2\2\u0190L\3\2\2\2\u0191\u0192\7>\2\2\u0192\u0193\7@\2\2\u0193N\3"+
		"\2\2\2\u0194\u0195\7>\2\2\u0195P\3\2\2\2\u0196\u0197\7>\2\2\u0197\u0198"+
		"\7?\2\2\u0198R\3\2\2\2\u0199\u019a\7@\2\2\u019a\u019b\7?\2\2\u019bT\3"+
		"\2\2\2\u019c\u019d\7@\2\2\u019dV\3\2\2\2\u019e\u019f\7-\2\2\u019fX\3\2"+
		"\2\2\u01a0\u01a1\7/\2\2\u01a1Z\3\2\2\2\u01a2\u01a3\7,\2\2\u01a3\\\3\2"+
		"\2\2\u01a4\u01a5\7\61\2\2\u01a5^\3\2\2\2\u01a6\u01a7\7<\2\2\u01a7\u01a8"+
		"\7?\2\2\u01a8`\3\2\2\2\u01a9\u01aa\7=\2\2\u01aab\3\2\2\2\u01ab\u01ac\7"+
		".\2\2\u01acd\3\2\2\2\u01ad\u01ae\7<\2\2\u01aef\3\2\2\2\u01af\u01b0\7\60"+
		"\2\2\u01b0h\3\2\2\2\u01b1\u01b2\7\60\2\2\u01b2\u01b3\7\60\2\2\u01b3j\3"+
		"\2\2\2\u01b4\u01b5\7*\2\2\u01b5l\3\2\2\2\u01b6\u01b7\7+\2\2\u01b7n\3\2"+
		"\2\2\u01b8\u01b9\7]\2\2\u01b9p\3\2\2\2\u01ba\u01bb\7_\2\2\u01bbr\3\2\2"+
		"\2\u01bc\u01bd\7*\2\2\u01bd\u01be\7\60\2\2\u01bet\3\2\2\2\u01bf\u01c0"+
		"\7\60\2\2\u01c0\u01c1\7+\2\2\u01c1v\3\2\2\2\u01c2\u01c4\7g\2\2\u01c3\u01c5"+
		"\t\6\2\2\u01c4\u01c3\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u01c7\4\62;\2\u01c7x\3\2\2\2\u01c8\u01c9\t\7\2\2\u01c9z\3\2\2\2\u01ca"+
		"\u01cb\t\b\2\2\u01cb|\3\2\2\2\u01cc\u01cd\t\t\2\2\u01cd~\3\2\2\2\u01ce"+
		"\u01cf\t\n\2\2\u01cf\u0080\3\2\2\2\u01d0\u01d1\t\13\2\2\u01d1\u0082\3"+
		"\2\2\2\u01d2\u01d3\t\f\2\2\u01d3\u0084\3\2\2\2\u01d4\u01d5\t\r\2\2\u01d5"+
		"\u0086\3\2\2\2\u01d6\u01d7\t\16\2\2\u01d7\u0088\3\2\2\2\u01d8\u01d9\t"+
		"\17\2\2\u01d9\u008a\3\2\2\2\u01da\u01db\t\20\2\2\u01db\u008c\3\2\2\2\u01dc"+
		"\u01dd\t\21\2\2\u01dd\u008e\3\2\2\2\u01de\u01df\t\22\2\2\u01df\u0090\3"+
		"\2\2\2\u01e0\u01e1\t\23\2\2\u01e1\u0092\3\2\2\2\u01e2\u01e3\t\24\2\2\u01e3"+
		"\u0094\3\2\2\2\u01e4\u01e5\t\25\2\2\u01e5\u0096\3\2\2\2\u01e6\u01e7\t"+
		"\26\2\2\u01e7\u0098\3\2\2\2\u01e8\u01e9\t\27\2\2\u01e9\u009a\3\2\2\2\u01ea"+
		"\u01eb\t\30\2\2\u01eb\u009c\3\2\2\2\u01ec\u01ed\t\31\2\2\u01ed\u009e\3"+
		"\2\2\2\u01ee\u01ef\t\32\2\2\u01ef\u00a0\3\2\2\2\u01f0\u01f1\t\33\2\2\u01f1"+
		"\u00a2\3\2\2\2\u01f2\u01f3\t\34\2\2\u01f3\u00a4\3\2\2\2\u01f4\u01f5\t"+
		"\35\2\2\u01f5\u00a6\3\2\2\2\u01f6\u01f7\t\36\2\2\u01f7\u00a8\3\2\2\2\u01f8"+
		"\u01f9\t\37\2\2\u01f9\u00aa\3\2\2\2\u01fa\u01fb\t \2\2\u01fb\u00ac\3\2"+
		"\2\2\u01fc\u01fd\7*\2\2\u01fd\u01fe\7,\2\2\u01fe\u0202\3\2\2\2\u01ff\u0201"+
		"\13\2\2\2\u0200\u01ff\3\2\2\2\u0201\u0204\3\2\2\2\u0202\u0203\3\2\2\2"+
		"\u0202\u0200\3\2\2\2\u0203\u0205\3\2\2\2\u0204\u0202\3\2\2\2\u0205\u0206"+
		"\7,\2\2\u0206\u0207\7+\2\2\u0207\u0208\3\2\2\2\u0208\u0209\bW\2\2\u0209"+
		"\u00ae\3\2\2\2\u020a\u020e\7}\2\2\u020b\u020d\13\2\2\2\u020c\u020b\3\2"+
		"\2\2\u020d\u0210\3\2\2\2\u020e\u020f\3\2\2\2\u020e\u020c\3\2\2\2\u020f"+
		"\u0211\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0212\7\177\2\2\u0212\u0213\3"+
		"\2\2\2\u0213\u0214\bX\2\2\u0214\u00b0\3\2\2\2\u0215\u0216\t!\2\2\u0216"+
		"\u0217\3\2\2\2\u0217\u0218\bY\2\2\u0218\u00b2\3\2\2\2\17\2\u0138\u0162"+
		"\u016c\u0172\u017f\u0185\u0188\u018a\u018d\u01c4\u0202\u020e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
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
		END=8, IF=9, THEN=10, ELSE=11, TO=12, FOR=13, DOWNTO=14, DO=15, CONST=16, 
		VAR=17, NIL=18, NOT=19, CHARACTER=20, BOOLEAN=21, BOOL=22, INTEGER=23, 
		STRING=24, DIV=25, MOD=26, AND=27, OR=28, IDENT=29, CHAR=30, INT=31, STR=32, 
		REAL=33, REAL_NUM=34, EQUAL=35, NOT_EQUAL=36, LT=37, LE=38, GE=39, GT=40, 
		PLUS=41, MINUS=42, STAR=43, SLASH=44, ASSIGN=45, SEMI=46, COMMA=47, COLON=48, 
		DOT=49, LPAREN=50, RPAREN=51, COMMENT_1=52, COMMENT_2=53, WS=54;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WRITELN", "WRITE", "READLN", "PROGRAM", "FUNCTION", "PROCEDURE", "BEGIN", 
			"END", "IF", "THEN", "ELSE", "TO", "FOR", "DOWNTO", "DO", "CONST", "VAR", 
			"NIL", "NOT", "CHARACTER", "BOOLEAN", "BOOL", "INTEGER", "STRING", "DIV", 
			"MOD", "AND", "OR", "IDENT", "CHAR", "INT", "STR", "REAL", "REAL_NUM", 
			"EQUAL", "NOT_EQUAL", "LT", "LE", "GE", "GT", "PLUS", "MINUS", "STAR", 
			"SLASH", "ASSIGN", "SEMI", "COMMA", "COLON", "DOT", "LPAREN", "RPAREN", 
			"EXPONENT", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", 
			"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", 
			"COMMENT_1", "COMMENT_2", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u01f5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u0128\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\7\36\u014a\n\36\f\36\16"+
		"\36\u014d\13\36\3\37\3\37\3\37\3\37\3 \6 \u0154\n \r \16 \u0155\3!\3!"+
		"\7!\u015a\n!\f!\16!\u015d\13!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\6#\u0167\n"+
		"#\r#\16#\u0168\3#\3#\6#\u016d\n#\r#\16#\u016e\3#\5#\u0172\n#\5#\u0174"+
		"\n#\3#\5#\u0177\n#\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*"+
		"\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\64\3\64\3\65\3\65\5\65\u01a1\n\65\3\65\3\65\3\66\3\66\3\67\3\67"+
		"\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C"+
		"\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N"+
		"\3O\3O\3P\3P\3P\3P\7P\u01dd\nP\fP\16P\u01e0\13P\3P\3P\3P\3P\3P\3Q\3Q\7"+
		"Q\u01e9\nQ\fQ\16Q\u01ec\13Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\5\u015b\u01de\u01ea"+
		"\2S\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\2k\2m"+
		"\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089"+
		"\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b"+
		"\2\u009d\2\u009f\66\u00a1\67\u00a38\3\2\"\4\2C\\c|\6\2\62;C\\aac|\5\2"+
		"\62;C\\c|\3\2\62;\4\2--//\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2"+
		"HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4"+
		"\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYy"+
		"y\4\2ZZzz\4\2[[{{\4\2\\\\||\5\2\13\f\17\17\"\"\2\u01e5\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2"+
		"\3\u00a5\3\2\2\2\5\u00ad\3\2\2\2\7\u00b3\3\2\2\2\t\u00ba\3\2\2\2\13\u00c2"+
		"\3\2\2\2\r\u00cb\3\2\2\2\17\u00d5\3\2\2\2\21\u00db\3\2\2\2\23\u00df\3"+
		"\2\2\2\25\u00e2\3\2\2\2\27\u00e7\3\2\2\2\31\u00ec\3\2\2\2\33\u00ef\3\2"+
		"\2\2\35\u00f3\3\2\2\2\37\u00fa\3\2\2\2!\u00fd\3\2\2\2#\u0103\3\2\2\2%"+
		"\u0107\3\2\2\2\'\u010b\3\2\2\2)\u010f\3\2\2\2+\u0114\3\2\2\2-\u0127\3"+
		"\2\2\2/\u0129\3\2\2\2\61\u0131\3\2\2\2\63\u0138\3\2\2\2\65\u013c\3\2\2"+
		"\2\67\u0140\3\2\2\29\u0144\3\2\2\2;\u0147\3\2\2\2=\u014e\3\2\2\2?\u0153"+
		"\3\2\2\2A\u0157\3\2\2\2C\u0160\3\2\2\2E\u0166\3\2\2\2G\u0178\3\2\2\2I"+
		"\u017a\3\2\2\2K\u017d\3\2\2\2M\u017f\3\2\2\2O\u0182\3\2\2\2Q\u0185\3\2"+
		"\2\2S\u0187\3\2\2\2U\u0189\3\2\2\2W\u018b\3\2\2\2Y\u018d\3\2\2\2[\u018f"+
		"\3\2\2\2]\u0192\3\2\2\2_\u0194\3\2\2\2a\u0196\3\2\2\2c\u0198\3\2\2\2e"+
		"\u019a\3\2\2\2g\u019c\3\2\2\2i\u019e\3\2\2\2k\u01a4\3\2\2\2m\u01a6\3\2"+
		"\2\2o\u01a8\3\2\2\2q\u01aa\3\2\2\2s\u01ac\3\2\2\2u\u01ae\3\2\2\2w\u01b0"+
		"\3\2\2\2y\u01b2\3\2\2\2{\u01b4\3\2\2\2}\u01b6\3\2\2\2\177\u01b8\3\2\2"+
		"\2\u0081\u01ba\3\2\2\2\u0083\u01bc\3\2\2\2\u0085\u01be\3\2\2\2\u0087\u01c0"+
		"\3\2\2\2\u0089\u01c2\3\2\2\2\u008b\u01c4\3\2\2\2\u008d\u01c6\3\2\2\2\u008f"+
		"\u01c8\3\2\2\2\u0091\u01ca\3\2\2\2\u0093\u01cc\3\2\2\2\u0095\u01ce\3\2"+
		"\2\2\u0097\u01d0\3\2\2\2\u0099\u01d2\3\2\2\2\u009b\u01d4\3\2\2\2\u009d"+
		"\u01d6\3\2\2\2\u009f\u01d8\3\2\2\2\u00a1\u01e6\3\2\2\2\u00a3\u01f1\3\2"+
		"\2\2\u00a5\u00a6\5\u0097L\2\u00a6\u00a7\5\u008dG\2\u00a7\u00a8\5{>\2\u00a8"+
		"\u00a9\5\u0091I\2\u00a9\u00aa\5s:\2\u00aa\u00ab\5\u0081A\2\u00ab\u00ac"+
		"\5\u0085C\2\u00ac\4\3\2\2\2\u00ad\u00ae\5\u0097L\2\u00ae\u00af\5\u008d"+
		"G\2\u00af\u00b0\5{>\2\u00b0\u00b1\5\u0091I\2\u00b1\u00b2\5s:\2\u00b2\6"+
		"\3\2\2\2\u00b3\u00b4\5\u008dG\2\u00b4\u00b5\5s:\2\u00b5\u00b6\5k\66\2"+
		"\u00b6\u00b7\5q9\2\u00b7\u00b8\5\u0081A\2\u00b8\u00b9\5\u0085C\2\u00b9"+
		"\b\3\2\2\2\u00ba\u00bb\5\u0089E\2\u00bb\u00bc\5\u008dG\2\u00bc\u00bd\5"+
		"\u0087D\2\u00bd\u00be\5w<\2\u00be\u00bf\5\u008dG\2\u00bf\u00c0\5k\66\2"+
		"\u00c0\u00c1\5\u0083B\2\u00c1\n\3\2\2\2\u00c2\u00c3\5u;\2\u00c3\u00c4"+
		"\5\u0093J\2\u00c4\u00c5\5\u0085C\2\u00c5\u00c6\5o8\2\u00c6\u00c7\5\u0091"+
		"I\2\u00c7\u00c8\5{>\2\u00c8\u00c9\5\u0087D\2\u00c9\u00ca\5\u0085C\2\u00ca"+
		"\f\3\2\2\2\u00cb\u00cc\5\u0089E\2\u00cc\u00cd\5\u008dG\2\u00cd\u00ce\5"+
		"\u0087D\2\u00ce\u00cf\5o8\2\u00cf\u00d0\5s:\2\u00d0\u00d1\5q9\2\u00d1"+
		"\u00d2\5\u0093J\2\u00d2\u00d3\5\u008dG\2\u00d3\u00d4\5s:\2\u00d4\16\3"+
		"\2\2\2\u00d5\u00d6\5m\67\2\u00d6\u00d7\5s:\2\u00d7\u00d8\5w<\2\u00d8\u00d9"+
		"\5{>\2\u00d9\u00da\5\u0085C\2\u00da\20\3\2\2\2\u00db\u00dc\5s:\2\u00dc"+
		"\u00dd\5\u0085C\2\u00dd\u00de\5q9\2\u00de\22\3\2\2\2\u00df\u00e0\5{>\2"+
		"\u00e0\u00e1\5u;\2\u00e1\24\3\2\2\2\u00e2\u00e3\5\u0091I\2\u00e3\u00e4"+
		"\5y=\2\u00e4\u00e5\5s:\2\u00e5\u00e6\5\u0085C\2\u00e6\26\3\2\2\2\u00e7"+
		"\u00e8\5s:\2\u00e8\u00e9\5\u0081A\2\u00e9\u00ea\5\u008fH\2\u00ea\u00eb"+
		"\5s:\2\u00eb\30\3\2\2\2\u00ec\u00ed\5\u0091I\2\u00ed\u00ee\5\u0087D\2"+
		"\u00ee\32\3\2\2\2\u00ef\u00f0\5u;\2\u00f0\u00f1\5\u0087D\2\u00f1\u00f2"+
		"\5\u008dG\2\u00f2\34\3\2\2\2\u00f3\u00f4\5q9\2\u00f4\u00f5\5\u0087D\2"+
		"\u00f5\u00f6\5\u0097L\2\u00f6\u00f7\5\u0085C\2\u00f7\u00f8\5\u0091I\2"+
		"\u00f8\u00f9\5\u0087D\2\u00f9\36\3\2\2\2\u00fa\u00fb\5q9\2\u00fb\u00fc"+
		"\5\u0087D\2\u00fc \3\2\2\2\u00fd\u00fe\5o8\2\u00fe\u00ff\5\u0087D\2\u00ff"+
		"\u0100\5\u0085C\2\u0100\u0101\5\u008fH\2\u0101\u0102\5\u0091I\2\u0102"+
		"\"\3\2\2\2\u0103\u0104\5\u0095K\2\u0104\u0105\5k\66\2\u0105\u0106\5\u008d"+
		"G\2\u0106$\3\2\2\2\u0107\u0108\5\u0085C\2\u0108\u0109\5{>\2\u0109\u010a"+
		"\5\u0081A\2\u010a&\3\2\2\2\u010b\u010c\5\u0085C\2\u010c\u010d\5\u0087"+
		"D\2\u010d\u010e\5\u0091I\2\u010e(\3\2\2\2\u010f\u0110\5o8\2\u0110\u0111"+
		"\5y=\2\u0111\u0112\5k\66\2\u0112\u0113\5\u008dG\2\u0113*\3\2\2\2\u0114"+
		"\u0115\5m\67\2\u0115\u0116\5\u0087D\2\u0116\u0117\5\u0087D\2\u0117\u0118"+
		"\5\u0081A\2\u0118\u0119\5s:\2\u0119\u011a\5k\66\2\u011a\u011b\5\u0085"+
		"C\2\u011b,\3\2\2\2\u011c\u011d\5\u0091I\2\u011d\u011e\5\u008dG\2\u011e"+
		"\u011f\5\u0093J\2\u011f\u0120\5s:\2\u0120\u0128\3\2\2\2\u0121\u0122\5"+
		"u;\2\u0122\u0123\5k\66\2\u0123\u0124\5\u0081A\2\u0124\u0125\5\u008fH\2"+
		"\u0125\u0126\5s:\2\u0126\u0128\3\2\2\2\u0127\u011c\3\2\2\2\u0127\u0121"+
		"\3\2\2\2\u0128.\3\2\2\2\u0129\u012a\5{>\2\u012a\u012b\5\u0085C\2\u012b"+
		"\u012c\5\u0091I\2\u012c\u012d\5s:\2\u012d\u012e\5w<\2\u012e\u012f\5s:"+
		"\2\u012f\u0130\5\u008dG\2\u0130\60\3\2\2\2\u0131\u0132\5\u008fH\2\u0132"+
		"\u0133\5\u0091I\2\u0133\u0134\5\u008dG\2\u0134\u0135\5{>\2\u0135\u0136"+
		"\5\u0085C\2\u0136\u0137\5w<\2\u0137\62\3\2\2\2\u0138\u0139\5q9\2\u0139"+
		"\u013a\5{>\2\u013a\u013b\5\u0095K\2\u013b\64\3\2\2\2\u013c\u013d\5\u0083"+
		"B\2\u013d\u013e\5\u0087D\2\u013e\u013f\5q9\2\u013f\66\3\2\2\2\u0140\u0141"+
		"\5k\66\2\u0141\u0142\5\u0085C\2\u0142\u0143\5q9\2\u01438\3\2\2\2\u0144"+
		"\u0145\5\u0087D\2\u0145\u0146\5\u008dG\2\u0146:\3\2\2\2\u0147\u014b\t"+
		"\2\2\2\u0148\u014a\t\3\2\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c<\3\2\2\2\u014d\u014b\3\2\2\2"+
		"\u014e\u014f\7)\2\2\u014f\u0150\t\4\2\2\u0150\u0151\7)\2\2\u0151>\3\2"+
		"\2\2\u0152\u0154\t\5\2\2\u0153\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156@\3\2\2\2\u0157\u015b\7)\2\2\u0158"+
		"\u015a\13\2\2\2\u0159\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u015c\3"+
		"\2\2\2\u015b\u0159\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e"+
		"\u015f\7)\2\2\u015fB\3\2\2\2\u0160\u0161\5\u008dG\2\u0161\u0162\5s:\2"+
		"\u0162\u0163\5k\66\2\u0163\u0164\5\u0081A\2\u0164D\3\2\2\2\u0165\u0167"+
		"\4\62;\2\u0166\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0166\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u0176\3\2\2\2\u016a\u016c\7\60\2\2\u016b\u016d\4"+
		"\62;\2\u016c\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u0172\5i\65\2\u0171\u0170\3\2"+
		"\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u016a\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0177\5i\65\2\u0176\u0173\3\2"+
		"\2\2\u0176\u0175\3\2\2\2\u0177F\3\2\2\2\u0178\u0179\7?\2\2\u0179H\3\2"+
		"\2\2\u017a\u017b\7>\2\2\u017b\u017c\7@\2\2\u017cJ\3\2\2\2\u017d\u017e"+
		"\7>\2\2\u017eL\3\2\2\2\u017f\u0180\7>\2\2\u0180\u0181\7?\2\2\u0181N\3"+
		"\2\2\2\u0182\u0183\7@\2\2\u0183\u0184\7?\2\2\u0184P\3\2\2\2\u0185\u0186"+
		"\7@\2\2\u0186R\3\2\2\2\u0187\u0188\7-\2\2\u0188T\3\2\2\2\u0189\u018a\7"+
		"/\2\2\u018aV\3\2\2\2\u018b\u018c\7,\2\2\u018cX\3\2\2\2\u018d\u018e\7\61"+
		"\2\2\u018eZ\3\2\2\2\u018f\u0190\7<\2\2\u0190\u0191\7?\2\2\u0191\\\3\2"+
		"\2\2\u0192\u0193\7=\2\2\u0193^\3\2\2\2\u0194\u0195\7.\2\2\u0195`\3\2\2"+
		"\2\u0196\u0197\7<\2\2\u0197b\3\2\2\2\u0198\u0199\7\60\2\2\u0199d\3\2\2"+
		"\2\u019a\u019b\7*\2\2\u019bf\3\2\2\2\u019c\u019d\7+\2\2\u019dh\3\2\2\2"+
		"\u019e\u01a0\7g\2\2\u019f\u01a1\t\6\2\2\u01a0\u019f\3\2\2\2\u01a0\u01a1"+
		"\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\4\62;\2\u01a3j\3\2\2\2\u01a4"+
		"\u01a5\t\7\2\2\u01a5l\3\2\2\2\u01a6\u01a7\t\b\2\2\u01a7n\3\2\2\2\u01a8"+
		"\u01a9\t\t\2\2\u01a9p\3\2\2\2\u01aa\u01ab\t\n\2\2\u01abr\3\2\2\2\u01ac"+
		"\u01ad\t\13\2\2\u01adt\3\2\2\2\u01ae\u01af\t\f\2\2\u01afv\3\2\2\2\u01b0"+
		"\u01b1\t\r\2\2\u01b1x\3\2\2\2\u01b2\u01b3\t\16\2\2\u01b3z\3\2\2\2\u01b4"+
		"\u01b5\t\17\2\2\u01b5|\3\2\2\2\u01b6\u01b7\t\20\2\2\u01b7~\3\2\2\2\u01b8"+
		"\u01b9\t\21\2\2\u01b9\u0080\3\2\2\2\u01ba\u01bb\t\22\2\2\u01bb\u0082\3"+
		"\2\2\2\u01bc\u01bd\t\23\2\2\u01bd\u0084\3\2\2\2\u01be\u01bf\t\24\2\2\u01bf"+
		"\u0086\3\2\2\2\u01c0\u01c1\t\25\2\2\u01c1\u0088\3\2\2\2\u01c2\u01c3\t"+
		"\26\2\2\u01c3\u008a\3\2\2\2\u01c4\u01c5\t\27\2\2\u01c5\u008c\3\2\2\2\u01c6"+
		"\u01c7\t\30\2\2\u01c7\u008e\3\2\2\2\u01c8\u01c9\t\31\2\2\u01c9\u0090\3"+
		"\2\2\2\u01ca\u01cb\t\32\2\2\u01cb\u0092\3\2\2\2\u01cc\u01cd\t\33\2\2\u01cd"+
		"\u0094\3\2\2\2\u01ce\u01cf\t\34\2\2\u01cf\u0096\3\2\2\2\u01d0\u01d1\t"+
		"\35\2\2\u01d1\u0098\3\2\2\2\u01d2\u01d3\t\36\2\2\u01d3\u009a\3\2\2\2\u01d4"+
		"\u01d5\t\37\2\2\u01d5\u009c\3\2\2\2\u01d6\u01d7\t \2\2\u01d7\u009e\3\2"+
		"\2\2\u01d8\u01d9\7*\2\2\u01d9\u01da\7,\2\2\u01da\u01de\3\2\2\2\u01db\u01dd"+
		"\13\2\2\2\u01dc\u01db\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01df\3\2\2\2"+
		"\u01de\u01dc\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2"+
		"\7,\2\2\u01e2\u01e3\7+\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\bP\2\2\u01e5"+
		"\u00a0\3\2\2\2\u01e6\u01ea\7}\2\2\u01e7\u01e9\13\2\2\2\u01e8\u01e7\3\2"+
		"\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01eb\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb"+
		"\u01ed\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ee\7\177\2\2\u01ee\u01ef\3"+
		"\2\2\2\u01ef\u01f0\bQ\2\2\u01f0\u00a2\3\2\2\2\u01f1\u01f2\t!\2\2\u01f2"+
		"\u01f3\3\2\2\2\u01f3\u01f4\bR\2\2\u01f4\u00a4\3\2\2\2\17\2\u0127\u014b"+
		"\u0155\u015b\u0168\u016e\u0171\u0173\u0176\u01a0\u01de\u01ea\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
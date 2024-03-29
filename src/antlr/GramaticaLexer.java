// Generated from Gramatica.g4 by ANTLR 4.7.2

    package antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AP=1, FP=2, AC=3, FC=4, ASP=5, DEL=6, VAR=7, ATR=8, IN=9, OUT=10, CSTR=11, 
		TIPO=12, FUN=13, CALL=14, MAIN=15, RET=16, OPLOGI=17, OPARIT=18, OPREL=19, 
		WHI=20, IF=21, THEN=22, ELSE=23, ID=24, NUM=25, WS=26, COM=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AP", "FP", "AC", "FC", "ASP", "DEL", "VAR", "ATR", "IN", "OUT", "CSTR", 
			"TIPO", "FUN", "CALL", "MAIN", "RET", "OPLOGI", "OPARIT", "OPREL", "WHI", 
			"IF", "THEN", "ELSE", "ID", "NUM", "WS", "COM", "ACENTO", "LETRA", "DIGITO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'\"'", "';'", "'vars'", "'='", "'in'", 
			"'out'", null, null, "'func'", "'call'", "'main'", "'return'", null, 
			null, null, "'while'", "'if'", "'then'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AP", "FP", "AC", "FC", "ASP", "DEL", "VAR", "ATR", "IN", "OUT", 
			"CSTR", "TIPO", "FUN", "CALL", "MAIN", "RET", "OPLOGI", "OPARIT", "OPREL", 
			"WHI", "IF", "THEN", "ELSE", "ID", "NUM", "WS", "COM"
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


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00e7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f^\n\f\f\f\16\fa"+
		"\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r{\n\r\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u0097\n\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00a4\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\7\31\u00bc\n\31\f\31\16\31\u00bf\13\31\3\32\6\32\u00c2"+
		"\n\32\r\32\16\32\u00c3\3\32\3\32\6\32\u00c8\n\32\r\32\16\32\u00c9\5\32"+
		"\u00cc\n\32\3\33\6\33\u00cf\n\33\r\33\16\33\u00d0\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\6\34\u00dc\n\34\r\34\16\34\u00dd\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\2;\2=\2\3\2\b\5\2,-//\61\61\4\2>>@@\5\2\13\f"+
		"\17\17\"\"\27\2\"\"$$))..C\\c|\u00c2\u00c5\u00c9\u00cb\u00cf\u00cf\u00d1"+
		"\u00d1\u00d3\u00d3\u00d5\u00d8\u00dc\u00dc\u00e2\u00e5\u00e9\u00ec\u00ef"+
		"\u00ef\u00f1\u00f1\u00f3\u00f3\u00f5\u00f8\u00fc\u00fc\u201e\u201e\4\2"+
		"C\\c|\3\2\62;\2\u00f8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2\tE\3\2\2\2\13G\3\2\2\2\rI\3\2"+
		"\2\2\17K\3\2\2\2\21P\3\2\2\2\23R\3\2\2\2\25U\3\2\2\2\27Y\3\2\2\2\31z\3"+
		"\2\2\2\33|\3\2\2\2\35\u0081\3\2\2\2\37\u0086\3\2\2\2!\u008b\3\2\2\2#\u0096"+
		"\3\2\2\2%\u0098\3\2\2\2\'\u00a3\3\2\2\2)\u00a5\3\2\2\2+\u00ab\3\2\2\2"+
		"-\u00ae\3\2\2\2/\u00b3\3\2\2\2\61\u00b8\3\2\2\2\63\u00c1\3\2\2\2\65\u00ce"+
		"\3\2\2\2\67\u00d4\3\2\2\29\u00e1\3\2\2\2;\u00e3\3\2\2\2=\u00e5\3\2\2\2"+
		"?@\7*\2\2@\4\3\2\2\2AB\7+\2\2B\6\3\2\2\2CD\7}\2\2D\b\3\2\2\2EF\7\177\2"+
		"\2F\n\3\2\2\2GH\7$\2\2H\f\3\2\2\2IJ\7=\2\2J\16\3\2\2\2KL\7x\2\2LM\7c\2"+
		"\2MN\7t\2\2NO\7u\2\2O\20\3\2\2\2PQ\7?\2\2Q\22\3\2\2\2RS\7k\2\2ST\7p\2"+
		"\2T\24\3\2\2\2UV\7q\2\2VW\7w\2\2WX\7v\2\2X\26\3\2\2\2Y_\5\13\6\2Z^\5;"+
		"\36\2[^\5=\37\2\\^\7\"\2\2]Z\3\2\2\2][\3\2\2\2]\\\3\2\2\2^a\3\2\2\2_]"+
		"\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\5\13\6\2c\30\3\2\2\2de\7k\2\2"+
		"ef\7p\2\2fg\7v\2\2gh\7g\2\2hi\7i\2\2ij\7g\2\2j{\7t\2\2kl\7h\2\2lm\7n\2"+
		"\2mn\7q\2\2no\7c\2\2o{\7v\2\2pq\7d\2\2qr\7q\2\2rs\7q\2\2st\7n\2\2tu\7"+
		"g\2\2uv\7c\2\2v{\7p\2\2wx\7u\2\2xy\7v\2\2y{\7t\2\2zd\3\2\2\2zk\3\2\2\2"+
		"zp\3\2\2\2zw\3\2\2\2{\32\3\2\2\2|}\7h\2\2}~\7w\2\2~\177\7p\2\2\177\u0080"+
		"\7e\2\2\u0080\34\3\2\2\2\u0081\u0082\7e\2\2\u0082\u0083\7c\2\2\u0083\u0084"+
		"\7n\2\2\u0084\u0085\7n\2\2\u0085\36\3\2\2\2\u0086\u0087\7o\2\2\u0087\u0088"+
		"\7c\2\2\u0088\u0089\7k\2\2\u0089\u008a\7p\2\2\u008a \3\2\2\2\u008b\u008c"+
		"\7t\2\2\u008c\u008d\7g\2\2\u008d\u008e\7v\2\2\u008e\u008f\7w\2\2\u008f"+
		"\u0090\7t\2\2\u0090\u0091\7p\2\2\u0091\"\3\2\2\2\u0092\u0093\7(\2\2\u0093"+
		"\u0097\7(\2\2\u0094\u0095\7~\2\2\u0095\u0097\7~\2\2\u0096\u0092\3\2\2"+
		"\2\u0096\u0094\3\2\2\2\u0097$\3\2\2\2\u0098\u0099\t\2\2\2\u0099&\3\2\2"+
		"\2\u009a\u00a4\t\3\2\2\u009b\u009c\7@\2\2\u009c\u00a4\7?\2\2\u009d\u009e"+
		"\7>\2\2\u009e\u00a4\7?\2\2\u009f\u00a0\7#\2\2\u00a0\u00a4\7?\2\2\u00a1"+
		"\u00a2\7?\2\2\u00a2\u00a4\7?\2\2\u00a3\u009a\3\2\2\2\u00a3\u009b\3\2\2"+
		"\2\u00a3\u009d\3\2\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4("+
		"\3\2\2\2\u00a5\u00a6\7y\2\2\u00a6\u00a7\7j\2\2\u00a7\u00a8\7k\2\2\u00a8"+
		"\u00a9\7n\2\2\u00a9\u00aa\7g\2\2\u00aa*\3\2\2\2\u00ab\u00ac\7k\2\2\u00ac"+
		"\u00ad\7h\2\2\u00ad,\3\2\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7j\2\2\u00b0"+
		"\u00b1\7g\2\2\u00b1\u00b2\7p\2\2\u00b2.\3\2\2\2\u00b3\u00b4\7g\2\2\u00b4"+
		"\u00b5\7n\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7g\2\2\u00b7\60\3\2\2\2\u00b8"+
		"\u00bd\5;\36\2\u00b9\u00bc\5=\37\2\u00ba\u00bc\5;\36\2\u00bb\u00b9\3\2"+
		"\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\62\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c2\5=\37"+
		"\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\u00cb\3\2\2\2\u00c5\u00c7\7\60\2\2\u00c6\u00c8\5=\37\2"+
		"\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca"+
		"\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c5\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\64\3\2\2\2\u00cd\u00cf\t\4\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2"+
		"\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3"+
		"\b\33\2\2\u00d3\66\3\2\2\2\u00d4\u00d5\7\61\2\2\u00d5\u00d6\7\61\2\2\u00d6"+
		"\u00db\3\2\2\2\u00d7\u00dc\5;\36\2\u00d8\u00dc\5=\37\2\u00d9\u00dc\59"+
		"\35\2\u00da\u00dc\5\13\6\2\u00db\u00d7\3\2\2\2\u00db\u00d8\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\b\34\2\2\u00e0"+
		"8\3\2\2\2\u00e1\u00e2\t\5\2\2\u00e2:\3\2\2\2\u00e3\u00e4\t\6\2\2\u00e4"+
		"<\3\2\2\2\u00e5\u00e6\t\7\2\2\u00e6>\3\2\2\2\20\2]_z\u0096\u00a3\u00bb"+
		"\u00bd\u00c3\u00c9\u00cb\u00d0\u00db\u00dd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
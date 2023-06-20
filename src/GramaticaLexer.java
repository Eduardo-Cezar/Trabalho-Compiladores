// Generated from Gramatica.g4 by ANTLR 4.7.2
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
		T__0=1, T__1=2, AP=3, FP=4, AC=5, FC=6, ASP=7, DEL=8, VAR=9, ATR=10, IN=11, 
		OUT=12, CSTR=13, TIPO=14, FUN=15, CALL=16, RET=17, OPLOGI=18, OPARIT=19, 
		OPREL=20, WHI=21, IF=22, THEN=23, ELSE=24, ID=25, NUM=26, WS=27, COM=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "AP", "FP", "AC", "FC", "ASP", "DEL", "VAR", "ATR", "IN", 
			"OUT", "CSTR", "TIPO", "FUN", "CALL", "RET", "OPLOGI", "OPARIT", "OPREL", 
			"WHI", "IF", "THEN", "ELSE", "ID", "NUM", "WS", "COM", "ACENTO", "LETRA", 
			"DIGITO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'main'", "'('", "')'", "'{'", "'}'", "'\"'", "';'", "'vars'", 
			"'='", "'in'", "'out'", null, null, "'func'", "'call'", "'return'", null, 
			null, null, "'while'", "'if'", "'then'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "AP", "FP", "AC", "FC", "ASP", "DEL", "VAR", "ATR", 
			"IN", "OUT", "CSTR", "TIPO", "FUN", "CALL", "RET", "OPLOGI", "OPARIT", 
			"OPREL", "WHI", "IF", "THEN", "ELSE", "ID", "NUM", "WS", "COM"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00ec\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\7\16h\n\16\f\16\16\16k\13\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\5\17\u0085\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\5\23\u009c\n\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u00a9\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\7\32"+
		"\u00c1\n\32\f\32\16\32\u00c4\13\32\3\33\6\33\u00c7\n\33\r\33\16\33\u00c8"+
		"\3\33\3\33\6\33\u00cd\n\33\r\33\16\33\u00ce\5\33\u00d1\n\33\3\34\6\34"+
		"\u00d4\n\34\r\34\16\34\u00d5\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\6\35\u00e1\n\35\r\35\16\35\u00e2\3\35\3\35\3\36\3\36\3\37\3\37\3 "+
		"\3 \2\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\2=\2?\2\3\2\b\5\2,-//\61\61\4\2>>@@\5\2\13\f\17\17\"\"\27\2\"\""+
		"$$))..C\\c|\u00c2\u00c5\u00c9\u00cb\u00cf\u00cf\u00d1\u00d1\u00d3\u00d3"+
		"\u00d5\u00d8\u00dc\u00dc\u00e2\u00e5\u00e9\u00ec\u00ef\u00ef\u00f1\u00f1"+
		"\u00f3\u00f3\u00f5\u00f8\u00fc\u00fc\u201e\u201e\4\2C\\c|\3\2\62;\2\u00fc"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3A\3"+
		"\2\2\2\5E\3\2\2\2\7J\3\2\2\2\tL\3\2\2\2\13N\3\2\2\2\rP\3\2\2\2\17R\3\2"+
		"\2\2\21T\3\2\2\2\23V\3\2\2\2\25[\3\2\2\2\27]\3\2\2\2\31`\3\2\2\2\33d\3"+
		"\2\2\2\35\u0084\3\2\2\2\37\u0086\3\2\2\2!\u008b\3\2\2\2#\u0090\3\2\2\2"+
		"%\u009b\3\2\2\2\'\u009d\3\2\2\2)\u00a8\3\2\2\2+\u00aa\3\2\2\2-\u00b0\3"+
		"\2\2\2/\u00b3\3\2\2\2\61\u00b8\3\2\2\2\63\u00bd\3\2\2\2\65\u00c6\3\2\2"+
		"\2\67\u00d3\3\2\2\29\u00d9\3\2\2\2;\u00e6\3\2\2\2=\u00e8\3\2\2\2?\u00ea"+
		"\3\2\2\2AB\7k\2\2BC\7p\2\2CD\7v\2\2D\4\3\2\2\2EF\7o\2\2FG\7c\2\2GH\7k"+
		"\2\2HI\7p\2\2I\6\3\2\2\2JK\7*\2\2K\b\3\2\2\2LM\7+\2\2M\n\3\2\2\2NO\7}"+
		"\2\2O\f\3\2\2\2PQ\7\177\2\2Q\16\3\2\2\2RS\7$\2\2S\20\3\2\2\2TU\7=\2\2"+
		"U\22\3\2\2\2VW\7x\2\2WX\7c\2\2XY\7t\2\2YZ\7u\2\2Z\24\3\2\2\2[\\\7?\2\2"+
		"\\\26\3\2\2\2]^\7k\2\2^_\7p\2\2_\30\3\2\2\2`a\7q\2\2ab\7w\2\2bc\7v\2\2"+
		"c\32\3\2\2\2di\5\17\b\2eh\5=\37\2fh\5? \2ge\3\2\2\2gf\3\2\2\2hk\3\2\2"+
		"\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\5\17\b\2m\34\3\2\2\2no\7"+
		"k\2\2op\7p\2\2pq\7v\2\2qr\7g\2\2rs\7i\2\2st\7g\2\2t\u0085\7t\2\2uv\7h"+
		"\2\2vw\7n\2\2wx\7q\2\2xy\7c\2\2y\u0085\7v\2\2z{\7d\2\2{|\7q\2\2|}\7q\2"+
		"\2}~\7n\2\2~\177\7g\2\2\177\u0080\7c\2\2\u0080\u0085\7p\2\2\u0081\u0082"+
		"\7u\2\2\u0082\u0083\7v\2\2\u0083\u0085\7t\2\2\u0084n\3\2\2\2\u0084u\3"+
		"\2\2\2\u0084z\3\2\2\2\u0084\u0081\3\2\2\2\u0085\36\3\2\2\2\u0086\u0087"+
		"\7h\2\2\u0087\u0088\7w\2\2\u0088\u0089\7p\2\2\u0089\u008a\7e\2\2\u008a"+
		" \3\2\2\2\u008b\u008c\7e\2\2\u008c\u008d\7c\2\2\u008d\u008e\7n\2\2\u008e"+
		"\u008f\7n\2\2\u008f\"\3\2\2\2\u0090\u0091\7t\2\2\u0091\u0092\7g\2\2\u0092"+
		"\u0093\7v\2\2\u0093\u0094\7w\2\2\u0094\u0095\7t\2\2\u0095\u0096\7p\2\2"+
		"\u0096$\3\2\2\2\u0097\u0098\7(\2\2\u0098\u009c\7(\2\2\u0099\u009a\7~\2"+
		"\2\u009a\u009c\7~\2\2\u009b\u0097\3\2\2\2\u009b\u0099\3\2\2\2\u009c&\3"+
		"\2\2\2\u009d\u009e\t\2\2\2\u009e(\3\2\2\2\u009f\u00a9\t\3\2\2\u00a0\u00a1"+
		"\7@\2\2\u00a1\u00a9\7?\2\2\u00a2\u00a3\7>\2\2\u00a3\u00a9\7?\2\2\u00a4"+
		"\u00a5\7#\2\2\u00a5\u00a9\7?\2\2\u00a6\u00a7\7?\2\2\u00a7\u00a9\7?\2\2"+
		"\u00a8\u009f\3\2\2\2\u00a8\u00a0\3\2\2\2\u00a8\u00a2\3\2\2\2\u00a8\u00a4"+
		"\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9*\3\2\2\2\u00aa\u00ab\7y\2\2\u00ab\u00ac"+
		"\7j\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7g\2\2\u00af"+
		",\3\2\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7h\2\2\u00b2.\3\2\2\2\u00b3\u00b4"+
		"\7v\2\2\u00b4\u00b5\7j\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7p\2\2\u00b7"+
		"\60\3\2\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7u\2\2\u00bb"+
		"\u00bc\7g\2\2\u00bc\62\3\2\2\2\u00bd\u00c2\5=\37\2\u00be\u00c1\5? \2\u00bf"+
		"\u00c1\5=\37\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\64\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c5\u00c7\5? \2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00d0\3\2\2\2\u00ca\u00cc\7\60"+
		"\2\2\u00cb\u00cd\5? \2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\66\3\2\2\2\u00d2\u00d4\t\4\2\2\u00d3\u00d2\3\2\2"+
		"\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7\u00d8\b\34\2\2\u00d88\3\2\2\2\u00d9\u00da\7\61\2\2\u00da"+
		"\u00db\7\61\2\2\u00db\u00e0\3\2\2\2\u00dc\u00e1\5=\37\2\u00dd\u00e1\5"+
		"? \2\u00de\u00e1\5;\36\2\u00df\u00e1\5\17\b\2\u00e0\u00dc\3\2\2\2\u00e0"+
		"\u00dd\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\b\35\2\2\u00e5:\3\2\2\2\u00e6\u00e7\t\5\2\2\u00e7<\3\2\2\2\u00e8"+
		"\u00e9\t\6\2\2\u00e9>\3\2\2\2\u00ea\u00eb\t\7\2\2\u00eb@\3\2\2\2\20\2"+
		"gi\u0084\u009b\u00a8\u00c0\u00c2\u00c8\u00ce\u00d0\u00d5\u00e0\u00e2\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
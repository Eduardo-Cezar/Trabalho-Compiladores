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
		AP=1, FP=2, AC=3, FC=4, DEL=5, VAR=6, ID=7, NUM=8, TIPO=9, FUN=10, CALL=11, 
		RET=12, OPARIT=13, OPREL=14, WHI=15, IF=16, THEN=17, ELSE=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AP", "FP", "AC", "FC", "DEL", "VAR", "ID", "NUM", "TIPO", "FUN", "CALL", 
			"RET", "OPARIT", "OPREL", "WHI", "IF", "THEN", "ELSE", "WS", "LETRA", 
			"DIGITO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "':'", "'vars'", null, null, null, 
			"'func'", "'call'", "'return'", null, null, "'while'", "'if'", "'then'", 
			"'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AP", "FP", "AC", "FC", "DEL", "VAR", "ID", "NUM", "TIPO", "FUN", 
			"CALL", "RET", "OPARIT", "OPREL", "WHI", "IF", "THEN", "ELSE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u00a2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\b@\n\b\f\b\16\bC\13"+
		"\b\3\t\6\tF\n\t\r\t\16\tG\3\t\3\t\6\tL\n\t\r\t\16\tM\5\tP\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nd"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0082"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\24\7\24\u0098\n\24\f\24\16\24\u009b\13"+
		"\24\3\24\3\24\3\25\3\25\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\2+\2\3"+
		"\2\7\5\2,-//\61\61\4\2>>@@\5\2\13\f\17\17\"\"\4\2C\\c|\3\2\62;\2\u00ac"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3"+
		"\2\2\2\13\65\3\2\2\2\r\67\3\2\2\2\17<\3\2\2\2\21E\3\2\2\2\23c\3\2\2\2"+
		"\25e\3\2\2\2\27j\3\2\2\2\31o\3\2\2\2\33v\3\2\2\2\35\u0081\3\2\2\2\37\u0083"+
		"\3\2\2\2!\u0089\3\2\2\2#\u008c\3\2\2\2%\u0091\3\2\2\2\'\u0099\3\2\2\2"+
		")\u009e\3\2\2\2+\u00a0\3\2\2\2-.\7*\2\2.\4\3\2\2\2/\60\7+\2\2\60\6\3\2"+
		"\2\2\61\62\7}\2\2\62\b\3\2\2\2\63\64\7\177\2\2\64\n\3\2\2\2\65\66\7<\2"+
		"\2\66\f\3\2\2\2\678\7x\2\289\7c\2\29:\7t\2\2:;\7u\2\2;\16\3\2\2\2<A\5"+
		")\25\2=@\5+\26\2>@\5)\25\2?=\3\2\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3"+
		"\2\2\2B\20\3\2\2\2CA\3\2\2\2DF\5+\26\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2G"+
		"H\3\2\2\2HO\3\2\2\2IK\7\60\2\2JL\5+\26\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2"+
		"MN\3\2\2\2NP\3\2\2\2OI\3\2\2\2OP\3\2\2\2P\22\3\2\2\2QR\7k\2\2RS\7p\2\2"+
		"Sd\7v\2\2TU\7h\2\2UV\7n\2\2VW\7q\2\2WX\7c\2\2Xd\7v\2\2YZ\7d\2\2Z[\7q\2"+
		"\2[\\\7q\2\2\\]\7n\2\2]^\7g\2\2^_\7c\2\2_d\7p\2\2`a\7u\2\2ab\7v\2\2bd"+
		"\7t\2\2cQ\3\2\2\2cT\3\2\2\2cY\3\2\2\2c`\3\2\2\2d\24\3\2\2\2ef\7h\2\2f"+
		"g\7w\2\2gh\7p\2\2hi\7e\2\2i\26\3\2\2\2jk\7e\2\2kl\7c\2\2lm\7n\2\2mn\7"+
		"n\2\2n\30\3\2\2\2op\7t\2\2pq\7g\2\2qr\7v\2\2rs\7w\2\2st\7t\2\2tu\7p\2"+
		"\2u\32\3\2\2\2vw\t\2\2\2w\34\3\2\2\2x\u0082\t\3\2\2yz\7@\2\2z\u0082\7"+
		"?\2\2{|\7>\2\2|\u0082\7?\2\2}~\7#\2\2~\u0082\7?\2\2\177\u0080\7?\2\2\u0080"+
		"\u0082\7?\2\2\u0081x\3\2\2\2\u0081y\3\2\2\2\u0081{\3\2\2\2\u0081}\3\2"+
		"\2\2\u0081\177\3\2\2\2\u0082\36\3\2\2\2\u0083\u0084\7y\2\2\u0084\u0085"+
		"\7j\2\2\u0085\u0086\7k\2\2\u0086\u0087\7n\2\2\u0087\u0088\7g\2\2\u0088"+
		" \3\2\2\2\u0089\u008a\7k\2\2\u008a\u008b\7h\2\2\u008b\"\3\2\2\2\u008c"+
		"\u008d\7v\2\2\u008d\u008e\7j\2\2\u008e\u008f\7g\2\2\u008f\u0090\7p\2\2"+
		"\u0090$\3\2\2\2\u0091\u0092\7g\2\2\u0092\u0093\7n\2\2\u0093\u0094\7u\2"+
		"\2\u0094\u0095\7g\2\2\u0095&\3\2\2\2\u0096\u0098\t\4\2\2\u0097\u0096\3"+
		"\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\b\24\2\2\u009d(\3\2\2\2"+
		"\u009e\u009f\t\5\2\2\u009f*\3\2\2\2\u00a0\u00a1\t\6\2\2\u00a1,\3\2\2\2"+
		"\13\2?AGMOc\u0081\u0099\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
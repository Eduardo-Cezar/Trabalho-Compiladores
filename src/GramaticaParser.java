// Generated from Gramatica.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AP=1, FP=2, AC=3, FC=4, ASP=5, DEL=6, VAR=7, ATR=8, IN=9, OUT=10, CSTR=11, 
		TIPO=12, FUN=13, CALL=14, MAIN=15, RET=16, OPLOGI=17, OPARIT=18, OPREL=19, 
		WHI=20, IF=21, THEN=22, ELSE=23, ID=24, NUM=25, WS=26, COM=27;
	public static final int
		RULE_inicio = 0, RULE_declaracao_main = 1, RULE_declaracao_func = 2, RULE_declaracao_vars = 3, 
		RULE_chamada_func = 4, RULE_chamada_funcSemPV = 5, RULE_acao = 6, RULE_estruturas = 7, 
		RULE_operacao_relacional = 8, RULE_operacao_logica = 9, RULE_operacao_aritmetica = 10, 
		RULE_condicional_senao = 11, RULE_condicional = 12, RULE_operando = 13, 
		RULE_repeticao = 14, RULE_atribuicao = 15, RULE_entrada_dados = 16, RULE_saida_dados = 17, 
		RULE_algoritmo = 18, RULE_retorno_de_funcao = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "declaracao_main", "declaracao_func", "declaracao_vars", "chamada_func", 
			"chamada_funcSemPV", "acao", "estruturas", "operacao_relacional", "operacao_logica", 
			"operacao_aritmetica", "condicional_senao", "condicional", "operando", 
			"repeticao", "atribuicao", "entrada_dados", "saida_dados", "algoritmo", 
			"retorno_de_funcao"
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

	@Override
	public String getGrammarFileName() { return "antlr/Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InicioContext extends ParserRuleContext {
		public Declaracao_mainContext declaracao_main() {
			return getRuleContext(Declaracao_mainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GramaticaParser.EOF, 0); }
		public List<Declaracao_funcContext> declaracao_func() {
			return getRuleContexts(Declaracao_funcContext.class);
		}
		public Declaracao_funcContext declaracao_func(int i) {
			return getRuleContext(Declaracao_funcContext.class,i);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(40);
					declaracao_func();
					}
					} 
				}
				setState(45);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(46);
			declaracao_main();
			setState(47);
			match(EOF);
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

	public static class Declaracao_mainContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(GramaticaParser.FUN, 0); }
		public TerminalNode TIPO() { return getToken(GramaticaParser.TIPO, 0); }
		public TerminalNode MAIN() { return getToken(GramaticaParser.MAIN, 0); }
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public TerminalNode FP() { return getToken(GramaticaParser.FP, 0); }
		public TerminalNode AC() { return getToken(GramaticaParser.AC, 0); }
		public Declaracao_varsContext declaracao_vars() {
			return getRuleContext(Declaracao_varsContext.class,0);
		}
		public AlgoritmoContext algoritmo() {
			return getRuleContext(AlgoritmoContext.class,0);
		}
		public TerminalNode FC() { return getToken(GramaticaParser.FC, 0); }
		public Declaracao_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclaracao_main(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclaracao_main(this);
		}
	}

	public final Declaracao_mainContext declaracao_main() throws RecognitionException {
		Declaracao_mainContext _localctx = new Declaracao_mainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(FUN);
			setState(50);
			match(TIPO);
			setState(51);
			match(MAIN);
			setState(52);
			match(AP);
			setState(53);
			match(FP);
			setState(54);
			match(AC);
			setState(55);
			declaracao_vars();
			setState(56);
			algoritmo();
			setState(57);
			match(FC);
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

	public static class Declaracao_funcContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(GramaticaParser.FUN, 0); }
		public List<TerminalNode> TIPO() { return getTokens(GramaticaParser.TIPO); }
		public TerminalNode TIPO(int i) {
			return getToken(GramaticaParser.TIPO, i);
		}
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public TerminalNode FP() { return getToken(GramaticaParser.FP, 0); }
		public TerminalNode AC() { return getToken(GramaticaParser.AC, 0); }
		public Declaracao_varsContext declaracao_vars() {
			return getRuleContext(Declaracao_varsContext.class,0);
		}
		public AlgoritmoContext algoritmo() {
			return getRuleContext(AlgoritmoContext.class,0);
		}
		public TerminalNode FC() { return getToken(GramaticaParser.FC, 0); }
		public Declaracao_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclaracao_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclaracao_func(this);
		}
	}

	public final Declaracao_funcContext declaracao_func() throws RecognitionException {
		Declaracao_funcContext _localctx = new Declaracao_funcContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(FUN);
			setState(60);
			match(TIPO);
			setState(61);
			match(ID);
			setState(62);
			match(AP);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIPO) {
				{
				{
				setState(63);
				match(TIPO);
				setState(64);
				match(ID);
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(FP);
			setState(71);
			match(AC);
			setState(72);
			declaracao_vars();
			setState(73);
			algoritmo();
			setState(74);
			match(FC);
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

	public static class Declaracao_varsContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GramaticaParser.VAR, 0); }
		public TerminalNode AC() { return getToken(GramaticaParser.AC, 0); }
		public TerminalNode FC() { return getToken(GramaticaParser.FC, 0); }
		public List<TerminalNode> TIPO() { return getTokens(GramaticaParser.TIPO); }
		public TerminalNode TIPO(int i) {
			return getToken(GramaticaParser.TIPO, i);
		}
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public List<TerminalNode> DEL() { return getTokens(GramaticaParser.DEL); }
		public TerminalNode DEL(int i) {
			return getToken(GramaticaParser.DEL, i);
		}
		public Declaracao_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclaracao_vars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclaracao_vars(this);
		}
	}

	public final Declaracao_varsContext declaracao_vars() throws RecognitionException {
		Declaracao_varsContext _localctx = new Declaracao_varsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(76);
				match(VAR);
				setState(77);
				match(AC);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TIPO) {
					{
					{
					setState(78);
					match(TIPO);
					setState(79);
					match(ID);
					setState(80);
					match(DEL);
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(86);
				match(FC);
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

	public static class Chamada_funcContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(GramaticaParser.CALL, 0); }
		public TerminalNode FUN() { return getToken(GramaticaParser.FUN, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public TerminalNode FP() { return getToken(GramaticaParser.FP, 0); }
		public TerminalNode DEL() { return getToken(GramaticaParser.DEL, 0); }
		public List<Operacao_aritmeticaContext> operacao_aritmetica() {
			return getRuleContexts(Operacao_aritmeticaContext.class);
		}
		public Operacao_aritmeticaContext operacao_aritmetica(int i) {
			return getRuleContext(Operacao_aritmeticaContext.class,i);
		}
		public List<Operacao_relacionalContext> operacao_relacional() {
			return getRuleContexts(Operacao_relacionalContext.class);
		}
		public Operacao_relacionalContext operacao_relacional(int i) {
			return getRuleContext(Operacao_relacionalContext.class,i);
		}
		public List<Operacao_logicaContext> operacao_logica() {
			return getRuleContexts(Operacao_logicaContext.class);
		}
		public Operacao_logicaContext operacao_logica(int i) {
			return getRuleContext(Operacao_logicaContext.class,i);
		}
		public Chamada_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterChamada_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitChamada_func(this);
		}
	}

	public final Chamada_funcContext chamada_func() throws RecognitionException {
		Chamada_funcContext _localctx = new Chamada_funcContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_chamada_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(CALL);
			setState(90);
			match(FUN);
			setState(91);
			match(ID);
			setState(92);
			match(AP);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==NUM) {
				{
				setState(97);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(93);
					match(ID);
					}
					break;
				case 2:
					{
					setState(94);
					operacao_aritmetica();
					}
					break;
				case 3:
					{
					setState(95);
					operacao_relacional();
					}
					break;
				case 4:
					{
					setState(96);
					operacao_logica();
					}
					break;
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(FP);
			setState(103);
			match(DEL);
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

	public static class Chamada_funcSemPVContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(GramaticaParser.CALL, 0); }
		public TerminalNode FUN() { return getToken(GramaticaParser.FUN, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public TerminalNode FP() { return getToken(GramaticaParser.FP, 0); }
		public List<Operacao_aritmeticaContext> operacao_aritmetica() {
			return getRuleContexts(Operacao_aritmeticaContext.class);
		}
		public Operacao_aritmeticaContext operacao_aritmetica(int i) {
			return getRuleContext(Operacao_aritmeticaContext.class,i);
		}
		public List<Operacao_relacionalContext> operacao_relacional() {
			return getRuleContexts(Operacao_relacionalContext.class);
		}
		public Operacao_relacionalContext operacao_relacional(int i) {
			return getRuleContext(Operacao_relacionalContext.class,i);
		}
		public List<Operacao_logicaContext> operacao_logica() {
			return getRuleContexts(Operacao_logicaContext.class);
		}
		public Operacao_logicaContext operacao_logica(int i) {
			return getRuleContext(Operacao_logicaContext.class,i);
		}
		public Chamada_funcSemPVContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_funcSemPV; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterChamada_funcSemPV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitChamada_funcSemPV(this);
		}
	}

	public final Chamada_funcSemPVContext chamada_funcSemPV() throws RecognitionException {
		Chamada_funcSemPVContext _localctx = new Chamada_funcSemPVContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_chamada_funcSemPV);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(CALL);
			setState(106);
			match(FUN);
			setState(107);
			match(ID);
			setState(108);
			match(AP);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==NUM) {
				{
				setState(113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(109);
					match(ID);
					}
					break;
				case 2:
					{
					setState(110);
					operacao_aritmetica();
					}
					break;
				case 3:
					{
					setState(111);
					operacao_relacional();
					}
					break;
				case 4:
					{
					setState(112);
					operacao_logica();
					}
					break;
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(FP);
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

	public static class AcaoContext extends ParserRuleContext {
		public Entrada_dadosContext entrada_dados() {
			return getRuleContext(Entrada_dadosContext.class,0);
		}
		public Saida_dadosContext saida_dados() {
			return getRuleContext(Saida_dadosContext.class,0);
		}
		public Operacao_logicaContext operacao_logica() {
			return getRuleContext(Operacao_logicaContext.class,0);
		}
		public Chamada_funcContext chamada_func() {
			return getRuleContext(Chamada_funcContext.class,0);
		}
		public Retorno_de_funcaoContext retorno_de_funcao() {
			return getRuleContext(Retorno_de_funcaoContext.class,0);
		}
		public AcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAcao(this);
		}
	}

	public final AcaoContext acao() throws RecognitionException {
		AcaoContext _localctx = new AcaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_acao);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				entrada_dados();
				}
				break;
			case OUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				saida_dados();
				}
				break;
			case ID:
			case NUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				operacao_logica();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				chamada_func();
				}
				break;
			case RET:
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				retorno_de_funcao();
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

	public static class EstruturasContext extends ParserRuleContext {
		public RepeticaoContext repeticao() {
			return getRuleContext(RepeticaoContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public EstruturasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estruturas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterEstruturas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitEstruturas(this);
		}
	}

	public final EstruturasContext estruturas() throws RecognitionException {
		EstruturasContext _localctx = new EstruturasContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_estruturas);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHI:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				repeticao();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				condicional();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				atribuicao();
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

	public static class Operacao_relacionalContext extends ParserRuleContext {
		public TerminalNode OPREL() { return getToken(GramaticaParser.OPREL, 0); }
		public List<OperandoContext> operando() {
			return getRuleContexts(OperandoContext.class);
		}
		public OperandoContext operando(int i) {
			return getRuleContext(OperandoContext.class,i);
		}
		public Operacao_relacionalContext operacao_relacional() {
			return getRuleContext(Operacao_relacionalContext.class,0);
		}
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public TerminalNode FP() { return getToken(GramaticaParser.FP, 0); }
		public Chamada_funcSemPVContext chamada_funcSemPV() {
			return getRuleContext(Chamada_funcSemPVContext.class,0);
		}
		public Operacao_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOperacao_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOperacao_relacional(this);
		}
	}

	public final Operacao_relacionalContext operacao_relacional() throws RecognitionException {
		Operacao_relacionalContext _localctx = new Operacao_relacionalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operacao_relacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(132);
			operando();
			}
			setState(133);
			match(OPREL);
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(134);
				operando();
				}
				break;
			case 2:
				{
				setState(135);
				operacao_relacional();
				}
				break;
			case 3:
				{
				setState(136);
				match(AP);
				setState(137);
				operacao_relacional();
				setState(138);
				match(FP);
				}
				break;
			case 4:
				{
				setState(140);
				chamada_funcSemPV();
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

	public static class Operacao_logicaContext extends ParserRuleContext {
		public TerminalNode OPLOGI() { return getToken(GramaticaParser.OPLOGI, 0); }
		public List<OperandoContext> operando() {
			return getRuleContexts(OperandoContext.class);
		}
		public OperandoContext operando(int i) {
			return getRuleContext(OperandoContext.class,i);
		}
		public Operacao_logicaContext operacao_logica() {
			return getRuleContext(Operacao_logicaContext.class,0);
		}
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public TerminalNode FP() { return getToken(GramaticaParser.FP, 0); }
		public Chamada_funcSemPVContext chamada_funcSemPV() {
			return getRuleContext(Chamada_funcSemPVContext.class,0);
		}
		public Operacao_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOperacao_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOperacao_logica(this);
		}
	}

	public final Operacao_logicaContext operacao_logica() throws RecognitionException {
		Operacao_logicaContext _localctx = new Operacao_logicaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operacao_logica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(143);
			operando();
			}
			setState(144);
			match(OPLOGI);
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(145);
				operando();
				}
				break;
			case 2:
				{
				setState(146);
				operacao_logica();
				}
				break;
			case 3:
				{
				setState(147);
				match(AP);
				setState(148);
				operacao_logica();
				setState(149);
				match(FP);
				}
				break;
			case 4:
				{
				setState(151);
				chamada_funcSemPV();
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

	public static class Operacao_aritmeticaContext extends ParserRuleContext {
		public TerminalNode OPARIT() { return getToken(GramaticaParser.OPARIT, 0); }
		public List<OperandoContext> operando() {
			return getRuleContexts(OperandoContext.class);
		}
		public OperandoContext operando(int i) {
			return getRuleContext(OperandoContext.class,i);
		}
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public Operacao_aritmeticaContext operacao_aritmetica() {
			return getRuleContext(Operacao_aritmeticaContext.class,0);
		}
		public TerminalNode FP() { return getToken(GramaticaParser.FP, 0); }
		public Chamada_funcSemPVContext chamada_funcSemPV() {
			return getRuleContext(Chamada_funcSemPVContext.class,0);
		}
		public Operacao_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOperacao_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOperacao_aritmetica(this);
		}
	}

	public final Operacao_aritmeticaContext operacao_aritmetica() throws RecognitionException {
		Operacao_aritmeticaContext _localctx = new Operacao_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operacao_aritmetica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(154);
			operando();
			}
			setState(155);
			match(OPARIT);
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(156);
				operando();
				}
				break;
			case 2:
				{
				setState(157);
				match(AP);
				setState(158);
				operacao_aritmetica();
				setState(159);
				match(FP);
				}
				break;
			case 3:
				{
				setState(161);
				operacao_aritmetica();
				}
				break;
			case 4:
				{
				setState(162);
				chamada_funcSemPV();
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

	public static class Condicional_senaoContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(GramaticaParser.ELSE, 0); }
		public TerminalNode AC() { return getToken(GramaticaParser.AC, 0); }
		public AlgoritmoContext algoritmo() {
			return getRuleContext(AlgoritmoContext.class,0);
		}
		public TerminalNode FC() { return getToken(GramaticaParser.FC, 0); }
		public Condicional_senaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional_senao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCondicional_senao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCondicional_senao(this);
		}
	}

	public final Condicional_senaoContext condicional_senao() throws RecognitionException {
		Condicional_senaoContext _localctx = new Condicional_senaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condicional_senao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(ELSE);
			setState(166);
			match(AC);
			setState(167);
			algoritmo();
			setState(168);
			match(FC);
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

	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GramaticaParser.IF, 0); }
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public TerminalNode FP() { return getToken(GramaticaParser.FP, 0); }
		public TerminalNode THEN() { return getToken(GramaticaParser.THEN, 0); }
		public TerminalNode AC() { return getToken(GramaticaParser.AC, 0); }
		public AlgoritmoContext algoritmo() {
			return getRuleContext(AlgoritmoContext.class,0);
		}
		public TerminalNode FC() { return getToken(GramaticaParser.FC, 0); }
		public List<Operacao_relacionalContext> operacao_relacional() {
			return getRuleContexts(Operacao_relacionalContext.class);
		}
		public Operacao_relacionalContext operacao_relacional(int i) {
			return getRuleContext(Operacao_relacionalContext.class,i);
		}
		public List<Operacao_logicaContext> operacao_logica() {
			return getRuleContexts(Operacao_logicaContext.class);
		}
		public Operacao_logicaContext operacao_logica(int i) {
			return getRuleContext(Operacao_logicaContext.class,i);
		}
		public Condicional_senaoContext condicional_senao() {
			return getRuleContext(Condicional_senaoContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(IF);
			setState(171);
			match(AP);
			setState(174); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(174);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(172);
					operacao_relacional();
					}
					break;
				case 2:
					{
					setState(173);
					operacao_logica();
					}
					break;
				}
				}
				setState(176); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID || _la==NUM );
			setState(178);
			match(FP);
			setState(179);
			match(THEN);
			setState(180);
			match(AC);
			setState(181);
			algoritmo();
			setState(182);
			match(FC);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(183);
				condicional_senao();
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

	public static class OperandoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode NUM() { return getToken(GramaticaParser.NUM, 0); }
		public OperandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOperando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOperando(this);
		}
	}

	public final OperandoContext operando() throws RecognitionException {
		OperandoContext _localctx = new OperandoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
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

	public static class RepeticaoContext extends ParserRuleContext {
		public TerminalNode WHI() { return getToken(GramaticaParser.WHI, 0); }
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public TerminalNode FP() { return getToken(GramaticaParser.FP, 0); }
		public TerminalNode AC() { return getToken(GramaticaParser.AC, 0); }
		public AlgoritmoContext algoritmo() {
			return getRuleContext(AlgoritmoContext.class,0);
		}
		public TerminalNode FC() { return getToken(GramaticaParser.FC, 0); }
		public List<Operacao_relacionalContext> operacao_relacional() {
			return getRuleContexts(Operacao_relacionalContext.class);
		}
		public Operacao_relacionalContext operacao_relacional(int i) {
			return getRuleContext(Operacao_relacionalContext.class,i);
		}
		public RepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRepeticao(this);
		}
	}

	public final RepeticaoContext repeticao() throws RecognitionException {
		RepeticaoContext _localctx = new RepeticaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_repeticao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(WHI);
			setState(189);
			match(AP);
			setState(191); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(190);
				operacao_relacional();
				}
				}
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID || _la==NUM );
			setState(195);
			match(FP);
			setState(196);
			match(AC);
			setState(197);
			algoritmo();
			setState(198);
			match(FC);
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public TerminalNode ATR() { return getToken(GramaticaParser.ATR, 0); }
		public TerminalNode DEL() { return getToken(GramaticaParser.DEL, 0); }
		public Operacao_aritmeticaContext operacao_aritmetica() {
			return getRuleContext(Operacao_aritmeticaContext.class,0);
		}
		public TerminalNode CSTR() { return getToken(GramaticaParser.CSTR, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(ID);
			setState(201);
			match(ATR);
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(202);
				operacao_aritmetica();
				}
				break;
			case 2:
				{
				setState(203);
				match(ID);
				}
				break;
			case 3:
				{
				setState(204);
				match(CSTR);
				}
				break;
			}
			setState(207);
			match(DEL);
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

	public static class Entrada_dadosContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(GramaticaParser.IN, 0); }
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public TerminalNode FP() { return getToken(GramaticaParser.FP, 0); }
		public TerminalNode DEL() { return getToken(GramaticaParser.DEL, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public Entrada_dadosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada_dados; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterEntrada_dados(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitEntrada_dados(this);
		}
	}

	public final Entrada_dadosContext entrada_dados() throws RecognitionException {
		Entrada_dadosContext _localctx = new Entrada_dadosContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_entrada_dados);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(IN);
			setState(210);
			match(AP);
			{
			setState(211);
			match(ID);
			}
			setState(212);
			match(FP);
			setState(213);
			match(DEL);
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

	public static class Saida_dadosContext extends ParserRuleContext {
		public TerminalNode OUT() { return getToken(GramaticaParser.OUT, 0); }
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public TerminalNode FP() { return getToken(GramaticaParser.FP, 0); }
		public TerminalNode DEL() { return getToken(GramaticaParser.DEL, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public Chamada_funcSemPVContext chamada_funcSemPV() {
			return getRuleContext(Chamada_funcSemPVContext.class,0);
		}
		public TerminalNode CSTR() { return getToken(GramaticaParser.CSTR, 0); }
		public List<Operacao_aritmeticaContext> operacao_aritmetica() {
			return getRuleContexts(Operacao_aritmeticaContext.class);
		}
		public Operacao_aritmeticaContext operacao_aritmetica(int i) {
			return getRuleContext(Operacao_aritmeticaContext.class,i);
		}
		public Saida_dadosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saida_dados; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSaida_dados(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSaida_dados(this);
		}
	}

	public final Saida_dadosContext saida_dados() throws RecognitionException {
		Saida_dadosContext _localctx = new Saida_dadosContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_saida_dados);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(OUT);
			setState(216);
			match(AP);
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(217);
				match(ID);
				}
				break;
			case 2:
				{
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID || _la==NUM) {
					{
					{
					setState(218);
					operacao_aritmetica();
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(224);
				chamada_funcSemPV();
				}
				break;
			case 4:
				{
				setState(225);
				match(CSTR);
				}
				break;
			}
			setState(228);
			match(FP);
			setState(229);
			match(DEL);
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

	public static class AlgoritmoContext extends ParserRuleContext {
		public List<AcaoContext> acao() {
			return getRuleContexts(AcaoContext.class);
		}
		public AcaoContext acao(int i) {
			return getRuleContext(AcaoContext.class,i);
		}
		public List<EstruturasContext> estruturas() {
			return getRuleContexts(EstruturasContext.class);
		}
		public EstruturasContext estruturas(int i) {
			return getRuleContext(EstruturasContext.class,i);
		}
		public AlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAlgoritmo(this);
		}
	}

	public final AlgoritmoContext algoritmo() throws RecognitionException {
		AlgoritmoContext _localctx = new AlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_algoritmo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << OUT) | (1L << CALL) | (1L << RET) | (1L << WHI) | (1L << IF) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(231);
					acao();
					}
					break;
				case 2:
					{
					setState(232);
					estruturas();
					}
					break;
				}
				}
				setState(237);
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

	public static class Retorno_de_funcaoContext extends ParserRuleContext {
		public TerminalNode RET() { return getToken(GramaticaParser.RET, 0); }
		public TerminalNode DEL() { return getToken(GramaticaParser.DEL, 0); }
		public TerminalNode NUM() { return getToken(GramaticaParser.NUM, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode CSTR() { return getToken(GramaticaParser.CSTR, 0); }
		public Operacao_aritmeticaContext operacao_aritmetica() {
			return getRuleContext(Operacao_aritmeticaContext.class,0);
		}
		public Operacao_relacionalContext operacao_relacional() {
			return getRuleContext(Operacao_relacionalContext.class,0);
		}
		public Operacao_logicaContext operacao_logica() {
			return getRuleContext(Operacao_logicaContext.class,0);
		}
		public Chamada_funcSemPVContext chamada_funcSemPV() {
			return getRuleContext(Chamada_funcSemPVContext.class,0);
		}
		public Retorno_de_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno_de_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRetorno_de_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRetorno_de_funcao(this);
		}
	}

	public final Retorno_de_funcaoContext retorno_de_funcao() throws RecognitionException {
		Retorno_de_funcaoContext _localctx = new Retorno_de_funcaoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_retorno_de_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(RET);
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(239);
				match(NUM);
				}
				break;
			case 2:
				{
				setState(240);
				match(ID);
				}
				break;
			case 3:
				{
				setState(241);
				match(CSTR);
				}
				break;
			case 4:
				{
				setState(242);
				operacao_aritmetica();
				}
				break;
			case 5:
				{
				setState(243);
				operacao_relacional();
				}
				break;
			case 6:
				{
				setState(244);
				operacao_logica();
				}
				break;
			case 7:
				{
				setState(245);
				chamada_funcSemPV();
				}
				break;
			}
			setState(248);
			match(DEL);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00fd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4D"+
		"\n\4\f\4\16\4G\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5T\n"+
		"\5\f\5\16\5W\13\5\3\5\5\5Z\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6d\n"+
		"\6\f\6\16\6g\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7t\n\7"+
		"\f\7\16\7w\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\u0080\n\b\3\t\3\t\3\t"+
		"\5\t\u0085\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0090\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009b\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a6\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\6\16\u00b1\n\16\r\16\16\16\u00b2\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u00bb\n\16\3\17\3\17\3\20\3\20\3\20\6\20\u00c2\n\20\r\20\16\20\u00c3"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u00d0\n\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00de\n\23"+
		"\f\23\16\23\u00e1\13\23\3\23\3\23\5\23\u00e5\n\23\3\23\3\23\3\23\3\24"+
		"\3\24\7\24\u00ec\n\24\f\24\16\24\u00ef\13\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u00f9\n\25\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(\2\3\3\2\32\33\2\u0115\2-\3\2\2\2\4\63\3\2"+
		"\2\2\6=\3\2\2\2\bY\3\2\2\2\n[\3\2\2\2\fk\3\2\2\2\16\177\3\2\2\2\20\u0084"+
		"\3\2\2\2\22\u0086\3\2\2\2\24\u0091\3\2\2\2\26\u009c\3\2\2\2\30\u00a7\3"+
		"\2\2\2\32\u00ac\3\2\2\2\34\u00bc\3\2\2\2\36\u00be\3\2\2\2 \u00ca\3\2\2"+
		"\2\"\u00d3\3\2\2\2$\u00d9\3\2\2\2&\u00ed\3\2\2\2(\u00f0\3\2\2\2*,\5\6"+
		"\4\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60"+
		"\61\5\4\3\2\61\62\7\2\2\3\62\3\3\2\2\2\63\64\7\17\2\2\64\65\7\16\2\2\65"+
		"\66\7\21\2\2\66\67\7\3\2\2\678\7\4\2\289\7\5\2\29:\5\b\5\2:;\5&\24\2;"+
		"<\7\6\2\2<\5\3\2\2\2=>\7\17\2\2>?\7\16\2\2?@\7\32\2\2@E\7\3\2\2AB\7\16"+
		"\2\2BD\7\32\2\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3"+
		"\2\2\2HI\7\4\2\2IJ\7\5\2\2JK\5\b\5\2KL\5&\24\2LM\7\6\2\2M\7\3\2\2\2NO"+
		"\7\t\2\2OU\7\5\2\2PQ\7\16\2\2QR\7\32\2\2RT\7\b\2\2SP\3\2\2\2TW\3\2\2\2"+
		"US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XZ\7\6\2\2YN\3\2\2\2YZ\3\2\2\2"+
		"Z\t\3\2\2\2[\\\7\20\2\2\\]\7\17\2\2]^\7\32\2\2^e\7\3\2\2_d\7\32\2\2`d"+
		"\5\26\f\2ad\5\22\n\2bd\5\24\13\2c_\3\2\2\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2"+
		"\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7\4\2\2ij\7\b\2"+
		"\2j\13\3\2\2\2kl\7\20\2\2lm\7\17\2\2mn\7\32\2\2nu\7\3\2\2ot\7\32\2\2p"+
		"t\5\26\f\2qt\5\22\n\2rt\5\24\13\2so\3\2\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2"+
		"\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7\4\2\2y\r\3"+
		"\2\2\2z\u0080\5\"\22\2{\u0080\5$\23\2|\u0080\5\24\13\2}\u0080\5\n\6\2"+
		"~\u0080\5(\25\2\177z\3\2\2\2\177{\3\2\2\2\177|\3\2\2\2\177}\3\2\2\2\177"+
		"~\3\2\2\2\u0080\17\3\2\2\2\u0081\u0085\5\36\20\2\u0082\u0085\5\32\16\2"+
		"\u0083\u0085\5 \21\2\u0084\u0081\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083"+
		"\3\2\2\2\u0085\21\3\2\2\2\u0086\u0087\5\34\17\2\u0087\u008f\7\25\2\2\u0088"+
		"\u0090\5\34\17\2\u0089\u0090\5\22\n\2\u008a\u008b\7\3\2\2\u008b\u008c"+
		"\5\22\n\2\u008c\u008d\7\4\2\2\u008d\u0090\3\2\2\2\u008e\u0090\5\f\7\2"+
		"\u008f\u0088\3\2\2\2\u008f\u0089\3\2\2\2\u008f\u008a\3\2\2\2\u008f\u008e"+
		"\3\2\2\2\u0090\23\3\2\2\2\u0091\u0092\5\34\17\2\u0092\u009a\7\23\2\2\u0093"+
		"\u009b\5\34\17\2\u0094\u009b\5\24\13\2\u0095\u0096\7\3\2\2\u0096\u0097"+
		"\5\24\13\2\u0097\u0098\7\4\2\2\u0098\u009b\3\2\2\2\u0099\u009b\5\f\7\2"+
		"\u009a\u0093\3\2\2\2\u009a\u0094\3\2\2\2\u009a\u0095\3\2\2\2\u009a\u0099"+
		"\3\2\2\2\u009b\25\3\2\2\2\u009c\u009d\5\34\17\2\u009d\u00a5\7\24\2\2\u009e"+
		"\u00a6\5\34\17\2\u009f\u00a0\7\3\2\2\u00a0\u00a1\5\26\f\2\u00a1\u00a2"+
		"\7\4\2\2\u00a2\u00a6\3\2\2\2\u00a3\u00a6\5\26\f\2\u00a4\u00a6\5\f\7\2"+
		"\u00a5\u009e\3\2\2\2\u00a5\u009f\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4"+
		"\3\2\2\2\u00a6\27\3\2\2\2\u00a7\u00a8\7\31\2\2\u00a8\u00a9\7\5\2\2\u00a9"+
		"\u00aa\5&\24\2\u00aa\u00ab\7\6\2\2\u00ab\31\3\2\2\2\u00ac\u00ad\7\27\2"+
		"\2\u00ad\u00b0\7\3\2\2\u00ae\u00b1\5\22\n\2\u00af\u00b1\5\24\13\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7\4\2\2\u00b5"+
		"\u00b6\7\30\2\2\u00b6\u00b7\7\5\2\2\u00b7\u00b8\5&\24\2\u00b8\u00ba\7"+
		"\6\2\2\u00b9\u00bb\5\30\r\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\33\3\2\2\2\u00bc\u00bd\t\2\2\2\u00bd\35\3\2\2\2\u00be\u00bf\7\26\2\2"+
		"\u00bf\u00c1\7\3\2\2\u00c0\u00c2\5\22\n\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c6\7\4\2\2\u00c6\u00c7\7\5\2\2\u00c7\u00c8\5&\24\2\u00c8\u00c9\7\6"+
		"\2\2\u00c9\37\3\2\2\2\u00ca\u00cb\7\32\2\2\u00cb\u00cf\7\n\2\2\u00cc\u00d0"+
		"\5\26\f\2\u00cd\u00d0\7\32\2\2\u00ce\u00d0\7\r\2\2\u00cf\u00cc\3\2\2\2"+
		"\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2"+
		"\7\b\2\2\u00d2!\3\2\2\2\u00d3\u00d4\7\13\2\2\u00d4\u00d5\7\3\2\2\u00d5"+
		"\u00d6\7\32\2\2\u00d6\u00d7\7\4\2\2\u00d7\u00d8\7\b\2\2\u00d8#\3\2\2\2"+
		"\u00d9\u00da\7\f\2\2\u00da\u00e4\7\3\2\2\u00db\u00e5\7\32\2\2\u00dc\u00de"+
		"\5\26\f\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2"+
		"\u00df\u00e0\3\2\2\2\u00e0\u00e5\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e5"+
		"\5\f\7\2\u00e3\u00e5\7\r\2\2\u00e4\u00db\3\2\2\2\u00e4\u00df\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\4"+
		"\2\2\u00e7\u00e8\7\b\2\2\u00e8%\3\2\2\2\u00e9\u00ec\5\16\b\2\u00ea\u00ec"+
		"\5\20\t\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2"+
		"\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\'\3\2\2\2\u00ef\u00ed\3"+
		"\2\2\2\u00f0\u00f8\7\22\2\2\u00f1\u00f9\7\33\2\2\u00f2\u00f9\7\32\2\2"+
		"\u00f3\u00f9\7\r\2\2\u00f4\u00f9\5\26\f\2\u00f5\u00f9\5\22\n\2\u00f6\u00f9"+
		"\5\24\13\2\u00f7\u00f9\5\f\7\2\u00f8\u00f1\3\2\2\2\u00f8\u00f2\3\2\2\2"+
		"\u00f8\u00f3\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f8\u00f6"+
		"\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\7\b\2\2\u00fb"+
		")\3\2\2\2\31-EUYcesu\177\u0084\u008f\u009a\u00a5\u00b0\u00b2\u00ba\u00c3"+
		"\u00cf\u00df\u00e4\u00eb\u00ed\u00f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
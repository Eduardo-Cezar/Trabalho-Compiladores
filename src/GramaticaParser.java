// Generated from Gramatica.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, AP=3, FP=4, AC=5, FC=6, ASP=7, DEL=8, VAR=9, ATR=10, IN=11, 
		OUT=12, CSTR=13, TIPO=14, FUN=15, CALL=16, RET=17, OPLOGI=18, OPARIT=19, 
		OPREL=20, WHI=21, IF=22, THEN=23, ELSE=24, ID=25, NUM=26, WS=27, COM=28;
	public static final int
		RULE_inicio = 0, RULE_declaracao_main = 1, RULE_declaracao_func = 2, RULE_declaracao_vars = 3, 
		RULE_chamada_func = 4, RULE_acao = 5, RULE_estruturas = 6, RULE_operacao_relacional = 7, 
		RULE_operacao_logica = 8, RULE_operacao_logicaX = 9, RULE_operacao_aritmetica = 10, 
		RULE_condicional = 11, RULE_operando = 12, RULE_repeticao = 13, RULE_atribuicao = 14, 
		RULE_entrada_dados = 15, RULE_saida_dados = 16, RULE_algoritmo = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "declaracao_main", "declaracao_func", "declaracao_vars", "chamada_func", 
			"acao", "estruturas", "operacao_relacional", "operacao_logica", "operacao_logicaX", 
			"operacao_aritmetica", "condicional", "operando", "repeticao", "atribuicao", 
			"entrada_dados", "saida_dados", "algoritmo"
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

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

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
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(36);
					declaracao_func();
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(42);
			declaracao_main();
			setState(43);
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
			setState(45);
			match(FUN);
			setState(46);
			match(T__0);
			setState(47);
			match(T__1);
			setState(48);
			match(AP);
			setState(49);
			match(FP);
			setState(50);
			match(AC);
			setState(51);
			declaracao_vars();
			setState(52);
			algoritmo();
			setState(53);
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
			setState(55);
			match(FUN);
			setState(56);
			match(TIPO);
			setState(57);
			match(ID);
			setState(58);
			match(AP);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIPO) {
				{
				{
				setState(59);
				match(TIPO);
				setState(60);
				match(ID);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(FP);
			setState(67);
			match(AC);
			setState(68);
			declaracao_vars();
			setState(69);
			algoritmo();
			setState(70);
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
			setState(72);
			match(VAR);
			setState(73);
			match(AC);
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				match(TIPO);
				setState(75);
				match(ID);
				setState(76);
				match(DEL);
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TIPO );
			setState(81);
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

	public static class Chamada_funcContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(GramaticaParser.CALL, 0); }
		public TerminalNode FUN() { return getToken(GramaticaParser.FUN, 0); }
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public TerminalNode FP() { return getToken(GramaticaParser.FP, 0); }
		public TerminalNode DEL() { return getToken(GramaticaParser.DEL, 0); }
		public List<TerminalNode> TIPO() { return getTokens(GramaticaParser.TIPO); }
		public TerminalNode TIPO(int i) {
			return getToken(GramaticaParser.TIPO, i);
		}
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
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
			setState(83);
			match(CALL);
			setState(84);
			match(FUN);
			setState(85);
			match(AP);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIPO) {
				{
				{
				setState(86);
				match(TIPO);
				setState(87);
				match(ID);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(FP);
			setState(94);
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
		public TerminalNode DEL() { return getToken(GramaticaParser.DEL, 0); }
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
		enterRule(_localctx, 10, RULE_acao);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				entrada_dados();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				saida_dados();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				operacao_logica();
				setState(99);
				match(DEL);
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
		enterRule(_localctx, 12, RULE_estruturas);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHI:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				repeticao();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				condicional();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
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
		enterRule(_localctx, 14, RULE_operacao_relacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(108);
			operando();
			}
			setState(109);
			match(OPREL);
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(110);
				operando();
				}
				break;
			case 2:
				{
				setState(111);
				operacao_relacional();
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
		public Operacao_logicaXContext operacao_logicaX() {
			return getRuleContext(Operacao_logicaXContext.class,0);
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
		enterRule(_localctx, 16, RULE_operacao_logica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(114);
			operando();
			}
			setState(115);
			match(OPLOGI);
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case NUM:
				{
				setState(116);
				operando();
				}
				break;
			case AP:
				{
				setState(117);
				operacao_logicaX();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Operacao_logicaXContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public TerminalNode OPLOGI() { return getToken(GramaticaParser.OPLOGI, 0); }
		public TerminalNode FP() { return getToken(GramaticaParser.FP, 0); }
		public List<OperandoContext> operando() {
			return getRuleContexts(OperandoContext.class);
		}
		public OperandoContext operando(int i) {
			return getRuleContext(OperandoContext.class,i);
		}
		public Operacao_logicaXContext operacao_logicaX() {
			return getRuleContext(Operacao_logicaXContext.class,0);
		}
		public Operacao_logicaXContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao_logicaX; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOperacao_logicaX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOperacao_logicaX(this);
		}
	}

	public final Operacao_logicaXContext operacao_logicaX() throws RecognitionException {
		Operacao_logicaXContext _localctx = new Operacao_logicaXContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operacao_logicaX);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(AP);
			{
			setState(121);
			operando();
			}
			setState(122);
			match(OPLOGI);
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case NUM:
				{
				setState(123);
				operando();
				}
				break;
			case AP:
				{
				setState(124);
				operacao_logicaX();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(127);
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

	public static class Operacao_aritmeticaContext extends ParserRuleContext {
		public TerminalNode OPARIT() { return getToken(GramaticaParser.OPARIT, 0); }
		public List<OperandoContext> operando() {
			return getRuleContexts(OperandoContext.class);
		}
		public OperandoContext operando(int i) {
			return getRuleContext(OperandoContext.class,i);
		}
		public Operacao_aritmeticaContext operacao_aritmetica() {
			return getRuleContext(Operacao_aritmeticaContext.class,0);
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
			setState(129);
			operando();
			}
			setState(130);
			match(OPARIT);
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(131);
				operando();
				}
				break;
			case 2:
				{
				setState(132);
				operacao_aritmetica();
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

	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GramaticaParser.IF, 0); }
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public TerminalNode FP() { return getToken(GramaticaParser.FP, 0); }
		public TerminalNode AC() { return getToken(GramaticaParser.AC, 0); }
		public AlgoritmoContext algoritmo() {
			return getRuleContext(AlgoritmoContext.class,0);
		}
		public TerminalNode FC() { return getToken(GramaticaParser.FC, 0); }
		public List<Operacao_aritmeticaContext> operacao_aritmetica() {
			return getRuleContexts(Operacao_aritmeticaContext.class);
		}
		public Operacao_aritmeticaContext operacao_aritmetica(int i) {
			return getRuleContext(Operacao_aritmeticaContext.class,i);
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
		enterRule(_localctx, 22, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(IF);
			setState(136);
			match(AP);
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137);
				operacao_aritmetica();
				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID || _la==NUM );
			setState(142);
			match(FP);
			setState(143);
			match(AC);
			setState(144);
			algoritmo();
			setState(145);
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
		enterRule(_localctx, 24, RULE_operando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
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
		enterRule(_localctx, 26, RULE_repeticao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(WHI);
			setState(150);
			match(AP);
			setState(152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(151);
				operacao_relacional();
				}
				}
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID || _la==NUM );
			setState(156);
			match(FP);
			setState(157);
			match(AC);
			setState(158);
			algoritmo();
			setState(159);
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
		enterRule(_localctx, 28, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(ID);
			setState(162);
			match(ATR);
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(163);
				operacao_aritmetica();
				}
				break;
			case 2:
				{
				setState(164);
				match(ID);
				}
				break;
			case 3:
				{
				setState(165);
				match(CSTR);
				}
				break;
			}
			setState(168);
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
		enterRule(_localctx, 30, RULE_entrada_dados);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(IN);
			setState(171);
			match(AP);
			{
			setState(172);
			match(ID);
			}
			setState(173);
			match(FP);
			setState(174);
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
		public TerminalNode IN() { return getToken(GramaticaParser.IN, 0); }
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public TerminalNode FP() { return getToken(GramaticaParser.FP, 0); }
		public TerminalNode DEL() { return getToken(GramaticaParser.DEL, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
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
		enterRule(_localctx, 32, RULE_saida_dados);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(IN);
			setState(177);
			match(AP);
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(178);
				match(ID);
				}
				break;
			case 2:
				{
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID || _la==NUM) {
					{
					{
					setState(179);
					operacao_aritmetica();
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(187);
			match(FP);
			setState(188);
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
		enterRule(_localctx, 34, RULE_algoritmo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << WHI) | (1L << IF) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(192);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(190);
					acao();
					}
					break;
				case 2:
					{
					setState(191);
					estruturas();
					}
					break;
				}
				}
				setState(196);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00c8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4@\n\4\f\4\16\4C\13\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\6\5P\n\5\r\5\16\5Q\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\5\7h\n\7\3\b\3\b\3\b\5\bm\n\b\3\t\3\t\3\t\3\t\5\ts\n\t\3\n\3\n"+
		"\3\n\3\n\5\ny\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u0080\n\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\5\f\u0088\n\f\3\r\3\r\3\r\6\r\u008d\n\r\r\r\16\r\u008e"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\6\17\u009b\n\17\r\17\16"+
		"\17\u009c\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u00a9"+
		"\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22"+
		"\u00b7\n\22\f\22\16\22\u00ba\13\22\5\22\u00bc\n\22\3\22\3\22\3\22\3\23"+
		"\3\23\7\23\u00c3\n\23\f\23\16\23\u00c6\13\23\3\23\2\2\24\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$\2\3\3\2\33\34\2\u00c9\2)\3\2\2\2\4/\3\2\2"+
		"\2\69\3\2\2\2\bJ\3\2\2\2\nU\3\2\2\2\fg\3\2\2\2\16l\3\2\2\2\20n\3\2\2\2"+
		"\22t\3\2\2\2\24z\3\2\2\2\26\u0083\3\2\2\2\30\u0089\3\2\2\2\32\u0095\3"+
		"\2\2\2\34\u0097\3\2\2\2\36\u00a3\3\2\2\2 \u00ac\3\2\2\2\"\u00b2\3\2\2"+
		"\2$\u00c4\3\2\2\2&(\5\6\4\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2"+
		"*,\3\2\2\2+)\3\2\2\2,-\5\4\3\2-.\7\2\2\3.\3\3\2\2\2/\60\7\21\2\2\60\61"+
		"\7\3\2\2\61\62\7\4\2\2\62\63\7\5\2\2\63\64\7\6\2\2\64\65\7\7\2\2\65\66"+
		"\5\b\5\2\66\67\5$\23\2\678\7\b\2\28\5\3\2\2\29:\7\21\2\2:;\7\20\2\2;<"+
		"\7\33\2\2<A\7\5\2\2=>\7\20\2\2>@\7\33\2\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2"+
		"\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\6\2\2EF\7\7\2\2FG\5\b\5\2GH\5$\23"+
		"\2HI\7\b\2\2I\7\3\2\2\2JK\7\13\2\2KO\7\7\2\2LM\7\20\2\2MN\7\33\2\2NP\7"+
		"\n\2\2OL\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\b\2\2T\t"+
		"\3\2\2\2UV\7\22\2\2VW\7\21\2\2W\\\7\5\2\2XY\7\20\2\2Y[\7\33\2\2ZX\3\2"+
		"\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\6\2\2`a"+
		"\7\n\2\2a\13\3\2\2\2bh\5 \21\2ch\5\"\22\2de\5\22\n\2ef\7\n\2\2fh\3\2\2"+
		"\2gb\3\2\2\2gc\3\2\2\2gd\3\2\2\2h\r\3\2\2\2im\5\34\17\2jm\5\30\r\2km\5"+
		"\36\20\2li\3\2\2\2lj\3\2\2\2lk\3\2\2\2m\17\3\2\2\2no\5\32\16\2or\7\26"+
		"\2\2ps\5\32\16\2qs\5\20\t\2rp\3\2\2\2rq\3\2\2\2s\21\3\2\2\2tu\5\32\16"+
		"\2ux\7\24\2\2vy\5\32\16\2wy\5\24\13\2xv\3\2\2\2xw\3\2\2\2y\23\3\2\2\2"+
		"z{\7\5\2\2{|\5\32\16\2|\177\7\24\2\2}\u0080\5\32\16\2~\u0080\5\24\13\2"+
		"\177}\3\2\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7\6\2\2\u0082"+
		"\25\3\2\2\2\u0083\u0084\5\32\16\2\u0084\u0087\7\25\2\2\u0085\u0088\5\32"+
		"\16\2\u0086\u0088\5\26\f\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\27\3\2\2\2\u0089\u008a\7\30\2\2\u008a\u008c\7\5\2\2\u008b\u008d\5\26"+
		"\f\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\6\2\2\u0091\u0092\7\7"+
		"\2\2\u0092\u0093\5$\23\2\u0093\u0094\7\b\2\2\u0094\31\3\2\2\2\u0095\u0096"+
		"\t\2\2\2\u0096\33\3\2\2\2\u0097\u0098\7\27\2\2\u0098\u009a\7\5\2\2\u0099"+
		"\u009b\5\20\t\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3"+
		"\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\6\2\2\u009f"+
		"\u00a0\7\7\2\2\u00a0\u00a1\5$\23\2\u00a1\u00a2\7\b\2\2\u00a2\35\3\2\2"+
		"\2\u00a3\u00a4\7\33\2\2\u00a4\u00a8\7\f\2\2\u00a5\u00a9\5\26\f\2\u00a6"+
		"\u00a9\7\33\2\2\u00a7\u00a9\7\17\2\2\u00a8\u00a5\3\2\2\2\u00a8\u00a6\3"+
		"\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\n\2\2\u00ab"+
		"\37\3\2\2\2\u00ac\u00ad\7\r\2\2\u00ad\u00ae\7\5\2\2\u00ae\u00af\7\33\2"+
		"\2\u00af\u00b0\7\6\2\2\u00b0\u00b1\7\n\2\2\u00b1!\3\2\2\2\u00b2\u00b3"+
		"\7\r\2\2\u00b3\u00bb\7\5\2\2\u00b4\u00bc\7\33\2\2\u00b5\u00b7\5\26\f\2"+
		"\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00b4\3\2\2\2\u00bb"+
		"\u00b8\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7\6\2\2\u00be\u00bf\7\n"+
		"\2\2\u00bf#\3\2\2\2\u00c0\u00c3\5\f\7\2\u00c1\u00c3\5\16\b\2\u00c2\u00c0"+
		"\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5%\3\2\2\2\u00c6\u00c4\3\2\2\2\23)AQ\\glrx\177\u0087"+
		"\u008e\u009c\u00a8\u00b8\u00bb\u00c2\u00c4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
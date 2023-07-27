// Generated from Gramatica.g4 by ANTLR 4.7.2

    package antlr;

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
		AP=1, FP=2, AC=3, FC=4, ASP=5, DEL=6, VAR=7, ATR=8, IN=9, OUT=10, CSTR=11, 
		TIPO=12, FUN=13, CALL=14, MAIN=15, RET=16, OPLOGI=17, OPARIT=18, OPREL=19, 
		WHI=20, IF=21, THEN=22, ELSE=23, ID=24, NUM=25, WS=26, COM=27;
	public static final int
		RULE_inicio = 0, RULE_declaracao_main = 1, RULE_declaracao_func = 2, RULE_declaracao_vars = 3, 
		RULE_declaracao_var_uni = 4, RULE_chamada_func = 5, RULE_chamada_funcSemPV = 6, 
		RULE_acao = 7, RULE_estruturas = 8, RULE_operacao_relacional = 9, RULE_operacao_logica = 10, 
		RULE_operacao_aritmetica = 11, RULE_condicional_senao = 12, RULE_condicional = 13, 
		RULE_operando = 14, RULE_repeticao = 15, RULE_atribuicao = 16, RULE_entrada_dados = 17, 
		RULE_saida_dados = 18, RULE_algoritmo = 19, RULE_retorno_de_funcao = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "declaracao_main", "declaracao_func", "declaracao_vars", "declaracao_var_uni", 
			"chamada_func", "chamada_funcSemPV", "acao", "estruturas", "operacao_relacional", 
			"operacao_logica", "operacao_aritmetica", "condicional_senao", "condicional", 
			"operando", "repeticao", "atribuicao", "entrada_dados", "saida_dados", 
			"algoritmo", "retorno_de_funcao"
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
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
	 
		public InicioContext() { }
		public void copyFrom(InicioContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NInicioContext extends InicioContext {
		public Declaracao_mainContext declaracao_main() {
			return getRuleContext(Declaracao_mainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GramaticaParser.EOF, 0); }
		public Declaracao_funcContext declaracao_func() {
			return getRuleContext(Declaracao_funcContext.class,0);
		}
		public NInicioContext(InicioContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			_localctx = new NInicioContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(42);
				declaracao_func();
				}
				break;
			}
			setState(45);
			declaracao_main();
			setState(46);
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
		public Declaracao_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_main; }
	 
		public Declaracao_mainContext() { }
		public void copyFrom(Declaracao_mainContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlocoDeclaracaoMainContext extends Declaracao_mainContext {
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
		public BlocoDeclaracaoMainContext(Declaracao_mainContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterBlocoDeclaracaoMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitBlocoDeclaracaoMain(this);
		}
	}

	public final Declaracao_mainContext declaracao_main() throws RecognitionException {
		Declaracao_mainContext _localctx = new Declaracao_mainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao_main);
		try {
			_localctx = new BlocoDeclaracaoMainContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(FUN);
			setState(49);
			match(TIPO);
			setState(50);
			match(MAIN);
			setState(51);
			match(AP);
			setState(52);
			match(FP);
			setState(53);
			match(AC);
			setState(54);
			declaracao_vars();
			setState(55);
			algoritmo();
			setState(56);
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
		public Declaracao_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_func; }
	 
		public Declaracao_funcContext() { }
		public void copyFrom(Declaracao_funcContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlocoDeclaracaoFuncContext extends Declaracao_funcContext {
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
		public BlocoDeclaracaoFuncContext(Declaracao_funcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterBlocoDeclaracaoFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitBlocoDeclaracaoFunc(this);
		}
	}

	public final Declaracao_funcContext declaracao_func() throws RecognitionException {
		Declaracao_funcContext _localctx = new Declaracao_funcContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao_func);
		int _la;
		try {
			_localctx = new BlocoDeclaracaoFuncContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(FUN);
			setState(59);
			match(TIPO);
			setState(60);
			match(ID);
			setState(61);
			match(AP);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIPO) {
				{
				{
				setState(62);
				match(TIPO);
				setState(63);
				match(ID);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(FP);
			setState(70);
			match(AC);
			setState(71);
			declaracao_vars();
			setState(72);
			algoritmo();
			setState(73);
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
		public Declaracao_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_vars; }
	 
		public Declaracao_varsContext() { }
		public void copyFrom(Declaracao_varsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlocoDeclaracaoVarsContext extends Declaracao_varsContext {
		public TerminalNode VAR() { return getToken(GramaticaParser.VAR, 0); }
		public TerminalNode AC() { return getToken(GramaticaParser.AC, 0); }
		public TerminalNode FC() { return getToken(GramaticaParser.FC, 0); }
		public List<Declaracao_var_uniContext> declaracao_var_uni() {
			return getRuleContexts(Declaracao_var_uniContext.class);
		}
		public Declaracao_var_uniContext declaracao_var_uni(int i) {
			return getRuleContext(Declaracao_var_uniContext.class,i);
		}
		public BlocoDeclaracaoVarsContext(Declaracao_varsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterBlocoDeclaracaoVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitBlocoDeclaracaoVars(this);
		}
	}

	public final Declaracao_varsContext declaracao_vars() throws RecognitionException {
		Declaracao_varsContext _localctx = new Declaracao_varsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_vars);
		int _la;
		try {
			_localctx = new BlocoDeclaracaoVarsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(75);
				match(VAR);
				setState(76);
				match(AC);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TIPO) {
					{
					{
					setState(77);
					declaracao_var_uni();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
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

	public static class Declaracao_var_uniContext extends ParserRuleContext {
		public Declaracao_var_uniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_var_uni; }
	 
		public Declaracao_var_uniContext() { }
		public void copyFrom(Declaracao_var_uniContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlocoDeclaracaoVarUniContext extends Declaracao_var_uniContext {
		public TerminalNode TIPO() { return getToken(GramaticaParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode DEL() { return getToken(GramaticaParser.DEL, 0); }
		public BlocoDeclaracaoVarUniContext(Declaracao_var_uniContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterBlocoDeclaracaoVarUni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitBlocoDeclaracaoVarUni(this);
		}
	}

	public final Declaracao_var_uniContext declaracao_var_uni() throws RecognitionException {
		Declaracao_var_uniContext _localctx = new Declaracao_var_uniContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracao_var_uni);
		try {
			_localctx = new BlocoDeclaracaoVarUniContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(TIPO);
			setState(87);
			match(ID);
			setState(88);
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

	public static class Chamada_funcContext extends ParserRuleContext {
		public Chamada_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_func; }
	 
		public Chamada_funcContext() { }
		public void copyFrom(Chamada_funcContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ChamadaFuncContext extends Chamada_funcContext {
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
		public ChamadaFuncContext(Chamada_funcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterChamadaFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitChamadaFunc(this);
		}
	}

	public final Chamada_funcContext chamada_func() throws RecognitionException {
		Chamada_funcContext _localctx = new Chamada_funcContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_chamada_func);
		int _la;
		try {
			_localctx = new ChamadaFuncContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(CALL);
			setState(91);
			match(FUN);
			setState(92);
			match(ID);
			setState(93);
			match(AP);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==NUM) {
				{
				setState(98);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(94);
					match(ID);
					}
					break;
				case 2:
					{
					setState(95);
					operacao_aritmetica();
					}
					break;
				case 3:
					{
					setState(96);
					operacao_relacional();
					}
					break;
				case 4:
					{
					setState(97);
					operacao_logica();
					}
					break;
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(FP);
			setState(104);
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
		public Chamada_funcSemPVContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_funcSemPV; }
	 
		public Chamada_funcSemPVContext() { }
		public void copyFrom(Chamada_funcSemPVContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ChamadaFuncSemPVContext extends Chamada_funcSemPVContext {
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
		public ChamadaFuncSemPVContext(Chamada_funcSemPVContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterChamadaFuncSemPV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitChamadaFuncSemPV(this);
		}
	}

	public final Chamada_funcSemPVContext chamada_funcSemPV() throws RecognitionException {
		Chamada_funcSemPVContext _localctx = new Chamada_funcSemPVContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_chamada_funcSemPV);
		int _la;
		try {
			_localctx = new ChamadaFuncSemPVContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(CALL);
			setState(107);
			match(FUN);
			setState(108);
			match(ID);
			setState(109);
			match(AP);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==NUM) {
				{
				setState(114);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(110);
					match(ID);
					}
					break;
				case 2:
					{
					setState(111);
					operacao_aritmetica();
					}
					break;
				case 3:
					{
					setState(112);
					operacao_relacional();
					}
					break;
				case 4:
					{
					setState(113);
					operacao_logica();
					}
					break;
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
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
		public AcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acao; }
	 
		public AcaoContext() { }
		public void copyFrom(AcaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NAcaoContext extends AcaoContext {
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
		public NAcaoContext(AcaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNAcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNAcao(this);
		}
	}

	public final AcaoContext acao() throws RecognitionException {
		AcaoContext _localctx = new AcaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_acao);
		try {
			_localctx = new NAcaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
				{
				setState(121);
				entrada_dados();
				}
				break;
			case OUT:
				{
				setState(122);
				saida_dados();
				}
				break;
			case ID:
			case NUM:
				{
				setState(123);
				operacao_logica();
				}
				break;
			case CALL:
				{
				setState(124);
				chamada_func();
				}
				break;
			case RET:
				{
				setState(125);
				retorno_de_funcao();
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

	public static class EstruturasContext extends ParserRuleContext {
		public EstruturasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estruturas; }
	 
		public EstruturasContext() { }
		public void copyFrom(EstruturasContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NEstruturasContext extends EstruturasContext {
		public RepeticaoContext repeticao() {
			return getRuleContext(RepeticaoContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public NEstruturasContext(EstruturasContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNEstruturas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNEstruturas(this);
		}
	}

	public final EstruturasContext estruturas() throws RecognitionException {
		EstruturasContext _localctx = new EstruturasContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_estruturas);
		try {
			_localctx = new NEstruturasContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHI:
				{
				setState(128);
				repeticao();
				}
				break;
			case IF:
				{
				setState(129);
				condicional();
				}
				break;
			case ID:
				{
				setState(130);
				atribuicao();
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

	public static class Operacao_relacionalContext extends ParserRuleContext {
		public Operacao_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao_relacional; }
	 
		public Operacao_relacionalContext() { }
		public void copyFrom(Operacao_relacionalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperacaoRelacionalContext extends Operacao_relacionalContext {
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
		public OperacaoRelacionalContext(Operacao_relacionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOperacaoRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOperacaoRelacional(this);
		}
	}

	public final Operacao_relacionalContext operacao_relacional() throws RecognitionException {
		Operacao_relacionalContext _localctx = new Operacao_relacionalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operacao_relacional);
		try {
			_localctx = new OperacaoRelacionalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(133);
			operando();
			}
			setState(134);
			match(OPREL);
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(135);
				operando();
				}
				break;
			case 2:
				{
				setState(136);
				operacao_relacional();
				}
				break;
			case 3:
				{
				setState(137);
				match(AP);
				setState(138);
				operacao_relacional();
				setState(139);
				match(FP);
				}
				break;
			case 4:
				{
				setState(141);
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
		public Operacao_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao_logica; }
	 
		public Operacao_logicaContext() { }
		public void copyFrom(Operacao_logicaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperacaoLogicaContext extends Operacao_logicaContext {
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
		public OperacaoLogicaContext(Operacao_logicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOperacaoLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOperacaoLogica(this);
		}
	}

	public final Operacao_logicaContext operacao_logica() throws RecognitionException {
		Operacao_logicaContext _localctx = new Operacao_logicaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operacao_logica);
		try {
			_localctx = new OperacaoLogicaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(144);
			operando();
			}
			setState(145);
			match(OPLOGI);
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(146);
				operando();
				}
				break;
			case 2:
				{
				setState(147);
				operacao_logica();
				}
				break;
			case 3:
				{
				setState(148);
				match(AP);
				setState(149);
				operacao_logica();
				setState(150);
				match(FP);
				}
				break;
			case 4:
				{
				setState(152);
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
		public Operacao_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao_aritmetica; }
	 
		public Operacao_aritmeticaContext() { }
		public void copyFrom(Operacao_aritmeticaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperacaoAritmeticaContext extends Operacao_aritmeticaContext {
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
		public OperacaoAritmeticaContext(Operacao_aritmeticaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOperacaoAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOperacaoAritmetica(this);
		}
	}

	public final Operacao_aritmeticaContext operacao_aritmetica() throws RecognitionException {
		Operacao_aritmeticaContext _localctx = new Operacao_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operacao_aritmetica);
		try {
			_localctx = new OperacaoAritmeticaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(155);
			operando();
			}
			setState(156);
			match(OPARIT);
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(157);
				operando();
				}
				break;
			case 2:
				{
				setState(158);
				match(AP);
				setState(159);
				operacao_aritmetica();
				setState(160);
				match(FP);
				}
				break;
			case 3:
				{
				setState(162);
				operacao_aritmetica();
				}
				break;
			case 4:
				{
				setState(163);
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
		public Condicional_senaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional_senao; }
	 
		public Condicional_senaoContext() { }
		public void copyFrom(Condicional_senaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondicionalSeNaoContext extends Condicional_senaoContext {
		public TerminalNode ELSE() { return getToken(GramaticaParser.ELSE, 0); }
		public TerminalNode AC() { return getToken(GramaticaParser.AC, 0); }
		public AlgoritmoContext algoritmo() {
			return getRuleContext(AlgoritmoContext.class,0);
		}
		public TerminalNode FC() { return getToken(GramaticaParser.FC, 0); }
		public CondicionalSeNaoContext(Condicional_senaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCondicionalSeNao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCondicionalSeNao(this);
		}
	}

	public final Condicional_senaoContext condicional_senao() throws RecognitionException {
		Condicional_senaoContext _localctx = new Condicional_senaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condicional_senao);
		try {
			_localctx = new CondicionalSeNaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(ELSE);
			setState(167);
			match(AC);
			setState(168);
			algoritmo();
			setState(169);
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
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
	 
		public CondicionalContext() { }
		public void copyFrom(CondicionalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondicionalIfContext extends CondicionalContext {
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
		public CondicionalIfContext(CondicionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCondicionalIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCondicionalIf(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condicional);
		int _la;
		try {
			_localctx = new CondicionalIfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(IF);
			setState(172);
			match(AP);
			setState(175); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(175);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(173);
					operacao_relacional();
					}
					break;
				case 2:
					{
					setState(174);
					operacao_logica();
					}
					break;
				}
				}
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID || _la==NUM );
			setState(179);
			match(FP);
			setState(180);
			match(THEN);
			setState(181);
			match(AC);
			setState(182);
			algoritmo();
			setState(183);
			match(FC);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(184);
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
		enterRule(_localctx, 28, RULE_operando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
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
		public RepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao; }
	 
		public RepeticaoContext() { }
		public void copyFrom(RepeticaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NRepeticaoContext extends RepeticaoContext {
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
		public NRepeticaoContext(RepeticaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNRepeticao(this);
		}
	}

	public final RepeticaoContext repeticao() throws RecognitionException {
		RepeticaoContext _localctx = new RepeticaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_repeticao);
		int _la;
		try {
			_localctx = new NRepeticaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(WHI);
			setState(190);
			match(AP);
			setState(192); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(191);
				operacao_relacional();
				}
				}
				setState(194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID || _la==NUM );
			setState(196);
			match(FP);
			setState(197);
			match(AC);
			setState(198);
			algoritmo();
			setState(199);
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
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	 
		public AtribuicaoContext() { }
		public void copyFrom(AtribuicaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NAtribuicaoContext extends AtribuicaoContext {
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
		public NAtribuicaoContext(AtribuicaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_atribuicao);
		try {
			_localctx = new NAtribuicaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(ID);
			setState(202);
			match(ATR);
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(203);
				operacao_aritmetica();
				}
				break;
			case 2:
				{
				setState(204);
				match(ID);
				}
				break;
			case 3:
				{
				setState(205);
				match(CSTR);
				}
				break;
			}
			setState(208);
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
		public Entrada_dadosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada_dados; }
	 
		public Entrada_dadosContext() { }
		public void copyFrom(Entrada_dadosContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EntradaDadosContext extends Entrada_dadosContext {
		public TerminalNode IN() { return getToken(GramaticaParser.IN, 0); }
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public TerminalNode FP() { return getToken(GramaticaParser.FP, 0); }
		public TerminalNode DEL() { return getToken(GramaticaParser.DEL, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public EntradaDadosContext(Entrada_dadosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterEntradaDados(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitEntradaDados(this);
		}
	}

	public final Entrada_dadosContext entrada_dados() throws RecognitionException {
		Entrada_dadosContext _localctx = new Entrada_dadosContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_entrada_dados);
		try {
			_localctx = new EntradaDadosContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(IN);
			setState(211);
			match(AP);
			{
			setState(212);
			match(ID);
			}
			setState(213);
			match(FP);
			setState(214);
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
		public Saida_dadosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saida_dados; }
	 
		public Saida_dadosContext() { }
		public void copyFrom(Saida_dadosContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SaidaContext extends Saida_dadosContext {
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
		public SaidaContext(Saida_dadosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSaida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSaida(this);
		}
	}

	public final Saida_dadosContext saida_dados() throws RecognitionException {
		Saida_dadosContext _localctx = new Saida_dadosContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_saida_dados);
		int _la;
		try {
			_localctx = new SaidaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(OUT);
			setState(217);
			match(AP);
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(218);
				match(ID);
				}
				break;
			case 2:
				{
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID || _la==NUM) {
					{
					{
					setState(219);
					operacao_aritmetica();
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(225);
				chamada_funcSemPV();
				}
				break;
			case 4:
				{
				setState(226);
				match(CSTR);
				}
				break;
			}
			setState(229);
			match(FP);
			setState(230);
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
		public AlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algoritmo; }
	 
		public AlgoritmoContext() { }
		public void copyFrom(AlgoritmoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NAlgoritmoContext extends AlgoritmoContext {
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
		public NAlgoritmoContext(AlgoritmoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNAlgoritmo(this);
		}
	}

	public final AlgoritmoContext algoritmo() throws RecognitionException {
		AlgoritmoContext _localctx = new AlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_algoritmo);
		int _la;
		try {
			_localctx = new NAlgoritmoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << OUT) | (1L << CALL) | (1L << RET) | (1L << WHI) | (1L << IF) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(234);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(232);
					acao();
					}
					break;
				case 2:
					{
					setState(233);
					estruturas();
					}
					break;
				}
				}
				setState(238);
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
		public Retorno_de_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno_de_funcao; }
	 
		public Retorno_de_funcaoContext() { }
		public void copyFrom(Retorno_de_funcaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RetornoDeFuncaoContext extends Retorno_de_funcaoContext {
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
		public RetornoDeFuncaoContext(Retorno_de_funcaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRetornoDeFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRetornoDeFuncao(this);
		}
	}

	public final Retorno_de_funcaoContext retorno_de_funcao() throws RecognitionException {
		Retorno_de_funcaoContext _localctx = new Retorno_de_funcaoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_retorno_de_funcao);
		try {
			_localctx = new RetornoDeFuncaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(RET);
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(240);
				match(NUM);
				}
				break;
			case 2:
				{
				setState(241);
				match(ID);
				}
				break;
			case 3:
				{
				setState(242);
				match(CSTR);
				}
				break;
			case 4:
				{
				setState(243);
				operacao_aritmetica();
				}
				break;
			case 5:
				{
				setState(244);
				operacao_relacional();
				}
				break;
			case 6:
				{
				setState(245);
				operacao_logica();
				}
				break;
			case 7:
				{
				setState(246);
				chamada_funcSemPV();
				}
				break;
			}
			setState(249);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00fe\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\5\2.\n\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4C\n\4"+
		"\f\4\16\4F\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5Q\n\5\f\5\16\5"+
		"T\13\5\3\5\5\5W\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7"+
		"\7e\n\7\f\7\16\7h\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b"+
		"u\n\b\f\b\16\bx\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u0081\n\t\3\n\3\n"+
		"\3\n\5\n\u0086\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0091"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009c\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a7\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\6\17\u00b2\n\17\r\17\16\17\u00b3\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u00bc\n\17\3\20\3\20\3\21\3\21\3\21\6\21\u00c3\n\21\r\21\16\21"+
		"\u00c4\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u00d1\n"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00df"+
		"\n\24\f\24\16\24\u00e2\13\24\3\24\3\24\5\24\u00e6\n\24\3\24\3\24\3\24"+
		"\3\25\3\25\7\25\u00ed\n\25\f\25\16\25\u00f0\13\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u00fa\n\26\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*\2\3\3\2\32\33\2\u0115\2-\3\2\2\2\4"+
		"\62\3\2\2\2\6<\3\2\2\2\bV\3\2\2\2\nX\3\2\2\2\f\\\3\2\2\2\16l\3\2\2\2\20"+
		"\u0080\3\2\2\2\22\u0085\3\2\2\2\24\u0087\3\2\2\2\26\u0092\3\2\2\2\30\u009d"+
		"\3\2\2\2\32\u00a8\3\2\2\2\34\u00ad\3\2\2\2\36\u00bd\3\2\2\2 \u00bf\3\2"+
		"\2\2\"\u00cb\3\2\2\2$\u00d4\3\2\2\2&\u00da\3\2\2\2(\u00ee\3\2\2\2*\u00f1"+
		"\3\2\2\2,.\5\6\4\2-,\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60\5\4\3\2\60\61\7\2"+
		"\2\3\61\3\3\2\2\2\62\63\7\17\2\2\63\64\7\16\2\2\64\65\7\21\2\2\65\66\7"+
		"\3\2\2\66\67\7\4\2\2\678\7\5\2\289\5\b\5\29:\5(\25\2:;\7\6\2\2;\5\3\2"+
		"\2\2<=\7\17\2\2=>\7\16\2\2>?\7\32\2\2?D\7\3\2\2@A\7\16\2\2AC\7\32\2\2"+
		"B@\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7\4\2\2"+
		"HI\7\5\2\2IJ\5\b\5\2JK\5(\25\2KL\7\6\2\2L\7\3\2\2\2MN\7\t\2\2NR\7\5\2"+
		"\2OQ\5\n\6\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2"+
		"\2UW\7\6\2\2VM\3\2\2\2VW\3\2\2\2W\t\3\2\2\2XY\7\16\2\2YZ\7\32\2\2Z[\7"+
		"\b\2\2[\13\3\2\2\2\\]\7\20\2\2]^\7\17\2\2^_\7\32\2\2_f\7\3\2\2`e\7\32"+
		"\2\2ae\5\30\r\2be\5\24\13\2ce\5\26\f\2d`\3\2\2\2da\3\2\2\2db\3\2\2\2d"+
		"c\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7\4\2\2"+
		"jk\7\b\2\2k\r\3\2\2\2lm\7\20\2\2mn\7\17\2\2no\7\32\2\2ov\7\3\2\2pu\7\32"+
		"\2\2qu\5\30\r\2ru\5\24\13\2su\5\26\f\2tp\3\2\2\2tq\3\2\2\2tr\3\2\2\2t"+
		"s\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7\4\2\2"+
		"z\17\3\2\2\2{\u0081\5$\23\2|\u0081\5&\24\2}\u0081\5\26\f\2~\u0081\5\f"+
		"\7\2\177\u0081\5*\26\2\u0080{\3\2\2\2\u0080|\3\2\2\2\u0080}\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\177\3\2\2\2\u0081\21\3\2\2\2\u0082\u0086\5 \21\2\u0083"+
		"\u0086\5\34\17\2\u0084\u0086\5\"\22\2\u0085\u0082\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0085\u0084\3\2\2\2\u0086\23\3\2\2\2\u0087\u0088\5\36\20\2\u0088"+
		"\u0090\7\25\2\2\u0089\u0091\5\36\20\2\u008a\u0091\5\24\13\2\u008b\u008c"+
		"\7\3\2\2\u008c\u008d\5\24\13\2\u008d\u008e\7\4\2\2\u008e\u0091\3\2\2\2"+
		"\u008f\u0091\5\16\b\2\u0090\u0089\3\2\2\2\u0090\u008a\3\2\2\2\u0090\u008b"+
		"\3\2\2\2\u0090\u008f\3\2\2\2\u0091\25\3\2\2\2\u0092\u0093\5\36\20\2\u0093"+
		"\u009b\7\23\2\2\u0094\u009c\5\36\20\2\u0095\u009c\5\26\f\2\u0096\u0097"+
		"\7\3\2\2\u0097\u0098\5\26\f\2\u0098\u0099\7\4\2\2\u0099\u009c\3\2\2\2"+
		"\u009a\u009c\5\16\b\2\u009b\u0094\3\2\2\2\u009b\u0095\3\2\2\2\u009b\u0096"+
		"\3\2\2\2\u009b\u009a\3\2\2\2\u009c\27\3\2\2\2\u009d\u009e\5\36\20\2\u009e"+
		"\u00a6\7\24\2\2\u009f\u00a7\5\36\20\2\u00a0\u00a1\7\3\2\2\u00a1\u00a2"+
		"\5\30\r\2\u00a2\u00a3\7\4\2\2\u00a3\u00a7\3\2\2\2\u00a4\u00a7\5\30\r\2"+
		"\u00a5\u00a7\5\16\b\2\u00a6\u009f\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\31\3\2\2\2\u00a8\u00a9\7\31\2\2\u00a9"+
		"\u00aa\7\5\2\2\u00aa\u00ab\5(\25\2\u00ab\u00ac\7\6\2\2\u00ac\33\3\2\2"+
		"\2\u00ad\u00ae\7\27\2\2\u00ae\u00b1\7\3\2\2\u00af\u00b2\5\24\13\2\u00b0"+
		"\u00b2\5\26\f\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3"+
		"\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b6\7\4\2\2\u00b6\u00b7\7\30\2\2\u00b7\u00b8\7\5\2\2\u00b8\u00b9\5"+
		"(\25\2\u00b9\u00bb\7\6\2\2\u00ba\u00bc\5\32\16\2\u00bb\u00ba\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\35\3\2\2\2\u00bd\u00be\t\2\2\2\u00be\37\3\2\2\2\u00bf"+
		"\u00c0\7\26\2\2\u00c0\u00c2\7\3\2\2\u00c1\u00c3\5\24\13\2\u00c2\u00c1"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c7\7\4\2\2\u00c7\u00c8\7\5\2\2\u00c8\u00c9\5("+
		"\25\2\u00c9\u00ca\7\6\2\2\u00ca!\3\2\2\2\u00cb\u00cc\7\32\2\2\u00cc\u00d0"+
		"\7\n\2\2\u00cd\u00d1\5\30\r\2\u00ce\u00d1\7\32\2\2\u00cf\u00d1\7\r\2\2"+
		"\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2\u00d3\7\b\2\2\u00d3#\3\2\2\2\u00d4\u00d5\7\13\2\2\u00d5"+
		"\u00d6\7\3\2\2\u00d6\u00d7\7\32\2\2\u00d7\u00d8\7\4\2\2\u00d8\u00d9\7"+
		"\b\2\2\u00d9%\3\2\2\2\u00da\u00db\7\f\2\2\u00db\u00e5\7\3\2\2\u00dc\u00e6"+
		"\7\32\2\2\u00dd\u00df\5\30\r\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2"+
		"\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e6\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e3\u00e6\5\16\b\2\u00e4\u00e6\7\r\2\2\u00e5\u00dc\3\2\2\2"+
		"\u00e5\u00e0\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e8\7\4\2\2\u00e8\u00e9\7\b\2\2\u00e9\'\3\2\2\2\u00ea"+
		"\u00ed\5\20\t\2\u00eb\u00ed\5\22\n\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3"+
		"\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		")\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f9\7\22\2\2\u00f2\u00fa\7\33\2"+
		"\2\u00f3\u00fa\7\32\2\2\u00f4\u00fa\7\r\2\2\u00f5\u00fa\5\30\r\2\u00f6"+
		"\u00fa\5\24\13\2\u00f7\u00fa\5\26\f\2\u00f8\u00fa\5\16\b\2\u00f9\u00f2"+
		"\3\2\2\2\u00f9\u00f3\3\2\2\2\u00f9\u00f4\3\2\2\2\u00f9\u00f5\3\2\2\2\u00f9"+
		"\u00f6\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\u00fc\7\b\2\2\u00fc+\3\2\2\2\31-DRVdftv\u0080\u0085\u0090\u009b"+
		"\u00a6\u00b1\u00b3\u00bb\u00c4\u00d0\u00e0\u00e5\u00ec\u00ee\u00f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
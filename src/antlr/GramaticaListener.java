// Generated from Gramatica.g4 by ANTLR 4.7.2

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code NInicio}
	 * labeled alternative in {@link GramaticaParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterNInicio(GramaticaParser.NInicioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NInicio}
	 * labeled alternative in {@link GramaticaParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitNInicio(GramaticaParser.NInicioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoDeclaracaoMain}
	 * labeled alternative in {@link GramaticaParser#declaracao_main}.
	 * @param ctx the parse tree
	 */
	void enterBlocoDeclaracaoMain(GramaticaParser.BlocoDeclaracaoMainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoDeclaracaoMain}
	 * labeled alternative in {@link GramaticaParser#declaracao_main}.
	 * @param ctx the parse tree
	 */
	void exitBlocoDeclaracaoMain(GramaticaParser.BlocoDeclaracaoMainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoDeclaracaoFunc}
	 * labeled alternative in {@link GramaticaParser#declaracao_func}.
	 * @param ctx the parse tree
	 */
	void enterBlocoDeclaracaoFunc(GramaticaParser.BlocoDeclaracaoFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoDeclaracaoFunc}
	 * labeled alternative in {@link GramaticaParser#declaracao_func}.
	 * @param ctx the parse tree
	 */
	void exitBlocoDeclaracaoFunc(GramaticaParser.BlocoDeclaracaoFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoDeclaracaoVars}
	 * labeled alternative in {@link GramaticaParser#declaracao_vars}.
	 * @param ctx the parse tree
	 */
	void enterBlocoDeclaracaoVars(GramaticaParser.BlocoDeclaracaoVarsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoDeclaracaoVars}
	 * labeled alternative in {@link GramaticaParser#declaracao_vars}.
	 * @param ctx the parse tree
	 */
	void exitBlocoDeclaracaoVars(GramaticaParser.BlocoDeclaracaoVarsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoDeclaracaoVarUni}
	 * labeled alternative in {@link GramaticaParser#declaracao_var_uni}.
	 * @param ctx the parse tree
	 */
	void enterBlocoDeclaracaoVarUni(GramaticaParser.BlocoDeclaracaoVarUniContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoDeclaracaoVarUni}
	 * labeled alternative in {@link GramaticaParser#declaracao_var_uni}.
	 * @param ctx the parse tree
	 */
	void exitBlocoDeclaracaoVarUni(GramaticaParser.BlocoDeclaracaoVarUniContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChamadaFunc}
	 * labeled alternative in {@link GramaticaParser#chamada_func}.
	 * @param ctx the parse tree
	 */
	void enterChamadaFunc(GramaticaParser.ChamadaFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChamadaFunc}
	 * labeled alternative in {@link GramaticaParser#chamada_func}.
	 * @param ctx the parse tree
	 */
	void exitChamadaFunc(GramaticaParser.ChamadaFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChamadaFuncSemPV}
	 * labeled alternative in {@link GramaticaParser#chamada_funcSemPV}.
	 * @param ctx the parse tree
	 */
	void enterChamadaFuncSemPV(GramaticaParser.ChamadaFuncSemPVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChamadaFuncSemPV}
	 * labeled alternative in {@link GramaticaParser#chamada_funcSemPV}.
	 * @param ctx the parse tree
	 */
	void exitChamadaFuncSemPV(GramaticaParser.ChamadaFuncSemPVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NAcao}
	 * labeled alternative in {@link GramaticaParser#acao}.
	 * @param ctx the parse tree
	 */
	void enterNAcao(GramaticaParser.NAcaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NAcao}
	 * labeled alternative in {@link GramaticaParser#acao}.
	 * @param ctx the parse tree
	 */
	void exitNAcao(GramaticaParser.NAcaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NEstruturas}
	 * labeled alternative in {@link GramaticaParser#estruturas}.
	 * @param ctx the parse tree
	 */
	void enterNEstruturas(GramaticaParser.NEstruturasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NEstruturas}
	 * labeled alternative in {@link GramaticaParser#estruturas}.
	 * @param ctx the parse tree
	 */
	void exitNEstruturas(GramaticaParser.NEstruturasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperacaoRelacional}
	 * labeled alternative in {@link GramaticaParser#operacao_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOperacaoRelacional(GramaticaParser.OperacaoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperacaoRelacional}
	 * labeled alternative in {@link GramaticaParser#operacao_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOperacaoRelacional(GramaticaParser.OperacaoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperacaoLogica}
	 * labeled alternative in {@link GramaticaParser#operacao_logica}.
	 * @param ctx the parse tree
	 */
	void enterOperacaoLogica(GramaticaParser.OperacaoLogicaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperacaoLogica}
	 * labeled alternative in {@link GramaticaParser#operacao_logica}.
	 * @param ctx the parse tree
	 */
	void exitOperacaoLogica(GramaticaParser.OperacaoLogicaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperacaoAritmetica}
	 * labeled alternative in {@link GramaticaParser#operacao_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterOperacaoAritmetica(GramaticaParser.OperacaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperacaoAritmetica}
	 * labeled alternative in {@link GramaticaParser#operacao_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitOperacaoAritmetica(GramaticaParser.OperacaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondicionalSeNao}
	 * labeled alternative in {@link GramaticaParser#condicional_senao}.
	 * @param ctx the parse tree
	 */
	void enterCondicionalSeNao(GramaticaParser.CondicionalSeNaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondicionalSeNao}
	 * labeled alternative in {@link GramaticaParser#condicional_senao}.
	 * @param ctx the parse tree
	 */
	void exitCondicionalSeNao(GramaticaParser.CondicionalSeNaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondicionalIf}
	 * labeled alternative in {@link GramaticaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicionalIf(GramaticaParser.CondicionalIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondicionalIf}
	 * labeled alternative in {@link GramaticaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicionalIf(GramaticaParser.CondicionalIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#operando}.
	 * @param ctx the parse tree
	 */
	void enterOperando(GramaticaParser.OperandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#operando}.
	 * @param ctx the parse tree
	 */
	void exitOperando(GramaticaParser.OperandoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NRepeticao}
	 * labeled alternative in {@link GramaticaParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void enterNRepeticao(GramaticaParser.NRepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NRepeticao}
	 * labeled alternative in {@link GramaticaParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void exitNRepeticao(GramaticaParser.NRepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NAtribuicao}
	 * labeled alternative in {@link GramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterNAtribuicao(GramaticaParser.NAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NAtribuicao}
	 * labeled alternative in {@link GramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitNAtribuicao(GramaticaParser.NAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EntradaDados}
	 * labeled alternative in {@link GramaticaParser#entrada_dados}.
	 * @param ctx the parse tree
	 */
	void enterEntradaDados(GramaticaParser.EntradaDadosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EntradaDados}
	 * labeled alternative in {@link GramaticaParser#entrada_dados}.
	 * @param ctx the parse tree
	 */
	void exitEntradaDados(GramaticaParser.EntradaDadosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Saida}
	 * labeled alternative in {@link GramaticaParser#saida_dados}.
	 * @param ctx the parse tree
	 */
	void enterSaida(GramaticaParser.SaidaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Saida}
	 * labeled alternative in {@link GramaticaParser#saida_dados}.
	 * @param ctx the parse tree
	 */
	void exitSaida(GramaticaParser.SaidaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NAlgoritmo}
	 * labeled alternative in {@link GramaticaParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void enterNAlgoritmo(GramaticaParser.NAlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NAlgoritmo}
	 * labeled alternative in {@link GramaticaParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void exitNAlgoritmo(GramaticaParser.NAlgoritmoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RetornoDeFuncao}
	 * labeled alternative in {@link GramaticaParser#retorno_de_funcao}.
	 * @param ctx the parse tree
	 */
	void enterRetornoDeFuncao(GramaticaParser.RetornoDeFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RetornoDeFuncao}
	 * labeled alternative in {@link GramaticaParser#retorno_de_funcao}.
	 * @param ctx the parse tree
	 */
	void exitRetornoDeFuncao(GramaticaParser.RetornoDeFuncaoContext ctx);
}
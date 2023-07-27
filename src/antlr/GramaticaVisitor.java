// Generated from Gramatica.g4 by ANTLR 4.7.2

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code NInicio}
	 * labeled alternative in {@link GramaticaParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNInicio(GramaticaParser.NInicioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlocoDeclaracaoMain}
	 * labeled alternative in {@link GramaticaParser#declaracao_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoDeclaracaoMain(GramaticaParser.BlocoDeclaracaoMainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlocoDeclaracaoFunc}
	 * labeled alternative in {@link GramaticaParser#declaracao_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoDeclaracaoFunc(GramaticaParser.BlocoDeclaracaoFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlocoDeclaracaoVars}
	 * labeled alternative in {@link GramaticaParser#declaracao_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoDeclaracaoVars(GramaticaParser.BlocoDeclaracaoVarsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChamadaFunc}
	 * labeled alternative in {@link GramaticaParser#chamada_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamadaFunc(GramaticaParser.ChamadaFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChamadaFuncSemPV}
	 * labeled alternative in {@link GramaticaParser#chamada_funcSemPV}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamadaFuncSemPV(GramaticaParser.ChamadaFuncSemPVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NAcao}
	 * labeled alternative in {@link GramaticaParser#acao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNAcao(GramaticaParser.NAcaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NEstruturas}
	 * labeled alternative in {@link GramaticaParser#estruturas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNEstruturas(GramaticaParser.NEstruturasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperacaoRelacional}
	 * labeled alternative in {@link GramaticaParser#operacao_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacaoRelacional(GramaticaParser.OperacaoRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperacaoLogica}
	 * labeled alternative in {@link GramaticaParser#operacao_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacaoLogica(GramaticaParser.OperacaoLogicaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperacaoAritmetica}
	 * labeled alternative in {@link GramaticaParser#operacao_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacaoAritmetica(GramaticaParser.OperacaoAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondicionalSeNao}
	 * labeled alternative in {@link GramaticaParser#condicional_senao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionalSeNao(GramaticaParser.CondicionalSeNaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondicionalIf}
	 * labeled alternative in {@link GramaticaParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionalIf(GramaticaParser.CondicionalIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#operando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperando(GramaticaParser.OperandoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NRepeticao}
	 * labeled alternative in {@link GramaticaParser#repeticao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNRepeticao(GramaticaParser.NRepeticaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NAtribuicao}
	 * labeled alternative in {@link GramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNAtribuicao(GramaticaParser.NAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EntradaDados}
	 * labeled alternative in {@link GramaticaParser#entrada_dados}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntradaDados(GramaticaParser.EntradaDadosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Saida}
	 * labeled alternative in {@link GramaticaParser#saida_dados}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSaida(GramaticaParser.SaidaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NAlgoritmo}
	 * labeled alternative in {@link GramaticaParser#algoritmo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNAlgoritmo(GramaticaParser.NAlgoritmoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RetornoDeFuncao}
	 * labeled alternative in {@link GramaticaParser#retorno_de_funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetornoDeFuncao(GramaticaParser.RetornoDeFuncaoContext ctx);
}
// Generated from Gramatica.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(GramaticaParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(GramaticaParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declaracao_main}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_main(GramaticaParser.Declaracao_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaracao_main}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_main(GramaticaParser.Declaracao_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declaracao_func}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_func(GramaticaParser.Declaracao_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaracao_func}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_func(GramaticaParser.Declaracao_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declaracao_vars}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_vars(GramaticaParser.Declaracao_varsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaracao_vars}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_vars(GramaticaParser.Declaracao_varsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#chamada_func}.
	 * @param ctx the parse tree
	 */
	void enterChamada_func(GramaticaParser.Chamada_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#chamada_func}.
	 * @param ctx the parse tree
	 */
	void exitChamada_func(GramaticaParser.Chamada_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#acao}.
	 * @param ctx the parse tree
	 */
	void enterAcao(GramaticaParser.AcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#acao}.
	 * @param ctx the parse tree
	 */
	void exitAcao(GramaticaParser.AcaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#estruturas}.
	 * @param ctx the parse tree
	 */
	void enterEstruturas(GramaticaParser.EstruturasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#estruturas}.
	 * @param ctx the parse tree
	 */
	void exitEstruturas(GramaticaParser.EstruturasContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#operacao_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOperacao_relacional(GramaticaParser.Operacao_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#operacao_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOperacao_relacional(GramaticaParser.Operacao_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#operacao_logica}.
	 * @param ctx the parse tree
	 */
	void enterOperacao_logica(GramaticaParser.Operacao_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#operacao_logica}.
	 * @param ctx the parse tree
	 */
	void exitOperacao_logica(GramaticaParser.Operacao_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#operacao_logicaX}.
	 * @param ctx the parse tree
	 */
	void enterOperacao_logicaX(GramaticaParser.Operacao_logicaXContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#operacao_logicaX}.
	 * @param ctx the parse tree
	 */
	void exitOperacao_logicaX(GramaticaParser.Operacao_logicaXContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#operacao_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterOperacao_aritmetica(GramaticaParser.Operacao_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#operacao_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitOperacao_aritmetica(GramaticaParser.Operacao_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(GramaticaParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(GramaticaParser.CondicionalContext ctx);
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
	 * Enter a parse tree produced by {@link GramaticaParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao(GramaticaParser.RepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao(GramaticaParser.RepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(GramaticaParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(GramaticaParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#entrada_dados}.
	 * @param ctx the parse tree
	 */
	void enterEntrada_dados(GramaticaParser.Entrada_dadosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#entrada_dados}.
	 * @param ctx the parse tree
	 */
	void exitEntrada_dados(GramaticaParser.Entrada_dadosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#saida_dados}.
	 * @param ctx the parse tree
	 */
	void enterSaida_dados(GramaticaParser.Saida_dadosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#saida_dados}.
	 * @param ctx the parse tree
	 */
	void exitSaida_dados(GramaticaParser.Saida_dadosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void enterAlgoritmo(GramaticaParser.AlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void exitAlgoritmo(GramaticaParser.AlgoritmoContext ctx);
}
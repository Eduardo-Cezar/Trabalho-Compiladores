import org.antlr.v4.runtime.ParserRuleContext;
import antlr.GramaticaBaseListener;
import antlr.GramaticaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;
public class MyListener extends GramaticaBaseListener{
    private Map<String,String> tabelaSimbolos = new HashMap<String,String>();


    @Override public void enterEveryRule(ParserRuleContext ctx) {
        System.out.println("+ Entrou na regra: " + ctx.getText());
    }

    @Override public void exitEveryRule(ParserRuleContext ctx) {
        System.out.println("- Saiu na regra: " + ctx.getText());
    }


    @Override public void enterBlocoDeclaracaoVars(GramaticaParser.BlocoDeclaracaoVarsContext ctx) {
        System.out.println("In id: " + ctx.getText());
        System.out.println("In TIPO: " + ctx.getText());
    }


    @Override public void exitBlocoDeclaracaoVars(GramaticaParser.BlocoDeclaracaoVarsContext ctx) {
        System.out.println("Out declaração: " + ctx.getText());
        String tipo = ctx.TIPO().toString();
        String id = ctx.ID().toString();
        if (tabelaSimbolos.containsKey(id)){
            System.out.println("Declaração duplicada! Variável " + id + " já declarada");
        } else {
            tabelaSimbolos.put(id,tipo);
        }
    }
    @Override public void enterChamadaFunc(GramaticaParser.ChamadaFuncContext ctx) {
        System.out.println("Chamou uma funcao ----------------");
    }
    public Map<String, String> getTabelaSimbolo() {
        return tabelaSimbolos;
    }
}

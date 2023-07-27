import org.antlr.v4.runtime.ParserRuleContext;
import antlr.GramaticaBaseListener;
import antlr.GramaticaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
/*
    - Declaracao duplicada [v]
    - Atr tipos diferentes [v]
    - Checagem de variáveis não declaradas []
        #ChamadaFunc[v]
        #Operando[]
        #EntradaDados
        #RetornoDeFuncao
    - escopo de variáveis []


 */

public class MyListener extends GramaticaBaseListener{
    private Map<String,String> tabelaSimbolos;
    private Map<String,Integer> escopoVariaveis;

    public  MyListener(){
        tabelaSimbolos = new HashMap<String,String>();
        escopoVariaveis = new HashMap<String, Integer>();
    }
    /*
    @Override public void enterEveryRule(ParserRuleContext ctx) {
        System.out.println("+ Entrou na regra: " + ctx.getText());
    }

    @Override public void exitEveryRule(ParserRuleContext ctx) {
        System.out.println("- Saiu na regra: " + ctx.getText());
    }
    */
    @Override public void enterBlocoDeclaracaoVarUni(GramaticaParser.BlocoDeclaracaoVarUniContext ctx) {
        System.out.println("Entrou declaração: " + ctx.getText());
        String tipo = ctx.TIPO().toString();
        String id = ctx.ID().toString();
        int escopo =  Integer.parseInt(splitIds(ctx.ID().getParent().getParent().getParent().toString())[0]);
        if (tabelaSimbolos.containsKey(id)){
            System.out.println("Declaração duplicada! Variável " + id + " já declarada");
        } else {
            tabelaSimbolos.put(id,tipo);
            escopoVariaveis.put(id, escopo);
        }
    }

    private String [] splitIds(String ids){
        String [] arrayIds = ids.split(",");
        for (int i = 0; i < arrayIds.length; i++){
            arrayIds[i] = arrayIds[i].replaceAll("[^a-zA-Z0-9]", "");
        }
        return arrayIds;
    }

    @Override public void enterChamadaFunc(GramaticaParser.ChamadaFuncContext ctx) {
        System.out.println("## enterChamadaFunc");
        String [] ids = splitIds(ctx.ID().toString());
        for (int i = 1; i < ids.length; i++){
            if (!variavelDeclarada(ids[i])){
                break;
            }
        }
    }
    @Override public void enterOperacaoAritmetica(GramaticaParser.OperacaoAritmeticaContext ctx) {
        System.out.println("enterOperacaoAritmetica");
        System.out.println("In id filho 1: " + ctx.getChild(0));
        System.out.println("In id filho 2: " + ctx.getChild(1));
    }

    @Override public void exitOperacaoAritmetica(GramaticaParser.OperacaoAritmeticaContext ctx) {
        System.out.println("exitOperacaoAritmetica");
        System.out.println("In id filho 1: " + ctx.getChild(0));
        System.out.println("In id filho 2: " + ctx.getChild(1));
    }

    @Override public void exitBlocoDeclaracaoVarUni(GramaticaParser.BlocoDeclaracaoVarUniContext ctx) {
        System.out.println("Saiu!");
        System.out.println("In id: " + ctx.ID().toString());
        System.out.println("In TIPO: " + ctx.TIPO().toString());
        System.out.println("Escopo: " + ctx.ID().getParent().getParent().getParent().toString());
    }

    @Override public void exitNAtribuicao(GramaticaParser.NAtribuicaoContext ctx) {
        String [] ids = splitIds(ctx.ID().toString());
        boolean possuiVarsdeclaradas = true;
        for (int i = 0; i < ids.length; i++){
            if (!variavelDeclarada(ids[i])){
                possuiVarsdeclaradas = false;
                break;
            }else{
                System.out.println("Nome id[" +i +"]: " + ids[i]);
                System.out.println("Tipo da variavel: " + getTipo(ids[i]));
            }
        }
        if (possuiVarsdeclaradas) {
            if (!getTipo(ids[0]).equals(ids[1])) {
                System.out.println("Tipos diferentes");
            }
        }
    }
    //-------------------------------- Mudar
    private boolean variavelDeclarada(String id){
        if (!tabelaSimbolos.containsKey(id)){
            System.out.println("A Variável " + id + " não foi declarada");
            return false;
        }
        return true;
    }
    //----------------------------------------
    public Map<String, String> getTabelaSimbolo() {
        return tabelaSimbolos;
    }

    private String getTipo(String nomeVar){
        return  tabelaSimbolos.get(nomeVar);
    }
}

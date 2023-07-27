import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class AppLexer {
    public static void  main (String[] args){
        // !!!! Mudar o caminho abaixo !!!!!
        String filename = "/home/eduardo/Documentos/Materias/Compiladores/Trabalhos/TrabalhoCompiladores/codigosTeste/Corretos/media2Numeros.txt";
        GramaticaParser parser = getParse(filename);

        //obter arvore
        ParseTree ast = parser.inicio();

        System.out.println(ast.toStringTree());

        //Inicia o MyListener, nossa implementação do baseListener
        MyListener listener = new MyListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        //percorre a ast com a nossa implementação do listener
        walker.walk(listener,ast);

        //imprime a tabela de símbolos
        System.out.println(listener.getTabelaSimbolo().toString());
    }

    private static GramaticaParser getParse(String nomeArquivo){
        GramaticaParser parser = null;
        try{
            CharStream input = CharStreams.fromFileName(nomeArquivo);
            GramaticaLexer lexer = new GramaticaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new GramaticaParser(tokens);

        } catch (IOException e){
            e.printStackTrace();
        }
        return parser;
    }
}

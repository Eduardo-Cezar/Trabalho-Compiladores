import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class AppLexer {
    public static void  main (String[] args){
        // !!!! Mudar o caminho abaixo !!!!!
        String filename = "/home/eduardo/Documentos/Materias/Compiladores/Trabalhos/TrabalhoCompiladores/codigosTeste/Corretos/codigo1.txt";
        try{
            CharStream input = CharStreams.fromFileName(filename);
            GramaticaLexer lexer = new GramaticaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GramaticaParser parser = new GramaticaParser(tokens);

            ParseTree ast;
            ast = parser.inicio();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

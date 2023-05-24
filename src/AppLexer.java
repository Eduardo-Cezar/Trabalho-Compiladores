import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.io.IOException;

public class AppLexer {
    public static void  main (String[] args){
        String filename = "/home/eduardo/Documentos/Materias/Compiladores/Trabalhos/TrabalhoCompiladores/codigo1.txt";
        try{
            CharStream input = CharStreams.fromFileName(filename);
            GramaticaLexer lexer = new GramaticaLexer(input);
            Token token;
            while (!lexer._hitEOF){
                token = lexer.nextToken();
                System.out.println("Token: "+ token.toString());
                System.out.println("    Lexema: "+ token.getText());
                System.out.println("    Classe: "+lexer.getVocabulary().getDisplayName(token.getType()));
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

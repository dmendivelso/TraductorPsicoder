import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Translate {
    public static void main(String [] args) throws Exception{
        PsicoderLexer lexer = new PsicoderLexer(CharStreams.fromFileName("Input/test5.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PsicoderParser parser = new PsicoderParser(tokens);
        ParseTree tree = parser.start();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new PsicoderToGo(), tree);
    }
}

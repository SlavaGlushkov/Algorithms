import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class StreamTokenizerTest {
    public static void main(String[] args) throws IOException {
        StreamTokenizer streamTokenizer = new StreamTokenizer(new FileReader("streamTokenizer.txt"));
        streamTokenizer.ordinaryChar(42);
        while (streamTokenizer.ttype != streamTokenizer.TT_EOF) {
            streamTokenizer.nextToken();
            System.out.println(streamTokenizer.sval);
        }
    }
}

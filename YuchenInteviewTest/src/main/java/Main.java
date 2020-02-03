import com.sun.org.apache.xml.internal.utils.StringBufferPool;
import javafx.util.Pair;

public class Main {
    public static void main(String[] args) {
        String input = "The cow jumped over the moon.";
        StringProcessor sp = new StringProcessor();
        System.out.println(sp.findLongestWordFromSentence(input));
    }
}

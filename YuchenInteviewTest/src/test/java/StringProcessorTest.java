import javafx.util.Pair;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by yuchenwang on 2020-02-02.
 */
public class StringProcessorTest {
    private StringProcessor sp;

    @Before
    public void config(){
        sp = new StringProcessor();
    }

    @Test
    public void testEmptyInput(){
        String input = "";
        Assert.assertEquals(new Pair<Integer, String>(0, ""), sp.findLongestWordFromSentence(input));
    }

    @Test
    public void testNullInput(){
        String input = null;
        Assert.assertEquals(new Pair<Integer, String>(0, ""), sp.findLongestWordFromSentence(input));
    }

    @Test
    public void testInputWithNoSpace(){
        String input = "Thecowjumpedoverthemoon.";
        Assert.assertEquals(new Pair<Integer, String>(23, "Thecowjumpedoverthemoon"), sp.findLongestWordFromSentence(input));
    }

    @Test
    public void testInputWithUnderscore(){
        String input = "Thecowjumpe_doverthemoon.";
        Assert.assertEquals(new Pair<Integer, String>(12, "doverthemoon"), sp.findLongestWordFromSentence(input));
    }

    @Test
    public void testInputWithNumber(){
        String input = "Thecowjumpe111doverthemoon.";
        Assert.assertEquals(new Pair<Integer, String>(26, "Thecowjumpe111doverthemoon"), sp.findLongestWordFromSentence(input));
    }

    @Test
    public void testInputWithStartSpace(){
        String input = " Thecowjumped";
        Assert.assertEquals(new Pair<Integer, String>(12, "Thecowjumped"), sp.findLongestWordFromSentence(input));
    }

    @Test
    public void testInputWithEndSpace(){
        String input = "Thecowjumped ";
        Assert.assertEquals(new Pair<Integer, String>(12, "Thecowjumped"), sp.findLongestWordFromSentence(input));
    }

    @Test
    public void testInputWithSuccessiveSpaces(){
        String input = " Thecowju       mped ";
        Assert.assertEquals(new Pair<Integer, String>(8, "Thecowju"), sp.findLongestWordFromSentence(input));
    }

    @Test
    public void testInputWithOneWord(){
        String input = " The";
        Assert.assertEquals(new Pair<Integer, String>(3, "The"), sp.findLongestWordFromSentence(input));
    }

    @Test
    public void testInputWithOnlyOneLongestWord(){
        String input = " The cow jumped over the moon.";
        Assert.assertEquals(new Pair<Integer, String>(6, "jumped"), sp.findLongestWordFromSentence(input));
    }

    @Test
    public void testInputWithMultipleLongestWord(){
        String input = " The cow jumped overed the123 moon.";
        Assert.assertEquals(new Pair<Integer, String>(6, "jumped"), sp.findLongestWordFromSentence(input));
    }
}

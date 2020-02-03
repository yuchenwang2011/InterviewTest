import javafx.util.Pair;

/**
 * Created by yuchenwang on 2020-02-02.
 * To Return the longest word with it's length given an input sentence
 */
public class StringProcessor {
    //Assumption:
    //1. input can be null
    //2. input length can be 0
    //3. input may have one or many empty spaces, at start, end or middle positions (worst case, whole string)
    //4. !!!!important one!!!! there might be more than one words have the longest length, in this case, return first one
    //5. word has punctuations, underscores will be considered as a space, the word will become 2 words
    //6. numbers 0-9 will be considered as part of the string as a regular letter
    public Pair<Integer, String> findLongestWordFromSentence(String input){
        int maxLength = 0;
        String longestWord = "";
        //<> is fullfilled in case language supported level is different on other computers
        if(input == null || input.length() == 0) return new Pair<Integer, String>(maxLength,longestWord);

        input = input.trim().replaceAll("[^A-Za-z0-9]", " ");
        String[] words = input.split(" ");

        for(String word : words){
            if(word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }
        return new Pair<Integer, String>(maxLength, longestWord);
    }
}

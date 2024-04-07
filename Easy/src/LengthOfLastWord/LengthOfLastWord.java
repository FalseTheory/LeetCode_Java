package LengthOfLastWord;

public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
    public static int lengthOfLastWord(String s) {
        String[] allWords = s.split(" ");
        return allWords[allWords.length-1].length();
    }
}

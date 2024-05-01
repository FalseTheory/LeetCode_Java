package reversePrefixOfWord;

public class Solution {

    public static String reversePrefix(String word, char ch) {
        StringBuilder pref = new StringBuilder();
        boolean hasPref = false;
        for(int i = 0; i < word.length();i++){
            char c = word.charAt(i);
            pref.append(c);
            if(c == ch && !hasPref){
                pref.reverse();
                hasPref = true;
            }
        }
        return pref.toString();
    }
}

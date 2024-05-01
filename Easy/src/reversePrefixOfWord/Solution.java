package reversePrefixOfWord;

import jdk.jfr.Description;

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


    public static String reversePrefix2(String word, char ch){
        char[] chWord = word.toCharArray();
        int firstAppearance = -1;
        for(int i = 0; i < chWord.length; i++){
            if(chWord[i]==ch){
                firstAppearance = i;
                break;
            }
        }
        if(firstAppearance==-1){
            return word;
        }
        for(int i = 0;i<=firstAppearance/2;i++){
            char tmp = chWord[i];
            chWord[i] = chWord[firstAppearance-i];
            chWord[firstAppearance-i] = tmp;
        }
        return new String(chWord);
    }
}

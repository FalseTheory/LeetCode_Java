package findTheDifference;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {

        int[] letters = new int[26];
        for(char c : s.toCharArray()){
            letters[c -'a'] += 1;
        }
        for(char c : t.toCharArray()){
            letters[c -'a'] -= 1;
            if(letters[c-'a']==-1){
                return c;
            }
        }
        return t.charAt(0);
    }
}

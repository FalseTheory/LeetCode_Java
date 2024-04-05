package MakeTheStringGreat;

public class MakeTheStringGreat {

    public static void main(String[] args) {
        System.out.println(makeGood("leEeetcode").equals("leetcode"));
        System.out.println(makeGood("abBAcC").equals(""));
        System.out.println(makeGood("s").equals("s"));
    }

    public static String makeGood(String s){
        StringBuilder res = new StringBuilder();
        char[] sc = s.toCharArray();
        res.append(sc[0]);
        int lastInd = 1;
        for(int i = 1; i<sc.length;i++){
            if(lastInd>0){
                if(sc[i]-32==res.charAt(lastInd-1) || sc[i] + 32==res.charAt(lastInd-1)){
                    res.deleteCharAt(lastInd-1);
                    lastInd--;
                    continue;
                }
            }
            res.append(sc[i]);
            lastInd++;
        }
        return res.toString();
    }
}

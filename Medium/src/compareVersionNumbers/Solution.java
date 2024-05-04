package compareVersionNumbers;

public class Solution {
    public static int compareVersion(String version1, String version2) {
        String[] ver1 = version1.split("[.]");
        String[] ver2 = version2.split("[.]");
        for(int i = 0; i<ver1.length && i<ver2.length;i++){
            int val1 = Integer.parseInt(ver1[i]);
            int val2 = Integer.parseInt(ver2[i]);
            if(val1<val2){
                return -1;
            }else if(val1>val2){
                return 1;
            }
        }
        if(ver1.length>ver2.length){
            for(int i = ver2.length;i<ver1.length;i++){
                if(Integer.parseInt(ver1[i])>0){
                    return 1;
                }
            }
        }else{
            for(int i = ver1.length;i<ver2.length;i++){
                if(Integer.parseInt(ver2[i])>0){
                    return -1;
                }
            }
        }
        return 0;
    }
}

package Finding3DigitEvenNumbers;


import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] count = new int[10];
        for(int n : digits) {
            count[n]++;
        }
        List<Integer> numbers = new ArrayList<>();
        for(int i = 1; i <= 9; i++) {
            if(count[i]==0) {
                continue;
            }
            count[i]--;
            for(int j = 0; j <= 9; j++) {
                if(count[j]==0) {
                    continue;
                }
                count[j]--;
                for(int k = 0; k <9; k+=2){
                    if(count[k]==0){
                        continue;
                    }
                    numbers.add(i * 100 + j * 10 + k);


                }
                count[j]++;

            }
            count[i]++;
        }
        int[] ret = new int[numbers.size()];
        for(int i = 0; i < ret.length; i++) {
            ret[i] = numbers.get(i);
        }
        return ret;
    }
}

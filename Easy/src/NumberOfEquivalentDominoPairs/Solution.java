package NumberOfEquivalentDominoPairs;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int count = 0;
        for(int i = 0; i < dominoes.length; i++) {
            int a = Math.min(dominoes[i][0], dominoes[i][1]);
            int b = Math.max(dominoes[i][0], dominoes[i][1]);

            int key = a * 10 + b;
            int get = countMap.getOrDefault(key, 0);

            count+=get;
            countMap.put(key, get+1);

        }
        return count;
    }
}

package 의상;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> combo = new HashMap<>();

        for(String[] s: clothes) {
            if(!combo.containsKey(s[1])){
                combo.put(s[1], 1);
            } else {
                combo.put(s[1], combo.get(s[1]) + 1);
            }
        }

        /*
        Iterator<Integer> it = combo.values().iterator();

        while(it.hasNext()) {
            answer *= it.next() + 1;
        }
        */

        for (Integer integer : combo.values()) {
            answer *= integer + 1;
        }

        return answer - 1;
    }
}
class Main {
    public static void main(String[] args) {

        String[][] clothes = {{"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}};

        Solution sol = new Solution();
        sol.solution(clothes);
    }
}

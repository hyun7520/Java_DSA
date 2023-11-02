package 의상;


import java.util.HashMap;
import java.util.Map;


public class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;

        Map<String, Integer> combo = new HashMap<>();

        for(String[] s: clothes) {
            if(!combo.containsKey(s[1])){
                combo.put(s[1], 1);
            } else {
                combo.put(s[1], combo.get(s[1]) + 1);
            }
        }

        for(String[] s : clothes){

        }

        return answer;
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

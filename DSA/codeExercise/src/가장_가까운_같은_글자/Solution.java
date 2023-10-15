package 가장_가까운_같은_글자;


import java.util.HashMap;


public class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(!map.containsKey(c)) {
                answer[i] = -1;
                map.put(c, i);
            } else {
                int before = map.get(c);
                map.put(c, i);
                answer[i] = i - before;
            }
        }

        return answer;
    }
}

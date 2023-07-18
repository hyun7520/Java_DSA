package 추억점수;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String, Integer> points = new HashMap<>();
        for(int i = 0; i < name.length; i++) {
            if(i >= yearning.length) {
                points.put(name[i], 0);
            }
            points.put(name[i], yearning[i]);
        }

        int idx = 0;

        for(String[] check : photo) {
            int total = 0;
            for(String person : check) {
                System.out.println("total is "+total);
            }
            answer[idx] = total;
            idx++;
        }

        return answer;
    }
}

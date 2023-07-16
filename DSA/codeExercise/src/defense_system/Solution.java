package defense_system;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int solution(int[][] targets) {
        int answer = 0;

        Arrays.sort(targets, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int shoot = -1;

        for (int[] target : targets) {
            int start = target[0];
            int end = target[1];
            if(start >= shoot) {
                answer++;
                shoot = end;
            }
        }

        return answer;
    }
}

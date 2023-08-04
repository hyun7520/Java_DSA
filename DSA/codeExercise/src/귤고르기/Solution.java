package 귤고르기;

import java.util.*;

public class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 1;
        int maxSize = 0;
        for(int s : tangerine) {
            maxSize = Math.max(maxSize, s);
        }

        int[] box = new int[maxSize+1];

        for(int s : tangerine) {
            box[s]++;
        }
        Arrays.sort(box);

        int sum = 0;
        for(int i = maxSize; i >= 0; i--) {
            sum += box[i];
            if(sum >= k) {
                return answer;
            }
            answer++;
        }

        return answer;
    }
}

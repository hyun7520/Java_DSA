package HIndex;

public class Solution {
    public int solution(int[] citations) {
        int answer = 0;

        int max = 0;
        for(int h = 1; h <= citations.length; h++) {
            int cnt = 0;
            for(int c : citations) {
                if(c >= h) cnt++;
            }
            if(cnt >= h && h > max) max = h;
        }

        answer = max;
        return answer;
    }
}

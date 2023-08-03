package 멀리뛰기;

public class Solution {
    public long solution(int n) {
        long answer = 0;
        long[] temp = new long[n+1];

        if(n == 1) return 1;
        if(n == 2) return 2;

        temp[0] = 0;
        temp[1] = 1L;
        temp[2] = 2L;

        for(int i = 3; i <= n; i++) {
            temp[i] = (temp[i-2] + temp[i-1]) % 1234567;
        }
        answer = temp[n];
        return answer;
    }
}

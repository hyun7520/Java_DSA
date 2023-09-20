package 두정수사이의합;

public class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        int temp = 0;

        if(a > b) {
            temp = b;
            b = a;
            a = temp;
        }

        for(int i = a; i <= b; i++) {
            answer += i;
        }

        return answer;
    }
}

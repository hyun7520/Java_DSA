package 콜라문제;

public class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int temp = 0;

        while(true) {
            if(n < a) {
                break;
            }

            answer += (n / a) * b;
            temp = n % a;

            n = (n / a) * b + temp;
        }

        return answer;
    }
}

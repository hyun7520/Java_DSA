package 부족한금액계산하기;

public class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;

        long temp = price;

        for(int i = 2; i <= count; i++) {
            temp += (long) price * i;
            if(temp > money) {
                answer = temp - money;
            }
        }

        if(temp <= money) {
            answer = 0;
        }

        return answer;
    }
}

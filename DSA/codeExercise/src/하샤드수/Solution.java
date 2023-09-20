package 하샤드수;

public class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        int temp = x;
        int sum = 0;

        while(temp >= 1) {
            sum += temp % 10;
            temp = temp / 10;
        }

        if(x % sum != 0) {
            answer = false;
        }

        return answer;
    }
}

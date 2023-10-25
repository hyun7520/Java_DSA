package 푸드파이트대회;

public class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();

        StringBuilder left = new StringBuilder();

        for(int i = 1; i < food.length; i++) {
            int num = food[i] / 2;
            String temp = Integer.toString(i).repeat(num);
            left.append(temp);
        }

        answer.append(left).append(0);

        for(int i = answer.length() - 2; i >= 0; i--) {
            answer.append(answer.charAt(i));
        }

        return answer.toString();
    }
}

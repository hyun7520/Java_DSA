package 문자열을정수로바꾸기;

public class Solution {
    public int solution(String s) {
        int answer = 0;

        answer = Integer.parseInt(s);

        return answer;
    }

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("-1234"));
    }
}

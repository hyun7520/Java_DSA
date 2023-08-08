package 숫자문자열과영단어;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public int solution(String s) {
        int answer = 0;

        String ans = "";
        String temp = "";
        List<String> num = List.of("zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine");

        for(int i = 0; i < s.length(); i++) {

            temp += s.charAt(i);

            try {
                int check = Integer.parseInt(temp);
                temp = "";
                ans += s.charAt(i);
            } catch(NumberFormatException e) {
                if(num.contains(temp)) {
                    ans += (num.indexOf(temp));
                    temp = "";
                }
            }
        }

        answer = Integer.parseInt(ans);

        return answer;
    }

}
class Main{
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("one4seveneight"));
    }
}


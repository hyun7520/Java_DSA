package 문자열다루기기본;

public class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        char[] cArr = s.toCharArray();

        if(s.length() == 4 || s.length() == 6) {
            for (char c : cArr) {
                int num = Character.getNumericValue(c);
                if (num > 9 || num < 0) {
                    return false;
                }
            }
        } else return false;

        return answer;
    }
}

package 수박수박수박수박수박수;

public class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();

        String s = "수박";

        for(int i = 0; i < n; i++) {
            sb.append(s.charAt(i%2));
        }

        return sb.toString();
    }
}

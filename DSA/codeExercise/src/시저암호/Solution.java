package 시저암호;

public class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        // 65 - 90 upper;
        // 97 - 122 lower
        char[] arr = s.toCharArray();

        for(char c: arr) {
            if(c == ' ') {
                answer.append(c);
                continue;
            }
            if(Character.isUpperCase(c)) {
                c = (char)((c -'A' +n) % 26 + 'A');
            } else {
                c = (char)((c -'a' +n) % 26 + 'a');
            }
            answer.append(c);
        }

        return answer.toString();
    }
}

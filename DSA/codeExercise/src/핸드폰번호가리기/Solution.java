package 핸드폰번호가리기;

public class Solution {
    public String solution(String phone_number) {
        String answer = "";

        int num = phone_number.length();
        StringBuilder str = new StringBuilder(phone_number);
        for(int i = 0; i < num-4; i++) {
            str.setCharAt(i, '*');
        }

        answer = str.toString();

        return answer;
    }
}

package 서울에서김서방찾기;

public class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int idx = 0;
        for(String s: seoul) {
            if(s.equals("Kim")) {
                answer = "김서방은 " + idx + "에 있다";
            }
            idx++;
        }

        return answer;
    }
}

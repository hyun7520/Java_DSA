package 크기가작은부분문자열;

public class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        int len = p.length();
        long num = Long.parseLong(p);
        int j = 0;
        
        // int로 풀 시 자릿수가 부족해 런타임 에러가 발생
        for(int i = 0; i < t.length() -len + 1; i++) {
            j = i+len;
            long temp = Long.parseLong(t.substring(i, j));
            if(temp <= num) {
                answer++;
            }
        }

        return answer;
    }
}

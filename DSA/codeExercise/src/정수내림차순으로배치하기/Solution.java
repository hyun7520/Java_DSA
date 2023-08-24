package 정수내림차순으로배치하기;

import java.util.Arrays;


public class Solution {
    public long solution(long n) {
        long answer = 0;

        String temp = Long.toString(n);
        String[] list = temp.split("");

        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for(String s: list) {
            sb.append(s);
        }

        answer = Long.parseLong(sb.reverse().toString());

        return answer;
    }
}

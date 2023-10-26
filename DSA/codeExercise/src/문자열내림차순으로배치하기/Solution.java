package 문자열내림차순으로배치하기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public String solution(String s) {

        StringBuilder answer = new StringBuilder();
        List<Character> lower = new ArrayList<>();
        List<Character> upper = new ArrayList<>();

        char[] temp = s.toCharArray();

        for(char c: temp) {
            if(Character.isUpperCase(c)) {
                upper.add(c);
            } else {
                lower.add(c);
            }
        }

        Collections.sort(upper);
        Collections.sort(lower);

        if(!lower.isEmpty()) {
            for (int i = lower.size() - 1; i >= 0; i--) {
                answer.append(lower.get(i));
            }
        }

        if(!upper.isEmpty()) {
            for (int i = upper.size() - 1; i >= 0; i--) {
                answer.append(upper.get(i));
            }
        }

        return answer.toString();
    }
}
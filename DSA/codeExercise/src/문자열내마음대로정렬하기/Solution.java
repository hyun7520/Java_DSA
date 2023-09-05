package 문자열내마음대로정렬하기;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public String[] solution(String[] strings, int n) {

        List<String> arr = new ArrayList<>();

        for(String s: strings) {
            arr.add(s.charAt(n) + s);
        }

        Collections.sort(arr);
        String[] answer = new String[arr.size()];
        int i = 0;

        for(String s: arr) {
            answer[i] = s.substring(1);
            i++;
        }

        return answer;
    }
}

package 튜플;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(String s) {


        List<Integer> AL = new ArrayList<>();

        String[] re = s.substring(2, s.length() - 2).replaceAll("[}{]", " ").split(" , ");

        Arrays.sort(re, (o1, o2) -> Integer.compare(o1.length(), o2.length()));

        String[][] newS = new String[re.length][];

        for(int i = 0; i < re.length; i++) {
            newS[i] = re[i].split(",");
        }

        for(String[] arr: newS) {
            for(String temp : arr) {
                if(!AL.contains(Integer.parseInt(temp))) {
                    AL.add(Integer.parseInt(temp));
                }
            }
        }

        int[] answer = new int[AL.size()];

        for(int i = 0; i < AL.size(); i++) {
            answer[i] = AL.get(i);
        }

        return answer;
    }
}

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}");
    }
}
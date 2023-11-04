package 튜플;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int[] solution(String s) {
        int[] answer = {};

        String re = s.replaceAll("[\\{,\\}]", " ");

//        System.out.println(re);

        String[] newS = s.split(" ");

        Arrays.sort(newS, (o1, o2) -> Integer.compare(o1.length(), o2.length()));

        return answer;
    }
}

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}");
    }
}
package 명예의전당1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> ans = new ArrayList<>();

        List<Integer> temp = new ArrayList<>();

        for(int s : score) {
            temp.add(s);
            Collections.sort(temp);
            Collections.reverse(temp);
            if(temp.size() < k) {
                ans.add(temp.get(temp.size() - 1));
            } else {
                ans.add(temp.get(k - 1));
            }
        }
        int[] answer = new int[ans.size()];

        for(int j = 0; j < ans.size(); j++) {
            answer[j] = ans.get(j);
        }

        return answer;
    }
}

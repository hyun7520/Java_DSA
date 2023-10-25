package 카드뭉치;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        List<String> arr1 = new ArrayList<>(Arrays.asList(cards1));
        List<String> arr2 = new ArrayList<>(Arrays.asList(cards2));

        for(int i = 0; i < goal.length; i++) {
            if(!arr1.isEmpty() && arr1.get(0).equals(goal[i])) {
                arr1.remove(goal[i]);
            } else if(!arr2.isEmpty() && arr2.get(0).equals(goal[i])) {
                arr2.remove(goal[i]);
            } else {
                return "No";
            }
        }

        return answer;
    }
}

package 같은숫자는싫어;

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};

        Stack<Integer> temp = new Stack<>();

        for(int i = 0; i < arr.length; i++) {
            int now = arr[i];
            if(temp.isEmpty()) {
                temp.push(now);
                continue;
            }
            if(temp.peek() == now) {
                continue;
            } else {
                temp.push(now);
            }
        }
        answer = new int[temp.size()];

        for(int i = temp.size() - 1; i >= 0; i--) {
            answer[i] = temp.pop();
        }

        return answer;
    }
}
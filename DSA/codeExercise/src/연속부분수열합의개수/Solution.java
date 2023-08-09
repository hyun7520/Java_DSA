package 연속부분수열합의개수;

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        List<Integer> arr = new ArrayList<>();
        List<Integer> sums = new ArrayList<>();

        for(int i = 0; i <= (elements.length * 2); i++) {
            int temp = i % elements.length;
            arr.add(elements[temp]);
        }

        for(int len = 1; len <= elements.length; len++) {
            for(int start = 0; start < arr.size(); start++) {
                int sum = 0;
                for(int end = start; end < start+end; end++) {
                    sum += arr.get(end);
                }
                if(sums.contains(sum)) continue;
                else sums.add(sum);
            }

        }
        answer = sums.size();
        return answer;
    }
}

class Main {
    public static void main(String[] args) {
        int[] elements = {7,9,1,1,4};
        Solution sol = new Solution();
        System.out.println(sol.solution(elements));
    }
}
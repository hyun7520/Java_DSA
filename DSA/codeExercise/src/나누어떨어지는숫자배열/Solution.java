package 나누어떨어지는숫자배열;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();

        for(int i : arr) {
            if(i % divisor == 0) answer.add(i);
        }

        answer.sort(Comparator.naturalOrder());

        if(answer.isEmpty()) {
            answer.add(-1);
        }

        return answer;
    }
}

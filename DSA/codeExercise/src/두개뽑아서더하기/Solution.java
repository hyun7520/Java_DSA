package 두개뽑아서더하기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> temp = new ArrayList<>();

        for(int i = 0; i < numbers.length; i++) {
            if(i == numbers.length - 1) break;
            for(int j = i + 1; j < numbers.length; j++) {
                if(temp.contains(numbers[i] + numbers[j])) {
                    continue;
                } else {
                    temp.add(numbers[i] + numbers[j]);
                }
            }
        }

        Collections.sort(temp);

        int[] answer = new int[temp.size()];

        for(int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }

        return answer;
    }
}

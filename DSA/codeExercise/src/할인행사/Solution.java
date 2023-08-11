package 할인행사;

import java.util.HashMap;
import java.util.Collections;
import java.util.Map;

public class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> check = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            check.put(want[i], number[i]);
        }


        for (int start = 0; start < discount.length - 10 + 1; start++) {
            Map<String, Integer> temp = new HashMap<>();

            // 이전 풀이 때 해시맵 복사 시 temp = check 같은 방식은 쓰지말 것

            for (int day = start; day < 10 + start; day++) {
                String now = discount[day];
                temp.put(now, temp.getOrDefault(now, 0) + 1);
            }

            // getOrDefault 값을 찾을 때 없다면 디폴트 값을 있다면 +1

            boolean ok = true;

            for(String k : check.keySet()) {
                if(check.get(k) != temp.get(k)){
                    ok = false;
                    break;
                }
            }
            answer += ok ? 1 : 0;
        }

        return answer;
    }
}

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice",
                "apple", "pork", "banana", "pork", "rice", "pot",
                "banana", "apple", "banana"};

        sol.solution(want, number, discount);
    }
}
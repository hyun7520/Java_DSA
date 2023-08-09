package n2배열자르기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Long> solution(int n, long left, long right) {
        List<Long> answer = new ArrayList<>();

        for(long i = left; i <= right; i++) {
            answer.add(Math.max((i/n), (i%n)) + 1);
        }

        return answer;
    }
}

class Main {
    public static void main(String[] args) {

    }
}

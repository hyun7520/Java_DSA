package 짝지어제거하기;
import java.util.*;

public class Solution {
    public int solution(String s)
    {
        int answer = 0;

        List<Character> check = new ArrayList<>();

        for(Character c : s.toCharArray()) {
            if(check.isEmpty()) check.add(c);

            else if(check.get(check.size() - 1) == c) {
                check.remove(check.size() - 1);
            } else {
                check.add(c);
            }
        }

        if(check.isEmpty()) answer = 1;

        return answer;
    }
}

package 폰켓몬;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int[] nums) {

        int maxTake = nums.length / 2;

        List<Integer> take = new ArrayList<>();

        for(int i: nums) {
            if(take.size() >= maxTake) {
                break;
            }

            if(!take.contains(i)) {
                take.add(i);
            }
        }

        return take.size();
    }
}

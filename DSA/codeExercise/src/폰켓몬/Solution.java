package 폰켓몬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int solution(int[] nums) {

        int mSize = nums.length;

        List<Integer> curTake = new ArrayList<>();
        int maxTake = mSize / 2;
        int maxKind = 0, tempKind, iter;

        for(int i = 0; i < mSize; i++) {
            iter = 0;
            curTake.clear();

            if(i == mSize - 1) {
                break;
            }

            curTake.add(nums[i]);
            iter++;

            for(int j = i + 1; j < mSize; j++) {

                curTake.add(nums[j]);
                iter++;

                if(iter == maxTake || j + 1 == mSize) {
                    break;
                }
            }

            Collections.frequency()

            tempKind = curTake.size();
            if(tempKind > maxKind) {
                maxKind = tempKind;
            }
        }

        return maxKind;
    }
}

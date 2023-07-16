package defense_system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        int[][] target = {{4, 5}, {4, 8}, {10, 14}, {11, 13}, {5, 12}, {3, 7}, {1, 4}};
        Solution sol = new Solution();
        int ans = sol.solution(target);
        System.out.println(ans);
    }
}

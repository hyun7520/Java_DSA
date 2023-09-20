package K번째수;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public ArrayList<Integer> solution(int[] array, int[][] commands) {
        ArrayList<Integer> temp = new ArrayList<>();

        for(int[] c : commands) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = c[0] - 1; i < c[1]; i++) {
                arr.add(array[i]);
            }
            Collections.sort(arr);
            temp.add(arr.get(c[2] - 1));
        }

        return temp;
    }
}

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        sol.solution(array, commands);
    }
}
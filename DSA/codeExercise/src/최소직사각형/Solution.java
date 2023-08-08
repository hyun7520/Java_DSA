package 최소직사각형;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public int solution(int[][] sizes) {
        // wrong solution, wrong thinking
//        List<Integer> xArr = new ArrayList<>();
//        List<Integer> yArr = new ArrayList<>();
//
//        for(int[] arr : sizes) {
//            xArr.add(arr[0]);
//            yArr.add(arr[1]);
//        }
//
//        int maxX = Collections.max(xArr);
//        int maxY = Collections.max(yArr);
//
//        maxX = Math.max(maxX, maxY);
//
//        yArr.remove((Integer) maxY);
//        maxY = Collections.max(yArr);
//
//        answer = maxX * maxY;
        int answer = 0;

        List<Integer> maxX = new ArrayList<>() , maxY = new ArrayList<>();

        for(int[] arr : sizes) {
            maxX.add(Math.max(arr[0], arr[1]));
            maxY.add(Math.min(arr[0], arr[1]));
        }

        int x = Collections.max(maxX);
        int y = Collections.max(maxY);

        answer = x*y;

        return answer;
    }

}

class Main{
    public static void main(String[] args) {
        int[][] arr = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        Solution sol = new Solution();
        sol.solution(arr);

        System.out.println("Hello World");
    }
}

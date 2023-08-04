package 카펫;

public class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        // brown = 2(H+W) - 4
        // yellow = H-2 * W-2
        // total = H * W

        int H = 0;
        int total = brown+yellow;

        for(int W = 1; W <= total; W++) {
            if(total % W == 0) {
                H = total/W;
                if(H <= W && 2*(H+W) - 4 == brown) {
                    answer[0] = W;
                    answer[1] = H;
                }
            }
        }

        return answer;
    }
}

class Main{
    public static void main(String[] args) {
        Solution sol = new Solution();
        for (int i : sol.solution(10, 2)){
            System.out.println(i);
        }
    }
}


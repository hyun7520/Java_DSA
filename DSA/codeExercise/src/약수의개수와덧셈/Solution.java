package 약수의개수와덧셈;

public class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int cnt = 0;

        for(int i = left; i <= right; i++) {
            int c = i / 2;
            for(int j = 1; j <= c; j++) {
                if(i % j == 0) {
                    cnt++;
                }
            }

            if(cnt % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
            cnt = 0;
        }

        return Math.abs(answer);
    }
}

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(13, 17));
    }
}

package 연속된부분수열의합;

public class Main {
    public static void main(String[] args) {
        int[] s = {2, 2, 2, 2, 2};
        int k = 6;
        Solution sol = new Solution();
        for(int i = 0; i < sol.solution(s,k).length; i++) {
            System.out.println(sol.solution(s,k)[i]);
        }
    }
}

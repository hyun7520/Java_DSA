package 광물캐기;

public class Main {
    public static void main(String[] args) {
        int[] picks = {1, 3, 2};
        String[] minerals = {"diamond", "diamond", "diamond", "iron",
                "iron", "diamond", "iron", "stone"};

        Solution sol = new Solution();
        System.out.println(sol.solution(picks, minerals));
    }
}

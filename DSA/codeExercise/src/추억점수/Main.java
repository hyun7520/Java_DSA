package 추억점수;

public class Main {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {
                {"may", "kein", "kain", "radi"},
                {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}
        };

        Solution sol = new Solution();

        for(Integer ans : sol.solution(name, yearning, photo)){
            System.out.println(ans);
        }
    }
}

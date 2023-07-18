package 달리기경주;

public class Main {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        Solution sol = new Solution();
        for(String name: sol.solution(players, callings)) {
            System.out.println(name);
        }
    }
}

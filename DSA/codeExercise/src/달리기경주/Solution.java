package 달리기경주;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};

        Map<String, Integer> rank = new HashMap<>();
        for(int i = 0; i < players.length; i++) {
            rank.put(players[i], i);
        }

        for(String called : callings) {
            int curRank = rank.get(called);
            String toChangeRunner = players[curRank - 1];

            players[curRank - 1] = called;
            players[curRank] = toChangeRunner;

            rank.put(called, curRank -1);
            rank.put(toChangeRunner, curRank);
        }
        answer = players;
        return answer;
    }
}

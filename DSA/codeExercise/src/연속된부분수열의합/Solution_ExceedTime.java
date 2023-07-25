package 연속된부분수열의합;

public class Solution_ExceedTime {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {0, 0};
        int minSeq = sequence.length;

        for (int i = 0; i < sequence.length; i++) {
            int temp = sequence[i];
            if (temp == k) {
                answer[0] = i;
                answer[1] = i;
                return answer;
            }
            for (int j = i + 1; j < sequence.length - 1; j++) {
                temp += sequence[j];
                if (temp == k && j - i < minSeq) {
                    minSeq = j - i;
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
        }

        return answer;
    }
}

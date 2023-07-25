package 연속된부분수열의합;

public class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {0,0};

        int left = 0;
        int right = 1;
        int sum = sequence[0];
        int minSeq = sequence.length;

        while(left < right) {
            if(sum == k && right - left - 1 < minSeq) {
                answer[0] = left;
                answer[1] = right - 1;
                minSeq = right - left - 1;
                sum -= sequence[left++];
            } else if(sum > k) {
                sum -= sequence[left++];
            } else if(right < sequence.length) {
                sum += sequence[right++];
            } else {
                break;
            }
        }

        return answer;
    }
}

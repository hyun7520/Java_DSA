package 두원사이의정수쌍;

class Solution {
    public long solution(int r1, int r2) {
        long answer = 0;

//        한 사분면을 구하고 *4
        answer += (r2 - r1) + 1;
        

        return answer;
    }
}
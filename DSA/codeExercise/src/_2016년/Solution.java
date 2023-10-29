package _2016년;

public class Solution {
    public String solution(int a, int b) {

        String answer = "";

        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        // 2월 - 29일 윤년
        // 홀수 - 31일, 2월 제외 짝수월 - 30일
        // 1, 3, 5, 7, 8, 10, 12
        // 2
        // 4, 6, 9, 11

        int dayCnt = 5;
        int monthDay = 0;

        if(a != 1) {
            for (int i = 1; i < a; i++) {
                if (i == 2) {
                    monthDay += 29;
                } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                    monthDay += 30;
                } else {
                    monthDay += 31;
                }
            }
        }

        answer = day[(dayCnt + monthDay + b - 1) % day.length];

        return answer;
    }
}

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(2, 1));
    }
}

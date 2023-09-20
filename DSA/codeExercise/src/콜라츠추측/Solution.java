package 콜라츠추측;

public class Solution {
    public int solution(int num) {
        int answer = 0;

        int temp = num;
        int cnt = 0;

        if(num == 1) return answer;

        while(temp != 1){

            if(cnt > 500) {
                return -1;
            }

            int check = temp % 2;

            if(check == 0) {
                temp /= 2;
            } else if (check == 1) {
                temp = (temp * 3) + 1;
            }
            cnt++;
        }

        answer = cnt;

        return answer;
    }
}

class Main {
    public static void main(String[] args) {
    }
}

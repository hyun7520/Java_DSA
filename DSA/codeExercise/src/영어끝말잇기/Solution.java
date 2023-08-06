package 영어끝말잇기;
import java.util.*;

public class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};

// my solution
//        int lenWords = words.length;
//
//        for(int i = 0; i < lenWords; i++) {
//            if(i + 1 == lenWords) {
//                break;
//            }
//            String now = words[i];
//            String end = words[i+1];
//            // i = 3;
//            char endChar = now.charAt(now.length() - 1);
//            char startChar = end.charAt(0);
//            if(startChar != endChar) {
//                answer[0] = (i+2) % n;
//                answer[1] = (i+2) / n + 1;
//                return answer;
//            }
//        }
//
//        if(words[0].equals(words[lenWords - 1])) {
//            if(lenWords % n == 0) {
//                answer[0] = n;
//            } else {
//                answer[0] = lenWords % n;
//            }
//            answer[1] = lenWords/n;
//        }
        List<String> temp = new ArrayList<>();

        for(int i = 0; i <= words.length; i++) {
            String now = words[i];
            if(temp.isEmpty()) temp.add(now);
            if(temp.contains(now)) {
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                return answer;
            }

            temp.add(now);

            if(i>0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                break;
            }
        }

        return answer;
    }
}

class Main{
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] arr = {"hello", "one", "even", "never", "now", "world", "draw"};
        sol.solution(2, arr);
    }
}

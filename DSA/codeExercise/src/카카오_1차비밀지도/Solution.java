package 카카오_1차비밀지도;

public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i = 0; i < n; i++) {
            String tmp = String.format(
                    "%"+n+"d",
                    Long.parseLong(Integer.toBinaryString(arr1[i] | arr2[i]))
            );

            answer[i] = tmp
                    .replace("0", " ")
                    .replace("1", "#");
        }

        return answer;
    }
}

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr1= {9,3,3};
        int[] arr2= {30,3,3};
        sol.solution(2, arr1, arr2);
    }
}



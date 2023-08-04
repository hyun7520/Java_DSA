package 비밀지도;

public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i = 0; i < arr1.length; i++) {
            String temp1 = binaryMap(arr1[i]);
            String temp2 = binaryMap(arr2[i]);
            String map = "";
            for(int j = 0; j < temp1.length(); j++) {
                if(temp1.charAt(j) == '#' || temp2.charAt(j) == '#') {
                    map += '#';
                } else {
                    map += ' ';
                }
            }
            answer[i] = map;
        }

        return answer;
    }

    public String binaryMap(int num) {
        String temp = Integer.toBinaryString(num);
        String bin = "";

        for(int i = 0 ; i < temp.length(); i++) {
            if(temp.charAt(i) == '1') {
                bin += '#';
            } else {
                bin += ' ';
            }
        }
        return bin;
    }
}

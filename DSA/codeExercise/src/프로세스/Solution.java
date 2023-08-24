package 프로세스;


import java.util.*;

public class Solution {
    // Searched Solution using Priority Queue
//    public int solution(int[] priorities, int location) {
//        int answer = 0;
//
//        PriorityQueue<Integer> process = new PriorityQueue<>(Collections.reverseOrder());
//
//        for(int p : priorities) {
//            process.add(p);
//        }
//
//        while(!process.isEmpty()) {
//            for(int i = 0; i < priorities.length; i++) {
//                if(priorities[i] == process.peek()) {
//                    process.poll();
//                    answer++;
//                    if(i == location) {
//                        return answer;
//                    }
//                }
//            }
//        }
//
//        return answer;
//    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
        int l = location;

        // Solution from Programmers
        Queue<Integer> que = new LinkedList<Integer>();
        for(int i : priorities){
            que.add(i);
        }
        // priorities = [1, 1, 1, 1, 1, 9]
        // que = [1, 1, 9, 1, 1, 1]
        // size = 5, l = 5

        Arrays.sort(priorities);
        int size = priorities.length-1;

        while(!que.isEmpty()){
            Integer i = que.poll();
            if(i == priorities[size - answer]){
                answer++;
                l--;
                if(l <0)
                    break;
            }else{
                que.add(i);
                l--;
                if(l<0)
                    l=que.size()-1;
            }
        }

        return answer;
    }
}

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] p = {2, 1, 3, 2};

        sol.solution(p, 2);
    }
}
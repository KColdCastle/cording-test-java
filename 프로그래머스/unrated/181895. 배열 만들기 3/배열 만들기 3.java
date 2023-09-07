import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            int a = intervals[i][0];
            int b = intervals[i][1];
            for (int j = a; j < b + 1; j++) {
                list.add(arr[j]);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
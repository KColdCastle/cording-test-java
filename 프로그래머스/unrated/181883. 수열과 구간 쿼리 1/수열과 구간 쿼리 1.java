import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 0; i < queries.length; i++) {
            int q = queries[i][0];
            int w = (queries[i][1]);

            for (int j = q; j <= w; j++) {
                int p = list.get(j);
                list.set(j, p + 1);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
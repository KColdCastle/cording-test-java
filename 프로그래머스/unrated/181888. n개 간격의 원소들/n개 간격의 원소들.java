import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int i = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (num_list.length > n * i) {
            list.add(num_list[n * i]);
            i++;
        }

        int[] answer = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            answer[k] = list.get(k);
        }
        return answer;
    }
}
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < num_list.length; i++) {
            a.add(num_list[i]);
        }

        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            a.add(num_list[num_list.length - 1] - num_list[num_list.length - 2]);
        } else {
            a.add(num_list[num_list.length - 1] * 2);
        }
        answer = new int[a.size()];
        for (int k = 0; k < a.size(); k++) {
            answer[k] = a.get(k);
        }

        return answer;
    }
}
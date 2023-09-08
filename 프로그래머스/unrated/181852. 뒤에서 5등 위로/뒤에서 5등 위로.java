import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : num_list) {
            list.add(i);
        }
        list.sort(Comparator.naturalOrder());
        int[] answer = new int[list.size() - 5];
        for (int i = 0; i < list.size() - 5; i++) {
            answer[i] = list.get(i + 5);
        }
        return answer;
    }
}
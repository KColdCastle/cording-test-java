import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {

        int answer = 0;

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
            list2.add(i);
        }

        while (true) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) >= 50 && list.get(i) % 2 == 0) {
                    list.set(i, list.get(i) / 2);
                } else if (list.get(i) < 50 && list.get(i) % 2 == 1) {
                    list.set(i, (list.get(i) * 2) + 1);
                }
            }
            if (!list.equals(list2)) {
                list2.clear();
                for (int i : list) {
                    list2.add(i);
                }
            } else {
                break;
            }
            answer++;
        }

        return answer;
    }
}
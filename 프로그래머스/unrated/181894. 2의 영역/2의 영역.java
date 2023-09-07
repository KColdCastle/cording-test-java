import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int first_index = 100;
        int last_index = 99;

        for (int i = 0; i < arr.length; i++) {// 첫번째 2찾기
            if (arr[i] == 2) {
                first_index = i;
                break;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {// 마지막 2찾기
            if (arr[i] == 2) {
                last_index = i;
                break;
            }
        }
        System.out.println(first_index);
        System.out.println(last_index);
        ArrayList<Integer> list = new ArrayList<>();
        if (first_index < last_index) {
            for (int i = first_index; i < last_index + 1; i++) {
                list.add(arr[i]);
            }

        } else if (first_index == last_index) {
            list.add(arr[first_index]);

        } else if (first_index == 100) {
            list.add(-1);
        }
        System.out.println(list);
        int[] answer = new int[list.size()];
        if (first_index != 100) {
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        } else {
            answer[0] = -1;
        }
        return answer;
    }
}
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        int[] answer = new int[num_list.length];

        for (int i = 0; i < num_list.length - n; i++) {
            list.add(num_list[i + n]);
        }
        System.out.println("뒷부분: " + list);
        for (int i = 0; i < n; i++) {
            list1.add(num_list[i]);
        }
        System.out.println("앞부분: " + list1);

        for (int i = 0; i < list.size(); i++) {
            list2.add(list.get(i));
        }
        for (int i = 0; i < list1.size(); i++) {
            list2.add(list1.get(i));
        }
        System.out.println(list2);
        for (int i = 0; i < list2.size(); i++) {
            answer[i] = list2.get(i);
        }

        return answer;
    }
}
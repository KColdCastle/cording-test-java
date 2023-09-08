import java.util.ArrayList;

class Solution {
    public String[] solution(String[] str_list) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();

        for (int i = 0; i < str_list.length; i++) {
            list.add(str_list[i]);
        }
        int i = list.indexOf("l");
        int j = list.indexOf("r");

        if (i < j && i >= 0 || j == -1) {// l이r보다 먼저나왔을 경우
            for (int k = 0; k < i; k++) {
                list1.add(list.get(k));
            }
        } else if (i > j && j >= 0 || i == -1) {
            for (int k = j + 1; k < list.size(); k++) {
                list1.add(list.get(k));
            }
        } else if (i == -1 && j == -1) {
            list1.clear();
        }
        // System.out.println(list1);
        String[] answer = new String[list1.size()];
        for (int q = 0; q < list1.size(); q++) {
            answer[q] = list1.get(q);
            System.out.println(answer[q]);
        }
        return answer;
    }

}
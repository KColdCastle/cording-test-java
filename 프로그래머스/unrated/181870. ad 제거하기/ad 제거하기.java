import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        for (String i : strArr) {
            list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).contains("ad")) {
                list2.add(list.get(i));
            }
        }

        String[] answer = new String[list2.size()];

        for (int i = 0; i < list2.size(); i++) {
            answer[i] = list2.get(i);
        }
        return answer;
    }
}
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] names) {

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            list.add(names[i]);
        }
        int n = names.length / 5;
        if (names.length % 5 == 0) {
            String[] answer = new String[n];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i * 5);
            }
            return answer;
        } else {
            String[] answer = new String[n + 1];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i * 5);
            }
            return answer;
        }
    }
}
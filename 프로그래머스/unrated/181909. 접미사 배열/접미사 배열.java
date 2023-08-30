import java.util.ArrayList;
import java.util.Collections;

class Solution {
    ArrayList<String> list = new ArrayList<>();

    public String[] solution(String my_string) {
        for (int i = my_string.length() - 1; i >= 0; i--) {
            list.add(my_string.substring(i, my_string.length()));
        }
        Collections.sort(list);
        String[] answer = new String[list.size()];
        for (int k = 0; k < list.size(); k++) {
            answer[k] = list.get(k);
        }
        return answer;
    }
}
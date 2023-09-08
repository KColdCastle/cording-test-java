import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public String solution(String[] str_list, String ex) {
        ArrayList<String> list = new ArrayList<>();
        String answer = "";
        for (String i : str_list) {
            if (!i.contains(ex)) {
                list.add(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        return answer;
    }
}
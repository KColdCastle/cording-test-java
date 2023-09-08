import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> list = new ArrayList<>();

        my_string = my_string.trim().replaceAll(" ", "/");
        String[] a = my_string.trim().split("/");

        for (int i = 0; i < a.length; i++) {
            if (!a[i].isEmpty()) {
                list.add(a[i].strip());
            }
        }
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

}
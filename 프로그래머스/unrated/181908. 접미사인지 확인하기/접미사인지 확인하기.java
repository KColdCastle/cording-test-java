import java.util.ArrayList;

class Solution {
    ArrayList<String> list = new ArrayList<>();

    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        for (int i = my_string.length() - 1; i >= 0; i--) {
            list.add(my_string.substring(i, my_string.length()));
        }
        for (int k = 0; k < list.size(); k++) {
            if (list.get(k).equals(is_suffix)) {
                answer = 1;
                break;
            } else {
                answer = 0;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
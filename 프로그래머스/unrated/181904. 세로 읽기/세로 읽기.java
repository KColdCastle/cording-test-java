import java.util.ArrayList;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();
        boolean flag = true;
        int i = 0;
        while (flag) {

            list.add(my_string.substring(0, m));
            my_string = my_string.substring(m);
            answer += list.get(i).substring(c - 1, c);
            i += 1;
            if (my_string.length() < m) {
                flag = false;
            }
        }
        return answer;
    }
}
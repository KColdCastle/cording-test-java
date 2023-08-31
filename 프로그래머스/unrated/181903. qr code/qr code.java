import java.util.ArrayList;

class Solution {
    public String solution(int q, int r, String code) {
        boolean flag = true;
        String answer = "";
        int i = 0;
        while (flag) {
            if (i % q == r) {
                if (i == code.length()) {
                    answer += code.substring(i);
                } else {
                    answer += code.substring(i, i + 1);
                }
            }
            if (i == code.length()) {
                break;
            }
            i++;
        }
        return answer;
    }
}
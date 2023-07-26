import java.util.ArrayList;


class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        ArrayList<String> k = new ArrayList<>();
        for (int i = 0; i < numLog.length - 1; i++) {
            if (numLog[i + 1] - numLog[i] == 1) {
                k.add("w");
            } else if (numLog[i + 1] - numLog[i] == -1) {
                k.add("s");
            } else if (numLog[i + 1] - numLog[i] == 10) {
                k.add("d");
            } else if (numLog[i + 1] - numLog[i] == -10) {
                k.add("a");
            } else {
                break;
            }
        }
        for (String u : k) {
            answer += u + "";
        }
        return answer;
    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(String myString) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) != 'x') {
                count++;
            } else {
                list.add(count);
                count = 0;
            }
            if (i == myString.length() - 1 && myString.charAt(i) == 'x') {
                list.add(0);
            } else if (i == myString.length() - 1 && myString.charAt(i) != 'x') {
                list.add(count);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
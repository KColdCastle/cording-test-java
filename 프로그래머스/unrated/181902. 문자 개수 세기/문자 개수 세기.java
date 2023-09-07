import java.util.ArrayList;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 52; i++) {
            list.add(0);
        }
        char[] c = my_string.toCharArray();
        int a = 65;
        int b = 97;
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = a; j < a + 26; j++) {
                if (j == c[i]) {
                    // System.out.println(j == c[i]);
                    list.set(j - 65, list.get(j - 65) + 1);
                }
            }
            for (int j = b; j < b + 26; j++) {
                if (j == c[i]) {
                    System.out.println(j);
                    list.set(j - 71, list.get(j - 71) + 1);
                }
            }
        }
        System.out.println(list);
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
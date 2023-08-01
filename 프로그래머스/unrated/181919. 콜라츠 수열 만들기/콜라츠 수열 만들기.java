import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> k = new ArrayList<>();
        boolean flag = true;
        k.add(n);
        while (flag) {
            if (n % 2 == 0) {
                n = n / 2;
                k.add(n);
            } else if (n == 1) {
                flag = false;
            } else {
                n = 3 * n + 1;
                k.add(n);
            }
        }
        System.out.println(k);
        answer = new int[k.size()];
        for (int i = 0; i < k.size(); i++) {
            answer[i] = k.get(i);
            System.out.println(answer[i]);
        }
        return answer;
    }
}
import java.util.ArrayList;
class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        ArrayList<Integer> q = new ArrayList<>();
        int[] k = new int[64];
        for (int i = 1; i < 64; i++) {
            k[i] = Integer.parseInt(Integer.toBinaryString(i)) * 5;
            // System.out.println(k[i]);
        }
        for (int j = 1; j < 64; j++) {
            if (k[j] >= l && k[j] <= r) {
                q.add(k[j]);
            }
        }
        if (q.size() == 0) {
            q.add(-1);
        }
        answer = new int[q.size()];
        for (int i = 0; i < q.size(); i++) {
            answer[i] = q.get(i);
            System.out.println(answer[i]);
        }
        return answer;
    }
}
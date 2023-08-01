import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        int i = 0;
        ArrayList<Integer> k = new ArrayList<>();
        boolean flag = true;
        while (flag) {

            if (k.size() != 0 && i == arr.length) {
                break;
            }
            if (k.size() == 0) {
                k.add(arr[i]);
                i++;
                continue;
            } else if (k.size() != 0 && k.get(k.size() - 1) < arr[i]) {
                k.add(arr[i]);
                i++;
                continue;
            } else if (k.size() != 0 && k.get(k.size() - 1) >= arr[i]) {
                k.remove(k.size() - 1);
                continue;
            }

        }
        stk = new int[k.size()];
        for (int q = 0; q < k.size(); q++) {
            stk[q] = k.get(q);
        }
        return stk;
    }
}
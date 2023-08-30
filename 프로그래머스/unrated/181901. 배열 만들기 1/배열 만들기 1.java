
class Solution {
    public int[] solution(int n, int k) {
        int i = 1;
        int[] answer = new int[n / k];
        while (true) {
            if (n >= k * i) {
                answer[i - 1] = k * i;
                i++;
            } else {
                break;
            }
        }

        return answer;
    }
}
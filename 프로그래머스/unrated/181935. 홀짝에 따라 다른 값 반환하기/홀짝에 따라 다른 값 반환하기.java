class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i++) {
            if (n % 2 == 0) {
                if (i % 2 == 0) {
                    answer += Math.pow(i, 2);
                }
            } else {
                if (i % 2 == 1) {
                    answer += i;
                }
            }
        }

        System.out.println(answer);
        return answer;
    }
}
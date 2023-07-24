class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        int k = Integer.parseInt(a + "" + b);
        int j = (2 * a * b);
        answer = k >= j ? k : j;
        return answer;
    }
}
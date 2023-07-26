class Solution {
    public int solution(int n, String control) {
        int answer = n;
        String[] k = control.split("");
        for (int i = 0; i < k.length; i++) {
            if (k[i].equals("w")) {
                answer += 1;
            } else if (k[i].equals("s")) {
                answer += -1;
            } else if (k[i].equals("d")) {
                answer += 10;
            } else if (k[i].equals("a")) {
                answer += -10;
            }
        }
        return answer;
    }
}
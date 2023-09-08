class Solution {
    public String solution(String n_str) {
        char[] c = n_str.toCharArray();
        int a = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] != '0') {
                a = i;
                break;
            }
        }
        String answer = "";

        for (int i = a; i < c.length; i++) {
            answer += c[i];
        }
        System.out.println(answer);
        return answer;
    }
}
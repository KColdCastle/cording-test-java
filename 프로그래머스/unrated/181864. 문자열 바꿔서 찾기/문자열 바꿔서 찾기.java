class Solution {
    public int solution(String myString, String pat) {
        char[] c = myString.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 65) {
                c[i] += 1;
            } else {
                c[i] -= 1;
            }
        }
        int answer = 0;

        String s = new String(c);
        if (s.contains(pat)) {
            answer = 1;
        }
        System.out.println(answer);
        return answer;
    }
}
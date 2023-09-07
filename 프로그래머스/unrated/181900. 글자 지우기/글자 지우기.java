class Solution {
    public String solution(String my_string, int[] indices) {
        char[] a = my_string.toCharArray();
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < indices.length; j++) {
                if (i == indices[j]) {
                    a[i] = 0;
                }
            }
            if (a[i] != 0) {
                answer += a[i];
            }
        }
        System.out.println(answer);
        return answer;
    }
}
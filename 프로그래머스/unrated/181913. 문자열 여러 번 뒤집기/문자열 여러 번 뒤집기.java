class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuffer sb = new StringBuffer();
        StringBuffer total = new StringBuffer();
        String reverse = "";

        for (int i = 0; i < queries.length; i++) {
            sb.append(my_string.substring(queries[i][0], queries[i][1] + 1));
            total.append(my_string);

            reverse = sb.reverse().toString();
            my_string = total.replace(queries[i][0], (queries[i][1] + 1), reverse)
                    .toString();
            sb.delete(0, sb.length());
            total.delete(0, total.length());

        }
        String answer = my_string;
        return answer;
    }
}
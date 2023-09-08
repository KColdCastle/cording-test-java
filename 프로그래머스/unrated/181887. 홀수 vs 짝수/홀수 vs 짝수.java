class Solution {
    public int solution(int[] num_list) {
        int jj = 0;
        int hh = 0;
        int answer = 0;

        for (int i = 0; i < num_list.length; i++) {
            if ((i + 1) % 2 == 0) {
                jj += num_list[i];
            } else {
                hh += num_list[i];
            }
        }
        if (jj > hh || jj == hh) {
            answer = jj;
        } else {
            answer = hh;
        }
        return answer;
    }
}
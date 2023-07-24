class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        if (num_list.length >= 2 && num_list.length <= 20) {
            if (num_list.length >= 11) {
                for (int i = 0; i < num_list.length; i++) {
                    answer += num_list[i];
                }
            } else {
                for (int i = 0; i < num_list.length; i++) {
                    if (i == 0) {
                        answer = 1 * num_list[i];
                    } else {
                        answer *= num_list[i];

                    }
                }
            }
        }

        System.out.println(answer);
        return answer;
    }
}
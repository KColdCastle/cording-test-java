class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] r = num_str.split("");
        int[] j = new int[num_str.length()];
        for (int i = 0; i < num_str.length(); i++) {
            j[i] = Integer.parseInt(r[i]);
            answer += j[i];
        }
        System.out.println(answer);
        return answer;
    }
}
class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        if (my_string.length() >= 1 && my_string.length() < 100 && k >= 1 && k <= 100) {
            answer = my_string.repeat(k);
        }
        System.out.println(answer);
        return answer;
    }
}
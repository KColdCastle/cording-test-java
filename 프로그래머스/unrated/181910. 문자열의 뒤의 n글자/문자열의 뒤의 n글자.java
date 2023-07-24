class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        if (my_string.length() >= 1 && my_string.length() <= 1000 && n >= 1 && n <= my_string.length()) {
            answer = my_string.substring(my_string.length() - n);
        }
        System.out.println(answer);
        return answer;
    }
}
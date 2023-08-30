class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuffer sb = new StringBuffer(my_string.substring(s, e + 1));
        StringBuffer total = new StringBuffer(my_string);
        String reverse = "";
        String answer = "";

        reverse = sb.reverse().toString();
        answer = total.replace(s, e + 1, reverse).toString();
        System.out.println(answer);
        return answer;
    }
}
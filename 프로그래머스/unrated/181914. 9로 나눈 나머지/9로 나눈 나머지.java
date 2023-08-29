class Solution {
    public int solution(String number) {
        int m = 0;
        int answer = 0;
        for (int i = 0; i < number.length(); i++) {
            int k = Integer.parseInt(String.valueOf(number.charAt(i)));
            m += k;
        }
        answer = m % 9;
        System.out.println(answer);
        return answer;
    }
}
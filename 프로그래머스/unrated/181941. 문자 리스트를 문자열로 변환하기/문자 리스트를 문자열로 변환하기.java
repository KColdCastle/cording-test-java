class Solution {
    public String solution(String[] arr) {
        String answer = "";
        if (arr.length >= 1 && arr.length <= 200) {
            for (int i = 0; i < arr.length; i++) {
                answer += arr[i];
            }
            System.out.println(answer);
        }
        return answer;
    }
}
class Solution {
    public int solution(double flo) {
        int answer = 0;
        if (flo >= 0 && flo <= 100) {
            answer = (int) flo;
        }
        System.out.println(answer);
        return answer;
    }
}
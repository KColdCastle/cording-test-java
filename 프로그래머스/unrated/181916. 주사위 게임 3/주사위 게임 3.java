
class Solution {
    int p = 0;
    int q = 0;
    int r = 0;
    int e = 6;

    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        if (case1(a, b, c, d)) {
            answer = 1111 * p;
        } else if (case2(a, b, c, d)) {
            answer = (10 * p + q) * (10 * p + q);
        } else if (case3(a, b, c, d)) {
            answer = (p + q) * Math.abs(p - q);
        } else if (case4(a, b, c, d)) {
            answer = (q * r);
        } else {
            case5(a, b, c, d);
            System.out.println("e: " + e);
            answer = e;
        }
        System.out.println(answer);
        return answer;
    }

    boolean case1(int a, int b, int c, int d) {
        if ((a == b) && (a == c) && (a == d)) {
            this.p = a;
            return true;
        } else {
            return false;
        }
    }

    boolean case2(int a, int b, int c, int d) {

        if (((a == b) && (a == c) && (a != d))) {
            this.p = a;
            this.q = d;

            return true;
        } else if (((a == b) && (a != c) && (a == d))) {
            this.p = a;
            this.q = c;

            return true;
        } else if (((a != b) && (a == c) && (a == d))) {
            this.p = a;
            this.q = b;

            return true;
        } else if (((a != b) && (b == c) && (b == d))) {
            this.p = b;
            this.q = a;

            return true;
        } else {
            return false;
        }
    }

    boolean case3(int a, int b, int c, int d) {

        if ((a == b) && (c == d) && (a != c)) {
            this.p = a;
            this.q = c;

            return true;
        } else if ((a == c) && (b == d) && (a != b)) {
            this.p = a;
            this.q = b;

            return true;
        } else if ((a == d) && (b == c) && (a != b)) {
            this.p = a;
            this.q = b;

            return true;
        } else {
            return false;
        }
    }

    boolean case4(int a, int b, int c, int d) {
        if ((a == b) && (c != d) && (a != c) && (a != d)) {
            this.q = c;
            this.r = d;
            return true;
        } else if ((a == c) && (b != d) && (a != b) && (a != d)) {
            this.q = b;
            this.r = d;
            return true;
        } else if ((a == d) && (b != c) && (a != b) && (a != c)) {
            this.q = b;
            this.r = c;
            return true;
        } else if ((b == c) && (a != d) && (b != a) && (b != d)) {
            this.q = a;
            this.r = d;
            return true;
        } else if ((b == d) && (a != c) && (b != a) && (b != c)) {
            this.q = a;
            this.r = c;
            return true;
        } else if ((c == d) && (a != b) && (c != a) && (c != b)) {
            this.q = a;
            this.r = b;
            return true;
        } else {
            return false;
        }
    }

    void case5(int a, int b, int c, int d) {
        if ((a != b) && (a != c) && (a != d) && (b != c) && (b != d) && (c != d)) {
            int[] k = { a, b, c, d };
            for (int o : k) {
                e = Math.min(e, o);
            }
        } else {
        }
    }

}
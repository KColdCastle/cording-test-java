import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        if (a.length() <= 1000000 && a.length() >= 1)
            System.out.println(a);
    }
}
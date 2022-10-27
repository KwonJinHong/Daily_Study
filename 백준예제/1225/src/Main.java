import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String A = sc.next();
            String B = sc.next();

            char[] aChars = A.toCharArray();
            char[] bChars = B.toCharArray();

            long digitSum1 = 0;
            long digitSum2 = 0;

            for (char c : aChars) {
                digitSum1 += Character.getNumericValue(c);
            }

            for (char c : bChars) {
                digitSum2 += Character.getNumericValue(c);
            }

            System.out.println(digitSum1 * digitSum2);
        }
    }
}


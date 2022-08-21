import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        int[] result = new int[testCase];

        for (int i = 0; i < testCase; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            result[i] = a + b;
        }
        sc.close();

        for (int i : result) {
            System.out.println(i);
        }
    }
}

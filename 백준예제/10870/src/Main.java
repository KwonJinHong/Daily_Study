import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(fibonacci(sc.nextInt()));

    }

    public static int fibonacci(int n) {

        if (n == 0) return 0;
        else if (n == 1 || n == 2) return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

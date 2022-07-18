import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        System.out.println(factorial(input));
    }

    public static int factorial(int n)
    {
        // n이 0인 경우 return 1
        if(n == 0)
            return 1;

        return n * factorial(n - 1); // n과 factorial(n-1)의 반환된 값을 곱함
    }
}

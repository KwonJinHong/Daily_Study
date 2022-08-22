import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        int result = factorial(n)/(factorial(n-k)*factorial(k));
        System.out.println(result);

    }

    public static int factorial(int n)
    {
        // n이 0인 경우 return 1
        if(n == 0)
            return 1;

        return n * factorial(n - 1); // n과 factorial(n-1)의 반환된 값을 곱함
    }
}

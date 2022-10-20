import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    static boolean prime[] = new boolean[10004002];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            long num = Long.parseLong(br.readLine());
            BigInteger bi = new BigInteger(String.valueOf(num));

            if (bi.isProbablePrime(10)) {
                System.out.println(num);
            } else {
                System.out.println(bi.nextProbablePrime());
            }
        }

        br.close();
    }
}
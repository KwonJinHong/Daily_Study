import java.io.*;
import java.util.StringTokenizer;

public class Main2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = n;

        for (int i = m; i <= n; i++) {
            if (isPrimeNumber(i)) {
                sum += i;

                if (min > i) {
                    min = i;
                }
            }
        }
        if (sum > 0) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }

    }

    private static boolean isPrimeNumber(int num) {
        if (num == 1) { // 1은 소수가 아니므로 false 반환
            return false;
        }
        for ( int i = 2 ; i <= Math.sqrt(num); i++) { // sqrt(num)까지의 값 중에 약수가 하나라도 존재하면 소수가 아니게 됨 혹은 sqrt(num)가 약수인 경우도 소수가 아님
            if(num%i == 0) {
                return false;
            }
        }
        return true;
    }
}
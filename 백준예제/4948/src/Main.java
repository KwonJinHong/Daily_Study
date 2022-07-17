import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int input = Integer.parseInt(br.readLine());
            int cnt = 0;
            if (input == 0)
                break;
            for (int i = input + 1; i <= 2*input; i++) {
                if (isPrimeNumber(i)) {
                    cnt++;
                }
            }
            System.out.println(cnt);

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

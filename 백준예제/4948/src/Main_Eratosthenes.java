//에라토스테네스의 채 적용 : 소수가 되는 수의 배수를 지우면 남는 건 결국 소수뿐
import java.io.*;
import java.util.Arrays;

public class Main_Eratosthenes {
    public static boolean[] primeNum; // default 값이 false (false면 소수, true면 소수 X)
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0)
                break;
            int cnt = 0;
            primeNum = new boolean[2*input + 1];
            sieveOfEratosthenes(); // 에라토스테네스의 채 실행
            for (int i = input + 1; i <= 2*input; i++) {
                if (!primeNum[i]) { // 배열값이 false면 소수이므로 카운트
                    cnt++;
                }
            }
            System.out.println(cnt);
        }

    }

    private static void sieveOfEratosthenes() {
        primeNum[0] = primeNum[1] = true; // 0과 1은 소수가 아니므로 true
        for ( int i = 2 ; i <= Math.sqrt(primeNum.length); i++) {
            if (primeNum[i]) // true면 다음 순서로 건너뜀
                continue;
            for (int j = i*i; j < primeNum.length; j += i) { // i가 소수이면, i의 배수들은 소수가 아니므로 true
                primeNum[j] = true;
            }
        }
    }
}

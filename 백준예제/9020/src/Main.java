//에라토스테네스의 채 적용 : 소수가 되는 수의 배수를 지우면 남는 건 결국 소수뿐
import java.io.*;
import java.util.Arrays;

public class Main {
    public static boolean[] primeNum; // default 값이 false (false면 소수, true면 소수 X)
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            int num = Integer.parseInt(br.readLine());
            primeNum = new boolean[num + 1];
            sieveOfEratosthenes();
            int[] result = goldbachConjecture(num, primeNum);
            bw.write(result[0] + " " + result[1] + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void sieveOfEratosthenes() { // 에라토스테네스의 채
        primeNum[0] = primeNum[1] = true; // 0과 1은 소수가 아니므로 true
        for ( int i = 2 ; i <= Math.sqrt(primeNum.length); i++) {
            if (primeNum[i]) // true면 다음 순서로 건너뜀
                continue;
            for (int j = i*i; j < primeNum.length; j += i) { // i가 소수이면, i의 배수들은 소수가 아니므로 true
                primeNum[j] = true;
            }
        }
    }

    private static int[] goldbachConjecture(int num, boolean[] prime) { // 골드바흐의 추측
        int[] result = new int[2];
        int[] min = new int[] {0, num};
        int count = 0;

        for (int i = num/2; i >= 2; i--) { // num의 절반부터

            if (!prime[i]) { // i가 소수면
                count = num - i; // input 에서 i를 빼고
                if (!prime[count]) { // input에서 i를 뺀 수가 소수면
                    result[0] = i;
                    result[1] = count;

                    if (Math.abs(result[1] - result[0]) < Math.abs(min[1] - min[0])) { // 현재 값과 이전 값의 차를 비교
                        min[0] = result[0];
                        min[1] = result[1];
                    }
                }
            }
       }
        return min;
    }
}
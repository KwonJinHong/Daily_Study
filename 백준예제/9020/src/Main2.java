import java.io.*;

public class Main2 {
    public static boolean[] primeNum; // default 값이 false (false면 소수, true면 소수 X)
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            int num = Integer.parseInt(br.readLine());
            primeNum = new boolean[num + 1];
            sieveOfEratosthenes();

            for (int j = num/2; j >= 2; j--) { // num의 절반부터
                if (!primeNum[j] && !primeNum[num - j]) { // i와 num - i 둘 다 소수인 경우
                    sb.append(j).append(" ").append(num-j).append("\n");
                    break;
                }
            }
        }
        bw.write(sb + "\n");
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

}
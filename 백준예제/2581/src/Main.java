import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = n;

        for (int i = m; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) { // i 번째 수만큼 for 문을 돌려 i의 갯수를 찾음
                if ((i%j) == 0) { // 나머지 0이면 i의 약수
                    cnt++;
                }
            }

            if (cnt == 2) { // 소수인 경우 (약수의 갯수가 2)
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
}
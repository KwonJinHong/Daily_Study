import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;

        for (int i = 0; i < testCase; i++) {
            int num = Integer.parseInt(st.nextToken());
            int cnt = 0;
            for (int j = 1; j <= num; j++) { // 1부터 num(자기 자신)까지 나눈 나머지가 0 인 경우는 약수이므로, num(입력)에 대한 약수의 갯수를 구한다.
                if ((num%j) == 0) {
                    cnt++;
                }
            }

            if (cnt == 2) { // 약수의 갯수가 2개(1, 자기자신)여야 소수이므로
                result++;
            }
        }
        System.out.println(result);
    }
}


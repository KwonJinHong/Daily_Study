import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        //큰 수와 작은 수를 A와 B에 저장
        long A = Math.min(N, M);
        long B = Math.max(N, M);
        long sum = (((B + 1) * B) / 2) - (((A - 1) * A) / 2);

        System.out.println(sum);
    }

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //  입력 값 n
        long baseNum = Integer.parseInt(br.readLine());

        long ans = (((baseNum + 1) * (baseNum + 2) - 1) + ((baseNum - 1) * baseNum / 2)) % 45678;

        // 출력
        System.out.print(ans);
    }
}
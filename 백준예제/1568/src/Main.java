import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int time = 0;
        int minusNum = 1;

        while(true) {
            // 날라가야 하는 새의 수가 남은 새의 수보다 많을 경우 1로 초기화
            if (minusNum > num) minusNum = 1;

            // 새가 날라간다.
            num -= (minusNum++);

            time++;
            if (num == 0) break;

        }
        System.out.println(time);
    }
}
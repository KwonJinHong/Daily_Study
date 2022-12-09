import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int x1, x2, y1, y2;

        if (num1 % 4 == 0) {    // 4로 나눈 나머지가 0이면 해당 숫자의 인덱스 번호는 3, num / 4 -1
            x1 = 3;
            y1 = num1 / 4 - 1;
        }else {                    // 아니면 num % 4 - 1, num / 4
            x1 = num1 % 4 - 1;
            y1 = num1 / 4;
        }

        if (num2 % 4 == 0) {
            x2 = 3;
            y2 = num2 / 4 - 1;
        }else {
            x2 = num2 % 4 - 1;
            y2 = num2 / 4;
        }

        int result = 0;
        if(x1 > x2) {    // 두 수의 인덱스 번호 중 큰 수에서 작은 수를 빼서 그 차를 구하여 합한다.
            result += x1 - x2;
        }else {
            result += x2 - x1;
        }

        if(y1 > y2) {
            result += y1 - y2;
        }else {
            result += y2 - y1;
        }
        System.out.println(result);


    }

}

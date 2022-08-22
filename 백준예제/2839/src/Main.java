import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int count = 0;

        while (true) {
            if (input%5 == 0) { // 5의 배수면 바로 값 출력하고 종료
                count += input/5;
                System.out.println(count);
                break;
            }
            else if (input < 0) { // 3을 계속 빼다 0보다 작게되면 -1을 출력하고 종료
                System.out.println(-1);
                break;
            }
            else { // 3을 계속 빼줌 (5의 배수가 될 때까지)
                input += -3;
                count++;
            }
        }
    }
}

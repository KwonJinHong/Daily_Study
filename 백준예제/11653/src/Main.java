import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int num = input;
        int result = 1;

        for (int i = 2; i <= input; i++) {
            if (input == result) { //소수들의 곱이 입력과 같으면 for문 종료
                break;
            } else {
                while ((num % i == 0)) { // i로 계속 나눠지면
                    num /= i; // num을 i로 계속 나눔
                    result *= i; // result 에 i를 계속 곱해줌
                    System.out.println(i);
                }
            }
        }
    }
}



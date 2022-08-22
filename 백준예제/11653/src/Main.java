import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int num = input;

        for (int i = 2; i <= input; i++) {
            if (input == 1) {
                break;
            } else {
                while ((num % i == 0)) { // i로 계속 나눠지면
                    num /= i; // num을 i로 계속 나눔
                    System.out.println(i);
                }
            }
        }
    }
}



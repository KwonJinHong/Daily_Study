import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int inputNum = sc.nextInt();
        int result = 0;

        for (int i = 0; i < inputNum; i++) {

            int num = i;
            int sum = 0;

            while (num != 0) { // 각 자릿수의 합을 구하는 while 문
                sum += num % 10;
                num /= 10;
            }

            if (sum + i == inputNum) { // 특정수 i와 i의 자릿수 합이 같을 경우 생성자
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
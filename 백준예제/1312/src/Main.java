import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int result = a % b; // 정수 영역의 나머지 구함

        for(int i=0; i<n-1; i++){ // 그 나머지의 10을 곱해 다음 자리 나머지를 구함
            result *= 10;
            result %= b;
        }

        result *= 10;

        System.out.println(result/b); // 원하는 자리수에서는 더이성 나머지를 구하는 것이 아니므로 나누기를 하여 몫을 구함
    }

}
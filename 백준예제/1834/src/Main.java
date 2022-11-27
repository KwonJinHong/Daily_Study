import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        long sum = 0;

        for (int i = 0; i < num; i++) {
            sum += (num + 1) * i;
        }
        System.out.println(sum);
    }
}
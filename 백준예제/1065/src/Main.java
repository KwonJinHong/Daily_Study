import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(hanSu(sc.nextInt()));

    }
    public static int hanSu (int a) {
        int num = a;
        int result = 0;

        if (num > 99) {
            result = 99;
            for (int i = 100; i <= num; i++) {

                int threeDigits = i/100;
                int twoDigits = (i/10)%10;
                int oneDigits = i%10;

                if ((twoDigits - oneDigits) == (threeDigits - twoDigits)) {
                    result++;
                }
            }
        } else {
            result = num;
        }
        return result;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String num1 = "";
        String num2 = "";

        Scanner sc = new Scanner(System.in);

        num1 = sc.next();
        num2 = sc.next();

        System.out.println(Integer.parseInt(num1) * Integer.parseInt(String.valueOf(num2.charAt(2))));
        System.out.println(Integer.parseInt(num1) * Integer.parseInt(String.valueOf(num2.charAt(1))));
        System.out.println(Integer.parseInt(num1) * Integer.parseInt(String.valueOf(num2.charAt(0))));
        System.out.println(Integer.parseInt(num1) * Integer.parseInt(num2));

    }
}

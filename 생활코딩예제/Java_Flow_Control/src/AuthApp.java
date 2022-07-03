import java.util.Scanner;

public class AuthApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String id = "KWON";
        String pwd = "1111";

        System.out.println("Hi! Input ID : ");
        String input = sc.nextLine();

        System.out.println("Input Password");
        String inputpwd = sc.nextLine();

        if (input.equals(id) && inputpwd.equals(pwd)) {
            System.out.println("Master!");
        } else {
            System.out.println("Who Are You?");
        }
    }
}

import java.util.Scanner;

public class AuthApp2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String id = "KWON";
        String pwd = "1111";
        String pwd2 = "2222";

        System.out.println("Hi! Input ID : ");
        String input = sc.nextLine();

        System.out.println("Input Password 1");
        String inputpwd = sc.nextLine();

        Boolean isRightPass = (inputpwd.equals(pwd) || inputpwd.equals(pwd2));
        if (input.equals(id) && isRightPass) {
            System.out.println("Master!");
        } else {
            System.out.println("Who Are You?");
        }
    }
}

import java.util.Scanner;

public class AuthApp3 {

    public static void main(String[] args) {

        //String[] users = {"egoing", "glgl", "zmfmfm"};
        String[][] users = {
                {"egoing", "1111"},
                {"glgl", "2222"},
                {"zmfmfm", "3333"}
        };

        System.out.println("Input ID & Password");
        Scanner sc = new Scanner(System.in);
        String inputId = sc.next();
        String inputPass = sc.next();

        boolean isLogined = false;
        for (int i = 0; i < users.length; i++) {
            String[] current = users[i];
            if ( current[0].equals(inputId) && current[1].equals(inputPass)) {
                isLogined = true;
                break;
            }
        }

        System.out.println("Hi!!");
        if (isLogined) {
            System.out.println("Master!!");
        } else {
            System.out.println("Who are you?");
        }

    }
}

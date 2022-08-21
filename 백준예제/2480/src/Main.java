
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int diceNum1 = sc.nextInt();
        int diceNum2 = sc.nextInt();
        int diceNum3 = sc.nextInt();


        if ((diceNum1 == diceNum2) && (diceNum1 == diceNum3) && (diceNum2 == diceNum3)) {
            System.out.println(10000 + 1000*diceNum1);
        }
        else if ((diceNum1 == diceNum2) || (diceNum1 == diceNum3)) {

            System.out.println(1000 + 100 * diceNum1);
        }
        else if (diceNum2 == diceNum3) {
            System.out.println(1000 + 100*diceNum2);

        }
        else
        {
            System.out.println((Math.max(diceNum1 , Math.max(diceNum2, diceNum3)))*100);
        }
    }

}
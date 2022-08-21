import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();
        int cookTime = sc.nextInt();

        int totalMinute = hour * 60 + min + cookTime;

        if ((totalMinute / 60) > 23)
        {
            System.out.println(((totalMinute / 60) - 24) + " " + totalMinute % 60);
        }
        else
        {
            System.out.println((totalMinute / 60) + " " + totalMinute % 60);
        }
    }
}

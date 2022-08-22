import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[9];
        int max = array[0];
        int index = 0;

        for (int i = 0; i < 9; i++) {
            array[i] = sc.nextInt();

            if (max < array[i]) {
                max = array[i];
                index = i + 1;
            }

        }
        System.out.println(max);
        System.out.println(index);
    }
}

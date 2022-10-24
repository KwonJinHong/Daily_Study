import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int val = 1;
        int count = 0;

        while (true) {
            for (int k = 0; k < 5; k++) {
                if (val % arr[k] == 0) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.println(val);
                return;
            }
            count = 0;
            val++;
        }

    }
}
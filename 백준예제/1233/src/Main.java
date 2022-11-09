import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[] arr = n.split(" ");

        int ans = 0;

        int[] S1 = new int[Integer.parseInt(arr[0])];
        int[] S2 = new int[Integer.parseInt(arr[1])];
        int[] S3 = new int[Integer.parseInt(arr[2])];
        for (int i = 0; i < S1.length; i++) {
            S1[i] = i + 1;
        }
        for (int i = 0; i < S2.length; i++) {
            S2[i] = i + 1;
        }
        for (int i = 0; i < S3.length; i++) {
            S3[i] = i + 1;
        }

        int counting[] = new int[81];
        for (int i = 0; i < Integer.parseInt(arr[0]); i++) {
            for (int j = 0; j < Integer.parseInt(arr[1]); j++) {
                for (int k = 0; k < Integer.parseInt(arr[2]); k++) {
                    counting[S1[i] + S2[j] + S3[k]]++;
                }
            }
        }

        int key = 0;
        for (int i = 0; i < counting.length; i++) {
            key = Math.max(key, counting[i]);
        }
        for (int i = 0; i < counting.length; i++) {
            if (key == counting[i]) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}

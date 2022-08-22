import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(arr);

        System.out.println(arr[1]);
    }
}

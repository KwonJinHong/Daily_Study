import java.io.*;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String[] arr = input.split("");
        int[] output = new int[26];
        Arrays.fill(output, -1);

        for (int i = 0; i < arr.length; i++) {
            if (output[arr[i].charAt(0) - 97] == -1) { // a 아스키코드 값 : 97
                output[arr[i].charAt(0) - 97] = i;
            }
        }

        for (int k : output) {
            bw.write(k + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();

    }
}

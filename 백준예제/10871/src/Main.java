import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int numOfInput = Integer.parseInt(input[0]);
        int stdNum = Integer.parseInt(input[1]);
        String[] inputArr = br.readLine().split(" ");

        for (int i = 0; i < numOfInput; i++) {
            int num = Integer.parseInt(inputArr[i]);
            if (num < stdNum) {
                bw.write(num + " ");
            }
        }
        bw.flush();
        bw.close();

    }
}

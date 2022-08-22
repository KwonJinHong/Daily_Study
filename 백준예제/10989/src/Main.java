import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        int[] counting = new int[10001];

        for (int i = 0; i < testCase; i++) {
            counting[Integer.parseInt(br.readLine())]++;
        }

        for (int j = 0; j < 10001; j++) {
            while (counting[j] > 0) {
                bw.write(j + "\n");
                counting[j]--;
            }

        }
        bw.flush();
        bw.close();
    }
}
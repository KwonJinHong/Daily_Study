import java.io.*;
import java.util.StringTokenizer;

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String result = String.valueOf(a * b * c);
        int[] num = new int[10];

        for (int i = 0; i < result.length(); i++) {
            num[result.charAt(i) - '0']++;
        }

        for (int k : num) {
            bw.write(k + "\n");
        }
        bw.flush();
        bw.close();
    }

}

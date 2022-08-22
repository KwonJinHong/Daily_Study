import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] num = new int[42];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(br.readLine());
            int b = (a%42);
            num[b]++;
        }

        for (int k : num) {
            if (k != 0) {
                count++;
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

}
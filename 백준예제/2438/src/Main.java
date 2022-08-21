import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(bf.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String star = "*";
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase ; i++) {
            bw.write(star + "\n");
            star += "*";
        }
        bw.flush();
        bw.close();
    }
}

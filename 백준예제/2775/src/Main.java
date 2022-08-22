import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] apt = new int[15][15];

        for (int i = 0; i < 15; i++) {
            apt[i][1] = 1;
            apt[0][i] = i;
        }

        for (int j = 1; j < 15; j ++) {
            for (int k = 2; k < 15; k++) {
                apt[j][k] = apt[j][k-1] + apt[j-1][k]; //apt[j][k-1] => n층의 k-1호까지 사람 수, apt[j-1][k] => 아랫층 k호의 사람 수
            }
        }

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            bw.write(apt[k][n] + "\n");
        }
        bw.flush();
        bw.close();
    }
}

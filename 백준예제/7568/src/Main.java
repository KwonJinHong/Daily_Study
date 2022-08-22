import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        int[][] arr = new int[testCase][2];

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < testCase; i++) {
            int rank = 1;

            for (int j = 0; j < testCase; j++) {
                if (!(i == j)) { // 자기 자신과 비교를 피하기 위해서
                    if ((arr[i][0] < arr[j][0]) && (arr[i][1] < arr[j][1])) {
                        rank++;
                    }
                }
            }
            bw.write(rank + " ");
        }
        bw.flush();
        bw.close();
    }
}

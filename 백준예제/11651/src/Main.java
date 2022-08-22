import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        int[][] arr = new int[testCase][2];

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (arr_1, arr_2) -> {
            //람다식 적용
            if (arr_1[1] == arr_2[1]) { // y 좌표가 같다면
                return arr_1[0] - arr_2[0]; // x 좌표 비교
            } else {
                return arr_1[1] - arr_2[1]; // y 좌표 비교
            }

        });

        for (int i = 0; i <testCase; i++) {
            bw.write(arr[i][0] + " " + arr[i][1] + "\n");
        }
        bw.flush();
        bw.close();

    }
}
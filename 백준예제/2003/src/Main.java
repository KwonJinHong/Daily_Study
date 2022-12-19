import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {

    public static int N, M;

    public static int[] list;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int start = 0, end = 0;
        int sum = 0;
        int ans = 0;

        list = new int[N];

        st = new StringTokenizer(br.readLine());

        for (int x = 0; x < N; x++) {
            list[x] = Integer.parseInt(st.nextToken());
        }


        while (end <= N) {
            if (sum == M) {
                // 현재까지 누적 합이 M과 같은 경우
                ans++;
                sum -= list[start++];
            } else if (sum < M) {
                // 현재까지의 누적 합이 M보다 작은 경우

                if(end==N)
                    break;
                sum += list[end++];
            } else {
                // 현재까지의 누적 합이 M보다 큰 경우
                sum -= list[start++];
            }
        }

        System.out.println(ans);




    }






}
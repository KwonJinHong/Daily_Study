import java.io.*;
import java.util.*;

public class Main {

    static int a;
    static int b;
    static int[] result = new int[100001];



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (n == m) {
            System.out.println(0);
        } else {
            bfs(n, m);
        }
    }

    public static void bfs(int x, int y) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x); // 입력받은 좌표를 큐에 삽입

        result[x] = 1;

        while (!queue.isEmpty()) {
            int temp = queue.poll();

            for (int i = 0; i < 8; i++) {
                int nx = 0;

                if (i == 0) {
                    nx = temp - 1;
                }
                if (i == 1) {
                    nx = temp + 1;
                }
                if (i == 2) {
                    nx = temp + a;
                }
                if (i == 3) {
                    nx = temp + b;
                }
                if (i == 4) {
                    nx = temp * a;
                }
                if (i == 5) {
                    nx = temp * b;
                }
                if (i == 6) {
                    nx = temp - a;
                }
                if (i == 7) {
                    nx = temp - b;
                }

                if (nx == y) {
                    System.out.println(result[temp]);
                    return;
                }

                if (nx >= 0 && nx < result.length && result[nx] == 0) {
                    queue.add(nx);
                    result[nx] = result[temp] + 1;
                }
            }
        }
    }
}
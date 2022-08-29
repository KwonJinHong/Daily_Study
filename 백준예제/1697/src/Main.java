import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int m;
    static int[] result = new int[100001];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        if (n == m) { // 둘의 위치가 같으면 0 출력
            System.out.println(0);
        } else {
            bfs(n);
        }
    }

    public static void bfs(int x) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x); // 입력받은 좌표를 큐에 삽입

        result[x] = 1;

        while (!queue.isEmpty()) {
            int temp = queue.poll();

            int[] dx = {-1, 1, temp}; // -1, 1, 자기자신*2 만큼만 움직일 수 있으므로

            for (int i = 0; i < 3; i++) {
                int nx = temp + dx[i];

                if (nx == m) {
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
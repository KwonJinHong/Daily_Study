import java.io.*;
import java.util.*;

public class Main {


    static int[][] chess;
    static boolean[][] visited;
    static int n;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        n = Integer.parseInt(br.readLine());

        chess = new int[n][n];
        visited = new boolean[n][n];

        String[] startXY = br.readLine().split(" ");

        int x1 = Integer.parseInt(startXY[0]);
        int y1 = Integer.parseInt(startXY[1]);
        int x2 = Integer.parseInt(startXY[2]);
        int y2 = Integer.parseInt(startXY[3]);

        if (x1 == x2 && y1 == y2) {
            sb.append(0).append("\n");
        } else {
            bfs(x1, y1, x2, y2);
        }

        System.out.println(sb);

    }

    public static void bfs(int x, int y, int objectX, int objectY) {
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[] {x, y}); // 입력받은 좌표를 큐에 삽입
        chess[x][y] = 1;
        int[] dx = {-2, -2, 0, 0, 2, 2};
        int[] dy = {-1, 1, -2, 2, -1, 1};

        while (!queue.isEmpty()) {
            int tempX = queue.peek()[0];
            int tempY = queue.peek()[1];
            queue.poll();
            visited[tempX][tempY] = true;

            for (int i = 0; i < 6; i++) {
                int nx = tempX + dx[i];
                int ny = tempY + dy[i];

                if (nx == objectX && ny == objectY) {
                    sb.append(chess[tempX][tempY]).append("\n");
                    return;
                }

                if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                    if (!visited[nx][ny]) {
                        queue.add(new int[] {nx, ny});
                        visited[nx][ny] = true;
                        chess[nx][ny] = chess[tempX][tempY] + 1;
                    }
                }
            }
        }
        sb.append(-1);
    }
}
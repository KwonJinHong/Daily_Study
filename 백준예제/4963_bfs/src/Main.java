import java.io.*;
import java.util.*;

public class Main {
    static int[][] ground;
    static boolean[][] visited;
    static int width;
    static int height;
    static int[] dx = {0, 0, -1, 1, -1, -1, 1, 1};
    static int[] dy = {-1, 1, 0, 0, 1, -1, -1, 1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            height = Integer.parseInt(st.nextToken());
            width = Integer.parseInt(st.nextToken());

            if (width == 0 && height == 0) {
                break;
            }

            ground = new int[width][height];
            visited = new boolean[width][height];

            for (int i = 0; i < width; i++) {
                String[] s = br.readLine().split(" ");
                for (int j = 0; j < height; j++) {
                    ground[i][j] = Integer.parseInt(s[j]);
                }
            }

            int cnt = 0;

            for (int k = 0; k < width; k++) {
                for (int l = 0; l < height; l++) {
                    if (ground[k][l] == 1 && !visited[k][l]) {
                        bfs(k, l);
                        cnt++;
                    }
                }
            }
            bw.write(cnt + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static void bfs (int x, int y) {
        Queue<int[]> queue = new LinkedList<int[]>();
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()) {
            x = queue.peek()[0]; // 큐의 front에 있는 정점을 꺼낸다.
            y = queue.peek()[1]; // 큐의 front에 있는 정점을 꺼낸다.
            visited[x][y] = true;
            queue.poll();

            for (int i = 0; i < 8; i++) { // 입력받은 그래프의 노드부터
                int searchX = x + dx[i];
                int searchY = y + dy[i];

                if ((searchX >= 0 && searchX < width) && (searchY >= 0 && searchY < height)) { // 입력받은 밭의 크기보다 작아야함
                    if ((ground[searchX][searchY] == 1) && (!visited[searchX][searchY])) { // 배추가 있고 방문한 적이 없는 곳이면 dfs 실행
                        queue.add(new int[] {searchX, searchY});
                        visited[searchX][searchY] = true;
                    }
                }
            }
        }
    }
}

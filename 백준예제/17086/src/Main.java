import java.io.*;
import java.util.*;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int n;
    static int m;
    static int[] dx = {0, 0, -1, 1, 1, 1, -1, -1};
    static int[] dy = {-1, 1, 0, 0, 1, -1, 1, -1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(s[j]);
            }
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 1) continue;
                max = Math.max(max, bfs(i, j));
            }
        }
        System.out.println(max);

    }

    public static int bfs(int x, int y) {
        Queue<point> queue = new LinkedList<>();
        queue.add(new point(x, y, 0)); // 입력받은 좌표를 큐에 삽입
        visited = new boolean[n][m];
        visited[x][y] = true; // 방문 표시

        while(!queue.isEmpty()) {
            point point = queue.poll();// 큐에 있는 y 좌표 꺼내옴

            for (int i = 0; i < 8; i++) {// 상하좌우에 1 이 있는지 표시
                int searchX = point.x + dx[i];
                int searchY = point.y + dy[i];

                if (searchX < 0 || searchX >= n || searchY < 0 || searchY >= m) { // 현재 위치가 미로에서 벗어나면 for문 탈출
                    continue;
                }
                if (visited[searchX][searchY]) {
                    continue;
                }
                if (map[searchX][searchY] == 1) {
                    return point.cnt + 1;
                }

                queue.add(new point(searchX, searchY, point.cnt + 1));
                visited[searchX][searchY] = true; // 방문 표시

            }
        }
        return 0;
    }

    static class point  {
        int x, y, cnt;

        public point (int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
}


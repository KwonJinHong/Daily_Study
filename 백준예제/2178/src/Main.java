import java.io.*;
import java.util.*;

public class Main {
    static int[][] maze;
    static boolean[][] visited;
    static int n;
    static int m;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        maze = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                maze[i][j] = Integer.parseInt(s[j]);
            }
        }

        bfs(0,0);
        System.out.println(maze[n - 1][m - 1]);
    }

    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<int[]>();
        queue.add(new int[] {x, y}); // 입력받은 좌표를 큐에 삽입

        while(!queue.isEmpty()) {
            x = queue.peek()[0]; // 큐에 있는 x 좌표 꺼내옴
            y = queue.peek()[1]; // 큐에 있는 y 좌표 꺼내옴
            visited[x][y] = true; // 방문 표시
            queue.poll();


            for (int i = 0; i < 4; i++) {// 상하좌우에 1 이 있는지 표시
                int searchX = x + dx[i];
                int searchY = y + dy[i];

                if (searchX < 0 || searchX >= n || searchY < 0 || searchY >= m) { // 현재 위치가 미로에서 벗어나면 for문 탈출
                    continue;
                }
                if (visited[searchX][searchY] || maze[searchX][searchY] == 0) { // 현재 지점이 방문한 적이 있거나 값이 0 이면 for문 탈출
                    continue;
                }

                queue.add(new int[] {searchX, searchY});
                visited[searchX][searchY] = true; // 방문 표시
                maze[searchX][searchY] = maze[x][y] + 1; // 현재 위치에 이전 위치에서 움직인 거리값에 + 1 값을 저장
            }

        }
    }
}

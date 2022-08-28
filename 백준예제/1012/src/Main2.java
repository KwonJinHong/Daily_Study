import java.io.*;
import java.util.*;

public class Main2 {
    static int[][] ground;
    static boolean[][] visited;
    static int width;
    static int height;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i ++) {
            st = new StringTokenizer(br.readLine());
            width = Integer.parseInt(st.nextToken());
            height = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            ground = new int[width][height];
            visited = new boolean[width][height];

            for (int j = 0; j < v; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                ground[x][y] = 1;
            }

            int cnt = 0;

            for (int k = 0; k < width; k++) { // 배추밭의 모든 좌표에서
                for (int l = 0; l < height; l++) {

                    // 배추가 있고 방문한 적이 없는 좌표에서만 bfs 실행
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

    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<int[]>();
        queue.add(new int[] {x, y}); // 입력받은 좌표를 큐에 삽입

        while(!queue.isEmpty()) {
            x = queue.peek()[0]; // 큐에 있는 x 좌표 꺼내옴
            y = queue.peek()[1]; // 큐에 있는 y 좌표 꺼내옴
            visited[x][y] = true; // 방문 표시
            queue.poll();

            for (int i = 0; i < 4; i++) {// 상하좌우에 배추가 있는지 연산
                int searchX = x + dx[i];
                int searchY = y + dy[i];

                if ((searchX >= 0 && searchX < width) && (searchY >= 0 && searchY < height)) { // 입력받은 밭의 크기보다 작아야함
                    if ((ground[searchX][searchY] == 1) && (!visited[searchX][searchY])) { // 배추가 있고 방문한 적이 없는 곳이면 bfs 실행
                        queue.add(new int[] {searchX, searchY}); // 또 다른 배추가 있는 좌표를 큐에 삽입
                        visited[searchX][searchY] = true; // 방문 표시
                    }
                }
            }

        }
    }
}

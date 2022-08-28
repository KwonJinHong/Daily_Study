import java.io.*;
import java.util.*;

public class Main2 {
    static int[][] apartment;
    static boolean[][] visited;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int n;
    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        apartment = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                apartment[i][j] = Integer.parseInt(s[j]);
            }
        }

        count = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (apartment[i][j] == 1 && !visited[i][j]) {
                    count = 1;
                    bfs(i, j);
                    result.add(count);
                }
            }
        }

        Collections.sort(result);
        bw.write(result.size() + "\n");
        for (int v : result) bw.write(v + "\n");
        bw.flush();
        bw.close();
    }

    public static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<int[]>();
        queue.add(new int[]{x, y}); // 입력받은 좌표를 큐에 삽입

        while (!queue.isEmpty()) {
            x = queue.peek()[0]; // 큐에 있는 x 좌표 꺼내옴
            y = queue.peek()[1]; // 큐에 있는 y 좌표 꺼내옴
            visited[x][y] = true; // 방문 표시
            queue.poll();

            for (int i = 0; i < 4; i++) {// 상하좌우에 아파트가 있는지 연산
                int searchX = x + dx[i];
                int searchY = y + dy[i];

                if ((searchX >= 0 && searchX < n) && (searchY >= 0 && searchY < n)) { // 입력받은 단지의 크기보다 작아야함
                    if ((apartment[searchX][searchY] == 1) && (!visited[searchX][searchY])) { // 아파트가 있고 방문한 적이 없는 곳이면 bfs 실행
                        queue.add(new int[]{searchX, searchY}); // 또 다른 아파트가 있는 좌표를 큐에 삽입
                        visited[searchX][searchY] = true; // 방문 표시
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

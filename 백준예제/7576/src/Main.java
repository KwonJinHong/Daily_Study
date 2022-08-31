import java.io.*;
import java.util.*;

public class Main {


    static int[][] tomato;
    static int m;
    static int n;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String[] s = br.readLine().split(" ");
        m = Integer.parseInt(s[0]);
        n = Integer.parseInt(s[1]);

        tomato = new int[n][m]; // 토마토 박스안의 토마토의 상태를 넣기 위한 그래프

        for (int i = 0; i < n; i++) { // 토마토 박스안에 토마토의 상태를 넣음
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                tomato[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(bfs());

    }

    public static int bfs() {
        Queue<ripeTomato> queue = new LinkedList<ripeTomato>();

        int[] dx = {-1, 1, 0, 0}; // 인접한 상하좌우를 이동하기 위한 x 좌표
        int[] dy = {0, 0, -1, 1}; // 인접한 상하좌우를 이동하기 위한 y 좌표

        for (int i = 0; i < n; i++) { // 익은 토마토의 위치를 큐에 넣음
            for (int j = 0; j < m; j++) {
                if (tomato[i][j] == 1) {
                    queue.add(new ripeTomato(i, j));
                }
            }
        }

        while (!queue.isEmpty()) {
            ripeTomato ripetomato = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = ripetomato.x + dx[i];
                int ny = ripetomato.y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (tomato[nx][ny] == 0) {
                        queue.add(new ripeTomato(nx, ny));
                        tomato[nx][ny] = tomato[ripetomato.x][ripetomato.y] + 1;
                    }
                }
            }
        }

        int result = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (tomato[i][j] == 0) {
                    return -1;
                }
                result = Math.max(result, tomato[i][j]);
            }
        }

        if (result == 1)
            return 0;
        else
            return result - 1;
    }
}

class ripeTomato { // 익은 토마토의 위치를 담기 위한 class
    int x;
    int y;

    ripeTomato(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
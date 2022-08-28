import java.io.*;
import java.util.*;

public class Main {
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
                    dfs(i,j);
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

    public static int dfs (int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int searchX = x + dx[i];
            int searchY = y + dy[i];

            if ((searchX >= 0 && searchX < n) && (searchY >= 0 && searchY < n)) {
                if ((apartment[searchX][searchY] == 1) && (!visited[searchX][searchY])) {
                    dfs(searchX, searchY);
                    count++;
                }
            }
        }
        return count;
    }
}

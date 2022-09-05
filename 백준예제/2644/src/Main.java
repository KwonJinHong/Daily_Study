import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer> relation[];
    static boolean[] visited;
    static int result = -1;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        relation = new ArrayList[n + 1];
        visited = new boolean[n+1];

        for (int i = 1; i < n + 1; i++) {
            relation[i] = new ArrayList<>();
        }

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());

        for (int j = 0; j < m; j++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            relation[a].add(b);
            relation[b].add(a);
        }

        dfs(x, y, 0);
        System.out.println(result);


    }

    public static void dfs (int x, int y, int cnt) {
        visited[x] = true;

        if (x == y) {
            result = cnt;
            return;
        }

        for (int i = 0; i < relation[x].size(); i++) {
            int nx = relation[x].get(i);
            if (!visited[nx]) {
                dfs(nx, y, cnt + 1);
            }
        }
    }
}

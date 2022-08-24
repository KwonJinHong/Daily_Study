import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main { // DFS를 이용해 구현

    static ArrayList<Integer> graph[];
    static int[] seq;
    static boolean[] visited;
    static int cnt;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int start = 1;

        graph = new ArrayList[n + 1];
        seq = new int[n+1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        for (int i = 1; i <= n; i++) {
            graph[i].sort(null);
        }

        seq[start] = 1;
        visited[start] = true;
        cnt = 0;
        dfs(start);

        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
    }

    public static void dfs (int nodeIndex) {

        for (int v : graph[nodeIndex]) { // 입력받은 그래프의 노드부터
            if (!visited[v]) { // 방문 하지 않은 경우에만
                // seq의 해당 노드의 몇 번째 방문인지 저장
                cnt++;
                visited[v] = true;
                dfs(v);
            }
        }
    }
}

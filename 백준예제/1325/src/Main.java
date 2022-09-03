import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer> graph[];
    static boolean[] visited;
    static int[] seq;
    static int n;
    static int m;
    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

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
        }

        int max = 0;
        for (int i = 1; i <= n; i++) {
            visited = new boolean[n + 1];
            dfs(i);
        }

        for (int i = 1; i <= n; i++) {
            if (max < seq[i]) {
                max = seq[i];
            }
        }

        for (int i = 1; i <= n; i++) {
            if (max == seq[i]) {
                bw.write(i + " ");
            }
        }
        bw.flush();
        bw.close();
    }

    public static void dfs (int x) {
        visited[x] = true;

        for (int v : graph[x]) {
            if (!visited[v]) {
                seq[v]++;
                dfs(v);
            }
        }
    }
}

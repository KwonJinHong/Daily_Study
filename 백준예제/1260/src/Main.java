import java.io.*;
import java.util.*;

public class Main { // BFS를 이용한 구현

    static LinkedList<Integer> graph[];
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        graph = new LinkedList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new LinkedList<>();
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

        dfs(v);
        sb.append("\n");

        visited = new boolean[n + 1];
        bfs(v);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void dfs (int nodeIndex) {
        sb.append(nodeIndex + " ");
        visited[nodeIndex] = true;

        for (int v : graph[nodeIndex]) { // 입력받은 그래프의 노드부터
            if (!visited[v]) { // 방문 하지 않은 경우에만
                dfs(v);
            }
        }
    }

    public static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<Integer>();
        visited[v] = true;
        queue.add(v);

        while(queue.size() != 0) {
            v = queue.poll(); // 큐의 front에 있는 정점을 꺼낸다.
            sb.append(v + " ");

            Iterator<Integer> iter = graph[v].listIterator();
            while(iter.hasNext()) {
                int w = iter.next();
                if(!visited[w]) {
                    visited[w] = true; // 방문한 정점 표시
                    queue.add(w); // 큐에 방문한 정점 넣는다.
                }
            }
        }
    }
}

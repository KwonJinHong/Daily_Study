import java.io.*;
import java.util.*;

public class Main2 { // BFS를 이용한 구현

    static LinkedList<Integer> graph[];
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

        graph = new LinkedList[n + 1];
        seq = new int[n+1];
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

        seq[start] = 1;
        visited[start] = true;
        cnt = 0;
        bfs(start);

        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
    }

    public static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<Integer>();
        visited[v] = true;
        queue.add(v);

        while(queue.size() != 0) {
            v = queue.poll(); // 큐의 front에 있는 정점을 꺼낸다.

            Iterator<Integer> iter = graph[v].listIterator();
            while(iter.hasNext()) {
                int w = iter.next();
                if(!visited[w]) {
                    visited[w] = true; // 방문한 정점 표시
                    queue.add(w); // 큐에 방문한 정점 넣는다.
                    cnt++;
                }
            }
        }
    }
}

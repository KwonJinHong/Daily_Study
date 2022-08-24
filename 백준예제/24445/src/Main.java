import java.io.*;
import java.util.*;

public class Main {

    static LinkedList<Integer> graph[];
    static int[] seq;
    static boolean[] visited;
    static int cnt;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

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
            graph[i].sort(Collections.reverseOrder());
        }

        seq[start] = 1;
        visited[start] = true;
        cnt = 2;
        bfs_list(start);

        for  (int i = 1; i <= n; i++) {
            bw.write(seq[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static void bfs_list(int v) {
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
                    seq[w] = cnt++;
                }
            }
        }
    }
}

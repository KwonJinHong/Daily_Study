import java.io.*;
import java.util.*;

public class Main {




    static int n;
    static int m;
    static StringBuilder sb = new StringBuilder();

    static class num{
        long num;
        int cnt;
        num(long num, int cnt) {
            this.num = num;
            this.cnt = cnt;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        bfs(n,m);

        System.out.println(sb);

    }

    public static void bfs(int x, int y) {
        Queue<num> queue = new LinkedList<>();

        queue.add(new num(x, 1)); // 입력받은 좌표를 큐에 삽입

        while (!queue.isEmpty()) {
            num currentNum = queue.poll();

            if (currentNum.num == y) {
                sb.append(currentNum.cnt);
                return;
            }

            if (2*currentNum.num <= y)
                queue.add(new num (2*currentNum.num, currentNum.cnt + 1));
            if (currentNum.num*10 + 1<= y)
                queue.add(new num(currentNum.num*10 + 1, currentNum.cnt + 1));
        }
        sb.append(-1);
    }
}


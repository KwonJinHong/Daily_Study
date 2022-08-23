import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Queue<Integer> q = new LinkedList<Integer>(); // Integer타입으로 선언

        int testCase = Integer.parseInt(br.readLine());
        int last = 0;

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {

                case "push" :
                    // offer는 큐의 맨 뒤 (rear)에 요소 추가
                    int num = Integer.parseInt(st.nextToken());
                    q.offer(num);
                    last = num;
                    break;

                case "pop" :
                    /*
                     * poll은 가장 앞(front)에 있는 요소를 삭제하며
                     * 삭제할 원소가 없을 경우 예외를 던지는 것이 나닌 null을 반환
                     */
                    if (q.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(q.poll() + "\n");
                    }
                    break;

                case "size" :
                    bw.write(q.size() + "\n");
                    break;

                case "empty" :
                    if (q.isEmpty()) {
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");
                    }
                    break;

                case "front" :
                    // peek() 은 큐에 꺼낼 요사가 없을 경우 null을 반환
                    Integer front = q.peek();
                    if (front == null) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(front + "\n");
                    }
                    break;

                case "back" :
                    if (q.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(last + "\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}

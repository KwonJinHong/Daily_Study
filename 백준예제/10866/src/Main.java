import java.io.*;
import java.util.*;

public class Main {
    static LinkedList<Integer> deque = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        String function = "";
        int num = 0;

        while(N --> 0) {
            st = new StringTokenizer(br.readLine());

            if(st.countTokens() > 1) {
                function = st.nextToken();
                num = Integer.parseInt(st.nextToken());

                if(function.startsWith("push_f")) {
                    push_front(num);
                }
                else if(function.startsWith("push_b")){
                    push_back(num);
                }
            }
            else {
                function = st.nextToken();

                if(function.startsWith("f")) {
                    front();
                }
                else if(function.startsWith("b")) {
                    back();
                }
                else if(function.startsWith("s")) {
                    size();
                }
                else if(function.startsWith("e")) {
                    empty();
                }
                else if(function.startsWith("pop_f")) {
                    pop_front();
                }
                else if(function.startsWith("pop_b")) {
                    pop_back();
                }

            }
        }

        System.out.println(sb);
    } // End of main

    static void push_front(int num) {
        deque.offerFirst(num);
    }

    static void push_back(int num) {
        deque.offerLast(num);
    }

    static void size() {
        sb.append(deque.size()).append('\n');
    }

    static void front() {
        if(deque.isEmpty()) {
            sb.append(-1).append('\n');
        }
        else {
            sb.append(deque.peekFirst()).append('\n');
        }
    }

    static void back() {
        if(deque.isEmpty()) {
            sb.append(-1).append('\n');
        }
        else {
            sb.append(deque.peekLast()).append('\n');
        }
    }

    static void pop_front() {
        if(deque.isEmpty()) {
            sb.append(-1).append('\n');
        }
        else {
            sb.append(deque.removeFirst()).append('\n');
        }
    }

    static void pop_back() {
        if(deque.isEmpty()) {
            sb.append(-1).append('\n');
        }
        else {
            sb.append(deque.removeLast()).append('\n');
        }
    }

    static void empty() {

        if(deque.isEmpty()) {
            sb.append(1).append('\n');
        }
        else {
            sb.append(0).append('\n');
        }

    }

}
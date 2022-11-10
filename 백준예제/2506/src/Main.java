import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int total = 0;  //총 점수
        int score = 0;  //문제 맞을 때 더할 점수
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int q = Integer.parseInt(st.nextToken());
            if (q == 1) {
                score++;  //더할 점수를 1씩 증가시켜준다
                total += score;
            } else {
                score = 0;  //문제를 틀리면 score는 리셋
            }
        }
        System.out.print(total);
    }
}
import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        String[] cardVal = br.readLine().split(" ");

        ArrayList<Integer> cardV = new ArrayList<>(); // String 배열을 Integer 배열로 변환

        for (String s : cardVal) {
            cardV.add(Integer.parseInt(s));
        }

        int max = 0;

        for (int i = 0; i < n - 2; i++) { // 3개의 카드를 고르므로 첫 번째 카드는 n - 2 까지 순회
            for (int j = i + 1; j < n - 1; j ++) { // 두 번째 카드는 첫 번째 카드 다음부터 n - 1까지 순회
                for (int k= j + 1; k < n; k++) { // 세 번째 카드는 두 번째 카드 다음부터 n 까지 순회
                    int sum = cardV.get(i) + cardV.get(j) + cardV.get(k);

                    if (sum <= m) {
                        max = Math.max(max, sum);
                    }
                    if (max == m) {
                        bw.write(max + "\n");
                        bw.flush();
                        bw.close();
                        return;
                    }
                }
            }
        }
        bw.write(max + "\n");
        bw.flush();
        bw.close();
    }
}

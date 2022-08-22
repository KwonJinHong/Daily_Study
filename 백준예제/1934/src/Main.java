import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {

            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            bw.write(lcm(a,b) + "\n");
        }
        bw.flush();
        bw.close();

    }

    public static int lcm (int x, int y) { // 최소공배수 - 유클리드 호재법으로 최대공약수 구한 다음 최소공배수 계산

        int max = Math.max(x, y);
        int min = Math.min(x, y);

        while (min != 0) {
            int r = max%min;
            max = min;
            min = r;
        }
        return x*y/max;
    }
}
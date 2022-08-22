import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        System.out.println(gcd(a,b));
        System.out.println((a*b/gcd(a,b)));

    }

    public static int gcd (int x, int y) { // 최대공약수 - 유클리드 호재법법

        int max = Math.max(x, y);
        int min = Math.min(x, y);

        while (min != 0) {
            int r = max%min;
            max = min;
            min = r;
        }
        return max;
    }
}

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(bf.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(bf.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            double d =  Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            if (d == 0 && r1 == r2) {
                bw.write("-1");
            } else if (d > Math.abs(r2 - r1) && d < r1 + r2) {
                bw.write("2");
            } else if (Math.abs(r2 - r1) == d || r2 + r1 == d) {
                bw.write("1");
            } else if (r1 + r2 < d || Math.abs(r2 - r1) > d || d == 0) {
                bw.write("0");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
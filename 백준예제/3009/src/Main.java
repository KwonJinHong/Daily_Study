import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] x = new int[3];
        int[] y = new int[3];
        int rx, ry;

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        if (x[0] == x[1])
            rx = x[2];
        else if (x[0] == x[2])
            rx = x[1];
        else rx = x[0];

        if (y[0] == y[1])
            ry = y[2];
        else if (y[0] == y[2])
            ry = y[1];
        else ry = y[0];

        System.out.println(rx + " " + ry);
    }
}

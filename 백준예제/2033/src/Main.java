import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Long.parseLong(br.readLine());
        long zari = 10;
        while (N > zari) {
            if (N % zari < zari / 2)
                N -= N % zari;
            else {
                N -= N % zari;
                N += zari;
            }
            zari *= 10;
        }
        bw.write(N + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
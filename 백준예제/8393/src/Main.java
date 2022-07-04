import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i <= num; i++)
        {
            result = result +  i;
        }
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}

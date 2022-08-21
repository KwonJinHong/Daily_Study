
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int temp = num;

        int i = 0;

        while (true) {

            temp = 10 * (temp%10) +((temp/10) + (temp%10))%10;
            i++;

            if (temp == num)
            {
                break;
            }
        }
        bw.write(i + "\n");
        bw.close();
    }
}

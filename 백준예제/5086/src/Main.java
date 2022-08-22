import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String[] s = br.readLine().split(" ");

            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            if (a == 0 && b == 0) {
                break;
            } else if (b%a == 0) {
                bw.write("factor" + "\n");
            } else if (a%b == 0) {
                bw.write("multiple" + "\n");
            } else {
                bw.write("neither" + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int sum = 0;

        String input = br.readLine();
        String[] arr = input.split("");

        for (int i = 0; i < num; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        bw.write(sum + "\n");
        bw.flush();
        bw.close();

    }
}

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);
        int h = Integer.parseInt(input[3]);

        int wx = w - x;
        int hy = h - y;

        int result1 = Math.min(x, wx);
        int result2 = Math.min(y, hy);

        System.out.println(Math.min(result1, result2));
    }
}

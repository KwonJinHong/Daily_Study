import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int sum = 0;
        int i = 1;
        int top = 0;
        int bottom = 0;

        while(sum < input) {
            sum = sum + i;
            i++;
        }

        if (i%2 == 0) {
            top = 1 + (sum - input);
            bottom = (i-1) - (sum - input);
        } else {
            top = (i-1) - (sum - input);
            bottom = 1 + (sum - input);
        }
        System.out.println(top + "/" + bottom);

    }
}

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int count = 2;
        int i = 1;

        if (input == 1) {
            System.out.println(1);
        } else {
            while (count <= input) {
                count = count + (6*i);
                i++;
            }
            System.out.println(i);
        }
    }

}

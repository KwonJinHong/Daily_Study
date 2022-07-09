import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] arr = input.split(" ");
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("") == false) {
                index++;
            }

        }
        System.out.println(index);
    }
}

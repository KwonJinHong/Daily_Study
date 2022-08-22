import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] arr = input.split(" ");

        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            arr[i] = sb.reverse().toString();

        }
        System.out.println(Math.max((Integer.parseInt(arr[0])), (Integer.parseInt(arr[1]))));
    }
}

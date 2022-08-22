import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < testCase; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(arr);

        for (int i : arr) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}
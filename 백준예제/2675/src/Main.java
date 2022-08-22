import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());
            int looNum = Integer.parseInt(st.nextToken());
            String input = st.nextToken();
            String[] arr = input.split("");
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < looNum; k++) {
                    sb.append(arr[j]);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

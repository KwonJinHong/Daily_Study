import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        HashMap<Integer, String> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            map.put(i, br.readLine());
        }

        int cnt = 0;
        for (int i = 0; i < m; i++) {
            if (map.containsValue(br.readLine()))
                cnt++;
        }

        System.out.println(cnt);
    }
}

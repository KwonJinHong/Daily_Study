import java.util.*;
import java.io.*;

public class Main {
    static int N,X, ans;
    static int arr[];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        HashSet<Integer> set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            set.add(arr[i]);
        }
        X = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            if(set.contains(X-arr[i])) {
                ans++;
            }
        }
        System.out.println(ans/2);
    }
}
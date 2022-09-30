import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int arr[][]= new int[N][M];

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j]=temp.charAt(j)-'0';
            }
        }

        int ans = 1;
        int size = Integer.min(N, M);
        for (int k = 2; k <= size; k++) {
            for (int i = 0; i < N-k+1; i++) {
                for (int j = 0; j < M-k+1; j++) {
                    if(arr[i][j]==arr[i+k-1][j]&&arr[i][j]==arr[i][j+k-1]&&arr[i][j]==arr[i+k-1][j+k-1]) {
                        if(ans<k) {
                            ans = k;
                        }
                    }
                }
            }
        }
        System.out.println(ans*ans);
    }
}
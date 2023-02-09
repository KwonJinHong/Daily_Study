import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;
        char[][] floor = new char[n][m];

        for (int i = 0; i < n; i++) {
            String a = br.readLine();
            for (int j = 0; j < m; j++) {
                floor[i][j] = a.charAt(j);
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){

                if(floor[i][j] == '-'){
                    if(j == m-1 || floor[i][j+1] == '|'){
                        // 같은 행의 마지막 방이거나
                        // 다음 칸(j+1)이 '|' 인 경우
                        cnt++;
                    }
                }

                if(floor[i][j] == '|'){
                    if(i == n-1 || floor[i+1][j] == '-'){
                        // 같은 열의 마지막 방이거나
                        // 다음 줄(i+1)이 '-' 인 경우
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }

}

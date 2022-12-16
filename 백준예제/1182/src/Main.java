import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int s, n;
    static int[] inputSubset;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        count = 0;
        inputSubset = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < n ; i++){
            inputSubset[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0,0);
        // count 합이 0인 경우 공집합도 포함되므로 그 수를 하나 빼주고 출력
        if (s == 0) {
            count--;
        }
        System.out.println(count);
    }
    public static void dfs (int index, int sum){
        // dfs로 돌며 누적시키다가 index를 끝까지 탐색했을 때
        if (index == n) {
            // 지금까지의 총합이 목표값과 같을 때
            if (sum == s) {
                count++;
            }
            return;
        }
        // 현재 index 의 값을 선택하지 않는다.
        dfs(index + 1, sum);
        // 현재 index 의 값을 선택한다.
        dfs(index + 1, sum + inputSubset[index]);
    }
}
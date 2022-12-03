import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static int arr[] = new int[9];
    public static int nums[] = new int[7];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        dfs(0, 0);
    }

    public static void dfs(int cnt, int start) {
        if (cnt == 7) {
            int sum = 0;
            for (int i = 0; i < 7; i++) {
                sum += nums[i];
            }
            if (sum == 100) {
                for (int i = 0; i < 7; i++) {
                    System.out.println(nums[i]);

                }
                return;
            }
            return;
        }

        for (int i = start; i < 9; i++) {
            nums[cnt] = arr[i];
            dfs(cnt + 1, i + 1);

        }

    }
}
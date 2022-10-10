import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        long L = Long.parseLong(st.nextToken());
        long W = Long.parseLong(st.nextToken());
        long H = Long.parseLong(st.nextToken());
        double min = L;
        min = Math.min(min, W);
        min = Math.min(min, H);

        // A(mid)의 최댓값을 구하시오.

        double l = 0;
        double h = min; // A <= 큰 상자의 최소길이
        double mid;

        // 소수점을 다루면서 오차를 허용하는 문제는 이런 식으로 충분한 반복을 통해 아주 가까운 근사치를 답으로 얻을 수 있다.
        for(int i=0; i<5000; ++i){
            mid = (l+h) / 2;

            // 각 변에 대한 나누기, 곱하기를 통해서 총 개수를 구할 수 있다.
            // 원하는 갯수보다 적으면 mid 값을 줄여서 들어갈 수 있는 박스를 늘리는 방식으로 가야 한다.
            if((long)(L/mid) * (long)(W/mid) * (long)(H/mid) < N){
                h = mid;
            }
            else{
                l = mid;
            }
        }

        System.out.print(l);
    }
}
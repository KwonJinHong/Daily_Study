import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());
        ArrayList<Integer> inputarr = new ArrayList<Integer>();
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        for(int i = 0; i < l; i++) {
            inputarr.add(Integer.parseInt(st.nextToken()));
        }
        int n = Integer.parseInt(br.readLine());
        int start = 0, end = 1001; // 집합 s에 포함된 모든 정수는 1보다 크거나 같고, 1000보다 작거나 같다.

        for(int i : inputarr) { //n과 가장 가까운 두 수 를 start, end에 저장
            if(i < n) {
                if( i > start) {
                    start = i;
                }
            }else if(i > n) {
                if(i < end) {
                    end = i;
                }
            }else {	// 리스트의 원소 중 n 과 같은 값이 있으면 출력은 0이 된다
                System.out.println(0);
                return;
            }
        }

        int cnt = 0;


        for(int i = start + 1; i <= n; i++) {
            for(int j = n; j <= end - 1; j++) {
                if(i != j) {	//이대로 계산하면 [n,n]도 카운트에 포함되므로 제외하기 위해
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }

}
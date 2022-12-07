import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int[] ball_cnt = new int[n+1];
        int res = 0;
        int now=1;
        while(true) {
            ball_cnt[now]++;
            if(ball_cnt[now]==m) break;
            //만약 공을 m번 받으면 break

            if(ball_cnt[now]%2==1) { //홀수일 때,
                now +=l;
                if(now>n) {
                    now = now-n;
                }
            }else {
                now -=l;
                if(now<=0) {
                    now += n;
                }
            }
            res++;
        }
        System.out.println(res);
    }

}
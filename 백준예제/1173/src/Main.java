import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N분
        int m = sc.nextInt(); // 초기 맥박
        int M = sc.nextInt(); // 최대 맥박
        int T = sc.nextInt(); // 1분당 T만큼 맥박 증가
        int R = sc.nextInt(); // 1분당 R만큼 맥박 감소

        int res = 0; // 결과
        int move = 0; // 운동 한 시간
        int init_m = m; // 초기 맥박

        while(move != N) {
            res++; // 시간 증가

            // 운동 후 맥박이 최대 맥박보다 작으면 운동 시작
            // 그렇지 않으면 휴식
            if(m + T <= M) {
                m += T;
                move++;
            } else {
                m -= R;

                // 초기 맥박 아래로 떨어지면, 초기 맥박으로 세팅
                if(m < init_m) m = init_m;
            }

            // 운동 후 맥박이 최대 맥박보다 크고, 맥박이 초기 맥박일 경우
            // 운동 시간을 채울 수 없으므로, 반복문을 중지시킴
            if((m + T > M) && (m == init_m))
                break;
        }

        if(move != N)
            System.out.println(-1);
        else
            System.out.println(res);
    }
}
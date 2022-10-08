import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 입력을 받는다
        int participantCount = Integer.parseInt(st.nextToken());
        int player1Index = Integer.parseInt(st.nextToken());
        int player2Index = Integer.parseInt(st.nextToken());
        int round = 1;

        while (true) {
            // 최후의 한명만 남은 경우 종료
            if (participantCount == 0) {
                break;
            }

            // 큰수가 짝수일경우 이번라운드에서 만남
            if (((player1Index + 1) / 2) == ((player2Index + 1) / 2)) {
                break;
            }

            // 다음 라운드로 넘어감
            player2Index = (player2Index + 1) / 2;
            player1Index = (player1Index + 1) / 2;
            participantCount = participantCount / 2;
            round++;
        }


        // 만약 서로 대결하지 않을 때는 -1을 출력
        if (participantCount == 0) {
            round = -1;
        }
        System.out.print(round);
    }
}

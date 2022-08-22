import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static boolean[][] chessBoard;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        chessBoard = new boolean[row][col];
        int result = row*col;

        for (int i = 0; i < row; i++) {
            String[] s = br.readLine().split("");
            for (int j = 0; j < col; j++) {
                if (s[j].charAt(0) == 'W') {
                    chessBoard[i][j] = true;
                } else {
                    chessBoard[i][j] = false;
                }
            }
        }

        /*
         주어진 입력으로부터 만들어진 체스판의 크기는 row * col 이다. 이 때 8*8 크기의 체스판을 찾아야하므로,
         우리가 실질적으로 따져야할 경우의 수는 (row - 7) * (col - 7) 이다. 이 경우의 수만큼만 for 문을 돌려주게 되면
         모든 배열값에 대해 for 문을 돌렸을 때와 같은 결과를 얻을 수 있다. (중복 계산을 피하고)
        */
        for (int i = 0; i < row - 7; i++) {
            for (int j = 0; j < col - 7; j++) {
                if (countChess(i,j) < result) {
                    result = countChess(i,j);
                }
            }
        }
        System.out.println(result);

    }

    public static int countChess (int a, int b) {

        int count = 0;
        boolean standard = chessBoard[a][b]; // 체스판의 시작 기준 (White, Black 두 가지 경우가 있으므로)

        for (int i = a; i < a+8; i++) {
            for (int j = b; j < b+8; j++) {
                if (chessBoard[i][j] != standard) {
                    count++;
                }
                standard = (!standard); // 정상적인 체스판이라면 다음 칸은 자신의 반대 색깔이므로
            }
            standard = (!standard); // 다음 줄의 칸도 자신과 반대색이므로
        }

        return Math.min(count, 64 - count); // 8*8에서 계산된 count 값을 뺀 수는 반대일 때의 경우의 수이다. (흰 -> 검 or 검 -> 흰)
    }
}
import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws  IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());

        String[][] arr = new String[num][num]; // 입력 N 크기 만큼 이차원 배열 생성

        for (int i = 0; i < arr.length; i++) { // 배열 값 공백으로 초기화
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = " ";
            }
        }

        makeStar(arr, 0, 0, num); // 재귀함수 호출 파라미터 (배열, 처음 시작 x 좌표, 처음 시작 y 좌표, 입력받은 수)

        for (String[] strings : arr) { // 모든 배열값을 출력하기 위한 for 문
            for (String string : strings) {
                bw.write(string + "");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    public static void makeStar(String[][] arr, int x, int y, int N) {

        if (N == 1) { // N이 1이면 해당 배열 인덱스에 * 값 저장
            arr[x][y] = "*";
            return;
        }
        /*
         별 찍는 패턴을 보면 크게 3X3, 9개의 블럭으로 나눌 수 있음 이때 가운데 구역은 공백처리
         재귀 함수가 호출되는 조건은 N/3 마다 호출되고, 이 때 파라미터 값으로 배열과 해당 x, y 좌표, N/3을 넘겨줌
         N=1 이 될 때까지 호출 반복
        */
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!(i == 1 && j == 1)) { // 가운데 구역은 공백으로 남기기 위한 조건
                    makeStar(arr, x + (i*N/3), y + (j*N/3), N/3); // 재귀함수 호출
                }
            }
        }
    }
}
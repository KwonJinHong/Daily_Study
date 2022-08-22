import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static int[] arrTree;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int max = 0;

        arrTree = new int[n]; // 나무 길이 배열
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arrTree.length; i++) {
            arrTree[i] = Integer.parseInt(st.nextToken());
            if (arrTree[i] > max) {
                max = arrTree[i]; // 나무 길이 최댓값
            }
        }

        binarySearch(max, m);

    }

    public static void binarySearch(int max, int target) { // 이분탐색
        int start = 0; // 시작점
        int end =  max; // 주어진 나무 길이 중 최댓값을 end 값으로 설정
        int mid; // 중앙

        while (start <= end) { // 시작과 종점이 같아질 때까지
            mid = (start + end)/2;

            if (cutterDetermine(mid) >= target) // 자른 값이 목표값보다 크거나 같으면
                start = mid + 1;
            else {
                end = mid - 1;
            }
        }
        System.out.println(start - 1);
    }

    public static long cutterDetermine(int mid) { // 절단기로 자른 나무 길이 계산하여 반환
        long sum = 0;

        for (int i : arrTree) {
            if (i - mid > 0) {
                sum += (i - mid);
            }
        }
        return sum;
    }
}
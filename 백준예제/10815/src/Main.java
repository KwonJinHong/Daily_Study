import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n]; // 상근이가 들고 있는 숫자 카드 배열
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr1); // 배열 정렬

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (binarySearch(arr1, num)) {
                bw.write(1 + " ");
            } else {
                bw.write(0 + " ");
            }
        }
        bw.flush();
        bw.close();

    }

    public static boolean binarySearch(int[] arr, int target) { // 이분탐색
        int start = 0; // 시작점
        int end = arr.length - 1; // 종점
        int mid; // 중앙

        while (start <= end) { // 시작과 종점이 같아질 때까지
            mid = (start + end)/2;

            if (arr[mid] == target) // 찾으려는 값과 arr[mid]값이 같다면 종료
                return true;
            else if (arr[mid] < target) { // 찾으려는 값이 arr[mid]값보다 크다면
                start = mid + 1;
            }
            else if (arr[mid] > target) { // 찾으려는 값이 arr[mid]값보다 작다면
                end = mid - 1;
            }
        }
        return false;
    }
}

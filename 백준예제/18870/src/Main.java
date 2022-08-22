import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer[] arr = new Integer[num];

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 배열을 LinkedHashSet 으로 변환합니다. (중복된 객체 허용 X)
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(arr));
        // LinkedHashSet 을 배열로 변환홥니다. (중복된 개체가 삭제된 배열로 반환)
        Integer[] intArrayWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});

        Arrays.sort(intArrayWithoutDuplicates);

        for (Integer integer : arr) {
            bw.write(binarySearch(intArrayWithoutDuplicates, integer) + " ");
        }
        bw.flush();
        bw.close();
    }



    public static int binarySearch(Integer[] arr, int target) { // 이분탐색
        int start = 0; // 시작점
        int end = arr.length - 1; // 종점
        int mid; // 중앙

        while (start <= end) { // 시작과 종점이 같아질 때까지
            mid = (start + end)/2;

            if (arr[mid] == target) // 찾으려는 값과 arr[mid]값이 같다면 종료
                return mid;
            else if (arr[mid] < target) { // 찾으려는 값이 arr[mid]값보다 크다면
                start = mid + 1;
            }
            else if (arr[mid] > target) { // 찾으려는 값이 arr[mid]값보다 작다면
                end = mid - 1;
            }
        }
        return -1;
    }

}

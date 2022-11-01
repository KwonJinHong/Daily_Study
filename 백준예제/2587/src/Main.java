import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];		// 입력한 값을 담을 배열 생성
        int sum = 0;				// 총 합을 구할 변수 생성

        for(int i=0; i<5; i++) {	// 반복문
            int num = sc.nextInt(); // 숫자 입력받기
            arr[i] += num;			// 배열에 숫자 넣기
            sum += num;				// 평균을 구하기 위해 입력받은 수의 총합 구하기
        }

        System.out.println(sum/5);	// 총합을 5로 나누기

        Arrays.sort(arr);			// 배열 정렬하기

        System.out.println(arr[2]);	// 3번째 값이 중앙값

        sc.close();
    }
}
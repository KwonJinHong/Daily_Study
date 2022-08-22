import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num + 1];
        //0과 1은 기본 값으로 주어져야하기 때문에 0과 1로 넣어준다.
        arr[0] = 0;
        arr[1] = 1;
        //2인덱스 부터 반복문을 돌려준다.
        for(int i = 2; i < num + 1; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[num]);
    }

}

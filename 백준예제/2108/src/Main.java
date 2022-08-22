import java.io.*;
import java.util.ArrayList;

public class Main {

    public static int[] counting;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        counting = new int[8001]; // 입력 정수 값 범위 : -4000 ~ 4000
        ArrayList<Integer> sortArr = new ArrayList<>(); // 오름차순으로 입력값 정렬할 배열
        double sum = 0;

        for (int i = 0; i < testCase; i++) {
            int num = Integer.parseInt(br.readLine());
            sum += num; // 입력된 값들의 총 합
            counting[num + 4000]++; // 양수 음수를 구분하기 위해 4000을 더해줌 (아래 설명 참조)
        }

        int mode = findMode(counting); // 최빈값 함수

        for (int i = 0; i < counting.length; i++) { // 오름차순으로 정렬해서 ArrayList에 값 추가
           while (counting[i] > 0) {
               sortArr.add(i - 4000);
               counting[i]--;
           }
        }

        System.out.println(Math.round(sum/testCase)); // 산술평균
        System.out.println(sortArr.get(testCase/2)); // 중앙값 (정렬된 배열의 testCase/2 인덱스가 중앙값이 된다.)
        System.out.println(mode); // 최빈값
        System.out.println(Math.abs(sortArr.get(testCase - 1) - sortArr.get(0))); // 범위 (오른차순으로 인덱싱 되어 있으므로, testCase - 1 번째가 최댓값, 0번째 값이 최소값)
    }

    public static int findMode (int[] arr) {
        int mode = 0; // 최빈값
        int modeMax = 0; // 최빈값의 최대 카운팅 값
        boolean flag = false; // 2번째로 작은 최빈값을 걸러내기 위한 플래그

        /*
         실제 arr[0]의 의미는 -4000의 등장 횟수이다. arr[0]가 -4000을 가르키는 이유는 위의 counting 배열을 받을 때 i + 4000으로 받았기 때문이다.
         실제 들어오는 숫자의 범위가 -4000 ~ 4000이므로, counting 배열의 총 크기를 8001로 지정하고 들어온 입력에 4000을 더해주게 되면 음수와 양수 구분이 가능해진다.
         나중에 실제값으로 되돌릴 때는 4000을 빼주게 되면 실제 입력값이 된다. 따라서 아래의 for 문에서 -4000 ~ 4000까지 순차적으로 도니까 최빈값을 찾을 때 문제의 조건 중,
         중복된 최빈값이 있을 때 2번째로 작은 값은 중복된 값 중에 2번째로 나오는 값이 바로 조건에 맞는 답이 된다.
        */
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                if (modeMax < arr[i]) {
                    modeMax = arr[i];
                    mode = i - 4000;
                    flag = true; // flag on
                }
                else if (modeMax == arr[i] && flag == true) { // 동일한 최대 카운팅값과 flag가 true 상태일 시,
                    mode = i - 4000; //
                    flag = false; // 다시 flag off -> 새로운 최빈값이 갱신되지 않는 한 동일한 최빈값은 더 이상 바뀌지 않는다.
                }
            }
        }
        return mode;
    }
}

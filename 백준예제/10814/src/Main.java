import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        String[][] arr = new String[testCase][2];

        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        /*
        안정 정렬은 중복된 값을 입력 순서와 동일하게 정렬하는 정렬 알고리즘의 특성을 말하고, 불안정 정렬은 안정 정렬과 반대로 중복된
        값이 입력 순서와 동일하지 않게 정렬되는 알고리즘을 말한다.
        안정 정렬에는 삽입 정렬, 병합 정렬, 버블 정렬이 있고, 불안정 정렬에는 퀵정렬, 선택정렬, 계수정렬 등이 있다.
        */
       Arrays.sort(arr, new Comparator<String[]>() {
            // 나이순으로 정렬
            @Override
            public int compare(String[] s1, String[] s2) {
                if(Objects.equals(s1[0], s2[0])) {
                    return 1;
                }else {
                    return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
                }
            }

        });

        for (int i = 0; i < testCase; i++) {
            bw.write(arr[i][0] + " " + arr[i][1] +"\n");
        }
        bw.flush();
        bw.close();
    }
}

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arrOrigin = new int[num]; // 원본 배열
        HashMap<Integer, Integer> tempMap = new HashMap<>(); // 좌표 압축한 데이터를 담을 해쉬맵

        for (int i = 0; i < num; i++) { // 원본 배열과 정렬할 배열에 입력값을 넣어줌
            arrOrigin[i] = Integer.parseInt(st.nextToken());
        }

        int[] arrSorted = arrOrigin.clone();
        Arrays.sort(arrSorted); // 크기순으로 배열 정렬

        int index = 0;
        for (int value : arrSorted) { // 정렬된 배열로
            if (!tempMap.containsKey(value)) { // 키값이 중복되지 않았을 때에만 값과 index를 넣어줌
                tempMap.put(value, index);
                index++;
            }
        }

        for (int key : arrOrigin) {
            bw.write(tempMap.get(key) + " ");
        }
        bw.flush();
        bw.close();
    }
}

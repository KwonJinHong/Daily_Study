import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashSet;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        String[] arr = new String[testCase];

        for (int i = 0; i < testCase; i++) {
            arr[i] = br.readLine();
        }

        // 배열을 LinkedHashSet으로 변환합니다. (중복된 객체 허용 X)
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(arr));
        // LinkedHashSet을 배열로 변환홥니다. (중복된 개체가 삭제된 배열로 반환)
        String[] strArrayWithoutDuplicates = linkedHashSet.toArray(new String[] {});

        Arrays.sort(strArrayWithoutDuplicates, (o1, o2) -> {
            if (o1.length() == o2.length()) { // 두 단어의 길이가 같은 경우
                return o1.compareTo(o2); // 두 단어를 비교하여 사전순으로 정렬
            }
            else {
                return o1.length() - o2.length();
            }
        });

        for (String s : strArrayWithoutDuplicates) {
            bw.write(s + "\n");
        }
        bw.flush();
        bw.close();
    }
}

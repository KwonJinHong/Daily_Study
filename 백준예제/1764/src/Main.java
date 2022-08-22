import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) { // 해쉬맵으로 입력단어 key로 받음
            String s = br.readLine();
            map.put(s, 1);
        }

        ArrayList<String> resultArr = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if (map.containsKey(s)) { // 다른 주어진 입력으로 키 검색
                resultArr.add(s);
            }
        }
        Collections.sort(resultArr); // Collection.sort -> 기본적으로 String 클래스는 Comparable 인터페이스를 사전편찬 순으로 정렬하도록 구현되어있다.

        // 정답 출력
        bw.write(resultArr.size() + "\n");
        for (String s : resultArr) {
            bw.write(s + "\n");
        }
        bw.flush();
        bw.close();
    }
}
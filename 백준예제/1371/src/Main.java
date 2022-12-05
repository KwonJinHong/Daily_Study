import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder statementStr = new StringBuilder();

        // 값 입력
        String str;
        while ((str = br.readLine()) != null) {
            statementStr.append(str);
        }

        // 단어 빈도수 카운트
        int[] alphabetArr = new int[26];
        for (char ch : statementStr.toString().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                final int idx = ch - 'a';
                alphabetArr[idx]++;
            }
        }

        // 최빈도 값 찾기
        int maxVal = Arrays.stream(alphabetArr).max().getAsInt();

        // 최빈도 단어 출력
        for (int i = 0; i < 26; i++) {
            if (alphabetArr[i] == maxVal) {
                System.out.print((char) (i + 'a'));
            }
        }
        br.close();
    }

}
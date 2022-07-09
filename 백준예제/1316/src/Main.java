import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabet = new int[26];
        int numOfWords = Integer.parseInt(br.readLine());
        int result = numOfWords;

        for (int i = 0; i < numOfWords; i++) {
            String input = br.readLine();
            String[] arr = input.split("");

            for (int j = 0; j < arr.length; j++) { // 알파벳이 문자열에 포함된 횟수
                alphabet[arr[j].charAt(0) - 'a']++;
            }

            for (int k =0; k < alphabet.length; k++) {
                if (alphabet[k] != 0) { // 나타난 알파벳에 대해서만
                    String s = "";
                    for (int l = 0; l < alphabet[k]; l++) { // 알파벳이 나타난 횟수만큼 반복된 문자열 생성 ex) a가 4번 나타나면 -> aaaa
                        s += (char)(k+97);
                    }

                    if (!input.contains(s)) { // 반복된 문자열을 포함하지 않을시 그룹단어가 아니게됨
                        result = result - 1; // 총 단어에서 1을 빼준 뒤 for문 break;
                        break;
                    }
                }
            }
            Arrays.fill(alphabet, 0);
        }
        System.out.println(result);
    }
}

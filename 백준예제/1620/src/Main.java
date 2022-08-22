import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> pokemonName = new HashMap<>(); // Key 값 : 포켓몬 이름. Value : 포겟몬 도감 번호
        String[] arrPokemonNum = new String[n+1]; // 배열을 이용해 도감 번호와 포겟몬 이름을 매칭시킴

        for (int i = 1; i < n + 1; i++) {
            String s = br.readLine();
            pokemonName.put(s, i); // 포켓몬 이름이 Key 값인 HashMap 에 저장
            arrPokemonNum[i] = s; // 배열에 이름 저장
        }

        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if (isNumber(s)) {
                bw.write(arrPokemonNum[Integer.parseInt(s)] + "\n");
            } else {
                bw.write(pokemonName.get(s) + "\n");
            }
        }
        bw.flush();
        bw.close();

    }

    static boolean isNumber(String s) { // 문자열이 숫자일 때 True 반환
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

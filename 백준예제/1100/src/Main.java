import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        String[][] map = new String[8][8];

        for(int i=0; i<map.length; i++) {
            String[] str = br.readLine().split("");
            for(int j=0; j<map[0].length; j++) {
                map[i][j] = str[j];
            }
        }

        for(int i=0; i<map.length; i++) {
            for(int j=0; j<map[0].length; j++) {
                if((i+j)%2 == 0 && map[i][j].equals("F")) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numOfSub = Integer.parseInt(br.readLine());
        int[] arrScore = new int[numOfSub];
        int max = arrScore[0];
        double total = 0;
        StringTokenizer st= new StringTokenizer(br.readLine());

        for (int i = 0; i < numOfSub; i++) {
            arrScore[i] = Integer.parseInt(st.nextToken());
            if (max < arrScore[i]) {
                max = arrScore[i];
            }
        }

        for (int j = 0; j < arrScore.length; j++) {
            total = total + ((double)arrScore[j]/max*100);

        }
        bw.write(total/numOfSub + "\n");
        bw.flush();
        bw.close();
    }
}
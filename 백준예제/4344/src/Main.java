import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double result = 0;

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());

            int numOfStd = Integer.parseInt(st.nextToken());
            int[] arrScore = new int[numOfStd];
            int total = 0;
            int avrg = 0;
            double upAvrgStd = 0;

            for (int j = 0; j < arrScore.length; j++) {
                arrScore[j] = Integer.parseInt(st.nextToken());
                total += arrScore[j];
                avrg = total/arrScore.length;
            }

            for (int k : arrScore) {
                if (k > avrg) {
                    upAvrgStd++;
                }
            }
            result =  (upAvrgStd/numOfStd*100);
            String s = String.format("%.3f", result);
            bw.write(s + "%" + "\n");

        }
        bw.flush();
        bw.close();
    }
}

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] num = new int[10];
        int[] inputNumber = new int[3];

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            inputNumber[i] = Integer.parseInt(st.nextToken());
        }
        String result = Integer.toString(inputNumber[0] * inputNumber[1] * inputNumber[2]);
        String[] resultArr = result.split("");

        for (int j = 0; j < resultArr.length; j++) {
            switch (resultArr[j]) {
                case "0":
                    num[0]++;
                    break;
                case "1":
                    num[1]++;
                    break;
                case "2":
                    num[2]++;
                    break;
                case "3":
                    num[3]++;
                    break;
                case "4":
                    num[4]++;
                    break;
                case "5":
                    num[5]++;
                    break;
                case "6":
                    num[6]++;
                    break;
                case "7":
                    num[7]++;
                    break;
                case "8":
                    num[8]++;
                    break;
                case "9":
                    num[9]++;
                    break;
                default:
                    break;
            }
        }


        for (int k = 0; k < 10; k++) {
            bw.write(num[k] + "\n");
        }
        bw.flush();
        bw.close();
    }

}

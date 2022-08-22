import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            String input = br.readLine();
            int score = 0;
            int inc = 0;
            String[] arr = input.split("");
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals("O")) {
                    inc++;
                    score += inc;
                } else if (arr[j].equals("X")) {
                    inc = 0;
                }
            }
            bw.write(score + "\n");
        }
        bw.flush();
        bw.close();
    }

}
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


        // Scanner 사용
//        Scanner sc = new Scanner(System.in);
//
//        int num = sc.nextInt();
//
//        for (int i = 0; i < num; i++) {
//            System.out.println(i+1);
//        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            bw.write(i+1 + "\n");
        }
        bw.flush();
        bw.close();
    }
}


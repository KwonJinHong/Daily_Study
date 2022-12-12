import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            double num = Double.parseDouble(st.nextToken());
            while(st.hasMoreTokens()){
                String oper = st.nextToken();
                if(oper.equals("@")){
                    num *= 3;
                } else if(oper.equals("%")){
                    num += 5;
                } else if(oper.equals("#")){
                    num -= 7;
                }
            }
            System.out.printf("%.2f\n", num);
        }
        br.close();
    }
}
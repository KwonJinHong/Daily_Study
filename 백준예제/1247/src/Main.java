import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 3; i++) {
            BigInteger S = new BigInteger("0");
            int N = Integer.parseInt(br.readLine());

            for(int j = 0; j < N; j++) {
                BigInteger N2 = new BigInteger(br.readLine());
                S = S.add(N2);
            }

            //compareTo(0)이 -1이면 음수, 1이면 양수, 0이면 0
            if(S.compareTo(BigInteger.ZERO) == -1) {
                System.out.println("-");
            }else if(S.compareTo(BigInteger.ZERO) == 1) {
                System.out.println("+");
            }else {
                System.out.println(0);
            }
        }
    }

}
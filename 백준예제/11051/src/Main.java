import java.io.*;

public class Main {

    public static int[][] bcVal;
    public static final int div = 10007;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        bcVal = new int[n + 1][k + 1];

        System.out.println(binomialCoefficient(n,k));

    }

    public static int binomialCoefficient(int N, int K)
    {
        //이미 값을 가지고 있는 경우 바로 값 반환 - 동적 계획법을 이용한 메모이제이션
        if (bcVal[N][K] > 0) {
            return bcVal[N][K];
        }

        // n이 0인 경우 return 1
        if(K == 0 || N == K) {
            return bcVal[N][K] = 1;
        }

        return bcVal[N][K] = (binomialCoefficient(N - 1, K - 1) + binomialCoefficient(N - 1, K)) % div;
    }
}


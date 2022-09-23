import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        bw.append(fibonacci(n)+" "+(n-2));
        bw.close();
    }


    /*
    * 동적계획법 (Dinamic Programing) 은 특정한 경우에 사용하는 알고리즘이 아니라 하나의 방버론이므로 다양한 문제해결에 쓰일 수 있다.
    * DP가 적용되기 위한 2가지 조건은 겹치는 부분 문제와 최적 부분 구조가 있다.
    * 즉 DP는 동일한 작은 문제들이 반복하여 나타나는 경우에 사용이 가능하고, 부분 문제의 최적 결과 값을 사용해 전체 문제의 최적 결과를 낼 수 있는 경우에 사용이 가능하다.
    * */

    public static int fibonacci(int n) {
        int[] fibos = new int[n+1];
        fibos[1]=fibos[2]=1;
        for(int i=3;i<=n;i++) {
            fibos[i]=fibos[i-1]+fibos[i-2];
        }
        return fibos[n];
    }
}

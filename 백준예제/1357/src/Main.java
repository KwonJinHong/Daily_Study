import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //입력값을 sb에 저장한다.
        StringBuilder sb = new StringBuilder(st.nextToken());
        //sb에 저장한 값을 뒤집는다.
        String A = sb.reverse().toString();
        //위와 동일
        sb = new StringBuilder(st.nextToken());
        String B = sb.reverse().toString();

        //뒤집은 값을 정수로 형변환해서 더해준다.
        int sum = Integer.parseInt(A) + Integer.parseInt(B);

        //더한 값을 sb에 저장한다.
        sb = new StringBuilder(String.valueOf(sum));

        //뒤집는다.
        String result = sb.reverse().toString();

        System.out.println(Integer.parseInt(result));
    }

}
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        int index = 0;
        int i = 666;

        while (true) { //
            String s = Integer.toString(i); // 현재 숫자를 문자열로 변환
            if (s.contains("666")) { // 문자열에 666이 포함이 되면 조건문 안으로 In
                if (index == testCase - 1) { // 현재 666이 포함된 숫자의 갯수가 주어진 입력과 동일하면 while 문 종료하고, 현재 순번의 종말 숫자 출력
                    System.out.println(s);
                    break;
                } else {
                    index++;
                }
            }
            i++;
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Long inputNum = Long.parseLong(br.readLine());

        Long outputNum = 0L;
        while (inputNum > 0L) {
            Long tempCnt = 0L;
            Long num = 1L;
            while (inputNum >= num * 2L) {
                num *= 2L;
                tempCnt++;
            }
            inputNum -= num;
            outputNum += myPowBy3(tempCnt);
        }
        System.out.println(outputNum);
    }

    private static Long myPowBy3(Long tempCnt) {
        Long retVal = 1L;
        for (int i=0;i<tempCnt;i++){
            retVal *= 3;
        }
        return retVal;
    }
}
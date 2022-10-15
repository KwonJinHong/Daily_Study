import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());//end of input

        int[] line = new int[N+1]; //줄에 선 순서
        for(int i = 1 ; i<= N ; i++) {
            int counts = Integer.parseInt(st.nextToken());//i: 본인 키, counts = 본인보다 왼쪽에 큰사람
            for(int j = 1; j<= N ;j ++) {
                if(counts==0) { //본인보다 키가 큰 사람이 없다-> i는 키순서로 들어오기 때문에 본인보다 큰 사람이 없다면 그자리가 본인 자리임
                    if(line[j]==0) {//자리에 아무도 없어서 줄 섰다.
                        line[j] = i;
                        break;
                    }
                    else {//본인보다 큰 사람이 왼편에 없지만 이미 누군가 자기보다 작은 사람이 서있다 -> 양보하고 다른 빈칸중 가장 가까운곳에 서면 된다
                        continue;
                    }
                }
                else if(line[j]==0) {//아직 count가 0이 아님-> 본인보다 큰 사람 존재하므로 다음칸으로 가보자
                    counts--;
                }

            }
        }
        //Print Answer:
        for(int i =1 ; i<=N ;i++) {System.out.print(line[i]+" ");}
    }

}
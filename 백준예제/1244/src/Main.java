import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine()); //스위치의 개수
        int[] switches = new int[total];
        StringTokenizer st = new StringTokenizer(br.readLine()); //스위치 string 받음
        for(int i=0; i<total; i++)
            switches[i] = Integer.parseInt(st.nextToken());

        int stuCnt = Integer.parseInt(br.readLine()); //학생의 명수
        for(int i=0; i<stuCnt; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());

            //남학생이면
            if(gender == 1) {
                for(int j=0; j<total; j++) //뽑은 수의 배수 위치에 있는 스위치의 상태를 바꾼다.
                    if((j+1) % number == 0)
                        switches[j] = switches[j] == 0? 1: 0;
            }
            //여학생이면
            else {
                //뽑은 수를 중심으로 좌우가 대칭이면 상태를 바꾼다.
                switches[number - 1] = switches[number - 1] == 0 ? 1 : 0;
                for(int j=1; j<total/2; j++) {
                    if(number - 1 + j >= total || number - 1 - j < 0)
                        break;
                    if(switches[number - 1 - j] == switches[number - 1 + j]) {
                        switches[number - 1 - j] = switches[number - 1 - j] == 0 ? 1 : 0;
                        switches[number - 1 + j] = switches[number - 1 + j] == 0 ? 1 : 0;
                    }
                    else break; //대칭 아닌것이 나오면 바로 끝낸다.
                }
            }
        }

        //한 줄에 20개씩 출력
        for(int i=0; i<total; i++) {
            System.out.print(switches[i] + " ");
            if((i+1) % 20 == 0)
                System.out.println();
        }
    }
}
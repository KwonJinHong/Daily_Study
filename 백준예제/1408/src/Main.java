import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언

        int[] now = new int[3];			//현재시간
        int[] end = new int[3];			//마감시간
        String[] diff = new String[3];	 //잔여시간


        StringTokenizer st1 = new StringTokenizer(br.readLine(),":");
        StringTokenizer st2 = new StringTokenizer(br.readLine(),":");


        int up = 0;
        for(int i = 0; i<now.length; i++) {
            now[i] =Integer.parseInt(st1.nextToken());
            end[i] =Integer.parseInt(st2.nextToken());
        }
        for(int i = 2; i>=0; i--) {

            if(i>0) {
                if(end[i]-now[i]+up<0) {
                    if(end[i]-now[i]+60+up<0) {
                        diff[i] =end[i]-now[i]+120+up+"";
                        up = -2;
                    }else {
                        diff[i] =end[i]-now[i]+60+up+"";
                        up = -1;
                    }
                }else if(end[i]-now[i]+up>=60){
                    diff[i] =end[i]-now[i]-60+up+"";
                    up = +1;
                }else {
                    diff[i] =end[i]-now[i]+up+"";
                    up = 0;
                }
            }else {
                if(end[i]-now[i]+up<0) {
                    if(end[i]-now[i]+24+up<0) {
                        diff[i] =end[i]-now[i]+48+up+"";
                    }else {
                        diff[i] =end[i]-now[i]+24+up+"";
                    }
                }else if(end[i]-now[i]+up>=24) {
                    diff[i] = (end[i]-now[i]+up)%24+"";
                }else {
                    diff[i] =end[i]-now[i]+up+"";
                }
            }
        }



        for(int i = 0; i<diff.length;i++) { //2자리로 변형
            diff[i] = String.format("%02d",(Integer.parseInt(diff[i])));
        }

        bw.write(diff[0]+":"+diff[1]+":"+diff[2]);
        bw.close();
        br.close();
    }
}
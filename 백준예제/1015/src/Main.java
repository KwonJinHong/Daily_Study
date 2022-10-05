import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Pair> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new Pair(i,Integer.parseInt(st.nextToken())));
        }

        Collections.sort(list, new Comparator<Pair>(){
            @Override
            public int compare(Pair o1, Pair o2){
                if(o1.value<o2.value){ // value 기준 오름차순
                    return -1;
                }else if(o1.value>o2.value){
                    return 1;
                }else{
                    if(o1.idx <o2.idx){
                        return -1;
                    }else{
                        return 1;
                    }
                }
            }
        });

        int[] p = new int[1001];
        for(int i=0;i<n;i++){
            p[list.get(i).idx]=i;
        }

        for(int i=0;i<n;i++){
            System.out.print(p[i]+" ");
        }

    }

    public static class Pair{
        int idx;
        int value;

        Pair(int idx,int value){
            this.idx = idx;
            this.value = value;
        }
    }
}
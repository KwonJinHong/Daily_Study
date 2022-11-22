import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(-1);
        for(int i = 1 ; i < N+1 ; i++) {
            int target = Integer.parseInt(st.nextToken());
            arr.add(i-target,i);
        }


        for(int i = 1 ; i < N +1 ; i++) {
            System.out.print(arr.get(i)+ " ");
        }


    }

}
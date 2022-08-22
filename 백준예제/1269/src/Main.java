import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        HashSet<Integer> aSet = new HashSet<>(); // A 집합 요소를 담을 HashSet
        HashSet<Integer> bSet = new HashSet<>(); // B 집합 요소를 담을 HashSet

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) { // setA에 입력 값 저장
            int num = Integer.parseInt(st.nextToken());
            aSet.add(num);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) { // setB에 입력 값 저장
            int num = Integer.parseInt(st.nextToken());
            bSet.add(num);
        }

        System.out.println(symmetricDifference(aSet, bSet) + symmetricDifference(bSet, aSet));
    }

    public static int symmetricDifference (HashSet<Integer> set1, HashSet<Integer> set2) { // set1에 set2 요소 값을 지운 수를 반환
        int result = set1.size();

        for (int i : set2) {
            if (set1.contains(i)) {
                result--;
            }
        }
        return result;
    }
}
import java.util.Scanner;

public class Main {
    static int n;
    static int[][] paper=new int[100][100];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for (int tc = 0; tc < n; tc++) {
            int x=sc.nextInt();
            int y=90-sc.nextInt();
            for (int i = y; i < y+10; i++) {
                for (int j = x; j < x+10; j++) {
                    paper[i][j]=1;
                }
            }
        }
        int cnt=0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(paper[i][j]==1) {
                    cnt+=1;
                }
            }
        }
        System.out.println(cnt);
    }
}
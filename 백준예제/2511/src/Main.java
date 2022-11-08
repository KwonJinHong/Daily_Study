import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int aScore = 0;
        int bScore = 0;

        for(int i=0; i<10; i++)
            A[i] = scan.nextInt();
        for(int i=0; i<10; i++)
            B[i] = scan.nextInt();

        for(int i=0; i<10; i++) {
            if(A[i] > B[i])
                aScore += 3;
            else if(A[i] == B[i]) {
                aScore +=1;
                bScore +=1;
            }
            else
                bScore += 3;
        }

        System.out.println(aScore + " " + bScore);
        if(aScore > bScore)	// A > B => A 출력
            System.out.println("A");
        else if(aScore == bScore) { // A = B => 승부가 난 라운드 비교
            boolean flag = true;
            for(int i=9; i>=0; i--) {
                if(A[i] > B[i]) {
                    System.out.println("A");
                    flag = false;
                    break;
                }
                else if(B[i] > A[i]) {
                    System.out.println("B");
                    flag = false;
                    break;
                }
            }
            if(flag)
                System.out.println("D");
        }
        else
            System.out.println("B");

        scan.close();
    }
}
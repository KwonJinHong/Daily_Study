import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            System.out.println("$"+ (String.format("%.2f",(a*350.34 + b*230.90 + c*190.55 + d*125.30 + e*180.90))));
        }
    }
}
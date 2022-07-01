
import java.util.Scanner;

public class ConsoleInputOutput {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수 : ");
		num1 = sc.nextInt();
		System.out.println("두번째 정수 : ");
		num2 = sc.nextInt();
		
		System.out.println("첫번째 정수 : " + num1);
		System.out.println("두번째 정수 : " + num2);
		System.out.print("두 수의 합  : ");
		System.out.println(num1 + num2);

	}

}

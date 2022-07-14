
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Coloque um num");
		int num1 = sc.nextInt();
		
		System.out.println("Coloque outro num");
		int num2 = sc.nextInt(); 
		
		System.out.println("O resultado da subtração é:" + (num1 - num2));

		sc.close();
	}

}

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b;

		System.out.println("Coloque um n�mero: ");
		a = sc.nextInt();
		while (a == 0) {
			System.out.println("O primeiro n�mero n�o pode ter o valor nulo: ");
			System.out.println("Coloque novamente o valor nulo: ");
			a = sc.nextInt();
		}
		System.out.println("Coloque um n�mero: ");
		b = sc.nextInt();
		System.out.println("Divis�o: " + (a / b));
		sc.close();
		}
}
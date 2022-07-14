import java.util.Scanner;

public class J {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantidade");
		double valor = sc.nextDouble();

		double euro = valor / 5.23;

		double dolar = valor / 4.97;

		double libra = valor / 6.25;

		System.out.println("Euros: " + euro + "\nDólares: " + dolar + "\nLibras: " + libra);

		sc.close();

	}
}
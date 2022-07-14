import java.util.Scanner;

public class G {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int multiplicacao, x, n;

		System.out.println("Coloque um número de 1 a 10 para que imprimida a tabuada!");
		n = sc.nextInt();
		sc.close();

		for (x = 1; x <= 10; x++) {
			multiplicacao = n * x;
			System.out.println(n + "x" + x + " = " + multiplicacao);
}
}
}

import java.util.Scanner;

public class M {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double S, K;
		
		System.out.println("Qual o valor do salário mínimo: ");
		S = sc.nextDouble();
		
		System.out.println("Quantidade em quilowatts: ");
		K = sc.nextDouble();
		
		double C = S / 5;
		System.out.println("O custo de cada quilowatt: " + C);
		System.out.println("O custo total: " + (C * K));
		double D = (C*K) * 0.15;
		System.out.println("Desconto: " + ((C * K) - D));
		sc.close();

	}
}

import java.util.Scanner;

public class I {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double H, S, E;
		
		System.out.println("Qual o valor do salário mínimo: ");
		S = sc.nextDouble();
		
		System.out.println("Quantas horas foram trabalhadas: ");
		H = sc.nextDouble();
		
		System.out.println("Hora extra: ");
		E = sc.nextDouble();
	
		double trabalhadas = S / 8;
		
		double extra = S / 4;
		
		double bruto = H * trabalhadas;
		
		double HorasExtras = E * extra;
		
		double resultado = bruto + HorasExtras;
		
		System.out.println("O valor do salário total é: " + resultado);
		
		sc.close();
}
}
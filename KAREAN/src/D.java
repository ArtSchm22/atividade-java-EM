import java.util.Scanner;

public class D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valor;
		
		System.out.println("Qual o valor do produto selecionado: ");
		valor = sc.nextDouble();
		
		double desconto = valor * 0.01;
		
		System.out.println("O valor novo do produto é: " + (valor - desconto));
		sc.close();
}
}
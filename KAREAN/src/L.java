import java.util.Scanner;

public class L {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double T, I, total = 0;
		int c = 0;
		
		System.out.println("Qual o valor custado para o teatro: ");
		T = sc.nextDouble();
		
		System.out.println("Qual o valor do ingresso: ");
		I = sc.nextDouble();
		
		sc.close();
		do {
			total += I;
			c++;
		}while(T > total);
		System.out.println("Total de ingresso: " + c);

}
}

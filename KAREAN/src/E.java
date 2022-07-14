import java.util.Scanner;

public class E {
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Coloque o valor do seu salário");
		double salario = sc.nextInt();
		
		System.out.println("Coloque o valor das suas vendas");
		double vendas = sc.nextInt();
		
		double comissao = vendas*0.04;
		double salarioFinal = salario + comissao;
		
		System.out.println("A comissão é de: " + comissao + "\n" + "O salário final é: " + salarioFinal);
		
		sc.close();
		
		
		
		
		
		
	}

}

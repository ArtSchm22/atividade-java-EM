import java.util.Scanner;

public class E {
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Coloque o valor do seu sal�rio");
		double salario = sc.nextInt();
		
		System.out.println("Coloque o valor das suas vendas");
		double vendas = sc.nextInt();
		
		double comissao = vendas*0.04;
		double salarioFinal = salario + comissao;
		
		System.out.println("A comiss�o � de: " + comissao + "\n" + "O sal�rio final �: " + salarioFinal);
		
		sc.close();
		
		
		
		
		
		
	}

}

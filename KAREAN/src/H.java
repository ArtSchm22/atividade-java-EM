import java.util.Scanner;

public class H {
	public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
System.out.println("coloque seu salário: ");
double salario = sc.nextDouble();

System.out.println("Coloque o valor da conta 1");
double conta1 = sc.nextDouble();

System.out.println("Coloque o valor da conta 2");
double conta2 = sc.nextDouble();

double restoSalario = salario - ((conta1*1.02) + (conta2*1.02));

System.out.println("O valor que restou foi: "+ restoSalario);

sc.close();

}
}
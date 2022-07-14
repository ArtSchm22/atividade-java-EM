import java.util.Scanner;

public class numeroMaior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N1, N2;

        System.out.println("Coloque um numero: ");
        N1 = sc.nextDouble();
        System.out.println("Coloqye um numero: ");
        N2 = sc.nextDouble();

        if(N1 > N2){
            System.out.println("O maior número é: " + N1);
        }
        if(N2 > N1){
            System.out.println("O maior número é: " + N2);
        }
    }

}

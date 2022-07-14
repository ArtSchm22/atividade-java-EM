import java.util.Scanner;

public class mediaAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N1, N2, N3;
        System.out.println("Coloque uma nota: ");
        N1 = sc.nextDouble();
        System.out.println("Coloque uma nota: ");
        N2 = sc.nextDouble();
        System.out.println("Coloque uma nota: ");
        N3 = sc.nextDouble();

        double media = (N1 + N2 + N3)/3;

        if(media > 0 && media < 3){
            System.out.println("Você foi Reprovado");
        }
        if(media >= 3 && media > 7){
            System.out.println("Você está em Exame");
        }
        if(media >= 7 && media <= 10){
            System.out.println("Você foi Aprovado");
        }
    }
}

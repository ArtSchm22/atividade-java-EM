import java.util.Scanner;

public class mediaPoderada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double N1, N2, N3;
        System.out.println("Coloque um numero: ");
        N1 = sc.nextDouble();
        System.out.println("Coloque um numero: ");
        N2 = sc.nextDouble();
        System.out.println("Coloque um numero: ");
        N3 = sc.nextDouble();
        double media = ((2 * N1) + (3 * N2) + (5 * N3)) / 10;
        System.out.println(media);
        if (media >= 8 && media <= 10) {
            System.out.println("Conceito A");
        }
        if (media > 8 && media <= 8) {
            System.out.println("Conceito B");
        }
        if (media > 6 && media <= 7) {
            System.out.println("Conceito C");
        }
        if (media > 5 && media <= 6) {
            System.out.println("Conceito D");
        }
        if (media > 0 && media <= 5) {
            System.out.println("Conceito E");
        }
    }
}

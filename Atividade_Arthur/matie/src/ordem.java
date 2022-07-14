import java.util.Scanner;

public class ordem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N1, N2, N3, p1, p2, p3;

        System.out.println("Coloque um numero: ");
        N1 = sc.nextDouble();
        System.out.println("Coloque um numero: ");
        N2 = sc.nextDouble();
        System.out.println("Coloque um numero: ");
        N3 = sc.nextDouble();

        if(N1 > N2 && N1 > N3){
           p1 = N1;
        }
        if(N2 > N1 && N2 > N3){
           p2 = N2;
        }
        if(N3 > N1 && N3 > N2){
            p3 = N3;
        }
    }
}

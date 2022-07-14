import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque numero: ");
        int numero = sc.nextInt();
        int i = 2;
        int divisoes = 0;
        do{
            if(numero % i == 0){
                divisoes++;
            }
            i++;
        }while(i<numero);
        if(divisoes == 0 ){
            System.out.println(numero+" O numero é primo");
        }
        else {
            System.out.println(numero + " O numero nao é primo");
        }

        sc.close();
    }
}
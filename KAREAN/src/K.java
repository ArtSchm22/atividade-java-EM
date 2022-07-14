import java.util.Scanner;

public class K {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double horas, minutos;
        
        System.out.println("horas: ");
        horas = sc.nextDouble();
        
        System.out.println("minutos: ");
        minutos = sc.nextDouble();
        
        horas = horas * 60;
        minutos = minutos + horas;
        double s = minutos * 60;
        System.out.println("Segundos: " + s);
        sc.close();
    }

}

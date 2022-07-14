import java.util.Scanner;

public class q2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int idade, contador = 0, contadorPeso = 0;
        double peso, altura, alturaTotal = 0, time1 = 0, time2 = 0;

        for (int cont = 0; cont < 2; cont++) {
            for (int j = 0; j < 11; j++) {
                System.out.println("Qual é a sua idade?: ");
                idade = sc.nextInt();
                System.out.println("Qual é o seu peso?: ");
                peso = sc.nextDouble();
                System.out.println("Qual é a sua altura?: ");
                altura = sc.nextDouble();
                if(idade < 18){
                    contador++;
                }
                if(cont == 0){
                    time1 += idade;
                } else {
                    time2 += idade;
                }
                if(peso > 80){
                    contadorPeso++;
                }
                alturaTotal += altura;
            }
        }
        System.out.println("Jogadores com idade inferior a 18: " + contador);

        System.out.println("media de idade do time1: " + (time1/11));

        System.out.println("media de idade do time2: " + (time2/11));

        System.out.println("Media de altura dos jodadores: " + (alturaTotal/22));

        System.out.println("Percentual de jogadores com mais de 80KG: " + (contadorPeso*100/22) + "%");
    }
}
package ExerciciosLoop;

import java.util.Scanner;

public class Exercicio03 {
    static void main(String[] args) {
        //Usando while
        int contador = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual tabuada você deseja ver? ");
        int numero = sc.nextInt();

        System.out.println("Até qual número você deseja ver? ");
        int tabuadaMaxima = sc.nextInt();

        while (contador <= tabuadaMaxima) {
            System.out.printf("%d * %d = %d %n", numero, contador, contador * numero);
            contador++;
        }
    }
}

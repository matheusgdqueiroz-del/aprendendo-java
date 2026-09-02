package basico;

import java.util.Scanner;

public class EstruturaDeRepeticaoParte01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual tabuada você deseja ver? ");
        int numero = sc.nextInt();

        System.out.println("Até qual número você deseja ver? ");
        int tabuadaMaxima = sc.nextInt();

        for(int contador = 0; contador <= tabuadaMaxima; contador++) {
            //Número x contador = contador * numero
            System.out.printf("%d * %d = %d %n", numero, contador, contador * numero);

            // System.out.println(numero + " * " + contador + " = " + contador * numero);
        }
    }
}

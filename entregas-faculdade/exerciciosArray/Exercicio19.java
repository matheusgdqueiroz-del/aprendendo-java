package exerciciosArray;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio19 {
    /*
    19. Trocar primeiro e último valor
Enunciado:
Peça 5 números. Depois troque o primeiro valor com o último e mostre o array alterado.

O que precisa fazer:
Guardar temporariamente o primeiro valor antes da troca.

Dicas:
Use uma variável auxiliar, por exemplo temporario.
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = sc.nextDouble();
        }
        double temporario = numeros[0];
        numeros[0] = numeros[numeros.length - 1];
        numeros[numeros.length - 1] = temporario;

        System.out.println(Arrays.toString(numeros));

        sc.close();
    }
}

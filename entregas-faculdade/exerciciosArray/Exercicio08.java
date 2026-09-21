package exerciciosArray;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio08 {
    /*
    8. Contar ímpares
Enunciado:
Peça 10 números inteiros e conte quantos deles são ímpares.

O que precisa fazer:
Percorrer o array e contar os números que não são divisíveis por 2.

Dicas:
Um número é ímpar quando numero % 2 != 0.
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = sc.nextInt();
        }

        int qtdImpares = 0;
        ArrayList<Integer> impares = new ArrayList<>();

        for (int numero : numeros) {
            if (numero % 2 != 0) {
                qtdImpares += 1;
                impares.add(numero);
            }
        }
        System.out.printf("""
                Existem %d impares, eles são: 
                """, qtdImpares);
        for (int numero : impares) {
            System.out.print(numero + " ");
        }

        sc.close();
    }
}

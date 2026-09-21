package exerciciosArray;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio07 {
    /*
    7. Contar pares
Enunciado:
Peça 10 números inteiros e conte quantos deles são pares.

O que precisa fazer:
Percorrer o array e verificar quais números têm resto da divisão por 2 igual a 0.

Dicas:
Use %.
Um número é par quando numero % 2 == 0.
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = sc.nextInt();
        }

        int qtdPares = 0;
        ArrayList<Integer> pares = new ArrayList<>();

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                qtdPares += 1;
                pares.add(numero);
            }
        }
        System.out.printf("""
                Existem %d pares, eles são: 
                """, qtdPares);
        for (int numero : pares) {
            System.out.print(numero + " ");
        }

        sc.close();
    }
}

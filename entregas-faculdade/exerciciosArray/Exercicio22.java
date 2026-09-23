package exerciciosArray;

import java.util.Scanner;

public class Exercicio22 {
    /*
    22. Comparar dois arrays
Enunciado:
Peça os valores de dois arrays com 5 posições cada. Verifique se eles são iguais.

O que precisa fazer:
Dois arrays são iguais quando todos os valores estão nas mesmas posições.

Dicas:
Use uma variável iguais = true.
Se encontrar uma posição diferente, mude para false.
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros1 = new double[5];

        for (int i = 0; i < numeros1.length; i++) {
            System.out.printf("Digite o %dº número do 1º array: ", i + 1);
            numeros1[i] = sc.nextDouble();
        }

        double[] numeros2 = new double[5];

        for (int i = 0; i < numeros2.length; i++) {
            System.out.printf("Digite o %dº número do 2º array: ", i + 1);
            numeros2[i] = sc.nextDouble();
        }

        boolean iguais = true;

        for (int i = 0; i < numeros1.length; i++) {
            if(numeros2[i] != numeros1[i]) {
                iguais = false;
                break;
            }
        }
        if(iguais) {
            System.out.println("Ambos os arrays são iguais");
        } else{
            System.out.println("Os arrays são diferentes");
        }

        sc.close();
    }
}

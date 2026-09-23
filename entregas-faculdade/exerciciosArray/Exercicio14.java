package exerciciosArray;

import java.util.Scanner;

public class Exercicio14 {
    /*
    14. Mostrar valores ao contrário
Enunciado:
Peça 6 números e depois mostre os valores na ordem inversa.

O que precisa fazer:
Preencher o array normalmente e depois imprimir começando da última posição.

Dicas:
O último índice é array.length - 1.
O for pode começar no último índice e ir diminuindo.
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[6];
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº numero: ", i + 1);
            numeros[i] = sc.nextDouble();
        }

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        sc.close();
    }
}

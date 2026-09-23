package exerciciosArray;

import java.util.Scanner;

public class Exercicio24 {
    /*
    24. Somar apenas os pares
Enunciado:
Peça 10 números e mostre a soma apenas dos números pares.

O que precisa fazer:
Verificar se o número é par antes de somar.

Dicas:
Use if (numeros[i] % 2 == 0).
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = sc.nextInt();
        }

        int soma = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                soma += numero;
            }
        }
        System.out.println("A soma dos números pares é: " + soma);

        sc.close();
    }
}

package exerciciosArray;

import java.util.Scanner;

public class Exercicio09 {
    /*
    9. Positivos, negativos e zeros
Enunciado:
Peça 10 números e mostre quantos são positivos, negativos e zeros.

O que precisa fazer:
Usar if, else if e else para classificar cada número.

Dicas:
Número positivo é maior que 0.
Número negativo é menor que 0.
Zero é igual a 0.
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = sc.nextDouble();
        }

        int positivos = 0;
        int negativos = 0;
        int igualZero = 0;

        for (double numero : numeros) {
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                igualZero++;
            }
        }
        System.out.printf("""
                Positivos: %d
                Negativos: %d
                Zeros : %d
                """, positivos, negativos, igualZero);
        sc.close();
    }
}

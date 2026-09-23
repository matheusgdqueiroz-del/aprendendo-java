package exerciciosArray;

import java.util.Scanner;

public class Exercicio20 {
    /*
    20. Verificar número repetido
Enunciado:
Peça 6 números e informe se existe algum número repetido.

O que precisa fazer:
Comparar cada posição com as próximas posições.

Dicas:
Use um for dentro de outro for.
Compare numeros[i] com numeros[j].
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = sc.nextDouble();
        }

        for (int i = 0; i < numeros.length; i++) {

            for (int j = i + 1; j < numeros.length; j++) {
                if(numeros[j] == numeros[i]) {
                    System.out.printf("%.0f é duplicado ", numeros[j]);
                }
            }
        }

        sc.close();
    }
}

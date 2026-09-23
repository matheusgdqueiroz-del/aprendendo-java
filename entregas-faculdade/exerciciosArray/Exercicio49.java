package exerciciosArray;

import java.util.Scanner;

public class Exercicio49 {
    /*
    49. Vendas por vendedor
Enunciado:
Crie uma matriz com 3 vendedores e 4 vendas para cada vendedor.

Depois mostre o total vendido por cada vendedor e informe qual vendedor vendeu mais.

O que precisa fazer:
Cada linha representa um vendedor.
Cada coluna representa uma venda.

Dicas:
Some cada linha separadamente.
Compare o total de cada vendedor para descobrir o maior.
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] vendas = new double[3][4];

        for (int i = 0; i < vendas.length; i++) {
            for (int j = 0; j < vendas[i].length; j++) {
                System.out.printf("Digite a %dª venda do %dº vendedor: ", j + 1, i + 1);
                vendas[i][j] = sc.nextDouble();
            }
        }
        

        sc.close();
    }
}

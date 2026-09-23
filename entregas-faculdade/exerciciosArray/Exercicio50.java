package exerciciosArray;

import java.util.Scanner;

public class Exercicio50 {
    /*
    50. Estoque por loja
Enunciado:
Crie uma matriz com 3 lojas e 5 produtos.

Cada linha representa uma loja.
Cada coluna representa um produto.

Peça a quantidade de cada produto em cada loja.

No final, mostre:

Total de produtos por loja.
Total de cada produto somando todas as lojas.
Qual loja tem mais produtos no estoque.

O que precisa fazer:
Somar por linha, somar por coluna e comparar os totais das lojas.

Dicas:
Para total por loja, some as colunas de uma linha.
Para total por produto, some as linhas de uma coluna.
Use variáveis auxiliares para guardar o maior total.
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] estoque = new int[3][5];

        for (int i = 0; i < estoque.length; i++) {
            for (int j = 0; j < estoque[i].length; j++) {
                System.out.printf("Digite a quantidade do %dº produto na %dª loja: ", j + 1, i + 1);
                estoque[i][j] = sc.nextInt();
            }
        }
        

        sc.close();
    }
}

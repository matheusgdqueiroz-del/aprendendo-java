package exerciciosArray;

import java.util.Scanner;

public class Exercicio29 {
    /*
    29. Menu de busca
Enunciado:
Cadastre 5 produtos em um array. Depois mostre um menu para o usuário escolher:

Listar todos os produtos
Buscar produto pelo nome
Mostrar quantidade de produtos cadastrados
O que precisa fazer:
Usar switch para controlar a opção escolhida.

Dicas:
Use produtos.length para mostrar a quantidade.
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] produtos = new String[5];

        for (int i = 0; i < produtos.length; i++) {
            System.out.printf("Digite o nome do %dº produto: ", i + 1);
            produtos[i] = sc.nextLine();
        }

        System.out.printf("""
                Escolha uma opção:
                1 - Listar todos os produtos
                2 - Buscar produto pelo nome
                3 - Mostrar a quantidade de produtos cadastrados               
                """);
        int input = sc.nextInt();
        sc.nextLine();

        switch (input) {
            case 1 :
                for (String produto : produtos) {
                    System.out.println(produto);
                }
                break;

            case 2 :
                System.out.print("Digite o nome do produto: ");
                String pesquisa = sc.nextLine();
                boolean encontrado = false;
                for (String produto : produtos) {
                    if (pesquisa.equalsIgnoreCase(produto)) {
                        encontrado = true;
                        break;
                    }
                }
                if (encontrado) {
                    System.out.println("Produto encontrado!");
                } else {
                    System.out.println("Produto não encontrado!");
                }
                break;

            case 3 :
                System.out.printf("Existem %d produtos cadastrado", produtos.length);
                break;

            default :
                System.out.println("Opção inválida!");
        }


        sc.close();
    }
}

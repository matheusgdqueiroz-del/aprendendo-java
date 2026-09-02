
package faccat;

import java.util.Scanner;

public class Exercicio10 {
    /*
    O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
    distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
    seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
    calcular e escrever o custo final ao consumidor.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double PERCENTUAL_DISTRIBUIDOR = 28;
        final double IMPOSTOS = 45;

        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = sc.nextDouble();

        double custoFinal = custoFabrica *
                (1 + PERCENTUAL_DISTRIBUIDOR / 100 + IMPOSTOS / 100);

        System.out.printf("""
                O custo de fábrica do carro é R$ %.2f
                Adicionando os %.0f%% da distribuidora e os %.0f%% de impostos:
                O custo final para o consumidor é R$ %.2f
                """,
                custoFabrica,
                PERCENTUAL_DISTRIBUIDOR,
                IMPOSTOS,
                custoFinal
        );

        sc.close();
    }
}


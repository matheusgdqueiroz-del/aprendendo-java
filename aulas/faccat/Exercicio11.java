package faccat;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        /*
        Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
        mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
        efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
        vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
        vendedor.
         */

        Scanner sc = new Scanner(System.in);

        final double COMISSAO_VENDAS = 5;

        System.out.print("Digite o número de carros vendidos: ");
        int carrosVendidos = sc.nextInt();

        System.out.print("Digite o valor total das vendas: R$ ");
        double valorVendas = sc.nextDouble();

        System.out.print("Digite o salário fixo: R$ ");
        double salarioFixo = sc.nextDouble();

        System.out.print("Digite o valor da comissão por carro vendido: R$ ");
        double comissaoPorCarro = sc.nextDouble();

        double salarioFinal = salarioFixo
                + (carrosVendidos * comissaoPorCarro)
                + (valorVendas * COMISSAO_VENDAS / 100);

        System.out.printf("""
                Salário fixo: R$ %.2f
                Carros vendidos: %d
                Valor total das vendas: R$ %.2f
                Salário final: R$ %.2f
                """,
                salarioFixo,
                carrosVendidos,
                valorVendas,
                salarioFinal
        );

        sc.close();
    }
}
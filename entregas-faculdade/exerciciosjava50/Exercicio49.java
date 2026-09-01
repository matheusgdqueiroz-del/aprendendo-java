package exerciciosjava50;

import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        /*
         * Parte 6 — Switch case
         *
         * 49. Posto de combustível
         * Mostre as opções:
         *
         * 1: gasolina — R$ 5,80
         * 2: etanol — R$ 4,20
         * 3: diesel — R$ 6,00
         *
         * Peça o tipo de combustível e a quantidade de litros.
         *
         * Use switch case para definir o preço por litro.
         *
         * Depois mostre o valor total a pagar.
         *
         */
        Scanner sc = new Scanner(System.in);

        int tipoCombustivel;
        double litros;
        double precoPorLitro = 0;
        String combustivel = "";
        boolean tipoValido = true;

        System.out.println("1 - Gasolina: R$ 5,80");
        System.out.println("2 - Etanol: R$ 4,20");
        System.out.println("3 - Diesel: R$ 6,00");

        System.out.println("Digite o tipo de combustível: ");
        tipoCombustivel = sc.nextInt();

        System.out.println("Digite a quantidade de litros: ");
        litros = sc.nextDouble();

        switch(tipoCombustivel) {
            case 1:
                combustivel = "Gasolina";
                precoPorLitro = 5.80;
                break;
            case 2:
                combustivel = "Etanol";
                precoPorLitro = 4.20;
                break;
            case 3:
                combustivel = "Diesel";
                precoPorLitro = 6.00;
                break;
            default:
                tipoValido = false;
        }

        if(tipoValido) {
            System.out.println("Combustível: " + combustivel);
            System.out.println("Valor total: R$ " + (precoPorLitro * litros));
        } else {
            System.out.println("Tipo de combustível inválido.");
        }

        sc.close();
    }
}

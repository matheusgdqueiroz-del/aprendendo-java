package exerciciosSwitch;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        /*
         * Posto de combustível
         *
         * Escolha o tipo de combustível e informe a quantidade de litros.
         * 1 - Gasolina: R$ 5,89 por litro
         * 2 - Etanol: R$ 3,99 por litro
         * 3 - Diesel: R$ 6,19 por litro
         *
         * Calcule o valor total a pagar usando switch.
         */
        Scanner sc = new Scanner(System.in);

        int tipoCombustivel;
        double litros;
        double precoPorLitro = 0;
        String combustivel = "";

        System.out.printf("""
                1 - Gasolina: R$ 5,89
                2 - Etanol: R$ 3,99
                3 - Diesel: R$ 6,19
                """);

        System.out.println("Digite o tipo de combustível: ");
        tipoCombustivel = sc.nextInt();

        System.out.println("Digite a quantidade de litros: ");
        litros = sc.nextDouble();

        switch(tipoCombustivel) {
            case 1:
                combustivel = "Gasolina";
                precoPorLitro = 5.89;
                break;
            case 2:
                combustivel = "Etanol";
                precoPorLitro = 3.99;
                break;
            case 3:
                combustivel = "Diesel";
                precoPorLitro = 6.19;
                break;
            default:
                System.out.printf("Tipo de combustível inválido%n");
                sc.close();
                return;
        }

        System.out.printf("""
                ============================
                POSTO DE COMBUSTÍVEL
                ============================
                Combustível: %s
                Litros: %.2f
                Valor total: R$ %.2f
                ============================
                """,
                combustivel, litros, litros * precoPorLitro);

        sc.close();
    }
}

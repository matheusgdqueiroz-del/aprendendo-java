package exerciciosSwitch;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        /*
         * Estacionamento
         *
         * Escolha o tipo de veículo e informe a quantidade de horas:
         * 1 - Moto: R$ 5,00 por hora
         * 2 - Carro: R$ 10,00 por hora
         * 3 - Caminhonete: R$ 15,00 por hora
         *
         * Se ficar mais de 5 horas, aplique uma taxa adicional de R$ 10,00.
         */
        Scanner sc = new Scanner(System.in);

        int tipoVeiculo;
        int horas;
        double precoPorHora = 0;
        double taxaAdicional;
        String veiculo = "";

        System.out.printf("""
                1 - Moto: R$ 5,00 por hora
                2 - Carro: R$ 10,00 por hora
                3 - Caminhonete: R$ 15,00 por hora
                """);

        System.out.println("Digite o tipo de veículo: ");
        tipoVeiculo = sc.nextInt();

        System.out.println("Digite a quantidade de horas: ");
        horas = sc.nextInt();

        switch(tipoVeiculo) {
            case 1:
                veiculo = "Moto";
                precoPorHora = 5;
                break;
            case 2:
                veiculo = "Carro";
                precoPorHora = 10;
                break;
            case 3:
                veiculo = "Caminhonete";
                precoPorHora = 15;
                break;
            default:
                System.out.printf("Tipo de veículo inválido%n");
                sc.close();
                return;
        }

        taxaAdicional = horas > 5 ? 10 : 0;
        System.out.printf("""
                ============================
                ESTACIONAMENTO
                ============================
                Veículo: %s
                Horas: %d
                Taxa adicional: R$ %.2f
                Valor total: R$ %.2f
                ============================
                """,
                veiculo, horas, taxaAdicional, (precoPorHora * horas) + taxaAdicional);

        sc.close();
    }
}

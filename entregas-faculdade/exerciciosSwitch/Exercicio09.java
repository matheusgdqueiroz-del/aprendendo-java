package exerciciosSwitch;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        /*
         * Serviço de banho e tosa
         *
         * Serviços:
         * 1 - Banho
         * 2 - Tosa
         * 3 - Banho e tosa
         *
         * Portes:
         * 1 - Pequeno
         * 2 - Médio
         * 3 - Grande
         *
         * Use switch para escolher o serviço e o valor de acordo com o porte.
         */
        Scanner sc = new Scanner(System.in);

        int tipoServico;
        int porteAnimal;
        double valor = 0;
        String servico = "";
        String porte = "";

        System.out.printf("1 - Banho%n2 - Tosa%n3 - Banho e tosa%n");
        System.out.println("Digite o serviço escolhido: ");
        tipoServico = sc.nextInt();

        System.out.printf("1 - Pequeno%n2 - Médio%n3 - Grande%n");
        System.out.println("Digite o porte do animal: ");
        porteAnimal = sc.nextInt();

        switch(porteAnimal) {
            case 1:
                porte = "Pequeno";
                break;
            case 2:
                porte = "Médio";
                break;
            case 3:
                porte = "Grande";
                break;
            default:
                System.out.printf("Porte do animal inválido%n");
                sc.close();
                return;
        }

        switch(tipoServico) {
            case 1:
                servico = "Banho";
                switch(porteAnimal) {
                    case 1:
                        valor = 40;
                        break;
                    case 2:
                        valor = 55;
                        break;
                    case 3:
                        valor = 70;
                        break;
                }
                break;
            case 2:
                servico = "Tosa";
                switch(porteAnimal) {
                    case 1:
                        valor = 50;
                        break;
                    case 2:
                        valor = 65;
                        break;
                    case 3:
                        valor = 80;
                        break;
                }
                break;
            case 3:
                servico = "Banho e tosa";
                switch(porteAnimal) {
                    case 1:
                        valor = 85;
                        break;
                    case 2:
                        valor = 110;
                        break;
                    case 3:
                        valor = 140;
                        break;
                }
                break;
            default:
                System.out.printf("Serviço inválido%n");
                sc.close();
                return;
        }

        System.out.printf("""
                ============================
                BANHO E TOSA
                ============================
                Serviço: %s
                Porte: %s
                Valor total: R$ %.2f
                ============================
                """,
                servico, porte, valor);

        sc.close();
    }
}

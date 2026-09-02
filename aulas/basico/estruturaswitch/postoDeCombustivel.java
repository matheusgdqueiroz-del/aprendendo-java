package flamingo.aprendendo.basico.estruturaswitch;

import java.util.Scanner;

public class postoDeCombustivel {
    public static void main(String[] args) {
        double valorTotal;
        String combustivel;

        Scanner sc = new Scanner(System.in);

        System.out.printf("""
                Digite o tipo de combustível: 
                1-Gasolina
                2-Etanol
                
                3-Diesel 
                """);
        int tipoCombustivel = sc.nextInt();

        System.out.print("Digite a quantidade de litros: ");
        double litros = sc.nextDouble();


        switch (tipoCombustivel) {
            case 1:
                combustivel = "Gasolina";
                valorTotal = litros * 5.89;
                break;

            case 2:
                combustivel = "Etanol";
                valorTotal = litros * 3.99;
                break;

            case 3:
                combustivel = "Diesel";
                valorTotal = litros * 6.19;
                break;

            default:
                System.out.println("Tipo de combustível inválido");
                return;
        }

        System.out.printf("""
        ==============================
             RESUMO DO ABASTECIMENTO
        ==============================
        Combustível:       %s
        Litros:            %.1f L
        Valor total:       R$ %.2f
        ==============================
        """, combustivel, litros, valorTotal);;

        sc.close();
    }
}
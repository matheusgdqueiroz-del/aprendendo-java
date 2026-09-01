package exerciciosjava50;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        /*
         * Parte 3 — Decisões com if e else
         *
         * 29. Desconto na compra
         * Peça o valor da compra.
         *
         * Se o valor for maior ou igual a 200, aplique 10% de desconto.
         *
         * Caso contrário, mantenha o valor original.
         *
         * No final, mostre o valor final da compra.
         *
         */
        Scanner sc = new Scanner(System.in);

        double valorCompra;

        System.out.println("Digite o valor da compra: ");
        valorCompra = sc.nextDouble();

        if(valorCompra >= 200) {
            valorCompra *= 0.90;
            System.out.printf("Você recebeu 10%% de desconto, o total é: R$%.2f", valorCompra);
        } else {
            System.out.printf("O total é: %.2f", valorCompra);
        }

        sc.close();
    }
}

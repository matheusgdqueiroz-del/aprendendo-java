package exerciciosSwitch;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        /*
         * Calculadora simples
         *
         * Informe dois números e escolha uma operação:
         * 1 - Soma
         * 2 - Subtração
         * 3 - Multiplicação
         * 4 - Divisão
         *
         * Use switch para realizar a operação escolhida.
         */
        Scanner sc = new Scanner(System.in);

        int operacao;
        double numero01;
        double numero02;
        double resultado = 0;

        System.out.println("Digite o primeiro número: ");
        numero01 = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        numero02 = sc.nextDouble();

        System.out.printf("1 - Soma%n2 - Subtração%n3 - Multiplicação%n4 - Divisão%n");

        System.out.println("Digite a operação escolhida: ");
        operacao = sc.nextInt();

        switch(operacao) {
            case 1:
                resultado = numero01 + numero02;
                break;
            case 2:
                resultado = numero01 - numero02;
                break;
            case 3:
                resultado = numero01 * numero02;
                break;
            case 4:
                if(numero02 == 0) {
                    System.out.printf("Não é possível dividir por zero%n");
                    sc.close();
                    return;
                } else {
                    resultado = numero01 / numero02;
                }
                break;
            default:
                System.out.printf("Operação inválida%n");
                sc.close();
                return;
        }

        System.out.printf("""
                ============================
                CALCULADORA
                ============================
                Resultado: %.2f
                ============================
                """,
                resultado);

        sc.close();
    }
}

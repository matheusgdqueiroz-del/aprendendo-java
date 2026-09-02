package exerciciosjava50;

import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        /*
         * Parte 6 — Switch case
         *
         * 48. Calculadora simples
         * Peça dois números para o usuário.
         *
         * Depois mostre o menu:
         *
         * 1: soma
         * 2: subtração
         * 3: multiplicação
         * 4: divisão
         *
         * Use switch case para executar a operação escolhida.
         *
         * Se for divisão, verifique se o segundo número é diferente de zero.
         *
         */
        Scanner sc = new Scanner(System.in);

        double numero1;
        double numero2;
        double resultado = 0;
        int opcao;
        String mensagem = "";

        System.out.println("Digite o primeiro número: ");
        numero1 = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        numero2 = sc.nextDouble();

        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        System.out.println("Digite a operação escolhida: ");
        opcao = sc.nextInt();

        switch(opcao) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                if(numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    mensagem = "Não é possível dividir por zero.";
                }
                break;
            default:
                mensagem = "Operação inválida.";
        }

        if(mensagem.isEmpty()) {
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println(mensagem);
        }

        sc.close();
    }
}

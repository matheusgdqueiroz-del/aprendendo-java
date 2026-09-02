package exerciciosjava50;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        /*
         * Parte 1 — Aquecimento com entrada de dados
         *
         * 10. Dados de um funcionário
         * Peça o nome, o cargo, o salário e se o funcionário está ativo na empresa.
         *
         * Depois exiba uma mensagem com todos esses dados.
         *
         */
        Scanner sc = new Scanner(System.in);

        String nome, cargo, status;
        double salario;

        System.out.print("Digite o nome do funcionário: ");
        nome = sc.nextLine();
        System.out.print("Digite o cargo do funcionário: ");
        cargo = sc.nextLine();
        System.out.print("Digite o salário do funcionário: ");
        salario = sc.nextDouble(); // NextDouble deixa o "ENTER" como rastro
        sc.nextLine(); // Coletamos esse enter pra pegar o dado correto no próximo nextLine
        System.out.print("O funcionário está ativo? (S/N): ");
        status = sc.nextLine();

        switch(status.toUpperCase()) {
            case "S":
                status = "Ativo";
                break;
            case "N":
                status = "Inativo";
                break;
            default:
                status = "Entrada inválida";
        }

        System.out.printf("""
                CADASTRO DO FUNCIONARIO
                =======================
                Nome: %s
                Cargo: %s
                Salario: R$%.2f
                Status: %s
                =======================
                """, nome, cargo, salario, status);

        sc.close();
    }
}

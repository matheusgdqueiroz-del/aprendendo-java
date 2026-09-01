package exerciciosjava50;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        /*
         * Parte 3 — Decisões com if e else
         *
         * 30. Verificando senha
         * Peça uma senha para o usuário.
         *
         * Se a senha digitada for igual a java123, mostre:
         *
         * Acesso liberado.
         *
         * Caso contrário, mostre:
         *
         * Senha incorreta.
         *
         */
        Scanner sc = new Scanner(System.in);

        String senha;

        System.out.println("Digite a senha: ");
        senha = sc.nextLine();

        if("java123".equals(senha)) {
            System.out.println("Acesso liberado.");
        } else {
            System.out.println("Senha incorreta.");
        }

        sc.close();
    }
}

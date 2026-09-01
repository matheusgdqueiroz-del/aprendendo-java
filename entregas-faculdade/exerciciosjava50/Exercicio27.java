package exerciciosjava50;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        /*
         * Parte 3 — Decisões com if e else
         *
         * 27. Login simples
         * Peça o email e a senha do usuário.
         *
         * Considere como dados corretos:
         *
         * Email: admin@email.com
         * Senha: 123456
         *
         * Se estiver correto, mostre:
         *
         * Login realizado com sucesso.
         *
         * Caso contrário, mostre:
         *
         * Email ou senha inválidos.
         *
         */
        Scanner sc = new Scanner(System.in);

        String email, senha;

        System.out.println("Digite o email: ");
        email = sc.nextLine();
        System.out.println("Digite a senha: ");
        senha = sc.nextLine();

        if("admin@email.com".equals(email) && "123456".equals(senha)) {
            System.out.println("Login realizado com sucesso.");
        } else {
            System.out.println("Email ou senha inválidos");
        }



        sc.close();
    }
}

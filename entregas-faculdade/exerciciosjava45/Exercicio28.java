package exerciciosjava45;

public class Exercicio28 {
    static void main(String[] args) {
        byte plano = 2;
        String mensagem;
        if (plano == 1) {
            mensagem = "Plano Básico - R$ 29,90";
        } else if (plano == 2) {
            mensagem = "Plano Intermediário - R$ 59,90";
        } else if (plano == 3) {
            mensagem = "Plano Premium - R$ 99,90";
        } else {
            mensagem = "Plano inválido";
        }
        System.out.println(mensagem);
    }
}

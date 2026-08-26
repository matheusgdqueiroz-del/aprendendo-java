package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Exercicio44 {
    static void main(String[] args) {
        boolean emailCorreto = true;
        boolean senhaCorreta = true;
        boolean contaAtiva = false;
        String mensagem;

        if (emailCorreto && senhaCorreta && contaAtiva) {
            mensagem = "Login realizado";
        } else if (!emailCorreto || !senhaCorreta) {
            mensagem = "Dados inválidos";
        } else {
            mensagem = "Conta bloqueada";
        }
        System.out.println(mensagem);
    }
}

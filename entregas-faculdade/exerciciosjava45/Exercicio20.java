package exerciciosjava45;

public class Exercicio20 {
    static void main(String[] args) {
        boolean temPermissao = true;
        String mensagem;
        if (temPermissao) {
            mensagem = "Acesso liberado";
        } else {
            mensagem = "Acesso negado";
        }
        System.out.println(mensagem);
    }
}

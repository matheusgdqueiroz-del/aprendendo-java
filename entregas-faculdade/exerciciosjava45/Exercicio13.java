package exerciciosjava45;

public class Exercicio13 {
    static void main(String[] args) {
        double saldo = 200;
        double produto = 120;
        String mensagem;
        if (saldo >= produto) {
            mensagem = "Compra aprovada";
        } else {
            mensagem = "Saldo insuficiente";
        }
        System.out.println(mensagem);
    }
}

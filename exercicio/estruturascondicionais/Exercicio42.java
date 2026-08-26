package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Exercicio42 {
    static void main(String[] args) {
        double saldo = 200;
        double valorProduto = 300;
        boolean clienteVip = true;
        String mensagem;

        if (saldo >= valorProduto) {
            mensagem = "Compra aprovada";
        } else if (clienteVip) {
            mensagem = "Compra aprovada pelo crédito VIP";
        } else {
            mensagem = "Compra recusada";
        }
        System.out.println(mensagem);
    }
}

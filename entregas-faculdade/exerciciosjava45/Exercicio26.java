package exerciciosjava45;

public class Exercicio26 {
    static void main(String[] args) {
        byte statusPedido = 3;
        String mensagem;
        if (statusPedido == 1) {
            mensagem = "Pedido recebido";
        } else if (statusPedido == 2) {
            mensagem = "Pedido em preparação";
        } else if (statusPedido == 3) {
            mensagem = "Pedido enviado";
        } else if (statusPedido == 4) {
            mensagem = "Pedido entregue";
        } else {
            mensagem = "Status inválido";
        }
        System.out.println(mensagem);
    }
}

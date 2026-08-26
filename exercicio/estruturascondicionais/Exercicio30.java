package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Exercicio30 {
    static void main(String[] args) {
        byte tipoCliente = 3;
        double valorCompra = 200;
        double desconto;
        String mensagem;

        if (tipoCliente == 1) {
            desconto = 0;
            mensagem = "Valor final da compra: R$ " + (valorCompra - desconto);
        } else if (tipoCliente == 2) {
            desconto = valorCompra * 0.05;
            mensagem = "Valor final da compra: R$ " + (valorCompra - desconto);
        } else if (tipoCliente == 3) {
            desconto = valorCompra * 0.10;
            mensagem = "Valor final da compra: R$ " + (valorCompra - desconto);
        } else if (tipoCliente == 4) {
            desconto = valorCompra * 0.15;
            mensagem = "Valor final da compra: R$ " + (valorCompra - desconto);
        } else {
            mensagem = "Tipo de cliente inválido";
        }
        System.out.println(mensagem);
    }
}

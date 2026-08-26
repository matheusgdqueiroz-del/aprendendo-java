package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Exercicio45 {
    static void main(String[] args) {
        double valorCompra = 450;
        double porcentagemDesconto;

        if (valorCompra <= 100) {
            porcentagemDesconto = 0;
        } else if (valorCompra <= 300) {
            porcentagemDesconto = 5;
        } else if (valorCompra <= 500) {
            porcentagemDesconto = 10;
        } else {
            porcentagemDesconto = 15;
        }

        double valorDesconto = valorCompra * porcentagemDesconto / 100;
        double valorFinal = valorCompra - valorDesconto;
        String mensagem = "Valor original: R$ " + valorCompra
                + "\nPorcentagem de desconto: " + porcentagemDesconto + "%"
                + "\nValor do desconto: R$ " + valorDesconto
                + "\nValor final da compra: R$ " + valorFinal;
        System.out.println(mensagem);
    }
}

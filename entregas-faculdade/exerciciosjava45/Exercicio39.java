package exerciciosjava45;

public class Exercicio39 {
    static void main(String[] args) {
        double valorCompra = 180;
        double frete = valorCompra >= 150 ? 0 : 20;
        String mensagem = "Valor do frete: R$ " + frete;
        System.out.println(mensagem);
    }
}

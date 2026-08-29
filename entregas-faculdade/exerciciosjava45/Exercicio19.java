package exerciciosjava45;

public class Exercicio19 {
    static void main(String[] args) {
        double valorCompra = 300;
        String mensagem;
        if (valorCompra >= 150) {
            mensagem = "Frete grátis";
        } else {
            mensagem = "Frete de 20 reais";
        }
        System.out.println(mensagem);
    }
}

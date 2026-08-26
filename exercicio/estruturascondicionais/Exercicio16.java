package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Exercicio16 {
    static void main(String[] args) {
        double valorCompra = 300;
        String mensagem = "";
        if (valorCompra >= 200) {
            valorCompra -= (valorCompra * 0.20);
            mensagem = "O valor final com desconto é: " + valorCompra;
        }
        System.out.println(mensagem);
    }
}

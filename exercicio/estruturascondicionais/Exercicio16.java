package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Exercicio16 {
    static void main(String[] args) {
        double valorCompra = 300;
        if(valorCompra >= 200) {
            valorCompra -= (valorCompra * 0.20);
            System.out.println("O valor final com desconto é: " + valorCompra);
        }
    }
}

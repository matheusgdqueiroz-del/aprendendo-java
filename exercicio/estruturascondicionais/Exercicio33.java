package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Exercicio33 {
    static void main(String[] args) {
        double saldo = 500;
        double valorProduto = 350;
        String mensagem = saldo >= valorProduto ? "Compra aprovada" : "Saldo insuficiente";
        System.out.println(mensagem);
    }
}

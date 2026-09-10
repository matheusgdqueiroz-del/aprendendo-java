package ExerciciosLoop;

public class Exercicio08 {
    static void main(String[] args) {
        //Usando for
        int quantidadeProdutos = 5;
        double valorProduto = 20;
        double valorCompra = 0;
        for (int i = 0; i < quantidadeProdutos; i++) {
            valorCompra += valorProduto;
        }
        System.out.println(valorCompra);
    }
}

package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Exercicio27 {
    static void main(String[] args) {
        byte codigoProduto = 4;
        String mensagem;
        if (codigoProduto == 1) {
            mensagem = "Eletrônico";
        } else if (codigoProduto == 2) {
            mensagem = "Alimento";
        } else if (codigoProduto == 3) {
            mensagem = "Roupa";
        } else if (codigoProduto == 4) {
            mensagem = "Livro";
        } else {
            mensagem = "Categoria inválida";
        }
        System.out.println(mensagem);
    }
}

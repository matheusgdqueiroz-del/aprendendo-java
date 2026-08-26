package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Exercicio07 {
    static void main(String[] args) {
        int quantidadeEstoque = 7;
        String mensagem = "";
        if (quantidadeEstoque > 0) {
            mensagem = "Produto disponível para venda!";
        }
        System.out.println(mensagem);
    }
}

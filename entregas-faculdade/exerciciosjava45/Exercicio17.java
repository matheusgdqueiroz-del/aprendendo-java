package exerciciosjava45;

public class Exercicio17 {
    static void main(String[] args) {
        byte idade = 27;
        boolean temCNH = true;
        String mensagem;
        if (idade >= 18 && temCNH) {
            mensagem = "Pode dirigir";
        } else {
            mensagem = "Não pode dirigir";
        }
        System.out.println(mensagem);
    }
}

package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Exercicio23 {
    static void main(String[] args) {
        double salario = 3500;
        String mensagem;
        if (salario <= 1500) {
            mensagem = "Salário baixo";
        } else if (salario <= 3000) {
            mensagem = "Salário médio";
        } else if (salario <= 7000) {
            mensagem = "Salário bom";
        } else {
            mensagem = "Salário alto";
        }
        System.out.println(mensagem);
    }
}

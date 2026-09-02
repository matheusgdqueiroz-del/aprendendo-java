package exerciciosjava45;

public class Exercicio40 {
    static void main(String[] args) {
        double salario = 2500;
        double bonus = salario < 3000 ? 500 : 200;
        String mensagem = "Valor do bônus: R$ " + bonus;
        System.out.println(mensagem);
    }
}

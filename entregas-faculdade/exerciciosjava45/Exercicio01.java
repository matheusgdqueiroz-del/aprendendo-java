package exerciciosjava45;

public class Exercicio01 {
    static void main(String[] args) {
        // 1. Verificar maioridade
        // Crie uma variável idade.
        // Se a idade for maior ou igual a 18, exiba:
        // "Você é maior de idade."
        byte idade = 19;
        String mensagem = "";
        if (idade >= 18) {
            mensagem = "Você é maior de idade";
        }
        System.out.println(mensagem);
    }
}

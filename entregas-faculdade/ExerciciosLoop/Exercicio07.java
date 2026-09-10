package ExerciciosLoop;

public class Exercicio07 {
    static void main(String[] args) {
        int quantidadeVendas = 8;
        double valorVenda = 50;
        double faturamentoTotal = 0;

        for (int i = 0; i < quantidadeVendas; i++) {
            faturamentoTotal += valorVenda;
        }

        System.out.println("Faturamento total: R$ " + faturamentoTotal);
    }
}

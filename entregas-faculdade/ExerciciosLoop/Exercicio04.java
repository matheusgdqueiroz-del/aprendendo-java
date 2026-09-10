package ExerciciosLoop;

public class Exercicio04 {
    static void main(String[] args) {
        //Usando while
        int numeroMinimo = 1;
        int numeroMaximo = 100;
        int quantidadeNumeros = numeroMaximo - numeroMinimo + 1;
        int soma = quantidadeNumeros * (numeroMinimo + numeroMaximo) / 2;
        do {
            System.out.println(soma);
        }
        while(false);

    }
}

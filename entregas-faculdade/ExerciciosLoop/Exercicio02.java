package ExerciciosLoop;

public class Exercicio02 {
    static void main(String[] args) {
        //Usando while
        int contador = 10;
        while(contador >= 1) {
            System.out.print(contador + " ");
            contador--;
        }
        System.out.printf("%n");
        //Usando for
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}

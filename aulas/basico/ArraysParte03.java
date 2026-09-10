package basico;

public class ArraysParte03 {
    static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};
        String[] nomes = {"Goku", "Naruto", "Luffy", "Ichigo"};

        for(String nome : nomes) {
            System.out.println(nome);
        }
        for(int numero : numeros) {
            System.out.println(numero);
        }
    }
}

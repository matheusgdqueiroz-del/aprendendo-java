package basico;

public class ArraysParte02 {
    static void main(String[] args) {
        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Luffy";
        nomes[2] = "Naruto";
        nomes[3] = "Ichigo";

        int contador = 0;
        while(contador < nomes.length) {
            System.out.println(nomes[contador]);
            contador++;
        }
    }
}


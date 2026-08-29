package basico;

public class OperadoresParte06 {
    static void main(String[] args) {
        // Incremento e decremento
        int contador = 0;
        contador = contador + 1;
        contador += 1;
        contador++;

        System.out.println(contador);

        contador--;
        System.out.println(contador);

        System.out.println(--contador); //Decrementa primeiro, depois apresenta
    }
}

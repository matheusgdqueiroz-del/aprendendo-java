package basico;

public class OperadoresParte03 {
    static void main(String[] args) {
        /*
        && E
        || OU
        ! NOT
         */
        byte idade = 27;
        boolean isCNH = true;
        boolean isEstanaleiParaDirigir = idade >=18 && isCNH;

        System.out.println(isEstanaleiParaDirigir);
    }
}

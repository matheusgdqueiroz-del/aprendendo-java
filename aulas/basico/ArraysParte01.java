package basico;

public class ArraysParte01 {
    static void main(String[] args) {
        int[] idades = new int[4];
        idades[0] = 12;
        idades[1] = 21;
        idades[2] = 23;
        idades[3] = 51;
        System.out.println(idades[0]);

        for(int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

        //outro método
        //int[] idades = {90, 10, 13};
        //System.out.println(idades[0]);
    }
}

package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Exercicio17 {
    static void main(String[] args) {
        byte idade = 27;
        boolean temCNH = true;
        if(idade >= 18 && temCNH) {
            System.out.println("Pode dirigir");
        } else {
            System.out.println("Não pode dirigir");
        }
    }
}

package intermediario.teste;

import intermediario.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Civic";
        carro.marca = "Honda";
        carro.ano = 1999;

        carro2.nome = "Gol";
        carro2.marca = "Volkswagen";
        carro2.ano = 2015;

        System.out.printf("""
                Carro 01
                nome: %s
                marca: %s
                ano: %d
                
                ---------------------
                Carro 02
                nome: %s
                marca: %s
                ano: %d
                
                """, carro.nome, carro.marca, carro.ano, carro2.nome, carro2.marca, carro2.ano);

    }
}

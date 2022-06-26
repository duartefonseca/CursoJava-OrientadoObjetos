package Aula06_Construtores;

public class MainCarro {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.marca = "Kia";
        carro.modelo = "Stonic";
        carro.numPassageiros = 5;
        carro.capCombustivel = 40;
        carro.consumoCombustivel = 6.0;

        System.out.println(carro);

        Carro carro2 = new Carro("Fiat", "500", 4, 30, 5.5);
        System.out.println(carro2);
    }
}

package Aula01_Classes_E_Atributos;

public class MainCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.marca = "Kia";
        carro.modelo = "Stonic";
        carro.numPassageiros = 5;
        carro.capacidadeCombustivel = 40;
        carro.consumoCombustivel = 6.0;

        System.out.println(carro);
    }


}

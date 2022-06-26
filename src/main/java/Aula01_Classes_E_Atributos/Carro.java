package Aula01_Classes_E_Atributos;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numPassageiros=" + numPassageiros +
                ", capacidadeCombustivel=" + capacidadeCombustivel +
                ", consumoCombustivel=" + consumoCombustivel +
                '}';
    }
}

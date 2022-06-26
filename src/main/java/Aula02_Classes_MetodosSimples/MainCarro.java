package Aula02_Classes_MetodosSimples;

public class MainCarro {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		carro.marca = "Kia";
		carro.modelo = "Stonic";
		carro.numPassageiros = 5;
		carro.capCombustivel = 40;
		carro.consumoCombustivel = 6.0;
		
		System.out.println(carro.marca);
		System.out.println(carro.modelo);
		
		carro.exibirAutonomia();

	}

}

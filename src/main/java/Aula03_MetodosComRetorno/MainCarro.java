package Aula03_MetodosComRetorno;

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

		double autonomia = carro.obterAutonomia();
		System.out.println("A autonomia do carro é: " + autonomia);
		System.out.println("A autonomia do carro é: " + carro.obterAutonomia());
	}

}

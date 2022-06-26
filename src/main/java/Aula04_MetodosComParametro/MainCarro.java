package Aula04_MetodosComParametro;

public class MainCarro {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		carro.marca = "Fiat";
		carro.modelo = "Ducato";
		carro.numPassageiros = 10;
		carro.capCombustivel = 100;
		carro.consumoCombustivel = 0.2;
		
		System.out.println(carro.marca);
		System.out.println(carro.modelo);
		
		carro.exibirAutonomia();

		double autonomia = carro.obterAutonomia();
		System.out.println("A autonomia do carro é: " + autonomia);
		System.out.println("A autonomia do carro é: " + carro.obterAutonomia());
		
		double qtdCombustivel10 = carro.calcularCombustivel(10);
		double qtdCombustivel15 = carro.calcularCombustivel(15);
		
		System.out.println("qtdCombustivel10 = " + qtdCombustivel10);
		System.out.println("qtdCombustivel15 = " + qtdCombustivel15);

	}

}

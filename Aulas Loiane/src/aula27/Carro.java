package aula27;

public class Carro {
	String marca, modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	//Metodo sem retorno
	void exibirAutonomia() {
		
		System.out.println("A autonomiado carro é: "+ capCombustivel*consumoCombustivel);
	}
	
	// Metodo com retorno
	double obterAutonomia() {
		
		return capCombustivel*consumoCombustivel;
	}
	
	// Pode utilizar qualquer tipo de retorno, para metodocom retorno
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km/consumoCombustivel;
		
		return qtdCombustivel;
	}
}

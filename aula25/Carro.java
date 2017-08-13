package aula25;

public class Carro {
	
	String marca,modelo;
	int numPassageiros;
	double capCombustivel; 
	double consumoCombustivel; 
	
	//Metodos Simples
	void exibirAutonomia() {
		
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
	}
}

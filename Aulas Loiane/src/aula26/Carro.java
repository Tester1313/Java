package aula26;

public class Carro {
	
	String marca,modelo;
	int numPassageiros;
	double capCombustivel; 
	double consumoCombustivel; 
	
	//Metodos Sem retorno
	void exibirAutonomia() {
		
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
	}
	
	//Metodo com Retorno
	double obterAutonomia() {
		
		System.out.println("Metodo obter autonomia foi chamado");
		
		return capCombustivel * consumoCombustivel;
	}
}

package aula31;

public class Carro {
	String marca,modelo;
	int numPassageiros;
	double capCombustivel; 
	double consumoCombustivel; 
	
	//Metodos Sem retorno
	public void exibirAutonomia() {
		
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + "km");
	}
	
	//Metodo com Retorno
	public double obterAutonomia() {
		
		System.out.println("Metodo obter autonomia foi chamado");
		
		return this.capCombustivel * this.consumoCombustivel;
	}
}

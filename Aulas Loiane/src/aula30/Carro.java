package aula30;

public class Carro {
	String marca,modelo;
	int numPassageiros;
	double capCombustivel; 
	double consumoCombustivel; 
	
	
	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro() {
		
	}

	public Carro(String marca, String modelo, int numPassageiros) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando contrutor com 3 parametos");

	}

	public Carro(String marca, String modelo) {
		this(marca, modelo, 20); // Chama o construtor com 3 parametros,logo acima
		System.out.println("Chamando contrutor com 2 parametos");

	}

	//Metodos Sem retorno
	void exibirAutonomia() {
		
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + "km");
	}
	
	//Metodo com Retorno
	double obterAutonomia() {
		
		System.out.println("Metodo obter autonomia foi chamado");
		
		return this.capCombustivel * this.consumoCombustivel;
	}
}

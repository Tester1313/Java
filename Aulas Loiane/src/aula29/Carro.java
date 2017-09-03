package aula29;

public class Carro {
	String marca, modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	//Metodo Construtor
	Carro(){
		System.out.println("Classe Carro foi instanciada.");
		numPassageiros = 4;
	}
	
	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	Carro(String marca_,String modelo_, int numPassageiros_, double capCombustivel_){
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capCombustivel = capCombustivel_;
		
	}
	
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

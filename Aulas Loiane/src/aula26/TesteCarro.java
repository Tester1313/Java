package aula26;

import aula26.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia();
		
		// Passa valor da autonomia para variavel atraves do metodo com retorno
		double autonomia = van.obterAutonomia();
		
		
		System.out.println("A autonomia do carro é: "+ autonomia);
		System.out.println("A autonomia do carro é: "+ van.obterAutonomia());
	}

}

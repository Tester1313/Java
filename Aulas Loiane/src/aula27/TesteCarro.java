package aula27;

public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro van = new Carro();
		
		van.marca= "Teste";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.consumoCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		double autonomia = van.obterAutonomia();
		
		double qtdCombustivel10 = van.calcularCombustivel(10);
		double qtdCombustivel15 = van.calcularCombustivel(15);
		
		System.out.println("Qtd Combustivel10 = "+qtdCombustivel10);
		System.out.println("Qtd Combustivel10 = "+qtdCombustivel15);
	}

}

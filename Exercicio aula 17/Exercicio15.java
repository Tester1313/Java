
public class Exercicio15 {

	public static void main(String[] args) {
		// Imprime sequencia de Fibonacci
		int ultimo = 1;
		int penultimo = 0;
		int auxiliar;
		
		for(int i=1; i < 11; i++) {
			System.out.println("Último: "+ultimo);
			auxiliar = ultimo;
			ultimo += penultimo;
			penultimo = auxiliar;
		}
		

	}

}

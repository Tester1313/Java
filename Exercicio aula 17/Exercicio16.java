
public class Exercicio16 {

	public static void main(String[] args) {
		// Imprime sequencia de Fibonacci at� que o ultimo seja maior e igual a 500
				int ultimo = 1;
				int penultimo = 0;
				int auxiliar;
				
				for(int i=1;; i++) {
					System.out.println("�ltimo: "+ultimo);
					auxiliar = ultimo;
					ultimo += penultimo;
					penultimo = auxiliar;
					
					if( ultimo > 500) {
						System.out.println("�ltimo: "+ultimo);
						break;
					}
				}
				

	}

}

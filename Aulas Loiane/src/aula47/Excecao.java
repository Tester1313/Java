package aula47;

public class Excecao {

	public static void main(String[] args) {
		// Tratamentos de possiveis erros
		try {
			int[] vetor = new int[4];
			
			System.out.println("Antes do exception");
			
			vetor[4] = 1;
			
			System.out.println("Texto nao impresso.");
			
		}catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exceção ao acessar o indice");
		}
		
		System.out.println("Texto impresso após a exception");
	}
}

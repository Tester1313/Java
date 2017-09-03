package aula11;
import java.util.Scanner; /* importa classe de leitura */

public class Escape {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // chama classe de leitura de teclado
		//"Hello, World!"
		String nome = scan.nextLine();
		
		int idade = scan.nextInt(); // retorna um inteiro
		double altura = scan.nextDouble(); // retorna um double
		
		System.out.println(nome);

	}

}

import java.util.Scanner;

public class Aula17 {

	public static void main(String[] args) {
		// Como funciona o loop for
		//Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 5 ; i++ ) {
			System.out.println("Valor do i: "+i);
		}
		
		for(int i = 5; i > 0 ; i-- ) {
			System.out.println("Valor do i: "+i);
		}
		
		// Laco com duas variaveis
		for(int i = 0 , j = 10; i < j ; i++,j-- ) {
			System.out.println("Valor do i: "+i+ " valor de j: "+j);
		} 
		
		//For com partes Ausentes
		int count = 0;
		for (; count < 10 ;) {
			System.out.println("Valor do count: "+count);
			count += 2;
		}
		
		// Loop infinito
		// for( ; ; );
		
		// Loop sem corpo
		int soma = 0;
		for ( int i = 1; i < 5; soma += i++); 
			System.out.println("Valor da soma = "+soma);
		
			
	}

}

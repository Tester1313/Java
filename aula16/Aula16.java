import java.util.Scanner;

public class Aula16 {

	public static void main(String[] args) {
		//Loops com while e Do-while
		Scanner scan = new Scanner(System.in);
		
		int i = 1; // count
		int max = 10;
				
		System.out.println("Contando até: "+ max );
		
		while ( i <= max) {
			System.out.println("Valor de i: "+i);
			i++; // incremento
		}
		
		System.out.println("Valor de i: "+i);
		
		do {
			i++;
			System.out.println("Valor de i: " + i);
		} while( i < 15);
	}

}

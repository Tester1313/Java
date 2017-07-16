import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Em que periodo você estuda: (M- Matutito) , (V - Vespertino), ( N - Noturno ):");
		String periodo  = scan.next();
		
		if ( periodo == "M" ) {
			System.out.println("Bom dia");
		} else if ( periodo == "V" ) {
			System.out.println("Boa tarde");
		} else if ( periodo == "N" ) {
			System.out.println("Boa Noite");
		} else {
			System.out.println("Entrada invalida");
		}
		
		
	}

}

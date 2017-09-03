import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// Entra com 2 valores e imprime todo o intervalo entre os mesmos
		
		Scanner scan = new Scanner(System.in);
		int valor1;
		int valor2;
		boolean verifica = false;
		
		do {
			System.out.println("Digite o 1 valor: ");
			valor1 = scan.nextInt();
			
			System.out.println("Digite o 2 valor: ");
			valor2 = scan.nextInt();
			
			if( valor2 > valor1) {
				verifica = true;
				
				for(int i = valor1; i <=valor2; i++) {
					System.out.println("Valor :"+i);
				}
			}else {
				System.out.println("O primeiro valor deve ser menor que o segundo.");
			}
		}while(!verifica);
		
		
	}

}

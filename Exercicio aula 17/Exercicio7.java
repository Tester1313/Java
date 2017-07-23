import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// Le 5 valore se informa o maior
		Scanner scan =new Scanner(System.in);
		
		int maior = 0;
		int valor;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite um valor: ");
			valor = scan.nextInt();
			
			if( valor > maior) {
				maior= valor;
			}
		}
		
		System.out.println("O maior valor deles é: "+maior);

	}

}

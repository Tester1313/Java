import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		// Calcula m�dia aritmetica de N notas
		int qty;
		int nota;
		int media;
		int soma = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantas notas ser�o digitadas ? ");
		qty = scan.nextInt();
		
		for(int i = 0; i < qty;i++) {
			System.out.println("Digite a nota: ");
			nota = scan.nextInt();
			
			soma += nota;
		}
		media = soma / qty;
		
		System.out.println("A m�dia �: "+media);
		
	}

}

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		// Faz um laco de 1 a 50 multiplicando porem nesse o valor é informado pelo usuario
		
		Scanner scan = new Scanner(System.in);
		double valor;
		
		System.out.print("Digite o valor do pão no dia de hoje: ");
		valor = scan.nextDouble();
		
		for(int i = 1; i <= 50; i++) {
			System.out.println("Valor de "+i+" itens: "+(valor*i));
		}
			
	}

}

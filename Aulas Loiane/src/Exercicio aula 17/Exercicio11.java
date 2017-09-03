import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// Igual ao 10, porem nesse é apresentado a soma dos valores entre o intervalo informado
		Scanner scan = new Scanner(System.in);
		int valor1;
		int valor2;
		int soma = 0;
		boolean verifica = false;
		
		do {
			System.out.println("Digite o 1 valor: ");
			valor1 = scan.nextInt();
			
			System.out.println("Digite o 2 valor: ");
			valor2 = scan.nextInt();
			
			if( valor2 > valor1) {
				verifica = true;
				
				for(int i = valor1; i <=valor2; i++) {
					soma += i;
				}
			}else {
				System.out.println("O primeiro valor deve ser menor que o segundo.");
			}
		}while(!verifica);
		
		System.out.println("O valor da soma dos valores entre "+valor1+" e "+valor2+" é: "+soma);
	}

}

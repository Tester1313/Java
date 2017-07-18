import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		//Calcula as raizes de uma equação do segundo grau
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("AX^2 +bx + c ");
		System.out.println("Digite o valor de A: ");
		int a = scan.nextInt();
		
		System.out.println("Digite o valor de B: ");
		int b = scan.nextInt();
		
		System.out.println("Digite o valor de C: ");
		int c = scan.nextInt();
		
		int delta = 0;
		double x1= 0;
		double x2= 0;
		
		if ( a == 0) {
			System.out.println("Não é uma equação do Segundo Grau");
		} else {
			delta = (b^2-4*a*c);
			if ( delta < 0) {
				System.out.println("Essa equação não tem raiz.");
			} else {
				x1= (-b+(delta^(1/2)))/(2*a);
				x2= (-b-(delta^(1/2)))/(2*a);
				
				System.out.println("As raizes são: "+x1 +" e "+x2);
			}
		}

	}

}

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// Le a nota do aluno e atribui nota A,B, C ou D

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a nota 1 nota do aluno: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a nota 2 nota do aluno: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		if( media >= 9 && media <= 10) {
			System.out.println("Aluno aprovado com conceito A" );
		} else if( media <9 && media >= 7.5) {
			System.out.println("Aluno aprovado com conceito B" );
		} else if ( media >= 6 && media < 7.5 ) {
			System.out.println("Aluno aprovado com conceito C" );
		} else if ( media >= 4 && media < 6) {
			System.out.println("Aluno reprovado com conceito D" );
		} else {
			System.out.println("Aluno reprovado com conceito E" );
		}
		
	}

}

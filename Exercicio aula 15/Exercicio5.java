import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// Le duas notas e apresenta a media e verifica se foi aprovado ou reprovado
		
		Scanner scan = new Scanner(System.in);
		
		 System.out.println("Digite a 1° nota: ");
		 double nota1 = scan.nextDouble();
		 
		 System.out.println("Digite a 2° nota: ");
		 double nota2 = scan.nextDouble();
		 
		 double media = (nota1+nota2)/2;
		 
		 if (  media == 10 ) {
			 System.out.println("Aluno aprovado com distinção.");
		 } else if ( media >= 7 ) {
			 System.out.println("Aluno aprovado ");
		 } else {
			 System.out.println("Aluno reprovado");
		 }
		 
	}

}

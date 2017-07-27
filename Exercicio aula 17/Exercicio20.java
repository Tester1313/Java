import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calcula média aritmetica de N notas
			int qty;
			int idade;
			int media;
			int soma = 0;
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Quantas pessoas participaram da entrevista ? ");
			qty = scan.nextInt();
			
			for( int i = 0; i < qty; i++) {
				System.out.println("Digite a nota: ");
				idade = scan.nextInt();
				
				soma += idade;
			}
			media = soma / qty;
			
			if(media >= 0 && media <= 25 ) {
				System.out.println("Essa é uma turma Jovem já que a média de idade é de :"+media);
			} else if(media >= 26 && media <= 60 ) {
				System.out.println("Essa é uma turma Adulta já que a média de idade é de :"+media);
			} else {
				System.out.println("Essa é uma turma Velha já que a média de idade é de :"+media);
			}
	}

}

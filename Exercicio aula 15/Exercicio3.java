import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Verificar se é M ou F
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o seu sexo: ( M ou F ) ");
		String sexo = scan.nextLine();
		
		switch(sexo) {
			case "M": System.out.println("Masculino"); break;
			case "F": System.out.println("Feminino"); break;
			default: System.out.println("Sexo invalido. ");
		}
		
	}

}

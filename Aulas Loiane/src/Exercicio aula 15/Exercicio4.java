import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		String letra = scan.nextLine();
		
		switch(letra) {
			case "a": System.out.println("Letra é vogal"); break;
			case "e":  System.out.println("Letra é vogal"); break;
			case "i":  System.out.println("Letra é vogal"); break;
			case "o":  System.out.println("Letra é vogal"); break;
			case "u":  System.out.println("Letra é vogal"); break;
			default:  System.out.println("É consoante");
		}
	}

}

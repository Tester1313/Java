import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// Gera qualquer tabuada
		Scanner scan = new Scanner(System.in);
		int tabuada;
		
		System.out.println("Qual tabuada está procurando: ");
		tabuada = scan.nextInt();
		
		for(int i = 1;i <= 10; i++) {
			System.out.println(tabuada+" x "+i+" : "+(tabuada*i));
		}

	}

}

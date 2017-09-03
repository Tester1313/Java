import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// Le 5 valorese informa a soma e media
		Scanner scan =new Scanner(System.in);
		int valor;
		int soma = 0;
		double media;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite um valor: ");
			valor = scan.nextInt();
			soma += valor;
		}
		media = soma /5;
		System.out.println("A media dos valores é: "+ media);

	}

}

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Valida se a senha e o login são iguais
		Scanner scan = new Scanner(System.in);
		String login="";
		String senha="";
		
		
		do {
			System.out.println("Digite o seu login: ");
			login = scan.next();
			
			System.out.println("Digite a sua senha: ");
			senha = scan.next();
			if ( login.equals(senha))
			{
				System.out.println("Login e senha não podem ser iguais");
			}

		}
		while( login.equals(senha)); 
	}

}

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// baseado no Exercicio 4 porem o usuario entra com a populacao
		Scanner scan = new Scanner(System.in);
		
		boolean flag = false;
		int paisA=0;
		int paisB=0;
		int count=0;
		
		System.out.println("Compara a popula��o do pais A e B e quanto tempo ir� levar para a popula��o de A chegar a popula��o de B");
		
		do {
				System.out.println("Digite a popula��o do pais A: ");
				paisA = scan.nextInt();
				
				System.out.println("Digite a popula��o do pais B: ");
				paisB = scan.nextInt();
				
				if( paisA < paisB) {
					for(int i=1; ; i++) {
						paisA += (paisA/100) * 3;
						paisB += (paisB/100)* 1.5;
						flag = true;
						if( paisA > paisB) {
							System.out.println("Levar� "+i+" anos para o paisA alcancar a popula��o do paisB");
							break;
							
						}
						
					}
				}else {
					System.out.println("PaisA j� tem uma popula��o maior que PaisB ou entrada invalida");
				}
			}while(!flag);
	}

}

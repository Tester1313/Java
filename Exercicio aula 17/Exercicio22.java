import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int valorTotal=0;
		int valor = 0;
		int quantCd;
		boolean verifica = false;
		
		System.out.println("Qual a quantidade de CDs da sua cole��o: ");
		quantCd = scan.nextInt();
		
		for(int i = 1; i <= quantCd ;i++ ) {
			
			verifica =false;
			do {
				System.out.println("Digite o valor do Cd "+i);
				valor = scan.nextInt();
				
				if (valor > 0){
                    verifica = true;
                    valorTotal += valor;
                } else {
                    System.out.println("N�mero de alunos inv�lido. Digite novamente.");
                }
			}while(!verifica);
		}
		
		System.out.println("O valor total gasto em sua cole��o de Cds foi de: "+valorTotal);
	}

}

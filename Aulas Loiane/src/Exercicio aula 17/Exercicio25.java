import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		// Caixa registradora
		
		Scanner scan = new Scanner(System.in);
		
		boolean verifica = true;
		int quantItens;
		double valor;
		double troco;
		double valorTotal = 0;
		
		System.out.println("Digite a quantidade de itens comprados: ");
		quantItens = scan.nextInt();
		
		for(int i = 1; i<= quantItens;i++) {
			verifica = true;
			do {
				System.out.println("Digite o valor do item "+i+":");
				valor = scan.nextDouble();
				
				if( valor > 0) {
					valorTotal += valor;
					verifica = false;
				} else {
					System.out.println("O valor do produto deve ser acima de 0.");
				}
			}while(verifica);
		}
		
		System.out.println("Valor total de sua compra: "+valorTotal);
		
		System.out.println("Quanto foi dado pelo cliente para pagar a fatura: ");
		troco = scan.nextDouble();
		
		System.out.println("Valor a ser passado ao cliente como troco: "+( troco-valorTotal));

	}

}

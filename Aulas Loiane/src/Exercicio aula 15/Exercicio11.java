import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// Pega o salario do colaborador e da aumento
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor do salário do colaborador: ");
		double salario = scan.nextDouble();
		double reajuste = 0;
		
		if ( salario < 280) {
			reajuste = salario + (salario*0.2);
			System.out.println("Salario: "+ salario+ " seu aumento foi de: 20% e o vlaor é de:  "+(salario*0.2)+ " e seu novo salário é de :"+reajuste );
		} else if ( salario >= 280 && salario < 700 ) {
			reajuste = salario + (salario*0.15);
			System.out.println("Salario: "+ salario+ " seu aumento foi de: 15% e o vlaor é de:  "+(salario*0.15)+ " e seu novo salário é de :"+reajuste );
			
		} else if ( salario >= 700 && salario < 1500 ) {
			reajuste = salario + (salario*0.10);
			System.out.println("Salario: "+ salario+ " seu aumento foi de: 10% e o vlaor é de:  "+(salario*0.10)+ " e seu novo salário é de :"+reajuste );
			
		} else {
			reajuste = salario + (salario*0.05);
			System.out.println("Salario: "+ salario+ " seu aumento foi de: 5% e o vlaor é de:  "+(salario*0.05)+ " e seu novo salário é de :"+reajuste );
			
		}
	}

}

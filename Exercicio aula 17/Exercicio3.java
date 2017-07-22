import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//String nome="";
		
		boolean infoValida= false;
		String nome , sexo, estadoCivil;
		int idade;
		double salario;
		
		do {
			System.out.println("Entre com o nome: ");
			nome = scan.next();
			
			if ( nome.length() > 3 ) {
				infoValida =true;
			} else {
				System.out.println("Nome precisa precisa de no minimo 3 caracteres");
			}
		}while(!infoValida);
		
		infoValida= false;
				
		do {
			System.out.println("Digite a idade ");
			idade = scan.nextInt();
			
			if ( idade >= 0 && idade <= 150 ) {
				infoValida =true;
			} else {
				System.out.println("Idade precisa ser entre 0 e 150");
			}
		}while(!infoValida);
		
		infoValida = false;
		
		do {
			System.out.println("Entre com o salario: ");
			salario = scan.nextDouble();
			
			if ( salario > 0 ) {
				infoValida =true;
			} else {
				System.out.println("Salario precisa ser maior que 0");
			}
		}while(!infoValida);
		
		infoValida = false;
		
		do {
			System.out.println("Entre com o Sexo: ");
			sexo = scan.next();
			
			if ( sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValida =true;
			} else {
				System.out.println("Sexo precisa ser F ou M");
			}
		}while(!infoValida);
		
		infoValida = false;
		
		do {
			System.out.println("Entre com o Estado civil: ");
			estadoCivil = scan.next();
			
			if ( estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("V") || estadoCivil.equalsIgnoreCase("D")) {
				infoValida =true;
			} else {
				System.out.println("Estado civil precisa ser C,S,D ou V.");
			}
		}while(!infoValida);
		
		System.out.println("Nome: "+nome+ " idade: "+idade+ " salario: "+salario + " Sexo: "+ " Estado civil: "+estadoCivil);
	}

}

package labsaula36;

import java.util.Scanner;

public class TesteAgenda {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome da sua Agenda: " );
		String a = scan.nextLine();
		agenda.setNome(a);
		
		System.out.println("Quantos contatos terão: ");
		int aux = scan.nextInt();
		
		Contato[] contatos = new Contato[aux];
		Contato contato0 = new Contato();
		Contato contato1 = new Contato();
		
		for( int i = 0; i< aux; i++) {
			System.out.println("Digite o Nome do "+(i+1)+ " contato:");
			String nome = scan.nextLine();
			contato0.setNome(nome);
			
			System.out.println("Digite o telefone do "+(i+1)+ " contato:");
			String telefone  = scan.nextLine();
			contato0.setTelefone(telefone);
			
			System.out.println("Digite o email do "+(i+1)+ " contato:");
			String email  = scan.nextLine();
			contato0.setTelefone(email);
			
		}
		contatos[0] = contato0;
		agenda.setContatos(contatos);
		
		System.out.println("Nome contato 1: "+ agenda.getContatos());
		//agenda.setContatos(contatos[1]);

	}

}

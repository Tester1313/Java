package exerciciosAula20;
import java.util.Scanner;

public class Exercicio4Agenda {

	public static void main(String[] args) {
		// Agenda de verificação de compromisso
		Scanner scan = new Scanner(System.in);
		
		String[][] compromissos = new String[31][24];
		int acao;
		boolean verDia ;
		boolean verHora;
		boolean sair = false;
		int dia = 0;
		int hora = 0;
		
		while(!sair) {
			acao = 0;
			System.out.println("Para Adicionar um novo compromisso digite 1");
			System.out.println("Para visualizar compromisso especifico digite 2");
			System.out.println("Para editar agenda de compromiss digite 3");
			System.out.println("Para sair agenda de compromiss digite 0");
			acao = scan.nextInt();
			
			// Adiciona um novo evento
			if(acao == 1) {
				// Faço a verificacao do dia do evento
				verDia = false;
				
				while(!verDia) {
					System.out.println("Qual o dia do compromisso ? ");
					dia = scan.nextInt();
					
					if(dia > 0 && dia < 31) {
						verDia=true;
					}else {
						System.out.println("Dia inválido, tente novamente.");
					}
				}
				
				// Faço a verificacao do horario do evento
				verHora = false;
				
				while(!verHora) {
					System.out.println("Qual o horario do seu compromisso ?");
					hora = scan.nextInt();
					
					if(hora >= 0 && hora <24) {
						verHora=true;
					}else {
						System.out.println("Horário Inválido, tente novamente.");
					}
				}
				System.out.println("Digite a descrição do compromisso: ");
				compromissos[dia][hora] = scan.next();
			
				
			// Visualizo um novo evento
			}else if(acao == 2) {
				// Faço a verificacao do dia do evento
				verDia = false;
				
				while(!verDia) {
					System.out.println("Qual o dia do compromisso que deseja visualizar ? ");
					dia = scan.nextInt();
					
					if(dia > 0 && dia < 31) {
						verDia=true;
					}else {
						System.out.println("Dia inválido, tente novamente.");
					}
				}
				
				// Faço a verificacao do horario do evento
				verHora = false;
				
				while(!verHora) {
					System.out.println("Qual o horario do seu compromisso que deseja visualizar ?");
					hora = scan.nextInt();
					
					if(hora >= 0 && hora <24) {
						verHora=true;
					}else {
						System.out.println("Horário Inválido, tente novamente.");
					}
				}
				
				System.out.println("Seu evento no dia "+dia+" e horário "+hora+" é: "+compromissos[dia][hora]);
			
			// Edito um Evento
			}else if(acao == 3) {
				// Faço a verificacao do dia do evento
				verDia = false;
				
				while(!verDia) {
					System.out.println("Qual o dia do compromisso que deseja editar ? ");
					dia = scan.nextInt();
					
					if(dia > 0 && dia < 31) {
						verDia=true;
					}else {
						System.out.println("Dia inválido, tente novamente.");
					}
				}
				
				// Faço a verificacao do horario do evento
				verHora = false;
				
				while(!verHora) {
					System.out.println("Qual o horario do seu compromisso que deseja editar ?");
					hora = scan.nextInt();
					
					if(hora >= 0 && hora <24) {
						verHora=true;
					}else {
						System.out.println("Horário Inválido, tente novamente.");
					}
				}
				System.out.println("Seu evento nesse dia é : "+compromissos[dia][hora]);
				System.out.println("Qual a edição deseja realizar ? ");
				compromissos[dia][hora] = scan.next();
				
			// Sai da Rotina
			}else if(acao == 0) {
				sair = true;
			}else {
				System.out.println("Entrada invalida, tente novamente");
			}
	}
  }

}

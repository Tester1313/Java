package aula15;


import java.util.Scanner;

public class SwithCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		
		int diaSemana = scan.nextInt();
		
		/*if( diaSemana == 1) {
			System.out.println("Domingo");
		} else if( diaSemana == 2) {
			System.out.println("Segunda");
		}else if( diaSemana == 3) {
			System.out.println("Terca");
		}else if( diaSemana == 4) {
			System.out.println("Quarta");
		}else if( diaSemana == 5) {
			System.out.println("Quinta");
		}else if( diaSemana == 6) {
			System.out.println("Sexta");
		}else if( diaSemana == 7) {
			System.out.println("Sabado");
		}else {
			System.out.println("N�o � um dia da semana v�lido.");
		}*/
		
		 // Aula Switch / Case
		
		switch(diaSemana) {
			case 1: System.out.println("Domingo"); break;
			case 2: System.out.println("Segunda"); break;
			case 3: System.out.println("Ter�a"); break;
			case 4: System.out.println("Quarta"); break;
			case 5: System.out.println("Quinta"); break;
			case 6: System.out.println("Sexta"); break;
			case 7: System.out.println("S�bado"); break;
			default: System.out.println("N�o � um dia da semana v�lido");
		}
	}

}
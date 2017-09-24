package aula53;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		usandoEnum();
	}
	
	public static void usandoConstantes() {
		
		int segunda = DiaSemanaConstantes.SEGUNDA;
		int terca = DiaSemanaConstantes.TERCA;
		int quarta = DiaSemanaConstantes.QUARTA;
		int quinta = DiaSemanaConstantes.QUINTA;
		int sexta = DiaSemanaConstantes.SEXTA;
		int sabado = DiaSemanaConstantes.SABADO;
		int domingo = DiaSemanaConstantes.DOMINGO;
		
		System.out.println("Testes utilizando constantes Java");
		imprimiDiaSemana(segunda);
		imprimiDiaSemana(terca);
		imprimiDiaSemana(quarta);
		imprimiDiaSemana(quinta);
		imprimiDiaSemana(sexta);
		imprimiDiaSemana(sabado);
		imprimiDiaSemana(domingo);
	}
	
	private static void imprimiDiaSemana(DiaSemana dia) {
		switch (dia) {
		case SEGUNDA:
			System.out.println("Segunda-feira");
			break;
		case TERCA:
			System.out.println("Terca-feira");
			break;
		case QUARTA:
			System.out.println("Quarta-feira");
			break;
		case QUINTA:
			System.out.println("Quinta-feira");
			break;
		case SEXTA:
			System.out.println("Sexta-feira");
			break;
		case SABADO:
			System.out.println("Sabado-feira");
			break;
		case DOMINGO:
			System.out.println("Domingo");
			break;
		}
	}
	
	// utilizando o Enum
	private static void usandoEnum() {
		
		DiaSemana segunda =  DiaSemana.SEGUNDA;
		DiaSemana terca =  DiaSemana.TERCA;
		DiaSemana quarta =  DiaSemana.QUARTA;
		DiaSemana quinta =  DiaSemana.QUINTA;
		DiaSemana sexta =  DiaSemana.SEXTA;
		DiaSemana sabado =  DiaSemana.SABADO;
		DiaSemana domingo =  DiaSemana.DOMINGO;
		
		imprimiDiaSemana(segunda);
		imprimiDiaSemana(terca);
		imprimiDiaSemana(quarta);
		imprimiDiaSemana(quinta);
		imprimiDiaSemana(sexta);
		imprimiDiaSemana(sabado);
		imprimiDiaSemana(domingo);
	}
}

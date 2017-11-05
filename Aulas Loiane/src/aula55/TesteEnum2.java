package aula55;

import aulas53.DiaSemana;

public class TesteEnum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DiaSemana dia;
		
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
		
		DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");
		
		System.out.println(dia);
	}

}

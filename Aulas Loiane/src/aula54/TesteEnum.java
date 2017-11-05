package aula54;

public class TesteEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DiaSemana dia = DiaSemana.DOMINGO;
		
		//. toString irá chamar o nome do Enum
		System.out.println(dia.toString() +" - "+dia.getValor());
		
		Data data = new Data(1,4,2016, DiaSemana.SEXTA);
	}

}

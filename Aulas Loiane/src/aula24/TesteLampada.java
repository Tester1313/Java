package aula24;

public class TesteLampada {

	public static void main(String[] args) {


		Lampada lampada = new Lampada();
		lampada.cor = "verde";
		lampada.garantiaMeses = 3;
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.tipoLuz = "Amarela";
		
		lampada.tipos = new String[5];
		lampada.tipos[0] = "Teste";
		lampada.tipos[1] = "Abajour";
	}

}

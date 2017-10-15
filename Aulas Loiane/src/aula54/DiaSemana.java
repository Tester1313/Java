package aula54;

public enum DiaSemana {

	//Parametros dentro de () serao utilizados pelo construtor abaixo
	SEGUNDA(1) , TERCA(2), QUARTA(3), QUINTA(4),SEXTA(5),SABADO(6),DOMINGO(7);
	
	private int valor;
	
	//Construtor sem limites de acesso
	DiaSemana(int valor){
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
}

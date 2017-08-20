package labs;

public class Lampada {
	String potencia, garantiaMeses, aviso, cor, vidaUtil;
	boolean ligada;
	
	void ligar() {
		ligada = true;
	}
	
	void desligar() {
		ligada = false;
	}
	
	void mostrarEstado() {
		
		if (ligada) {
			System.out.println("Lampada est� ligada");
		} else {
			System.out.println("Lampada est� desligada");
		}
	}
	
	void mudarEstado() {
		
		if(ligada) {
			desligar();
		} else {
			ligar();
		}
	}
}

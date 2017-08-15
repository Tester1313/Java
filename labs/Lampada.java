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
			System.out.println("Lampada está ligada");
		} else {
			System.out.println("Lampada está desligada");
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

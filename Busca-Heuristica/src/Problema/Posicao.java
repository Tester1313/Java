package Problema;

public class Posicao {
	
	private int x;
	private int y;
	
	// Metodos Get e Set
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// Sobrescreve metodo toString
	@Override
	public String toString() {
		return "Posição {" +
				"x = "+ x+
				" y = " +y;
	}
	
}

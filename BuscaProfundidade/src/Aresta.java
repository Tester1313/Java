
public class Aresta {
	
	private Vertice vertice;
	private double peso;
	
	
	public Aresta(Vertice vertice) {
		super();
		this.vertice = vertice;
		//this.peso = peso;
	}

	public Vertice getVertice() {
		return vertice;
	}
	
	public void setVertice(Vertice vertice) {
		this.vertice = vertice;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
}

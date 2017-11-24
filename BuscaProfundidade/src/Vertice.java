import java.util.ArrayList;

//import grafo.Arestas;

public class Vertice {
	private String nome;
	private String matriz[][];
	private ArrayList<Aresta> aresta;
	private boolean visitado;
	
	public Vertice(String nome, String[][] matriz) {
		super();
		this.nome = nome;
		this.matriz = matriz;
		this.aresta = new ArrayList<Aresta>();
		this.visitado = visitado;
	}

	

	public String[][] getMatriz() {
		return matriz;
	}



	public void setMatriz(String[][] matriz) {
		this.matriz = matriz;
	}



	public ArrayList<Aresta> getAresta() {
		return aresta;
	}

	public void setAresta(ArrayList<Aresta> aresta) {
		this.aresta = aresta;
	}

	public boolean isVisitado() {
		return visitado;
	}

	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}
	
	public void setArestaAdijacente(Aresta a) {
		this.aresta.add(a);
	}

}

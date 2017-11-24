import java.util.ArrayList;

import grafo.Arestas;
import grafo.Vertice;

//import grafo.Vertice;

public class Manipula {
	
	private ArrayList<Aresta> aresta = new ArrayList<>();

	public void exbirConeccao(Vertice v1) {
		
		System.out.println("Exibe as conecções do vertices");
		System.out.println("Nome do vertice:" + v1.getNome());
		System.out.println("Arestas :" + v1.getAresta().size());
		
		for(int i = 0; i < v1.getAresta().size(); i++) {
			System.out.println("Aresta "+ i + " : " + v1.getAresta().get(i).getVertice().getNome());
			//System.out.println("Teste: "+ v1.getNome());
		}
		System.out.println("####################### ");
	}
	
	// Exibe todos os vertices
		public void exibeTodosVertices(Vertice v1) {
			System.out.println("#### Exibe Vertices #### ");

			if (recursaovertice(v1) == true) {
				System.out.println("######################## ");
			}
		}
		
		public boolean recursaovertice(Vertice v, String[][] matriz) {
			// Marca o vertice como visitado
			if (v.isVisitado() == true) {
				return true;
			} else {
				this.aresta = aresta;
				//System.out.println("  " + v.getNome() + "  ");
				v.setVisitado(true);
				String[][] matriz1 = v.getMatriz();
				String[][] matrizPrincipal = matriz;
				
				for (int i = 0; i < matriz.length; i++) {
					for( int j = 0; j < matriz[i].length;j++ )
					
					if(matriz1[i][j].equals("")) {
						if(matriz[i+1][j] != null) {
							matriz1[i][j] = matriz[i+1][j];
							Vertice v2 = new Vertice("V2",matriz1);
							v.setArestaAdijacente(v2);;
							return true;
							
						}
						
					}
					
				}
			}
			return true;
		}
		
		
		public boolean resolveBo() {
			return true;
		}
}

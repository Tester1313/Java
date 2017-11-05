import java.util.ArrayList;
import java.util.List;

public class Matriz {

	private int[][] matriz;
	private int[][] aux_matriz;
	
	public int[][] getaux_matriz() {
		return aux_matriz;
	}

	public void setAux_matriz(int[][] aux_matriz) {
		this.aux_matriz = aux_matriz;
	}

	public int[][] getMatriz() {
		return matriz;
	}
	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}
	
	// Imprime a matriz
			
	public void imprimirMatriz() {
		System.out.println("Matriz");
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" "); 
			}
			System.out.println();
		}
	}
	
	public void calcularDistancia(List listaGenes) {
		List list = new ArrayList<ArrayList>();
		list = listaGenes;
		
		
		System.out.println("MInha lista de Genes "+list);
		//Passa em todos os ArrayList da minha Lista de ArrayList
		for(int i = 0;i< list.size();i++) {
			ArrayList aux = new ArrayList();
			aux = (ArrayList) list.get(i);// Passa o i List para o Arraylist aux
			int custo = 0;	
			
			//FOR que passa em todas as posicoes
			for(int j = 0;j < aux.size()-1 ; j++) {
				//System.out.println(aux.get(j)+" "+aux.get(j+1));
				
				//Variavel chama metodo que busca na matriz valores de distancia
				custo += this.retornaDistancia(((Integer) aux.get(j)),((Integer) aux.get(j+1))); // Converte tipo Object para Inteiro
			}
			aux.add(custo);
			list.remove(i);
			list.add(i, aux);
		}
	}
	
	// Busca distancia na matriz dde distancia de acordo com os parametros passados
	private int retornaDistancia(int aux , int aux2) {
		return this.matriz[aux][aux2];
	}
}

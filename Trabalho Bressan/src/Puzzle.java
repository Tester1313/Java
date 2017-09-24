import java.util.ArrayList;

public class Puzzle {
	ArrayList<int[][]> array;
	int custo;
	int[][] resultado = {{1,2,3},{4,5,6},{7,8}};
	
	public Puzzle(int[][] a) {
		this.Heuristica(a);
		this.array = new ArrayList<>();
		this.array.add(a);
	}
	
	public ArrayList<int[][]> getArray() {
		return array;
	}

	public void setArray(ArrayList<int[][]> array) {
		this.array = array;
	}

	public int getCusto() {
		return custo;
	}

	public void setCusto(int custo) {
		this.custo = custo;
	}

	public void Heuristica(int[][] a) {
		int [][]aux = a;
		int erro = 0;
		
		for(int i = 0; i < resultado.length; i++) {
			for(int j = 0; j < resultado[i].length;j++) {
				if( aux[i][j] != resultado[i][j]) {
					erro++;
				}
			}
		}
	}
	
	public void mostraMatriz(int [][] matriz ) {
		int [][] aux = matriz;
		
		for(int i = 0; i < resultado.length; i++) {
			for(int j = 0; j < resultado[i].length;j++) {
				System.out.print(aux[i][j] + "|");
			}
			System.out.println("");
		}
	}
}

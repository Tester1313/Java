import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;


public class GeraGeracoes {

	ArrayList array = new ArrayList();
	ArrayList genes;
	
	//Lista de ArrayList com as Geracoes gerada
	List list = new ArrayList<ArrayList>();
	
	public GeraGeracoes(int numCidades) {
		super();
		this.array = array;
		
		for(int i = 0; i < numCidades; i++) {
			array.add(i);
		}
	}
	
	public ArrayList getArray() {
		return array;
	}

	public void setArray(ArrayList array) {
		this.array = array;
	}

	void imprimirArray() {
		System.out.println("Array Principal: "+ this.array);
	}
	
	//Gera as Geracoes Aleatoriamentes
	public List<ArrayList> gerarGeracoes() {
		Random gerador = new Random();
		for(int i = 0 ;i < 10; i++) {
			//Inicializa o Vetor de genes
			genes = new ArrayList(Arrays.asList("A","A","A","A","A","A","A","A"));
			
			// Passamos para o Genes o inicial e o Final
			Object aux2 = this.array.get(9);
			Object aux1 = this.array.get(0);
			genes.add(0, aux1);
			genes.add(9, aux2);
			
			
			int j = 1;
			
			//Gera aleatoriamente valoes entre os paramentros passados
			while(j < (this.array.size() - 1)) {
				//Verifica se o valor ja esta no array, caso não, remove o valor atual e insere o novo valor na posicao j
				int aux = gerador.nextInt(9);
				if(!genes.contains(aux)) {
					genes.remove(j);
					genes.add(j, aux);
					j++;
				}
			}
			//Passa o Array list para uma lista de todos os genes gerados
			////System.out.println(this.genes);
			list.add(this.genes);
			
		}
		//Retorna A lista de Genes para Main
		return list;
	}
	
	void imprimirGeracoes() {
		System.out.println(this.list);
	}
	
}
	


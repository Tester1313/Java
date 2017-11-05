import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
<<<<<<< HEAD
=======
import java.util.ListIterator;
>>>>>>> 451565914baad5c44e57016532cfbcf598a4c2d6
import java.util.Random;
import java.util.function.Consumer;


public class GeraGeracoes {

<<<<<<< HEAD
	ArrayList array = new ArrayList();
=======
	ArrayList array;
>>>>>>> 451565914baad5c44e57016532cfbcf598a4c2d6
	ArrayList genes;
	
	//Lista de ArrayList com as Geracoes gerada
	List list = new ArrayList<ArrayList>();
<<<<<<< HEAD
	
	public GeraGeracoes(int numCidades) {
		super();
		this.array = array;
		
		for(int i = 0; i < numCidades; i++) {
			array.add(i);
=======
	List filhos = new ArrayList<ArrayList>();
	
	public GeraGeracoes(int numCidades) {
		array = new ArrayList(numCidades);
		
		for(int i = 0; i < numCidades; i++) {
			if(i == 0 || i == (numCidades-1)) {
				array.add(i);
			}else {
				array.add("A");
			}
>>>>>>> 451565914baad5c44e57016532cfbcf598a4c2d6
		}
	}
	
	public ArrayList getArray() {
<<<<<<< HEAD
		return array;
=======
		return this.array;
>>>>>>> 451565914baad5c44e57016532cfbcf598a4c2d6
	}

	public void setArray(ArrayList array) {
		this.array = array;
	}

	void imprimirArray() {
		System.out.println("Array Principal: "+ this.array);
	}
	
	//Gera as Geracoes Aleatoriamentes
	public List<ArrayList> gerarGeracoes() {
<<<<<<< HEAD
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
	
=======
		for(int i = 0 ;i < this.array.size(); i++) {
			list.add(verificaPosicoes(this.getArray()));
		}
		//Retorna A lista de Genes para Main
		return list;
	}
	
	public ArrayList verificaPosicoes(ArrayList genes) {
		int j = 1;
		Random gerador = new Random();
		ArrayList gene = new ArrayList(genes);//copia o array sem a referencia de memoria
		
		
		//Gera aleatoriamente valoes entre os paramentros passados
		while(j < (gene.size() - 1)) {
			if( genes.get(j).toString().equals("A")) {
				//Verifica se o valor ja esta no array, caso não, remove o valor atual e insere o novo valor na posicao j
				int aux = gerador.nextInt(9);
				if(!gene.contains(aux)) {
					gene.remove(j);
					gene.add(j, aux);
					j++;
				}
			}else {
				j++;
			}
		}
		return gene;
	}
	
	void imprimirGeracoes(List imprime) {
		List imprimir = new ArrayList<ArrayList>();
		imprimir = imprime;
	
		System.out.println("GERACOES SEM ORDENAR:");
		ListIterator<ArrayList> litr = null;
		
		litr = imprimir.listIterator();
		
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
	}
	
	public List<ArrayList> crossover(List genesFilhos){
		
		
		for(int i = 0;i< genesFilhos.size();i++) {
			ArrayList aux = new ArrayList((ArrayList) genesFilhos.get(i));
			//aux = (ArrayList) genesFilhos.get(i);// Passa o i List para o Arraylist aux
			int custo = 0;	
			
			//FOR que passa em todas as posicoes
			for(int j = 1;j < aux.size()-1 ; j++) {
				
					ArrayList aux2 = new ArrayList((ArrayList) genesFilhos.get(j));
					
					ArrayList pai = new ArrayList(this.getArray()); // Copia vetor 1
					ArrayList mae = new ArrayList(this.getArray()); // Copia vetor 2
						
					mae.add(5, aux.get(5));
					pai.add(5, aux2.get(5));
					
					mae.add(7, aux.get(7));
					pai.add(7, aux2.get(7));
					
					mae = this.verificaPosicoes(mae);
					System.out.println(mae);
				}
			
			}
		
		return list;
	}
	
	
>>>>>>> 451565914baad5c44e57016532cfbcf598a4c2d6
}
	


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.function.Consumer;


public class GeraGeracoes {

	ArrayList array;
	ArrayList genes;
	ArrayList bestway = new ArrayList();
	Matriz matriz = new Matriz();
	int numCidades;  // 
	
	public int getnumCidades() {
		return numCidades;
	}

	public void setnumCidades(int numCidades) {
		this.numCidades = numCidades;
	}

	public ArrayList getBestway() {
		return bestway;
	}

	public void setBestway(ArrayList bestway) {
		this.bestway = bestway;
	}

	//Lista de ArrayList com as Geracoes gerada
	List list = new ArrayList<ArrayList>();
	List filhos = new ArrayList<ArrayList>();
	
	public GeraGeracoes(int numCidades,Matriz matriz) {
		this.matriz = matriz;
		this.setnumCidades(numCidades);
		array = new ArrayList(numCidades);
		
		Random random = new Random();
		int aux = random.nextInt(numCidades); // Gera primeira e ultima cidade Aleatoria
		
		for(int i = 0; i < (this.getnumCidades()); i++) {
			if(i == 0 || i == (numCidades -1)) {
				array.add(i,0);
			}else {
				array.add("A");
			}
		}
		bestway = new ArrayList(array);
		bestway.add(1000000000);
	}
	
	public ArrayList getArray() {
		return this.array;
	}

	public void setArray(ArrayList array) {
		this.array = array;
	}

	void imprimirArray() {
		System.out.println("Array Principal: "+ this.array);
	}
	
	//Gera as Geracoes Aleatoriamentes
	public List<ArrayList> gerarGeracoes() {
		for(int i = 0 ;i < this.array.size(); i++) {
			list.add(verificaPosicoes(this.getArray()));
		}
		//Retorna A lista de Genes para Main
		return list;
	}
	
	//Verifica se tenho A no ARRAYLIST
	public ArrayList verificaPosicoes(ArrayList genes) {
		int j = 1;
		Random gerador = new Random();
		ArrayList gene = new ArrayList(genes);//copia o array sem a referencia de memoria
		
		
		//Gera aleatoriamente valoes entre os paramentros passados
		while(j < (gene.size() - 1)) {
			if( genes.get(j).toString().equals("A")) {
				//Verifica se o valor ja esta no array, caso n�o, remove o valor atual e insere o novo valor na posicao j
				int a = this.getArray().size();
				int aux = gerador.nextInt(this.getnumCidades());
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
	
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("GERAC�O:");
		ListIterator<ArrayList> litr = null;
		
		int i = 0; 
		litr = imprimir.listIterator();
		
		while(litr.hasNext()) {
			System.out.println(i+" "+litr.next());
			i++;
		}
		
	}
	
	public List<ArrayList> crossover(List genesFilhos, int geracoes){
		List genesFilho = new ArrayList(genesFilhos);
	    
		int var1 = 0;
		int var2 = 0;
		
		for(int h = 0; h <= geracoes; h++) {
			var1 = 0;
			var2 = 0;
			
			while((var1 == 0 && var2 == 0) || (var1 == this.getArray().size() && var2 == this.getArray().size())){ 
				
				Random random = new Random();
				int aux = getArray().size();
				var1 = random.nextInt((this.getArray().size()-1)); // Variavel que ir� definir o corte
				var2 = random.nextInt((this.getArray().size()-1)); // Variavel que ir� definir o corte
			}
			genesFilho = this.retiraCusto(genesFilho); // Retira custo dos Arrays
			
		
			for(int i = 0;i < genesFilho.size();i++) {
				int tam = filhos.size();
				ArrayList aux = new ArrayList((ArrayList) genesFilho.get(i));
				
				//FOR que passa em todas as posicoes
				for(int j = 1;j <genesFilho.size()-1 ; j++) {
					int tam1=aux.size();
					
						ArrayList aux2 = new ArrayList((ArrayList) genesFilho.get(j));
						
						ArrayList pai = new ArrayList(aux); // Copia aux 1
						ArrayList mae = new ArrayList(aux2); // Copia aux 2
						
						mae.remove(var1);	
						mae.add(var1, aux.get(var1));
						
						pai.remove(var1);
						pai.add(var1, aux2.get(var1));
						
						mae.remove(var2);
						mae.add(var2, aux.get(var2));
						
						pai.remove(var2);
						pai.add(var2, aux2.get(var2));
						
						mae = this.verificaRepeticao(mae);
						pai = this.verificaRepeticao(pai);
						
						filhos.add(pai);
						filhos.add(mae);
						
					}
				
				}
			filhos = matriz.calcularDistancia(filhos); // Calcula distancia entre cidades			
			matriz.OrdenaVetor(filhos);  // Ordena a lista de filhos
			filhos = this.qtdPosicoes(filhos); //Pega apenas os 100 primeiros
			
			
			this.imprimirGeracoes(filhos);
			
			
			genesFilho = new ArrayList(filhos);
			filhos.clear();
		 
		}
		list.clear();
		return list;
		
	}

	public List retiraCusto(List params) {
		ListIterator<ArrayList> litr = null;
		litr = params.listIterator();
		
		while(litr.hasNext()) {
			ArrayList teste = litr.next();
			
			teste.remove((teste.size()-1));
			
		}
		
		return params;
	}
	public ArrayList verificaRepeticao(ArrayList genes) {
		
		int j = 1;
		Random gerador = new Random();
		ArrayList gene = new ArrayList();//copia o array sem a referencia de memoria
		
		ListIterator<ArrayList> litr = null;
		litr = genes.listIterator();
	
		while(litr.hasNext()) {
			Object gene1 = litr.next();
			if(!gene.contains(gene1) && genes.size() != gene.size()) {
				gene.add(gene1);
			}else if(gene.contains(gene1) && genes.size() == (gene.size()+1)) {
				gene.add(gene1);
			} else {
				gene.add("A");
			}
		}
		if(gene.contains("A")) {
			gene = this.verificaPosicoes(gene);
		}
		return gene;
	}
	
	public List qtdPosicoes(List genes) {
		List list = new ArrayList<ArrayList>();
		ArrayList aux = new ArrayList();
		
		int qtd = (int) (genes.size() * 0.1);
		
		
		for(int i = 0;i< 99 ;i++) {
			//ArrayList aux = new ArrayList((ArrayList) genes.get(i));
			list.add(genes.get(i));
			aux =(ArrayList) genes.get(i);
			
			int aux1=aux.size();
			if((int)aux.get((int)(aux.size()-1)) < ((int) bestway.get((int)(aux.size()-1)))) {
				bestway = new ArrayList(aux);
			}
				
		}
		return list;
	}
	
	
}
	


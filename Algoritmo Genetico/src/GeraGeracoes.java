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
	int[] id = new int[11];
	Matriz matriz = new Matriz();
	
	//Lista de ArrayList com as Geracoes gerada
	List list = new ArrayList<ArrayList>();
	List filhos = new ArrayList<ArrayList>();
	ArrayList bestway = new ArrayList();
	int numCidades;
	
	public ArrayList getBestway() {
		return bestway;
	}

	public int getNumCidades() {
		return numCidades;
	}

	public void setNumCidades(int numCidades) {
		this.numCidades = numCidades;
	}

	public void setBestway(ArrayList bestway) {
		this.bestway = bestway;
	}

	public GeraGeracoes(int numCidades,Matriz matriz) {
		this.matriz = matriz;
		array = new ArrayList(numCidades);
		this.numCidades = numCidades;
		Random random = new Random();
		int aux = random.nextInt(numCidades); // Gera primeira e ultima cidade Aleatoria
		
		for(int i = 0; i <= (numCidades); i++) {
			if(i == 0) {
				array.add(i,0);
			}else if( i == numCidades) {
				array.add(i,0);
			}
			else {
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
				//Verifica se o valor ja esta no array, caso não, remove o valor atual e insere o novo valor na posicao j
				int a = this.getArray().size();
				int aux = gerador.nextInt(this.getNumCidades());
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
	
	public List realizaMutacao(List genes) {
		
		List mutacao = new ArrayList<ArrayList>(genes);
		Random gerador = new Random();
		for(int i = 0;i < mutacao.size() ; i++) {
			ArrayList aux2 = new ArrayList((ArrayList) mutacao.get(i));
			int ver = 0;
			while (ver==0) {
				int a = gerador.nextInt(this.numCidades);
				int b = gerador.nextInt(this.numCidades);
				
				if(a != 0 && a != (this.numCidades-1) && b != 0 && b != (this.numCidades-1)) {
					int c = (int) aux2.get(a);
					int d = (int) aux2.get(b);
					
					aux2.remove(a);
					aux2.remove(b);
					aux2.add(a,d);
					aux2.add(b,c);
					
					aux2 = this.verificaRepeticao(aux2);
					
					ver = 1;
				}
			}
			mutacao.remove(i);
			mutacao.add(i, aux2);
		}		
		return mutacao;
	}
	
	void imprimirGeracoes(List imprime) {
		List imprimir = new ArrayList<ArrayList>();
		imprimir = imprime;
	
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("GERACÃO:");
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
	    
		for(int h = 0; h <= geracoes; h++) {
			int var1 = 0;
			int var2 = 0;	
		
			genesFilho = this.retiraCusto(genesFilho); // Retira custo dos Arrays
			
			
			for(int i = 0;i < genesFilho.size();i++) {
				int tam = filhos.size();
				ArrayList aux = new ArrayList((ArrayList) genesFilho.get(i));
				int corte = aux.size() / 2;
				//FOR que passa em todas as posicoes
				for(int j = 1;j <genesFilho.size()-1 ; j++) {
					int tam1=aux.size();
					
						ArrayList aux2 = new ArrayList((ArrayList) genesFilho.get(j));
						
						ArrayList pai = new ArrayList(aux); // Copia aux 1
						ArrayList mae = new ArrayList(aux2); // Copia aux 2
						
						//System.out.println("Pai antes da mutação:"+aux);
						//System.out.println("MAE antes da mutação:"+aux2);
						
						for(int k = 0; k < pai.size(); k++) {
							if(k < corte) {
								pai.remove(k);
								pai.add(k, aux2.get(k));
								//System.out.println("Pai:"+pai);
							}else {
								mae.remove(k);
								mae.add(k, aux.get(k));
								//System.out.println("Mae:"+mae);
							}
						}
						//System.out.println(mae +""+ pai);
						mae = this.verificaRepeticao(mae);
						pai = this.verificaRepeticao(pai);
						//System.out.println(mae +""+ pai);
						
						filhos.add(pai);
						filhos.add(mae);
					}
				
				}
			
			filhos = matriz.calcularDistancia(filhos); // Calcula distancia entre cidades			
			matriz.OrdenaVetor(filhos);  // Ordena a lista de filhos
			filhos = this.qtdPosicoes(filhos); //Pega apenas os 100 primeiros
			
			
			//this.imprimirGeracoes(filhos);
			
			genesFilho.clear();
			filhos = this.retiraCusto(filhos);
			filhos = this.realizaMutacao(filhos);
			filhos = matriz.calcularDistancia(filhos);
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
		ArrayList aux = new ArrayList(genes);
		
		for(int i = 0;i< 150 ;i++) {
			//ArrayList aux = new ArrayList((ArrayList) genes.get(i));
			list.add(genes.get(i));
			aux =(ArrayList) genes.get(i);
				
			int aux1=aux.size();
			if((int)aux.get((int)(aux.size()-1)) < ((int) bestway.get((int)(aux.size()-1)))) {
				bestway = new ArrayList(aux);
			}
			//final = bestway.toArray();
		}
		return list;
	}
	
	
}
	


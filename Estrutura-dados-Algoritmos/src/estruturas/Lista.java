package estruturas;

import java.lang.reflect.Array;

public class Lista<T>{
	
	private T[] elementos;
	private int tamanho;

	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	public Lista(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[])Array.newInstance(tipoClasse, capacidade); // Utilizando Reflection
		this.tamanho = 0;
	}
	
	public boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	public boolean adiciona(int posicao, T elemento) {
		this.aumentaCapacidade();
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao invalida");
		}

		//Aula 07 Mover elementos
		// Tamanho tem o tamanho real do vetor, a quantidade de elementos utilizados
		for(int i = this.tamanho; i >= posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		return true;
	}

	// Aula 08
	private void aumentaCapacidade(){
		if(this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length* 2]; //dobrar tamanho do vetor;
			for( int i=0; i<this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	public Object busca(int posicao) {
		if(!(posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		return this.elementos[posicao];		
	}

	public int busca(T elemento) {
		// Busca Sequencial
		for(int i =0 ; i< this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	//Aula 09
	public void remove(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		for(int i = posicao; i < tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}

	public int getTamanho() {
		return tamanho;
	}	

	public String toString() {

		// Append concatena as palavras
		StringBuilder s = new StringBuilder();
		s.append("[");

		for(int i = 0; i<this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if(this.tamanho > 0) {
			s.append(this.elementos[this.tamanho-1]);
		}

		s.append("]");

		return s.toString();
	}
}

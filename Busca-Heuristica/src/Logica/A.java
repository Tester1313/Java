package Logica;

import java.util.ArrayList;

import Problema.Estado;

public class A {
	
	
	private Estado obj_estado;
	
	private ArrayList<Estado> estado_aberto;
	private ArrayList<Estado> estado_fechado;
	
	public A (Estado estado_inicial, Estado obj) {
		estado_aberto = new ArrayList<Estado>();
		estado_fechado = new ArrayList<Estado>();
		
		this.obj_estado = obj;
		estado_aberto.add(estado_inicial);
	}
	
	public Estado resolve() {
		
		Estado estado_atual = null;
		ArrayList<Estado> estado_filho = new ArrayList<Estado>();
		int posicao = -1;
		
		while(!estado_aberto.isEmpty()) {
			estado_atual = estado_aberto.get(0);
			estado_aberto.remove(0);
			
			if(estado_atual.estado_igual(this.obj_estado)) {
				break;
			}
			
			estado_filho.addAll(estado_atual.gera_filhos());
			
			for(Estado s : estado_filho) {
				
				// Se o estado filho já estao aberto
				
				posicao = conter(estado_aberto,s);
				
				if(posicao >= 0) {
					// O novo estado filho tem uma funcao melhor (menor) que o estado pertencente a lista de abertos
					
					if(estado_aberto.get(posicao).custo_avaliacao(s)) {
						estado_aberto.remove(posicao);
						estado_aberto.add(s);
					}
					
					//o estado filho nao estao aberto
				
				}else {
					// Se o estado esta fechado
					
					posicao = conter(estado_fechado,s);
					
					if(posicao >= 0) {
						// o novo estado filho tem uma funcao melhor
						//pertencente a lista de fechados
						
						if(estado_fechado.get(posicao).custo_avaliacao(s)) {
							estado_fechado.remove(posicao);
							estado_aberto.add(s);
						}
					}else {
						// Se o estado filho nao foi expandido antes
						
						estado_aberto.add(s);
					}
				}
			}
			estado_fechado.add(estado_atual);
			sort(estado_aberto);
			estado_filho.clear();
		}
		return estado_atual;
	}
	
	private void sort(ArrayList<Estado> lista) {
		
		ArrayList<Estado> nova_lista = new ArrayList<>();
		
		while(!lista.isEmpty()) {
			// acha o menor da lista
			Estado menor = lista.get(0);
			int posicao = 0;
			for(int i = 1; i<lista.size(); i++) {
				if(lista.get(i).getPuzzle_atual().getF() < menor.getPuzzle_atual().getF()) {
					menor = lista.get(i);
					posicao = 1;
				}
			}
			lista.remove(posicao);
			nova_lista.add(menor);
		}
		lista.clear();
		lista.addAll(nova_lista);
	}
	
	// Se o estado pertencer a lista retorna a posicao da lista no estado sena retorna -1
	private int conter(ArrayList<Estado> lista, Estado estado) {
		
		int posicao = -1;
		
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).estado_igual(estado)) {
				posicao = i;
			}
		}
		return posicao;
	}
	
}

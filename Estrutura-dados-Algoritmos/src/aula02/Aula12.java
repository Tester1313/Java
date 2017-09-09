package aula02;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("A");
		arrayList.add("B");
		System.out.println(arrayList);
		
		arrayList.add(1, "AA"); // Coloca no indice desejado e passa os elementos para o prooxima posicao
		System.out.println(arrayList);
		
		if(arrayList.contains("A")) { // Contains verifica se o element esta dentro do Array
			System.out.println("Elemento existe no array");
		}else {
			System.out.println("Elemento nao existe no array");
		}
		
		int pos = arrayList.indexOf("B");
		
		if(pos > -1) { // Indexof busca o indice do elemento, senao achar resulta em -1
			System.out.println("Elemento existe no array" + pos);
		}else {
			System.out.println("Elemento nao existe no array");
		}
		
		//busca por posicao
		System.out.println(arrayList.get(2));
		
		// metodo para remover
		arrayList.remove(0);
		System.out.println(arrayList);
		arrayList.remove("AA");
		System.out.println(arrayList);
		
		
		//Tamanho
		System.out.println(arrayList.size());
		
		
	}

}

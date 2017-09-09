package aula02;

import estruturas.Vetor;

public class Aula3 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(5);

		if(vetor.adiciona("elemento 1")) {
			System.out.println("Elemento adicionado");
		}
		vetor.adiciona("elemento 2");



	}

}

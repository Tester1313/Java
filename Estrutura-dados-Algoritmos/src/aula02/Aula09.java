package aula02;

import estruturas.Vetor;

public class Aula09 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(3);

		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");

		System.out.println(vetor);
		vetor.remove(1);
		System.out.println(vetor);


		System.out.println("Remover elemento E");
		int pos = vetor.busca("E");
		if(pos>=0) {
			vetor.remove(pos);
		}
		System.out.println(vetor);
	}

}

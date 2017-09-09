package aula02;

import estruturas.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VetorObjetos vetor = new VetorObjetos(3);

		Contato c1 = new Contato("Contato1", "342693491", "teste1@email");
		Contato c2 = new Contato("Contato2", "342693492", "teste2@email");
		Contato c3 = new Contato("Contato3", "342693493", "teste3@email");
		Contato c4 = new Contato("Contato1", "342693491", "teste1@email");

		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);

		System.out.println("Tamanho = " + vetor.getTamanho());

		int pos = vetor.busca(c4);
		
		if(pos >= 0) {
			System.out.println("Elemento existe");
		}else {
			System.out.println("Elemento nao existe");
		}
		System.out.println(vetor);
	}

}

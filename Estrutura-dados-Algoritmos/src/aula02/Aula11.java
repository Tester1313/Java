package aula02;

import estruturas.Lista;
import estruturas.VetorObjetos;

public class Aula11 {

	public static void main(String[] args) {
		//Trata a questao de aceitar diferente tipos de variaveis em um vetor
		
		Lista<Contato> vetor = new Lista<>(1);
		
		Contato c1 = new Contato("Contato1", "342693491", "teste1@email");
		Contato c2 = new Contato("Contato2", "342693492", "teste2@email");
		Contato c3 = new Contato("Contato3", "342693493", "teste3@email");
		Contato c4 = new Contato("Contato1", "342693491", "teste1@email");
		
		
	}

}

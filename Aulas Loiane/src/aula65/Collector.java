package aula65;

import aula61.Contato;

//Coletor lixo memoria java
public class Collector {
	
	//Obtem total de memoria utilizado para execução do programa
	public static void obterMemoriaUsada() {
		
		final int MB = 1024 * 1024;
		
		Runtime runtime = Runtime.getRuntime(); // Padrao singleton, apenas uma instancia
		
		System.out.println((runtime.totalMemory() - runtime.freeMemory()) / MB);
	}

	public static void main(String[] args) {
		
		Contato[] contatos = new Contato[10000];
		Contato contato;
		
		for(int i =0 ; i< contatos.length; i++) {
			contato = new Contato("Contato"+i,"12345678"+i,"contato"+i+"@email.com");
			contatos[i] = contato;
		}
		
		System.out.println("Contatos criados");
		
		obterMemoriaUsada();
		
		contatos = null;
		
		Runtime.getRuntime().runFinalization(); // Forca limpeza de memoria java
		
		Runtime.getRuntime().gc(); // Forca limpeza de memoria java

		System.out.println("Contatos removidos da memoria");
		
		obterMemoriaUsada();
	}

}

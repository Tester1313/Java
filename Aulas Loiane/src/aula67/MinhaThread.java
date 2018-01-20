package aula67;

public class MinhaThread extends Thread {
	
	private String nome;
	private int tempo;
	
	public MinhaThread(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		start();
	}
	
	// Nova Thread precisa sobrescrever o metodo Run
	
	@Override
	public void run() {
		//System.out.println("Execução de Thread");
		try {
			for(int i = 0; i< 6; i++ ) {
				System.out.println(nome + " contador "+ i);
				Thread.sleep(tempo); // Thread Dormi por 1 segundo
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Thread termina a execução - Estado Dead
		System.out.println(nome + "terminou a execucao"+ this.nome);
	
	}
}

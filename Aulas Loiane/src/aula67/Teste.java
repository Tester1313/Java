package aula67;

public class Teste {

	public static void main(String[] args) {
		
		MinhaThread thread = new MinhaThread("Thread #1",1000);
		//thread.start(); // Chama o metodo Run
		
		MinhaThread thread2 = new MinhaThread("Thread #2",2000);
		
		MinhaThread thread3 = new MinhaThread("Thread #3",5000);
	}

}

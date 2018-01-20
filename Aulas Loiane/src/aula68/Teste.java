package aula68;

public class Teste {

	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 5000);
		
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 1000);
		
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 3000);
		//Thread t1 = new Thread(thread1);
		//t1.start();
	}

}

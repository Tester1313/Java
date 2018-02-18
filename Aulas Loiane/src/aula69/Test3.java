package aula69;

public class Test3 {

	public static void main(String[] args) {
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 500);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 500);
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
	
		t1.start();
		
		/*try {
			t1.join(200); // espera a execu��o da Thread para continuar o c�digo
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//Thread 2 ser� executada apos o termino da Thread1 OU depois de 200ml segundos apos 
		// o inicio da primeira
		t2.start();
		
		/*try {
			t2.join(200); // espera a execu��o da Thread para continuar o c�digo
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		t3.start();
		
		/*try {
			t3.join(200); // espera a execu��o da Thread para continuar o c�digo
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		try {
			t1.join();
			t2.join();
			t3.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Programa finalizado");
	}
}

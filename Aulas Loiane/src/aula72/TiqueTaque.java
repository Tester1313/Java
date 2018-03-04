package aula72;

public class TiqueTaque {

	boolean tique;

	synchronized void tique(boolean estaExecutando) {

		if(!estaExecutando) {
			tique = true;
			notify(); // notifica a outra Thread

			return;
		}

		System.out.print("Tique ");

		tique = true;

		notify();
		
		try {
			while(tique) {
				wait();
			} 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	synchronized void taque(boolean estaExecutando) {

		if(!estaExecutando) {
			tique = false;
			notify(); // notifica a outra Thread

			return;
		}

		System.out.println("Taque ");

		tique = false;

		notify();
		
		try {
			while(!tique) {
				wait();
			} 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

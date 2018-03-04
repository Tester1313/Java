package aula71;

public class Calculadora {

	private int soma;
	
	//Synchronized garante que o recurso compartilhado entre thread
	// seja executado um de cada vez para o mesmo garantindo assim o valor exato da soma
	public synchronized int somaArray(int[] array) {
		soma = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			soma += array[i];
			
			
			//Pega o nome da thread em execucao
			System.out.println("Executando a soma "+ Thread.currentThread().getName() + 
					" somando o valor " + array[i] + " com total de " + soma); 
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return soma;
	}
}

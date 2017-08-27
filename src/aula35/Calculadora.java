package aula35;

public class Calculadora {
	public static int fatorial11(int num) {
		
		if(num == 0) {
			return 1;
		}
		
		int total = 1;
		for(int i = num; i>1; i--) {
			total *= i;
		}
		
		return total;
	}
	
	
	// Metodo Recursivo
	public static int fatorial(int num) {
		
		if(num == 0) {
			return 1;
		}
		return num * fatorial(num-1);
	}
}

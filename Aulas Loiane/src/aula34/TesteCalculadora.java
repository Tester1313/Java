package aula34;

public class TesteCalculadora {

	static int resultSoma;
	
	public static void main(String[] args) {
		
		/*MinhaCalculadora calc = new MinhaCalculadora();
		
		System.out.println(calc.soma(1,2));
		calc.soma(2.0, 2.1);*/
		resultSoma = MinhaCalculadora.soma(1, 2);
		

	}

	static int soma2Valores(int num1, int num2) {
		return MinhaCalculadora.soma(num1, num2);
	}
}

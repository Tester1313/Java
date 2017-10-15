package exeraula56;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("Calculadora");
		
		double x = 2.0;
		double y = 3.0;
		
		//Operacoes.values retorna todas as operações dentro do enumerador
		for (Operacoes op: Operacoes.values()) {
			System.out.print(x + " ");
			System.out.print(op.toString() + " ");
			System.out.print(y + " = ");
			System.out.println(op.executarOperacao(x, y));
		}
	}

	

}

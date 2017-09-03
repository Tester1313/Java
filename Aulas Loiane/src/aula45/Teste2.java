package aula45;

public class Teste2 {

	public static void main(String[] args) {
		
		// Object � a SuperClasse de todas as classes do Java
		//exemplo1: OK
		// retorno do m�todo pode referenciar String
		Object obj1 = obterString();
		String s1 =(String) obj1; // DownCasting
		
		// Exemplo2:Ok
		//Obj2 referencia String Explicitamente
		Object obj2 = "Minha String"; // UpCasting
		String s2 = (String) obj2;
		
		//Exemplo3: Falha em tempo de Execu��o
		Object obj3 = new Object(); // Da problema pq n�o faz referencia a uma String
		String s3 = (String) obj3;
		
		//Exemplo4: Falha em tempo de Compila��o
		//obj4 nunca referencia String j� que retorno m�todo � int
		Object obj4 = obterInteiro();
		String s4 = (String) obj4;
	}
	
	public static String obterString() {
		return "Minha String";
	}
	
	public static int obterInteiro() {
		return 1;
	}
	
}

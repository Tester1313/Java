
public class Exercicio4 {

	public static void main(String[] args) {
		// Descobre crescimento de paises
		int paisA = 80000;
		int paisB = 200000;
	
		for(int i=1; ; i++) {
			paisA += (paisA/100) * 3;
			paisB += (paisB/100)* 1.5;
			
			if( paisA > paisB) {
				System.out.println("Levar� "+i+" anos para o paisA alcancar a popula��o do paisB");
				break;
				
			}
			
		}
	} 

}

package aula19;


public class Aula19 {

	public static void main(String[] args) {
		// Vetores ou Arrays
		
		// Armazenar a temperatura media por 1 ano
		
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;
		
		System.out.println("O valor da temperatura do dia 1 é: "+temperaturas[0]);
		
		// O tamanho do Array
		System.out.println("O tamanho do Array: "+temperaturas.length);
		
		// Versão padrao do For com Array
		/*for(int i = 0; i < temperaturas.length ; i++ ) {
			System.out.println("O valor da temperatura do dia "+(i+ 1) +" é: "+temperaturas[i]);
		}*/
		
		// Laço melhorado para trabalhar com Array
		// disponivel a partir do Java 5
		// joga as possições dentro de temp
		for( double temp : temperaturas) {
			System.out.println(temp);
		}
		
		
	}

}

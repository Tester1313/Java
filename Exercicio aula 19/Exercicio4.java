package exerciciosAula17;
import java.text.DecimalFormat;

public class Exercicio4 {

	public static void main(String[] args) {
		// Cria 2 Arrays e passa o valor da raiz quadrada para o segundo
		
		int[] vetor1 = new int[15];
		vetor1[0]= 1;
		vetor1[1]= 2;
		vetor1[2]= 3;
		vetor1[3]= 4;
		vetor1[4]= 5;
		vetor1[5]= 6;
		vetor1[6]= 7;
		vetor1[7]= 8;
		vetor1[8]= 1;
		vetor1[9]= 2;
		vetor1[10]= 3;
		vetor1[11]= 4;
		vetor1[12]= 5;
		vetor1[13]= 6;
		vetor1[14]= 7;
		//vetor1[15]= 8;
		double[] vetor2 = new double[15];
		
		for(int i = 0; i <vetor1.length; i++) {
			vetor2[i] = Math.sqrt(vetor1[i]); // pega a raiz quadrada do valor do vetor1
			System.out.println("Valor de vetor2 na posição "+i+" é: "+vetor2[i]);
		}
	}

	
}

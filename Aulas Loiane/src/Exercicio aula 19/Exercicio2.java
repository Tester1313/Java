package exerciciosAula17;

public class Exercicio2 {

	public static void main(String[] args) {
		// Passa os valores de um vetor para outro porém com o valor multiplicado por 2
		
		int[] vetor1 = new int[8];
		vetor1[0]= 1;
		vetor1[1]= 2;
		vetor1[2]= 3;
		vetor1[3]= 4;
		vetor1[4]= 5;
		vetor1[5]= 6;
		vetor1[6]= 7;
		vetor1[7]= 8;
		
		int[] vetor2 = new int[8];
		
		for(int i = 0; i <vetor1.length; i++) {
			vetor2[i] = vetor1[i] * 2;
			System.out.println("Valor de vetor2 na posição "+i+" é: "+vetor2[i]);
		}
	}

}

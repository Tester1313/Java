package exerciciosAula17;

public class Exercicio3 {

	public static void main(String[] args) {
		// Cria 2 Arrays e passa o valor dobrado para o 2 vetor
		
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
		int[] vetor2 = new int[15];
		
		for(int i = 0; i <vetor1.length; i++) {
			vetor2[i] = vetor1[i] * vetor1[i];
			System.out.println("Valor de vetor2 na posição "+i+" é: "+vetor2[i]);
		}
	}

}

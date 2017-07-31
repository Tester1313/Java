package exerciciosAula17;

public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetor1 = new int[10];
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
		//vetor1[10]= 3;
		int[] vetor2 = new int[10];
		vetor2[0]= 1;
		vetor2[1]= 2;
		vetor2[2]= 3;
		vetor2[3]= 4;
		vetor2[4]= 5;
		vetor2[5]= 6;
		vetor2[6]= 7;
		vetor2[7]= 8;
		vetor2[8]= 1;
		vetor2[9]= 2;
		
		int[] vetor3 = new int[10];
		
		for(int i = 0; i <vetor1.length; i++) {
			vetor3[i] = vetor1[i] / vetor2[i]; 
			System.out.println("Valor de vetor2 na posição "+i+" é: "+vetor3[i]);
		}

	}

}

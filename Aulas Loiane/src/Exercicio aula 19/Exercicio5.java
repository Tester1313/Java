package exerciciosAula17;

public class Exercicio5 {

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
		
		for(int i = 0; i <vetor1.length; i++) {
			vetor2[i] = vetor1[i]*i; 
			System.out.println("Valor de vetor2 na posição "+i+" é: "+vetor2[i]);
		}
	}

}

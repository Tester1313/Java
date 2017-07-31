package exerciciosAula17;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetor1 = new int[4];
		vetor1[0]= 1;
		vetor1[1]= 2;
		vetor1[2]= 3;
		vetor1[3]= 4;
		
		int[] vetor2 = new int[4];
		
		for(int i = 0 ; i < 4; i++) {
			vetor2[i] = vetor1[i];
			System.out.println("Valor do vetor2 na posição "+i+" é: "+vetor2[i]);
		}
	}

}

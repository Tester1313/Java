package exerciciosAula20;

import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) {
		// Gerar matriz 4x4 e determinar o maior valor dessa matriz e posição
		Random numeroRandom = new Random();
		int[][] numAleatorios = new int[4][4];
		
		for(int i=0;i <numAleatorios.length ; i++) {
			for(int j=0; j< numAleatorios[i].length; j++) {
				numAleatorios[i][j] = numeroRandom.nextInt(10);
			}
		}
		
		
		int maior = 0;
		int linha = 0;
		int coluna = 0;
		
		for(int i=0;i <numAleatorios.length ; i++) {
			for(int j=0; j< numAleatorios[i].length; j++) {
				if(numAleatorios[i][j] > maior) {
					maior= numAleatorios[i][j];
					linha=i;
					coluna = j;
				}
			}
		}
		
		System.out.println("O maior valor dessa matriz é "+maior+ " e fica na linha: "+linha+" e coluna: "+coluna);
		
		// Para conferencia de valores
		for(int i=0;i <numAleatorios.length ; i++) {
			for(int j=0; j< numAleatorios[i].length; j++) {
				System.out.print(numAleatorios[i][j]+ " ");
			}
			System.out.println();
		}
	}

}

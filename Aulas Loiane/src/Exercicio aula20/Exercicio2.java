package exerciciosAula20;

import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random numeroRandom = new Random(10);
		Scanner scan = new Scanner(System.in);
		
		int[][] matriz = new int[10][10];
		
		for(int i=0; i< matriz.length;i++) {
			for(int j=0; j< matriz[i].length; j++) {
				matriz[i][j]= numeroRandom.nextInt(10);
			}
		}
		
		
		// Confere linha 5
		int maiorLinha = 0;
		int menorLinha = 11;
		
		for(int i=5; i< matriz.length;i+=2) {
			for(int j=1; j< matriz[i].length; j++) {
				if(i==5  && matriz[i][j] > maiorLinha ) {
					maiorLinha = matriz[i][j];
				}
				
				if(i==5  && matriz[i][j] < menorLinha ) {
					menorLinha = matriz[i][j];
				}
					
			}
		}
		
		System.out.println("O maior valor da linha 5 é: "+maiorLinha+" e o menor: "+menorLinha);
		
		// Confere coluna 7
		int maiorColuna = 0;
		int menorColuna = 11;
		
		for(int i=1;i<matriz.length;i++) {
			for(int j=1; j<matriz[i].length; j++) {
				
				if(j==7 && matriz[i][j] > maiorColuna) {
					maiorColuna = matriz[i][j];
				}
				if(j==7 && matriz[i][j] < menorColuna) {
					menorColuna = matriz[i][j];
				}
			}
		}
		
		System.out.println("O maior valor da coluna 7 é: "+maiorColuna+" e o menor: "+menorColuna);
		
		
		//Conferir saida da matriz
		for(int i=0; i< matriz.length;i++) {
			for(int j=0; j< matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}

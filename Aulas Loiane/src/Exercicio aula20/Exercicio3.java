package exerciciosAula20;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Le Matriz 3x3 e apresenta a quantidade de pares e impares
		Scanner scan = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int qtdPares = 0 ;
		int qtdImpares = 0;
		
		for(int i =0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.println("Digite um valor para matriz: ");
				matriz[i][j] = scan.nextInt();
			}
		}
		
		for(int i =0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if( matriz[i][j] %2 == 0) {
					qtdPares++;
				}else {
					qtdImpares++;
				}
			}
		}
		
		System.out.println("Nessa matriz temos "+qtdPares+" números pares e "+qtdImpares+" números impares.");
		
		// Confere entradas da matriz
		for(int i =0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}

}

package aula35.labs;

import java.util.Scanner;

public class Exer04 {
	
	public static void main(String[] args) {
		
		jogoDaVelha jogoDaVelha = new jogoDaVelha();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		// Enquanto ninguem ganhar, o la�o continua
		boolean ganhou= false;
		char sinal;
		int linha = 0, coluna = 0;
		
		while(!ganhou) {
			if(jogoDaVelha.vezJogador1()) {
				System.out.println("Vez do Jogador 1. Escolha Linha e coluna(1-3)");
				sinal = 'X';
			}else {
				System.out.println("Vez do Jogador 1. Escolha Linha e coluna(1-3)");
				sinal = 'O';
			}
			
			linha = valor("Linha", scan);
			coluna = valor("Coluna", scan);
			
			if(!jogoDaVelha.validarJogada(linha, coluna, sinal)) {
				System.out.println("Posi��o j� usada, tente novamente.");
			}
			
			jogoDaVelha.imprimirTabuleiro();
			
			if(jogoDaVelha.verificarGanhador('X')) {
				ganhou = true;
				System.out.println("Parab�ns, jogador 1 ganhou.");
			}else if(jogoDaVelha.verificarGanhador('O')) {
				ganhou = true;
				System.out.println("Parab�ns, jogador 2 ganhou.");
			}else if(jogoDaVelha.jogada > 9){
				ganhou = true;
				System.out.println("Ninguem ganhou essa partida");
			}
		}
	}
	
	static int valor(String tipoValor, Scanner scan) {
		int valor = 0;
		boolean valorValida = false;
		while (!valorValida) {
			System.out.println("Entre com a "+ tipoValor +" (1,2 ou 3)");
			valor = scan.nextInt();
			if (valor >= 1 && valor <= 3) {
				valorValida = true;
			} else {
				System.out.println("Entrada inv�lida, tente novamnete.");
			}
		}
		valor--;
		return valor;
	}

}

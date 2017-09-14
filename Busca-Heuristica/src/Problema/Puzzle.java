package Problema;

import java.util.Random;

import javax.swing.ImageIcon;

public class Puzzle {
	
	// Constantes
	public final float CUSTO = 1.0f;
	public final int LINHA = 3;
	public final int COLUNA = 3;
	
	private int puzzle[][];
	private Posicao posicao;
	private float custoAtual;
	private float f; // valor da funcao de avaliacao
	
	
	//Construtor
	public Puzzle(float c) {
		
		this.custoAtual = c;
		this.puzzle = new int[LINHA][COLUNA];
		
		//Preenche a matriz com 0
		for(int i = 0; i<this.puzzle.length; i++) {
			for(int j = 0; j < this.puzzle[i].length; j++) {
				this.puzzle[i][j] = 0;
			}
		}
	
		this.posicao = new Posicao();  // inicializa posicao
	}
	
	// Construtor recebe outro puzzle como parametro e clona o mesmo
	public Puzzle(Puzzle outro_Puzzle) {
		this.puzzle = outro_Puzzle.getPuzzle();
		
		this.posicao = new Posicao();
		this.posicao.setX(outro_Puzzle.getPosicao().getX());
		this.posicao.setY(outro_Puzzle.getPosicao().getY());
		
		this.custoAtual = outro_Puzzle.getCustoAtual();
		this.f = outro_Puzzle.getF();
	}
	
	// Metodos Get e Set
	public int[][] getPuzzle() {
		return puzzle;
	}

	public void setPuzzle(int[][] puzzle) {
		
		this.puzzle = puzzle;
		
		this.posicao.setX(procuraPosicao().getX());
		this.posicao.setY(procuraPosicao().getY());
	}

	public Posicao getPosicao() {
		return posicao;
	}

	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}

	public float getCustoAtual() {
		return custoAtual;
	}

	public void setCustoAtual(float custoAtual) {
		this.custoAtual = custoAtual;
	}

	public float getF() {
		return f;
	}

	public void setF(float f) {
		this.f = f;
	}
	
	// Faz a busca celula a celula do espaço em branco na matriz
	public Posicao procuraPosicao() {
		Posicao aux = new Posicao();
		
		for(int i = 0 ; i< LINHA; i++) {
			for(int j = 0; j < COLUNA; j++) {
				if(this.puzzle[i][j] == -1) {
					posicao.setX(i);
					posicao.setY(j);
				}
			}
		}
		return aux;
	}
	
	//Metodo que mostra Puzzle
	public void mostraPuzzle() {
		for( int i = 0 ; i < LINHA;i++) {
			for(int j = 0; j < COLUNA; j++) {
				if(this.puzzle[i][j] == -1) {
					System.out.print(" " + " ");
				} else {
					 System.out.print(this.puzzle[i][j] + " ");
				}
			}
			 System.out.println();
		}
		
		//ImageIcon icone = new ImageIcon(puzzle);
	}
	
	//Cria puzzle Randomico com movimentos permitidos e cria solucao
	public void criaPuzzleRandomico() {
		Random r = new Random();
		mostraPuzzle();
		criaSolucao();
		
		for(int i = 0; i < 50 ;i++) {
			switch (((r.nextInt() % 4) + 1 )) {
			case 1:
				move_down();
			case 2:
				move_top();
			case 3:
				move_left();
			case 4:
				move_right();
			}
		}
		this.f = this.CUSTO + getHeuristica();
		mostraPuzzle();
	}
	
	//Metodo cria puzzle identico a solucão
	public void criaSolucao() {
		for(int i = 0;i < LINHA; i++) {
			for(int j = 0; j < COLUNA; j++) {
				this.puzzle[i][j] = i * 3 + j + 1;
				//mostraPuzzle();
			}
		}
		this.puzzle[2][2]= -1;
		
		this.posicao.setX(procuraPosicao().getX());
		this.posicao.setY(procuraPosicao().getY());
		
	}
	
	//Metodo de troca de valores de duas posicoes
	public void Troca(Posicao a, Posicao b) {
		int aux = this.puzzle[a.getX()][a.getY()];
		this.puzzle[a.getX()][a.getY()] = this.puzzle[b.getX()][b.getY()];
		this.puzzle[b.getX()][b.getY()] = aux;
	}
	
	//Metodos de Movimento
	// Esquerda
	public boolean move_left() {
		if(this.posicao.getX() == 0) {
			return false;
		}else {
			Posicao  TrocaPosicao = new Posicao();
			TrocaPosicao.setX(posicao.getX());
			TrocaPosicao.setY(posicao.getY());
			Troca(posicao, TrocaPosicao);
			posicao.setY(TrocaPosicao.getY());
			
			//Calcula o novo custo
			this.f = this.custoAtual + getHeuristica();
			return true;
		}
	}
		
	// pra baixo
	public boolean move_down() {
		if(this.posicao.getX() == 2) {
			return false;
		}else {
			Posicao TrocaPosicao = new Posicao();
			TrocaPosicao.setX(posicao.getX()+1);
			TrocaPosicao.setY(posicao.getY());
			Troca(posicao, TrocaPosicao);
			posicao.setY(TrocaPosicao.getY());
			
			//Calcula o novo custo
			this.f = this.custoAtual + getHeuristica();
			return true;
		}
	}
	
	//Direita
	public boolean move_right() {
		if(this.posicao.getX() == 2) {
			return false;
		}else {
			
			Posicao TrocaPosicao = new Posicao();
			TrocaPosicao.setX(posicao.getX());
			TrocaPosicao.setY(posicao.getY()+1);
			Troca(posicao, TrocaPosicao);
			posicao.setY(TrocaPosicao.getY());

			//Calcula o novo custo
			this.f = this.custoAtual + getHeuristica();
			return true;
		}
	}
	
	//Pra cima
	public boolean move_top() {
		if(this.posicao.getX() == 2) {
			return false;
		}else {
			Posicao TrocaPosicao = new Posicao();
			TrocaPosicao.setX(posicao.getX()-1);
			TrocaPosicao.setY(posicao.getY());
			Troca(posicao, TrocaPosicao);
			posicao.setY(TrocaPosicao.getY());

			//Calcula o novo custo
			this.f = this.custoAtual + getHeuristica();
			return true;
		}
			
	}
	
	public int getHeuristica() {
		Puzzle solucao = new Puzzle(this.CUSTO); // Custo 1
		int posicao_diferente = 0;
		
		solucao.criaSolucao();
		for(int i = 0; i< LINHA; i++) {
			for (int j = 0; j < COLUNA; j++) {
				if(solucao.puzzle[i][j] != this.puzzle[i][j])
					posicao_diferente++;
			}
		}
		return posicao_diferente;
	}
}

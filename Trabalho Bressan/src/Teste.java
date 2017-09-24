import java.util.Random;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int[][] teste = gerarMatrizAleatoria(random);
		Puzzle a = new Puzzle(teste);
		a.mostraMatriz(teste);
	}

	static int[][] gerarMatrizAleatoria(Random random) {
		int[][] matriz = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3;j++) {
				matriz[i][j] = random.nextInt(8);
			}
		}
		return matriz;
	}
}

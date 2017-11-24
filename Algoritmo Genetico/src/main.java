import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		//http://www.inf.ufsc.br/~alexandre.goncalves.silva/courses/14s2/ine5633/slides/aulaAG.pdf
		Scanner scan = new Scanner(System.in);
		Matriz matriz = new Matriz();
		
		String nome;
		List list = new ArrayList<ArrayList>();
		// Classe que le e inicializa matriz
		LeArquivo le = new LeArquivo(new int [26][26]);
		
		nome ="c:\\teste\\26.txt";
		scan.close();
		le.leituraDeArquivo(nome); // le  arquivo e inicializa matriz
		
		//Passo a matriz do txt para a classe matriz
		matriz.setMatriz(le.getMatriz());
		
		//for (int i = 0; i <100; i++) {
			GeraGeracoes geracoes = new GeraGeracoes(26,matriz);
			list = geracoes.gerarGeracoes();
		
			list = matriz.calcularDistancia(list);
			matriz.OrdenaVetor(list);
			geracoes.imprimirGeracoes(list);
		
			list = geracoes.crossover(list,1000);
		
			System.out.println("Melhor caminho: "+ geracoes.getBestway());
		//}
	
	}

}

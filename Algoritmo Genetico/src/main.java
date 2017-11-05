import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
<<<<<<< HEAD
=======
import java.util.Collections;
import java.util.Comparator;
>>>>>>> 451565914baad5c44e57016532cfbcf598a4c2d6
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
<<<<<<< HEAD
		
=======
		//http://www.inf.ufsc.br/~alexandre.goncalves.silva/courses/14s2/ine5633/slides/aulaAG.pdf
>>>>>>> 451565914baad5c44e57016532cfbcf598a4c2d6
		Scanner scan = new Scanner(System.in);
		Matriz matriz = new Matriz();
		
		String nome;
		List list = new ArrayList<ArrayList>();
		// Classe que le e inicializa matriz
		LeArquivo le = new LeArquivo(new int [48][48]);
		
		//System.out.println("Digite o caminho do arquivo: ");
		//nome = scan.nextLine();
		nome ="c:\\teste\\b.txt";
		scan.close();
		le.leituraDeArquivo(nome); // le  arquivo e inicializa matriz
		
		//Passo a matriz do txt para a classe matriz
		matriz.setMatriz(le.getMatriz());
		
<<<<<<< HEAD
		matriz.imprimirMatriz();
=======
		//matriz.imprimirMatriz();
>>>>>>> 451565914baad5c44e57016532cfbcf598a4c2d6
		
		//ArrayList minhaCidades = new ArrayList();
		
		
		GeraGeracoes geracoes = new GeraGeracoes(10);
		geracoes.imprimirArray();
		list = geracoes.gerarGeracoes();
<<<<<<< HEAD
		//geracoes.imprimirGeracoes();
		
		matriz.calcularDistancia(list);
		geracoes.imprimirGeracoes();
=======
		geracoes.imprimirGeracoes(list);
		
		list = matriz.calcularDistancia(list);
		matriz.OrdenaVetor(list);
		
		geracoes.imprimirGeracoes(list);
		geracoes.crossover(list);
	
		
		System.out.println(list);
>>>>>>> 451565914baad5c44e57016532cfbcf598a4c2d6
	
	}

}

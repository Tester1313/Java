import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
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
		
		matriz.imprimirMatriz();
		
		//ArrayList minhaCidades = new ArrayList();
		
		
		GeraGeracoes geracoes = new GeraGeracoes(10);
		geracoes.imprimirArray();
		list = geracoes.gerarGeracoes();
		//geracoes.imprimirGeracoes();
		
		matriz.calcularDistancia(list);
		geracoes.imprimirGeracoes();
	
	}

}

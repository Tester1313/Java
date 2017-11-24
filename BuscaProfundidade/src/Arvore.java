import java.util.ArrayList;
import java.util.Random;

public class Arvore {

	public static void main(String[] args) {
		/*
		 * Exemplo simples de um grafo
		 * 
		 *          _______ (1) ________
		 *          
		 *         /         |          \ 
		 *         
		 *       (2)        (3)          (4) 
		 *       
		 *       / \        / \          / 
		 *       
		 *    (5)   (6)   (7)  (8)     (9)
		 *    
		 *    / 
		 *    
		 *  (10)
		 * 
		 */
		Random random = new Random();
		ArrayList<String> teste = new ArrayList<String>();
		String[][] matriz = {{"1","2","3"}, {"4","5","6"}, {"7","8",""}}; 
		
		String[][]randomica = {{"8","7","6"},{"5","4","3"},{"2","1",""}};
		
		Vertice v1 = new Vertice(randomica);
		
		Manipula mp = new Manipula();
		//mp.exbirConeccao(v1);
		
		mp.exibeTodosVertices(v2);
		
	}

}

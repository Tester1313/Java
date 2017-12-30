package aula59;

// Static Import
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
//import static java.lang.Math.*; // Importa todos os metodos da classe Math

public class StaticImport {

	public static void main(String[] args) {
		
		double a = 2;
		double b = 3;
		double c = 4;
		
		System.out.println(pow(a, b)); // 2 ^ 3

		System.out.println(sqrt(c)); // Raiz de 4
	}

}

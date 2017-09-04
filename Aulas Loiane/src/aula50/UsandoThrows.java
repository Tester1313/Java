package aula50;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {
		
		System.out.println("Entre com um n�mero decimal: ");
		try {
			double num = leNumero();
			System.out.println("Voc� digitou "+num);
		} catch (Exception e) {
			System.out.println("Entra inv�lida");
			e.printStackTrace();
		}
	}
	
	// Throws ir� tercerizar essa Exception
	public static double leNumero() throws Exception {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}

}

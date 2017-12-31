package aula63;

public class ExemploPrintf {

	public static void main(String[] args) {
		
		System.out.printf("Hello %s", "teste");
		System.out.println();
		
		System.out.printf("%S", "ola mundo" ); //deixa caixa alta
		
		System.out.printf("%c", 'o' );
		
		System.out.printf("%C", 'o' );
		
		System.out.printf("%n" );
		
		int valor = 123456789;
		
		System.out.printf("%d", valor);
		
		
		double pontoFlutuante = 1.14222;
		System.out.printf("%f", pontoFlutuante );
		
		System.out.println();
		
		String olaMundo = "Ola Mundo";
		System.out.printf("%20s", olaMundo);
		
		System.out.println();
		
		System.out.printf("%-20s", olaMundo);
		
		System.out.println();
		System.out.printf("%+d", valor);

		System.out.println();
		System.out.printf("%015d", valor);// 15 caracteres, se faltar completa com zero
		
		System.out.println();
		System.out.printf("%,d", valor);
		System.out.println();
		
		int valor2 = -12345678;
		
		
		System.out.printf("% d", valor2);
		
		System.out.println();
		System.out.printf("%,3f", pontoFlutuante );
		
		testeMaisCompleto();
		
	}
	
	private static void testeMaisCompleto() {
		double[] precos = {10000, 123.54, 1843.567, 1, 4.56789};
		
		for(int i = 0; i < precos.length; i++) {
			System.out.printf("%s %02d: total de de R$%,10.2f%n","Item",i,precos[i]);
		}
	}

}

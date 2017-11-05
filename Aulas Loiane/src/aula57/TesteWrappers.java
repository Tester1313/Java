package aula57;

public class TesteWrappers {

	public static void main(String[] args) {
		
		short num = 1;
		byte num2 = 20;
		int num3  = 100;
		long num4 = 10000;
		float num5 = 2.5f;
		double num6 = 2.33;
		boolean flag = true;
		char a = 'a';
		
		// Classe Wrapper
		Short num7 = new Short((short) 1);
		Byte num8 = new Byte((byte)20);
		Integer num9 = new Integer(100);
		Long num10 = new Long(1000l);
		Float num11= new Float(2.5f);
		Double num12 = new Double(2.33);
		Boolean flag2 = new Boolean(true);
		Character b = new Character('b');
		
		int num16 = Integer.parseInt("1000"); // Converte String para inteiro
	}
}

package aula58;

public class TesteAutoboxing {

	public static void main(String[] args) {
		
		// autoboxing
		Short num7 =  1;
		Byte num8 = 20;
		Integer num9 = 100;
		Long num10 = 1000l;
		Float num11= 2.5f;
		Double num12 = 2.33;
		Boolean flag2 = true;
		Character b = 'b';
		
		//auto un-boxing
		int num13 = num9;
		
		num9++;
		System.out.println(num9);
		
		//auto unboxing num9 -> autoboxing num13/num9 -> num14
		Integer num14 = num13/num9;
	}

}

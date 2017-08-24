package labs;

public class Somatorio {	
	
	public static int somatorio(int num) {
		if(num > 100) {
			return 1;
		}
		System.out.println(num);
		return num + somatorio(num);
	}

}

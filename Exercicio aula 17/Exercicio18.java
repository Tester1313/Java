import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// Verifica se � n�mero primo ou n�o
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero");
        int num = scan.nextInt();
        
        boolean primo = true;
        
        // verifica todos os valores de 2 at� 1 a menos que o valor
        for (int i=2; i<num; i++){
            if (num % i == 0){
                System.out.println("N�o � primo - divis�vel por " + i);
                primo = false;
                //break;
            }
        }
        
        if (primo){
            System.out.println("� n�mero primo");
        }
	
	}

}

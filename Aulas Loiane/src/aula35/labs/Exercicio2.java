package aula35.labs;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		conta conta = new conta();
		
		conta.numero = "123456";
		conta.agencia = "1234";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.saldo = -10;
		conta.valorEspecialUsado = 0;
		
		boolean saqueEfetuado = conta.realizarSaque(900);
		conta.consultarSaldo();
		
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso.");
			System.out.println("Saldo atual da conta = "+ conta.saldo);
		}else {
			System.out.println("Saldo indisponivel.");
		}
		
		conta.depositar(10);
		conta.consultarSaldo();
		conta.realizarSaque(100);
		conta.consultarSaldo();
		if(conta.verificarUsoChequeEspecial()) {
			System.out.println("Esta utilizando cheque especial");
		}else {
			System.out.println("Não está utilizando cheque especial");
		}
	}

}

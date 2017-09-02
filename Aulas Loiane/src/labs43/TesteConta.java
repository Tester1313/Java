package labs43;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Teste contaBancaria");
		ContaBancaria conta = new ContaBancaria();
		conta.setNomeCliente("Thiago");
		conta.setNumConta("12345");
		
		conta.realizarDeposito(100);
		
		realizarSaque(conta, 50);
		
		realizarSaque(conta, 70);
		//System.out.println(conta);
		
		System.out.println("Teste contaPoupanca");
		ContaPoupanca poupanca = new ContaPoupanca() ;
		poupanca.setNomeCliente("Loiane");
		poupanca.setNumConta("54321");
		poupanca.setDiaRendimento(2);
		
		poupanca.realizarDeposito(100);
		
		realizarSaque(poupanca , 50);
		realizarSaque(poupanca , 70);
		
		if(poupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Novo rendimento aplicado, novo saldo é de: "+poupanca.getSaldo());
		}else {
			System.out.println("Hoje não é dia de rendimento");
		}
		
		System.out.println(poupanca);
		
		System.out.println("Teste contaEspecial");
		ContaEspecial especial = new ContaEspecial() ;
		especial.setNomeCliente("Loiane");
		especial.setNumConta("543232321");
		especial.setLimite(50);
		//especial.setDiaRendimento(2);
		
		especial.realizarDeposito(100);
		
		realizarSaque(especial , 50);
		realizarSaque(especial , 70);
		realizarSaque(especial , 80);
		
		System.out.println(especial);

	}
	
	private static void realizarSaque(ContaBancaria conta, double valor) {
		if(conta.realizarSaque(valor)) {
			System.out.println("Saque efetuado com suscesso, novo saldo: "+ conta.getSaldo());
		}else {
			System.out.println("Saldo insuficiente para saque de "+valor+" Saldo de: "+conta.getSaldo());
		}
	}
}

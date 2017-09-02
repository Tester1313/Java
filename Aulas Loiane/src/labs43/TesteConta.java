package labs43;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBancaria conta = new ContaBancaria();
		conta.realizarDeposito(300);
		conta.realizarSaque(299);
		
		ContaPoupanca poupanca = new ContaPoupanca() ;
		poupanca.realizarDeposito(1000);;
		poupanca.calcularNovoSaldo(10);
		System.out.println("Saldo: "+poupanca.getSaldo());
		
		ContaEspecial especial = new ContaEspecial();
		especial.setLimite(100);
		especial.realizarDeposito(1000);
		
		especial.realizarSaque(1200);
	}

}

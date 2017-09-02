package labs43;

public class ContaPoupanca extends ContaBancaria {
	
	private String diaRendimento;
	
	public void calcularNovoSaldo(double taxaRendimento) {
		double aux = 0;
		aux = (super.getSaldo()*taxaRendimento)/100;
		
		super.setSaldo(super.getSaldo() + aux);
	}
}

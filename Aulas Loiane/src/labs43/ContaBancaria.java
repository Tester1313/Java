package labs43;

public class ContaBancaria {
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void realizarSaque(double valor) {
		if(this.getSaldo() >= valor) {
			this.setSaldo(this.saldo - valor);
			System.out.println("Saque no valor de "+valor+" realizado com sucesso.");
			System.out.println("Seu saldo atual é de: "+this.getSaldo());
		}else {
			System.out.println("Você não tem saldo suficiente para realizar o saque.");
			System.out.println("Seu saldo atual é de: "+this.getSaldo());
		}
	}
	
	public void realizarDeposito(double valor) {
		this.setSaldo(this.saldo += valor);
		System.out.println("Deposito no valor de "+valor+" realizado com sucesso.");
		System.out.println("Seu saldo atual é de: "+this.getSaldo());
	}
}

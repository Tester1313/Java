package labs43;

public class ContaEspecial extends ContaBancaria {
	
	double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void realizarSaque(double valor) {
		if(this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Saque no valor de "+valor+" realizado com sucesso.");
			System.out.println("Seu saldo atual é de: "+this.getSaldo());
		
		}else if ( (this.getSaldo() + this.limite) >= valor){
			this.setSaldo(this.getSaldo()-valor);
			System.out.println("Saque no valor de "+valor+" realizado com sucesso.");
			System.out.println("Seu saldo atual é de: "+this.getSaldo());
		}else {
			System.out.println("Você não tem saldo suficiente para realizar o saque.");
			System.out.println("Seu saldo atual é de: "+this.getSaldo());
		}
	}
}

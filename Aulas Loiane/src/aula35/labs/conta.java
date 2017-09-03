package aula35.labs;

public class conta {
    String numero, agencia;
	double saldo, limiteEspecial, valorEspecialUsado;
	boolean status, especial;
	
	boolean realizarSaque(double quantiaASacar) {
		
		// tem saldo na conta
		if(saldo >= quantiaASacar) {

			saldo -= quantiaASacar;
			return true;
		} else { // Não tem saldo na conta
			
			if(especial) {
				//Verificar se o limite especial tem saldo
				double limite = limiteEspecial + saldo;
				if(limite >= quantiaASacar) {
					saldo -= quantiaASacar;
					return true;
				}else {
					return false;
				}
			}else {
				return false; // não é especial e nao tem saldo
			}
		}
		
	}
	
	void depositar(double valor) {
		
		if( valor > 0) {
			saldo += valor;
			consultarSaldo();
		} else {
			System.out.println("Valor invalido");
		}
		
	}
	
	void consultarSaldo() {
		
		System.out.println("Seu saldo é de :"+ saldo);
	}
	
	boolean verificarUsoChequeEspecial() {
		return saldo < 0;
	}
	
}

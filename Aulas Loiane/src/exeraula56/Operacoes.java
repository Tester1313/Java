package exeraula56;

public enum Operacoes {
	SOMAR("+") {
		@Override
		public double executarOperacao(double x, double y) {
			return x+y;
		}
	},SUBTRAIR("-") {
		@Override
		public double executarOperacao(double x, double y) {
			return x-y;
		}
	},MULTIPLICAR("*") {
		@Override
		public double executarOperacao(double x, double y) {
			return x*y;
		}
	},DIVIDIR("/") {
		@Override
		public double executarOperacao(double x, double y) {
			if(y != 0) {
				return x/y;
			}else {
				return 0;
			}
			
		}
	};
	
	private String operacao;
	
	Operacoes(String operacao){
		this.operacao = operacao;
	}
	
	public String toString() {
		return this.operacao;
	}
	public abstract double executarOperacao(double x,double y);
		
	
}

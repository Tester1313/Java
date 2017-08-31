package aula42;

public class Professor {
	
	private double salario;
	private String nomeCurso;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public double calcularSalarioLiquido() {
		return 0;
	}
	
	// Muda o comportamento herdado da Classe Pai ( Pessoa)
	// Sobreescre o metodo herdado
	//public String obterEtiquetaEndereco() {

	//	String s = "Endereco do Professor:\n ";
	//	s += super.getEndereco();
		
	//	return s;
	//}
	
	// Anotação Override
	//@Override
	//public void imprimirEtiquetaEndereco() {
		
	//	System.out.println(this.obterEtiquetaEndereco());
	//}
	
	
}

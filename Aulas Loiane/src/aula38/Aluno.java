package aula38;

public class Aluno extends Pessoa {

	private String curso;
	private double[] notas;
	

	public Aluno(String curso, double[] notas) {
		super(); // Funciona como o this porem faz referencia a super classe
		this.curso = curso;
		this.notas = notas;
	}
	
	
	
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
		this.curso = curso;
	}


	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	public void teste() {
		super.setCpf("4445545454");
		this.setCpf("445454545");
	}
}

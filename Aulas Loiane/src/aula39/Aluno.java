package aula39;

public class Aluno extends Pessoa {

	private String curso;
	private double[] notas;
	//Protected é visivel na subclasse também ao contrario do default
	
	public Aluno(String nome, String endereco, String telefone, String cpf, String curso, double[] notas) {
		//super(nome, endereco, telefone, cpf);
		this.curso = curso;
		this.notas = notas;
	}

	public void verificarAcesso() {
		//super.
		super.nomeVisibilidade = "Thiago";
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
}

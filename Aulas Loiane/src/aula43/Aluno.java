package aula43;

import java.util.Arrays;

public class Aluno {

	private String curso;
	private double[] notas;
	
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
	
	// Muda o comportamento herdado da Classe Pai ( Pessoa)
	// Sobreescre o metodo herdado
	public String obterEtiquetaEndereco() {

		String s = "Endereco do aluno:\n ";
		//s += super.getEndereco();
		
		return s;
	}
	
	//@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("Imprimindo endereco do aluno");
		System.out.println(this.obterEtiquetaEndereco());
	}
	
	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}
	
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if (obj == null)
			return false;
	
		Aluno other = (Aluno)obj;
		
		if(curso.equalsIgnoreCase(other.getCurso())) {
			return true;
		
		}
		return true;
	}
	
	/*public String toString() {
		String s = curso +"\n";
		for (double nota: notas) {
			s+= nota +" ";
		}
		
		return s;
		}*/
	
	
	}

	

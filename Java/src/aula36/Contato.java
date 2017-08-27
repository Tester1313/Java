package aula36;

public class Contato {
	// Declarar uma classe A dentro de uma classe B como atributo
	
	private String nome;
	private Endereco endereco;
	private Telefone[] telefones; // Nao utilizado em projetos java, normalmente é utilizados collections
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Telefone[] getTelefones() {
		return telefones;
	}
	
	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}
	
}

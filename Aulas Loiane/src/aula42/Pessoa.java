package aula42;

//Final não permite que estenda a classe
// Utilizado em Constantes
public final class Pessoa {
	
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	// Funciona da mesma maneira para os metodos
	//public abstract String obterEtiquetaEndereco(); // metodos incrementado noas classes filhas
	
	//public abstract void imprimirEtiquetaEndereco();
}

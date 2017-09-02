package aula44;
public abstract class Animal {
	// Todos os metodos de uma Interface são publicos e abstratos
	private String nome;
	
	public abstract void emitirSom();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}

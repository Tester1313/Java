package labsaula36;

public class Agenda {
	private String nome;
	private Contato[] contatos;
	
	public Agenda(){ }
	
	public Agenda(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Contato[] getContato() {
		return contatos;
	}

	public void setContato(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	public String obterInfo() {
		String info = " Nome = "+ this.nome +"\n";
		
		if(contatos != null) {
			for(Contato c : contatos) { // Auxiliar busca metodos na classe Contato
				info += c.obterInfo() + "\n";
			}
		}
				
		return info;
	}
	
}

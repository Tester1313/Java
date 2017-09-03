package aula24;

public class TesteLivro {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		
		livro.nome = "Percy jackson";
		livro.autor = "Thiago";
		livro.qtdPaginas = 345;
		
		System.out.println("Nome do livro= "+livro.nome);

	}

}

package aula45;

public class Teste {
	
	public static void main(String arg[]) {
		/*Aluno aluno = new Aluno();
		Pessoa pessoaAluno = aluno; //Upcasting
		
		Pessoa aluno2 = (Pessoa) new Aluno(); //UpCasting
		
		Pessoa aluno3 = new Pessoa();
		Aluno aluno4 = (Aluno) aluno3;*/
		
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor prof = new Professor();
		
		// Instanceof  verifica se variavel é do tipo pessoa
		if(pessoa instanceof Pessoa) {
			System.out.println("é do tipo Pessoa");
		}
		
		// Instanceof  verifica se variavel é do tipo Aluno
		if(aluno instanceof Aluno) {
			System.out.println("é do tipo aluno");
		}
		
		// Instanceof  verifica se variavel é do tipo Professor
		if(prof instanceof Professor) {
			System.out.println("é do tipo Professor");
		}
	}
}

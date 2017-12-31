package aula65;
// Cria annotations
@interface InformacaoAula {
	
	String autor();
	
	int aulaNumero();
	
	String blog() default "http//www.globo.com.br";
	
	String site() default "http//www.globo.com.br";
}

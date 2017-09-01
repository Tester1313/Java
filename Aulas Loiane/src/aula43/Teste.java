
package aula43;
import java.util.*;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ciencia da computação");
		
		double[] notas = {10,9,8,7};
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		String sl = "afgasnistao";
		String s2 = "Asdadsadsda";
		
		//System.out.println(s1 == s2); // Compara as referencias de memoria
		System.out.println(s2.equalsIgnoreCase(sl));
		
		Aluno aluno2 = new Aluno();
		
		aluno.setCurso("Ciencia da computação");
		
		double[] notas2 = {10,9,8,7};
		aluno.setNotas(notas2);	
		
		System.out.println(aluno.equals(aluno2)); // Compara os atributos
	}

}

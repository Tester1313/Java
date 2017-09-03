package aula35.labs;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Entre com o nome do aluno: ");
		aluno.nome = scan.next();
		
		System.out.println("Entre com o nome do Curso: ");
		aluno.nomeCurso = scan.next();
		
		System.out.println("Entre com a matricula: ");
		aluno.matricula = scan.next();
		
		
		
		for(int i =0;i < aluno.nomeDisciplinas.length; i++) {
			System.out.println("Entre com o nome da disciplina:"+i);
			aluno.nomeDisciplinas[i] = scan.next();
		}
		
		for(int i =0;i < aluno.notasDisciplinas.length; i++) {
			System.out.println("Obtendo notas da disciplina "+ aluno.nomeDisciplinas[i]);
			
			for(int j=0; j< aluno.notasDisciplinas[i].length;j++) {
				System.out.println("Entre com a nota "+ (j+1));
				aluno.notasDisciplinas[i][j] = scan.nextDouble();
			}
		
		}
		
		aluno.mostrarInfo();
		
		for(int i=0; i<aluno.nomeDisciplinas.length; i++) {
			if(aluno.verificarAprovado(i)) {
				System.out.println("Discplina: "+ aluno.nomeDisciplinas[i] + " foi aprovado");
			}else {
				System.out.println("Discplina: "+ aluno.nomeDisciplinas[i] + " foi reprovado");
			}
		}
	}

}

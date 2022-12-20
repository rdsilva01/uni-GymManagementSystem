import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import myinputs.Ler;

public class GerirGinasio {
	public static int menu() {
		int opcao;
		System.out.println("1 - Criar ginásio");
		System.out.println("2 - Consultar ginásios");
		System.out.println("3 - Consultar aluno, dado o seu nome");
		System.out.println("4 - Listar todos os alunos");
		System.out.println("5 - Apagar um aluno");
		System.out.println("6 - Corrigir o nome de um aluno");
		System.out.println("7 - Terminar");
		System.out.println("Qual a sua opção? ");
		opcao = Ler.umInt();
		return opcao;
	}
	
	public static void main(String[] args) {
		int escolha;
		
		// LISTA DOS ALUNOS
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		
		// Ler ficheiro
		try {
	
			ObjectInputStream is = new ObjectInputStream( new FileInputStream("/Users/rdsilva/Developer/java/Aula10pr/fichALunos.dat"));
			int ult = is.readInt();
			Aluno.setUltimo(ult);
			alunos = (ArrayList<Aluno>) is.readObject();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		do {
			escolha = menu();
			switch(escolha) {
			case 1: FuncAluno.criarAluno(alunos);
			break;
			
			case 2: FuncAluno.consultarAlunoNum(alunos);
			break;
			
			case 3: FuncAluno.consultarAlunoNome(alunos);
			break;
			
			case 4:	System.out.println(alunos);
			break;
			
			case 5:	FuncAluno.removerAluno(alunos);
			break;
			
			case 6:	FuncAluno.corrigirNome(alunos);
			break;
			}
		} while(escolha != 7);
		
}

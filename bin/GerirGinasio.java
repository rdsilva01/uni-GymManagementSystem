import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import myinputs.Ler;

public class GerirGinasio {
	
	// menu geral
	public static int menu() {
		int opcao;
		System.out.println("1 - Criar ginásio");
		System.out.println("2 - Consultar ginásios");
		System.out.println("3 - Consultar ginásio, dado o nome");
		System.out.println("4 - Alterar ginásio");
		System.out.println("5 - Apagar um ginásio");
		System.out.println("6 - Terminar");
		System.out.println("Qual a sua opção? ");
		opcao = Ler.umInt();
		return opcao;
	}
	
	// menu para a classe Membro
	public static int menumembro() {
		int opcaomem;
		System.out.println("1 - Criar membro");
		System.out.println("2 - Consultar membros");
		System.out.println("3 - Consultar membro, dado o nome");
		System.out.println("4 - Consultar membro, dado o número");
		System.out.println("5 - Alterar membro");
		System.out.println("6 - Apagar membro");
		System.out.println("7 - Terminar");
		System.out.println("Qual a sua opção? ");
		opcaomem = Ler.umInt();
		return opcaomem;
	}
	
	// menu para a classe Staff
	public static int menustaff() {
		int opcaostaff;
		System.out.println("1 - Criar STAFF");
		System.out.println("2 - Consultar STAFF");
		System.out.println("3 - Consultar STAFF, dado o nome");
		System.out.println("4 - Consultar STAFF, dado o cargo");
		System.out.println("5 - Alterar STAFF");
		System.out.println("6 - Apagar STAFF");
		System.out.println("7 - Terminar");
		System.out.println("Qual a sua opção? ");
		opcaostaff = Ler.umInt();
		return opcaostaff;
	}
	
	// menu para a classe Aula
	public static int menuaula() {
		int opcaoaula;
		System.out.println("1 - Criar aula");
		System.out.println("2 - Consultar aulas");
		System.out.println("3 - Consultar aula, dado o nome");
		System.out.println("4 - Consultar aula, dando a hora");
		System.out.println("5 - Alterar aula");
		System.out.println("6 - Apagar aula");
		System.out.println("7 - Terminar");
		System.out.println("Qual a sua opção? ");
		opcaoaula = Ler.umInt();
		return opcaoaula;
	}
	
	public static void main(String[] args) {
		int escolha;
		
		// LISTA DOS ALUNOS
		ArrayList<Ginasio> ginasios = new ArrayList<Ginasio>();
		
		// Ler ficheiro
		try {
	
			ObjectInputStream is = new ObjectInputStream( new FileInputStream("/Users/rdsilva/Developer/java/GinásioProject/gymdata.md"));
			ginasios = (ArrayList<Ginasio>) is.readObject();
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
			case 1:
			break;
			
			case 2: System.out.println(ginasios);
			break;
			
			case 3:
			break;
			
			case 4:
			break;
			
			case 5:	
			break;
			
			case 6:	
			break;
			}
		} while(escolha != 6);
		
	}
}

import java.io.*;
import java.util.ArrayList;

import myinputs.Ler;

public class FuncGinasio {
	
	/* ------------------- CRIAR GINÁSIO --------------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void criarGinasio(ArrayList<Ginasio> ginasios) {
		System.out.println("Insira o nome do Ginásio: ");
		String nome = Ler.umaString();
		
		// não podem existir nomes iguais
		for (int i = 0; i < ginasios.size(); i++) {
			if (ginasios.get(i).getNome().equals(nome)) {
				System.out.println("Um ginásio com esse nome já existe!");
				return;
			}
		}
		
		/* obter os parâmetros para criar o objeto Ginásio
		System.out.println("Qual o preço base?");
		double preco = Ler.umDouble(); */
		
		Ginasio g = new Ginasio(nome);
		ginasios.add(g);
		
		try {
		      ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("/Users/rdsilva/Developer/java/GinásioProject/gymdata.md"));

		      // escrever o objeto (ArrayList<Ginasio>) ginasios no ficheiro
		      os.writeInt(Ginasio.getUltimo());
		      os.writeObject(ginasios);
		      os.flush();
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	/* ------------------- CONSULTAR GINÁSIO DADO NOME ------------------------- *
	 * ------------------------------------------------------------------------- */
	public static int consultarGinasioNome(ArrayList<Ginasio> ginasios) {
		System.out.println("Insira o nome do Ginásio: ");
		String nome = Ler.umaString();
		
		// verificar se existe o Ginásio
		for(int i = 0; i < ginasios.size(); i++) {
			if(ginasios.get(i).getNome().equals(nome)) {
				System.out.println(ginasios.get(i).toString());
				return i;
			}
		}
		System.out.print("Não existe nenhum ginásio com o nome dado");
		return -1;
	}
	
	/* ------------------- ALTERAR GINÁSIO ------------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void alterarGinasio(ArrayList<Ginasio> ginasios) {
		System.out.println("Insira o nome do Ginásio que pretende alterar");
		String nome = Ler.umaString();
		
		// verificar se existe o ginásio com o nome dado
		for(int i = 0; i < ginasios.size(); i++) {
			if(ginasios.get(i).getNome().equals(nome)) {
				int escolha = 1;
				do {
					System.out.println("O que pretende alterar?\n1 - Nome\n2 - Precos\n3 - Aulas\n4 - Membros\n5 - Staff\n6 - Sair");
					escolha = Ler.umInt();
					switch(escolha) {
					
					// alterar nome
					case 1:	
							int escnome = 0;
							while(escnome != 0) {
								System.out.println("Insira o novo nome");
								String nomenovo = Ler.umaString();
								for(int j = 0; j < ginasios.size(); j++) {
									if(ginasios.get(i).getNome().equals(nomenovo)) {
										System.out.println("O nome que pretende introduzir já existe!");
									}
								}
							}
					break;
					
					// alterar precos
					case 2:
					break;
					
					// alterar aulas
					case 3:
					break;
					
					// alterar membros
					case 4:
					break;
					}
				} while(escolha != 6);
				
			}
		}
	}
	
	/*public static void getUltimoMembro(ArrayList<Ginasio>) {
		
	} */
	
}

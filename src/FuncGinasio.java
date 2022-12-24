import java.io.*;
import java.util.ArrayList;

import myinputs.Ler;

public class FuncGinasio {
	
	/* ------------------- CRIAR GINÁSIO --------------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void criarGinasio(ArrayList<Ginasio> ginasio) {
		System.out.println("Insira o nome do Ginásio: ");
		String nome = Ler.umaString(); 
		
		// não podem existir nomes iguais
		for (int i = 0; i < ginasio.size(); i++) {
			if (ginasio.get(i).getNome().equals(nome)) {
				System.out.println("Um ginásio com esse nome já existe!");
				return;
			}
		}
		
		Ginasio g = new Ginasio(nome);
		ginasio.add(g);
		
		try {
		      ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("/Users/rdsilva/Developer/java/GinásioProject/gymdata.md"));

		      // escrever o objeto (ArrayList<Ginasio>) ginasios no ficheiro
		      os.writeInt(Ginasio.getUltimo());
		      os.writeObject(ginasio);
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
	public static void alterarGinasio(ArrayList<Ginasio> ginasio) {
		System.out.println("Insira o nome do Ginásio que pretende alterar");
		String nome = Ler.umaString();
		
		// verificar se existe o ginásio com o nome dado
		for(int i = 0; i < ginasio.size(); i++) {
			if(ginasio.get(i).getNome().equals(nome)) {
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
								for(int j = 0; j < ginasio.size(); j++) {
									if(ginasio.get(i).getNome().equals(nomenovo)) {
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
		
		try {
		      ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("/Users/rdsilva/Developer/java/GinásioProject/gymdata.md"));

		      // escrever o objeto (ArrayList<Ginasio>) ginasios no ficheiro
		      os.writeInt(Ginasio.getUltimo());
		      os.writeObject(ginasio);
		      os.flush();
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	/* ------------------- APAGAR GINÁSIO -------------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void apagarGinásio(ArrayList<Ginasio> ginasio) {
		int apagar = 1;
		do {	
			System.out.println("Insira o nº do Ginásio que pretende apagar: ");
			int num = Ler.umInt();
		
			for(int i = 0; i < ginasio.size(); i++) {
				if(ginasio.get(i).getNum() == num) {
					System.out.println("Deseja apagar o seguinte ginásio?\n" + ginasio.get(i).getNome() + "\n1 - Sim\n2 - Não");
						apagar = Ler.umInt();
						switch(apagar) {
						case 1: ginasio.remove(i);
								System.out.println("Ginásio removido com sucesso!");
								apagar = 2;
						break;
						
						case 2:
						break;
						
						default: System.out.println("Opção errada! Tente novamente!");
						}		
				}
			}
		} while(apagar != 2);
		
		try {
		      ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("/Users/rdsilva/Developer/java/GinásioProject/gymdata.md"));

		      // escrever o objeto (ArrayList<Ginasio>) ginasios no ficheiro
		      os.writeInt(Ginasio.getUltimo());
		      os.writeObject(ginasio);
		      os.flush();
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	/* ------------------- LISTAR GINÁSIO -------------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void listarGinasio(ArrayList<Ginasio> ginasio) {
		String listar = "";
		for(int i = 0; i < ginasio.size(); i++) {
			listar += "\n" + ginasio.get(i).toString();
		}
		
		System.out.println(listar);
	}
	
	
}

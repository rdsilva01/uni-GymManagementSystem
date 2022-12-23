import java.io.*;
import java.util.ArrayList;

import myinputs.Ler;

public class FuncMembro {
	
	/* ------------------- CRIAR MEMBRO ---------------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void criarMembro(ArrayList<Ginasio> ginasio, int num) {
		System.out.println("Insira o primeiro nome: ");
		String p_nome = Ler.umaString();
		
		System.out.println("Insira o último nome: ");
		String u_nome = Ler.umaString();
		
		System.out.println("Insira o NIF: ");
		int nif = Ler.umInt();
		for(int i = 0; i < ginasio.get(num).getMembros().size(); i++) {
			if(ginasio.get(num).getMembros().get(i).getNif() == nif) {
				System.out.println("O NIF [" + nif + "] já está registado no sistema!");
				return;
			}
		}
		char sexo = 'A';
		while(sexo != 'M' && sexo != 'm' && sexo != 'F' && sexo != 'f') { 
			System.out.println("Insira o seu sexo (M ou F)");
			sexo = Ler.umChar();
		}
		
		System.out.println("Insira a sua data de nascimento ");
		System.out.println("Dia: ");
		int dia = Ler.umInt();
		System.out.println("Mês (1-12): ");
		int mes = Ler.umInt();
		System.out.println("Ano: ");
		int ano = Ler.umInt();
		
		System.out.println("Insira a altura (em centímetros): ");
		int altura = Ler.umInt();
		System.out.println("Insira o peso (em quilogramas): ");
		double peso = Ler.umDouble();
		
		Pessoa pax = new Pessoa(p_nome, u_nome, nif, dia, mes, ano, altura, peso, sexo);
		Membro mem = new Membro(pax);
		
		mem.setNum_membro(ginasio.get(num).getMembros().size() + 1);
		
		for(int j = 0; j < ginasio.get(num).getMembros().size(); j++) {
			if(mem.getNum_membro() == ginasio.get(num).getMembros().get(j).getNum_membro()) {
				mem.setNum_membro(mem.getNum_membro() + 1);
			}
		}
		ginasio.get(num).addMembros(mem);
		
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
	/* ------------------- LISTAR MEMBROS -------------------------------------- *
	 * ------------------------------------------------------------------------- */
	
	public static void listarMembro(ArrayList<Ginasio> ginasio, int num) {
		String s = "";
		for(int i = 0; i < ginasio.get(num).getMembros().size(); i++) {
			s += "\n nº [" + ginasio.get(num).getMembros().get(i).getNum_membro() + "] :: Nome: " + ginasio.get(num).getMembros().get(i).getP_nome() + " " + ginasio.get(num).getMembros().get(i).getU_nome() + ":: NIF [" + ginasio.get(num).getMembros().get(i).getNif() + "]";
		}
		System.out.println(s);
	}
	
	/* ------------------- CONSULTAR MEMBRO -------------------------------------- *
	 * --------------------------------------------------------------------------- */
	public static void consultarMembro(ArrayList<Ginasio> ginasio, int num) {
		int escolha = 1;
		do {
			System.out.println("Deseja consultar dado:\n1 - Nome\n2 - Número de Membro\n3 - NIF\n4 - Sair");
			escolha = Ler.umInt();
			switch(escolha) {
			
			// dado o nome
			case 1: System.out.println("Insira o primeiro nome: ");
					String totalnome = "";
					String p_nome = Ler.umaString();
					for(int i = 0; i < ginasio.get(num).getMembros().size(); i++) {
						if(ginasio.get(num).getMembros().get(i).getP_nome().equals(p_nome)) {
							System.out.println("Insira o último nome: ");
							String u_nome = Ler.umaString();
							if(ginasio.get(num).getMembros().get(i).getU_nome().equals(u_nome)) {
								totalnome += ginasio.get(num).getMembros().get(i).toString() + "\n";
							}
						}
					}
					
					if(totalnome.equals("")) {
						System.out.println("Não existe nenhum membro registado com esse nome!");
					}
					else {
						System.out.println(totalnome);
					}
			break;
			
			// dado o número de membro
			case 2: System.out.println("Insira o número de membro: ");
					String totalnum = "";
					int numm = Ler.umInt();
					
					for(int j = 0; j < ginasio.get(num).getMembros().size(); j++) {
						if(numm == ginasio.get(num).getMembros().get(j).getNum_membro()) {
							totalnum = ginasio.get(num).getMembros().get(j).toString();
						}
					}
					
					if(totalnum.equals("")) {
						System.out.println("Não existe nenhum membro registado com esse número!");
					}
					else {
						System.out.println(totalnum);
					}
			break;
			
			// dado o nif
			case 3: System.out.println("Insira o NIF: ");
					String totalnif = "";
					int nif = Ler.umInt();
					
					for(int k = 0; k < ginasio.get(num).getMembros().size(); k++) {
						if(nif == ginasio.get(num).getMembros().get(k).getNif()) {
							totalnif = ginasio.get(num).getMembros().get(k).toString();
						}
					}
					
					if(totalnif.equals("")) {
						System.out.println("Não existe nenhum membro registado com esse NIF!");
					}
					else {
						System.out.println(totalnif);
					}
			break;
			}
		} while(escolha != 4);
	}
	
	/* ------------------- ALTERAR MEMBRO -------------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void alterarMembro(ArrayList<Ginasio> ginasio, int num) {
		System.out.println("Insira o número do membro que pretende alterar");
		int numm = Ler.umInt();
		
		for(int i = 0; i < ginasio.get(num).getMembros().size(); i++) {
			if(ginasio.get(num).getMembros().get(i).getNum_membro() == numm) {
				int escolha = 1;
				do {
					System.out.println("O que pretende alterar:\n1 - Nome\n2 - NIF\n3 - Data de Nascimento\n4 - Altura\n5 - Peso\n6 - Sexo\n7 - Sair");
					escolha = Ler.umInt();
					switch(escolha) {
					
					// --------------- mudar o nome ------------------
					case 1: int escnome = 1;
							do {
								System.out.println("Deseja alterar:\n1 - Primeiro Nome\n2 - Último Nome\n3 - Ambos\n4 - Sair");
								escnome = Ler.umInt();
								switch(escnome) {
								case 1:	System.out.println("Insira o novo Primeiro nome: ");
										String p_nome = Ler.umaString();
										
										ginasio.get(num).getMembros().get(i).setP_nome(p_nome); // set Primeiro nome
								break;
								
								case 2: System.out.println("Insira o novo Último nome: ");
										String u_nome = Ler.umaString();
										
										ginasio.get(num).getMembros().get(i).setU_nome(u_nome); // set Último nome
								break;
								
								case 3: System.out.println("Insira o novo Primeiro nome: ");
										String p_nome2 = Ler.umaString();
										System.out.println("Insira o novo Último nome: ");
										String u_nome2 = Ler.umaString();
										
										ginasio.get(num).getMembros().get(i).setP_nome(p_nome2); // set Primeiro nome
										ginasio.get(num).getMembros().get(i).setU_nome(u_nome2); // set Último nome
								}
								
							} while(escnome != 4);
					break;
					
					// --------------- mudar o nif ------------------
					case 2:	int escnif = 1;
							while(escnif == 1) {
								System.out.println("Insira o novo NIF: ");
								int nif = Ler.umInt();
							
								for(int l = 0; l < ginasio.get(num).getMembros().size(); l++) {
									if(nif == ginasio.get(num).getMembros().get(l).getNif()) {
										System.out.println("Já existe um NIF igual registado!");
										escnif = 0;
									}
								}
								ginasio.get(num).getMembros().get(i).setNif(nif); // set do novo nif
								escnif = 0;	
							}	
					break;
					
					// --------------- mudar a idade ------------------
					case 3:	int escidade = 1;
							do {
								System.out.println("Deseja alterar:\n1 - Dia\n2 - Mês\n3 - Ano\n4 - Sair");
								escidade = Ler.umInt();
								switch(escidade) {
								case 1:	System.out.println("Insira o novo dia: ");
										int dia = Ler.umInt();
										
										ginasio.get(num).getMembros().get(i).setDataNasc(ginasio.get(num).getMembros().get(i).getDataNasc().getYear(), ginasio.get(num).getMembros().get(i).getDataNasc().getMonthValue(), dia);
								break;
						
								case 2: System.out.println("Insira o novo mês (1-12): ");
										int mes = Ler.umInt();
										while(mes >= 1 && mes <= 12) {
											ginasio.get(num).getMembros().get(i).setDataNasc(ginasio.get(num).getMembros().get(i).getDataNasc().getYear(), mes, ginasio.get(num).getMembros().get(i).getDataNasc().getDayOfMonth());
										}
								break;
						
								case 3:	System.out.println("Insira o novo ano (1900 - 2022): ");
										int ano = Ler.umInt();
										while(ano >= 1900 && ano <= 2022) {
											ginasio.get(num).getMembros().get(i).setDataNasc(ano, ginasio.get(num).getMembros().get(i).getDataNasc().getMonthValue(), ginasio.get(num).getMembros().get(i).getDataNasc().getDayOfMonth());
										}
								break;
								
								case 4:
								break;
								
								default: System.out.println("Opção inválida! Tente novamente");
								}
							} while(escidade!= 4);
					break;
					
					// --------------- mudar a altura ------------------
					case 4:
					break;
					
					// --------------- mudar o peso --------------------
					case 5:
					break;
					
					// --------------- mudar o sexo --------------------
					case 6:
					break;
					
					
					case 7:
					break;
					
					default: System.out.println("Opção inválida! Tente novamente");
					}
					
				} while(escolha != 7);
			}
		}
		
		// ESCRITA PARA O FICHEIRO DOS GINÁSIOS
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
	
	/* ------------------- APAGAR MEMBRO --------------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void apagarMembro(ArrayList<Ginasio> ginasio, int num) {
		int controlo = 1;
		while(controlo != 3) {
			System.out.println("Insira o número do membro que pretende alterar: ");
			int numem = Ler.umInt();
			
			for(int i = 0; i < ginasio.get(num).getMembros().size(); i++) {
				if(numem == ginasio.get(num).getMembros().get(i).getNum_membro()) {
					int controlo2 = 1;
					do {
						System.out.println("Deseja remover o seguinte membro? \n" + ginasio.get(num).getMembros().get(i).toString() + "\n 1 - Sim\n 2- Não");
						controlo2 = Ler.umInt();
						if(controlo2 == 1) { // se 1 - Sim, remove o membro e sai
							ginasio.get(num).getMembros().remove(i);
							System.out.println("Membro removido com sucesso!");
							return;	
						}
						else if(controlo2 == 2) { // se 2 - Não, repete!
							controlo2 = 2;
						}
					} while(controlo2 != 2);
				}
			}
			System.out.println("Não existe nenhum membro com esse número");
		}
		
		// ESCRITA PARA O FICHEIRO DOS GINÁSIOS
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
	
}

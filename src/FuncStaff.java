import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.DateTimeException;
import java.util.ArrayList;

import myinputs.Ler;

public class FuncStaff {
	/* ------------------- CRIAR STAFF ----------------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void criarStaff(ArrayList<Ginasio> ginasio, int num) {
		boolean verif = true;
		
		System.out.println("  Insira o primeiro nome: ");
		String p_nome = Ler.umaString();
		
		System.out.println("  Insira o último nome: ");
		String u_nome = Ler.umaString();
		
		System.out.println("  Insira o NIF: ");
		int nif = Ler.umInt();
		for(int i = 0; i < ginasio.get(num).getStaff().size(); i++) {
			if(ginasio.get(num).getStaff().get(i).getNif() == nif) {
				System.out.println("  O NIF [" + nif + "] já está registado no sistema!");
				return;
			}
		}
		char sexo = 'A';
		while(sexo != 'M' && sexo != 'm' && sexo != 'F' && sexo != 'f') { 
			System.out.println("  Insira o seu género (M ou F)");
			sexo = Ler.umChar();
		}
		
		
		int dia = 1, mes = 1, ano = 1;

		
		System.out.println("  Insira a altura (em centímetros): ");
		int altura = Ler.umInt();
		System.out.println("  Insira o peso (em quilogramas): ");
		double peso = Ler.umDouble();
		
		System.out.println("  Insira o tipo: (Personal Trainer, Instrutor de Aula, etc...): ");
		String tipo = Ler.umaString();
		
		Pessoa pax = new Pessoa(p_nome, u_nome, nif, dia, mes, ano, altura, peso, sexo, "Funcionário do Ginásio");
		
		System.out.println("Insira a sua data de nascimento ");
		verif = true;
		while(verif) {
			try {
				System.out.println("Ano: ");
				ano = Ler.umInt();
				System.out.println("Mês (1-12): ");
				mes = Ler.umInt();
				System.out.println("Dia: ");
				dia = Ler.umInt();
				pax.setDataNasc(ano, mes, dia);
				verif = false;
			}
			catch(DateTimeException d) {
				System.out.println("Valores errados! Tente novamente! (Lembre-se: Meses de 1 a 12!)");
			}
		}
		
		Staff mem = new Staff(pax, tipo);
		
		mem.setNum_staff(ginasio.get(num).getStaff().size() + 1);
		
		for(int j = 0; j < ginasio.get(num).getStaff().size(); j++) {
			if(mem.getNum_staff() == ginasio.get(num).getStaff().get(j).getNum_staff()) {
				mem.setNum_staff(mem.getNum_staff() + 1);
			}
		}
		
		ginasio.get(num).addStaff(mem);
		ginasio.get(num).addPax(mem);
		
		try {
		      ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("gymdata.md"));

		      // escrever o objeto (ArrayList<Ginasio>) ginasios no ficheiro
		      os.writeInt(Ginasio.getUltimo());
		      os.writeObject(ginasio);
		      os.flush();
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	/* ------------------- CONSULTAR STAFF ------------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void consultarStaff(ArrayList<Ginasio> ginasio, int num) {
		int escolha = 1;
		do {
			System.out.println("*************************************");
			System.out.println("Deseja consultar dado:\n  1 - Nome\n  2 - Número de STAFF\n  3 - NIF\n  4 - Voltar");
			System.out.print("*************************************\n  Opção:");
			escolha = Ler.umInt();
			switch(escolha) {
			
			// dado o nome
			case 1: System.out.println("  Insira o primeiro nome: ");
					String totalnome = "";
					String p_nome = Ler.umaString();
					for(int i = 0; i < ginasio.get(num).getStaff().size(); i++) {
						if(ginasio.get(num).getStaff().get(i).getP_nome().equals(p_nome)) {
							System.out.println("  Insira o último nome: ");
							String u_nome = Ler.umaString();
							if(ginasio.get(num).getStaff().get(i).getU_nome().equals(u_nome)) {
								totalnome += ginasio.get(num).getStaff().get(i).toString() + "\n";
							}
						}
					}
					
					if(totalnome.equals("")) {
						System.out.println("  Não existe nenhum STAFF registado com esse nome!");
					}
					else {
						System.out.println(totalnome);
						escolha = 4;
					}
			break;
			
			// dado o número de membro
			case 2: System.out.println("  Insira o número de STAFF: ");
					String totalnum = "";
					int numm = Ler.umInt();
					
					for(int j = 0; j < ginasio.get(num).getStaff().size(); j++) {
						if(numm == ginasio.get(num).getStaff().get(j).getNum_staff()) {
							totalnum = ginasio.get(num).getStaff().get(j).toString();
						}
					}
					
					if(totalnum.equals("")) {
						System.out.println("  Não existe nenhum STAFF registado com esse número!");
					}
					else {
						System.out.println(totalnum);
						escolha = 4;
					}
			break;
			
			// dado o nif
			case 3: System.out.println("  Insira o NIF: ");
					String totalnif = "";
					int nif = Ler.umInt();
					
					for(int k = 0; k < ginasio.get(num).getStaff().size(); k++) {
						if(nif == ginasio.get(num).getStaff().get(k).getNif()) {
							totalnif = ginasio.get(num).getStaff().get(k).toString();
						}
					}
					
					if(totalnif.equals("")) {
						System.out.println("  Não existe nenhum STAFF registado com esse NIF!");
					}
					else {
						System.out.println(totalnif);
						escolha = 4;
					}
			break;
			}
		} while(escolha != 4);
	}
	
	/* ------------------- APAGAR STAFF ---------------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void apagarStaff(ArrayList<Ginasio> ginasio, int num) {
		int controlo = 1;
		while(controlo != 3) {
			System.out.println("  Insira o número do STAFF que pretende alterar: ");
			int numem = Ler.umInt();
			
			for(int i = 0; i < ginasio.get(num).getStaff().size(); i++) {
				if(numem == ginasio.get(num).getStaff().get(i).getNum_staff()) {
					int controlo2 = 1;
					do {
						System.out.println("  Deseja remover o seguinte STAFF? \n" + ginasio.get(num).getStaff().get(i).toString() + "\n 1 - Sim\n 2- Não");
						controlo2 = Ler.umInt();
						if(controlo2 == 1) { // se 1 - Sim, remove o membro e sai
							ginasio.get(num).getStaff().remove(i);
							System.out.println("  STAFF removido com sucesso!");
							for(int j = 0; j < ginasio.get(num).getAulas().size(); j++) {
								if(ginasio.get(num).getAulas().get(j).getInstrutor().get(0).getNum_staff() == numem){
									ginasio.get(num).getAulas().get(j).getInstrutor().remove(0);
								}
								else if(ginasio.get(num).getAulas().get(j).getInstrutor().get(1).getNum_staff() == numem) {
									ginasio.get(num).getAulas().get(j).getInstrutor().remove(1);
								}
							}
							
							return;	
						}
						else if(controlo2 == 2) { // se 2 - Não, repete!
							controlo2 = 2;
						}
					} while(controlo2 != 2);
				}
			}
			System.out.println("  Não existe nenhum STAFF com esse número");
		}
		
		// ESCRITA PARA O FICHEIRO DOS GINÁSIOS
			try {
				 ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("gymdata.md"));

				 // escrever o objeto (ArrayList<Ginasio>) ginasios no ficheiro
				 os.writeInt(Ginasio.getUltimo());
				 os.writeObject(ginasio);
				 os.flush();
			} 
			catch (IOException e) {
				System.out.println(e.getMessage());
			}
	}
	
	/* ------------------- ALTERAR STAFF --------------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void alterarStaff(ArrayList<Ginasio> ginasio, int num) {
		boolean verif = true;
		
		System.out.println("  Insira o número do Staff que pretende alterar");
		int numm = Ler.umInt();
		
		for(int i = 0; i < ginasio.get(num).getStaff().size(); i++) {
			if(ginasio.get(num).getStaff().get(i).getNum_staff() == numm) {
				int escolha = 1;
				do {
					System.out.println("*************************************");
					System.out.println(ginasio.get(num).getStaff().get(i).toString()+ "\n");
					System.out.println("O que pretende alterar:\n  1 - Nome\n  2 - NIF\n  3 - Data de Nascimento\n  4 - Altura\n  5 - Peso\n  6 - Sexo\n  7 - Tipo\n  8 - Escalão\n  9 - Voltar");
					System.out.print("*************************************\n  Opção:");
					escolha = Ler.umInt();
					switch(escolha) {
					
					// --------------- mudar o nome ------------------
					case 1: int escnome = 1;
							do {
								System.out.println("*************************************");
								System.out.println("Deseja alterar:\n  1 - Primeiro Nome\n  2 - Último Nome\n  3 - Ambos\n  4 - Voltar");
								System.out.print("*************************************\n  Opção: ");
								escnome = Ler.umInt();
								switch(escnome) {
								case 1:	System.out.println("  Insira o novo Primeiro nome: ");
										String p_nome = Ler.umaString();
										
										ginasio.get(num).getStaff().get(i).setP_nome(p_nome); // set Primeiro nome
								break;
								
								case 2: System.out.println("  Insira o novo Último nome: ");
										String u_nome = Ler.umaString();
										
										ginasio.get(num).getStaff().get(i).setU_nome(u_nome); // set Último nome
								break;
								
								case 3: System.out.println("  Insira o novo Primeiro nome: ");
										String p_nome2 = Ler.umaString();
										System.out.println("  Insira o novo Último nome: ");
										String u_nome2 = Ler.umaString();
										
										ginasio.get(num).getStaff().get(i).setP_nome(p_nome2); // set Primeiro nome
										ginasio.get(num).getStaff().get(i).setU_nome(u_nome2); // set Último nome
								}
								
							} while(escnome != 4);
					break;
					
					// --------------- mudar o nif ------------------
					case 2:	int escnif = 1;
							while(escnif == 1) {
								System.out.println("  Insira o novo NIF: ");
								int nif = Ler.umInt();
							
								for(int l = 0; l < ginasio.get(num).getStaff().size(); l++) {
									if(nif == ginasio.get(num).getStaff().get(l).getNif()) {
										System.out.println("  Já existe um NIF igual registado!");
										escnif = 0;
									}
								}
								ginasio.get(num).getStaff().get(i).setNif(nif); // set do novo nif
								escnif = 0;	
							}	
					break;
					
					// --------------- mudar a idade ------------------
					case 3:	int escidade = 1;
							do {
								System.out.println("*************************************");
								System.out.println("Deseja alterar:\n  1 - Dia\n  2 - Mês\n  3 - Ano\n  4 - Voltar");
								System.out.print("*************************************\n  Opção: ");
								escidade = Ler.umInt();
								switch(escidade) {
								case 1:	verif = true;
										while(verif) {
											try {
												System.out.println("  Insira o novo dia: ");
												int dia = Ler.umInt();
												ginasio.get(num).getStaff().get(i).setDataNasc(ginasio.get(num).getMembros().get(i).getDataNasc().getYear(), ginasio.get(num).getMembros().get(i).getDataNasc().getMonthValue(), dia);
												verif = false;
											}
											catch(DateTimeException d) {
												System.out.println("Valor errado! Tente novamente!");
											}
										}
								break;
						
								case 2: verif = true;
										while(verif) {
										try {
											System.out.println("  Insira o novo mês (1-12): ");
											int mes = Ler.umInt();
											ginasio.get(num).getStaff().get(i).setDataNasc(ginasio.get(num).getMembros().get(i).getDataNasc().getYear(), mes, ginasio.get(num).getMembros().get(i).getDataNasc().getDayOfMonth());
											verif = false;
										}
										catch(DateTimeException d) {
											System.out.println("Valor errado! Insira um valor entre 1 e 12");
										}
									}
										
								break;
						
								case 3:	verif = true;
										while(verif) {
										try {
											System.out.println("  Insira o novo ano: ");
											int ano = Ler.umInt();
											ginasio.get(num).getStaff().get(i).setDataNasc(ano, ginasio.get(num).getMembros().get(i).getDataNasc().getMonthValue(), ginasio.get(num).getMembros().get(i).getDataNasc().getDayOfMonth());
											verif = false;
										}
										catch(DateTimeException d) {
											System.out.println("Valor errado! Tente novamente!");
										}
									}
										
								break;
								
								case 4:
								break;
								
								default: System.out.println("  Opção inválida! Tente novamente");
								}
							} while(escidade!= 4);
					break;
					
					// --------------- mudar a altura ------------------
					case 4:	int escaltura = 1;
							int novaltura = 1;
							while(escaltura == 1) {
								System.out.println("  Antiga altura: " + ginasio.get(num).getStaff().get(i).getAltura() + "cm");
								System.out.println("  Insira a nova altura (em centímetros):");
								novaltura = Ler.umInt();
								
								if(novaltura < 30 || novaltura > 300) {
									System.out.println("  Valor não permitido! Apenas permitidos valores de 30 a 300");
								}
								else {
									escaltura = 2;
								}
							}
							ginasio.get(num).getStaff().get(i).setAltura(novaltura);
					break;
					
					// --------------- mudar o peso --------------------
					case 5:	int escpeso = 1;
							int novopeso = 1;
							while(escpeso == 1) {
								System.out.println("  Peso atual: " + ginasio.get(num).getStaff().get(i).getPeso() + "kg");
								System.out.println("  Insira o novo peso (em quilogramas):");
								novopeso = Ler.umInt();
								
								if(novopeso < 10 || novopeso > 500) {
									System.out.println("  Valor não permitido! Apenas permitidos valores de 10 a 500");
								}
								else {
									escpeso = 2;
								}
							}
							ginasio.get(num).getStaff().get(i).setPeso(novopeso);
					break;
					
					// --------------- mudar o sexo --------------------
					case 6:	int escsexo = 1;
							char novosexo = 'F';
							while(escsexo == 1) {
								System.out.println("  Sexo atual: " + ginasio.get(num).getStaff().get(i).getSexo());
								System.out.println("  Insira o novo sexo (M ou F):");
								novosexo = Ler.umChar();
								
								if(novosexo != 'M' && novosexo != 'm' && novosexo != 'F' && novosexo != 'f') {
									System.out.println("  Caracter introduzido não permitido, apenas permitido M ou F!");
								}
								else {
									escsexo = 2;
								}
							}
							ginasio.get(num).getStaff().get(i).setSexo(novosexo);
					break;
					
					// --------------- mudar o tipo --------------------
					case 7:	String novotipo = "demo";
							System.out.println("  Posição atual: " + ginasio.get(num).getStaff().get(i).getTipo());
							System.out.println("  Insira a nova posição: ");
							novotipo = Ler.umaString();
							ginasio.get(num).getStaff().get(i).setTipo(novotipo);
					break;
					
					// --------------- mudar o escalao -----------------
					case 8:	int escescalao = 1;
							int novoescalao = 1;
							while(escescalao == 1) {
								System.out.println("  Escalão atual: " + ginasio.get(num).getStaff().get(i).getEscalao());
								System.out.println("  Insira o novo escalão: ");
								novoescalao = Ler.umInt();
								
								if(novoescalao < 1 || novoescalao > 5) {
									System.out.println("  O escalão só tem de estar entre 1 e 5");
								}
								
								else {
									escescalao = 2;
								}
							}
							ginasio.get(num).getStaff().get(i).setEscalao(novoescalao);
					break;
					
					// --------------- sair ----------------------------
					case 9:
					break;
					
					default: System.out.println("  Opção inválida! Tente novamente");
					}
					
				} while(escolha != 9);
			}
		}
		
		
		// ESCRITA PARA O FICHEIRO DOS GINÁSIOS
		try {
		      ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("gymdata.md"));

		      // escrever o objeto (ArrayList<Ginasio>) ginasios no ficheiro
		      os.writeInt(Ginasio.getUltimo());
		      os.writeObject(ginasio);
		      os.flush();
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	/* ------------------- LISTAR STAFF ---------------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void listarStaff(ArrayList<Ginasio> ginasio, int num) {
		String liststaff = "";
		for(int i = 0; i < ginasio.get(num).getStaff().size(); i++) {
			liststaff += ginasio.get(num).getStaff().get(i).toString() + "\n******************************\n";
		}
		
		System.out.println(liststaff);
	}
	
}

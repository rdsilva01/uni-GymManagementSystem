import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import myinputs.Ler;

public class FuncStaff {
	/* ------------------- CRIAR STAFF ----------------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void criarStaff(ArrayList<Ginasio> ginasio, int num) {
		System.out.println("Insira o primeiro nome: ");
		String p_nome = Ler.umaString();
		
		System.out.println("Insira o último nome: ");
		String u_nome = Ler.umaString();
		
		System.out.println("Insira o NIF: ");
		int nif = Ler.umInt();
		for(int i = 0; i < ginasio.get(num).getStaff().size(); i++) {
			if(ginasio.get(num).getStaff().get(i).getNif() == nif) {
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
		
		System.out.println("Insira o tipo: (Personal Trainer, Instrutor de Aula, etc...): ");
		String tipo = Ler.umaString();
		
		Pessoa pax = new Pessoa(p_nome, u_nome, nif, dia, mes, ano, altura, peso, sexo);
		Staff mem = new Staff(pax, tipo);
		
		mem.setNum_staff(ginasio.get(num).getStaff().size() + 1);
		
		for(int j = 0; j < ginasio.get(num).getStaff().size(); j++) {
			if(mem.getNum_staff() == ginasio.get(num).getStaff().get(j).getNum_staff()) {
				mem.setNum_staff(mem.getNum_staff() + 1);
			}
		}
		
		ginasio.get(num).addStaff(mem);
		
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
	
	/* ------------------- CONSULTAR STAFF ------------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void consultarStaff(ArrayList<Ginasio> ginasio, int num) {
		int escolha = 1;
		do {
			System.out.println("Deseja consultar dado:\n1 - Nome\n2 - NIF\n3 - Sair");
			escolha = Ler.umInt();
			switch(escolha) {
			
			// dado o nome
			case 1: System.out.println("Insira o primeiro nome: ");
					String totalnome = "";
					String p_nome = Ler.umaString();
					for(int i = 0; i < ginasio.get(num).getStaff().size(); i++) {
						if(ginasio.get(num).getStaff().get(i).getP_nome().equals(p_nome)) {
							System.out.println("Insira o último nome: ");
							String u_nome = Ler.umaString();
							if(ginasio.get(num).getStaff().get(i).getU_nome().equals(u_nome)) {
								totalnome += ginasio.get(num).getStaff().get(i).toString() + "\n";
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
			case 2: System.out.println("Insira o número de Staff: ");
					String totalnum = "";
					int numm = Ler.umInt();
					
					for(int j = 0; j < ginasio.get(num).getStaff().size(); j++) {
						if(numm == ginasio.get(num).getStaff().get(j).getNum_staff()) {
							totalnum = ginasio.get(num).getStaff().get(j).toString();
						}
					}
					
					if(totalnum.equals("")) {
						System.out.println("Não existe nenhum Staff registado com esse número!");
					}
					else {
						System.out.println(totalnum);
					}
			break;
			
			// dado o nif
			case 3: System.out.println("Insira o NIF: ");
					String totalnif = "";
					int nif = Ler.umInt();
					
					for(int k = 0; k < ginasio.get(num).getStaff().size(); k++) {
						if(nif == ginasio.get(num).getStaff().get(k).getNif()) {
							totalnif = ginasio.get(num).getStaff().get(k).toString();
						}
					}
					
					if(totalnif.equals("")) {
						System.out.println("Não existe nenhum Staff registado com esse NIF!");
					}
					else {
						System.out.println(totalnif);
					}
			break;
			}
		} while(escolha != 4);
	}
	
	/* ------------------- APAGAR STAFF ---------------------------------------- *
	 * ------------------------------------------------------------------------- */
	
	
	/* ------------------- ALTERAR STAFF --------------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void alterarStaff(ArrayList<Ginasio> ginasio, int num) {
		System.out.println("Insira o número do Staff que pretende alterar");
		int numm = Ler.umInt();
		
		for(int i = 0; i < ginasio.get(num).getStaff().size(); i++) {
			if(ginasio.get(num).getStaff().get(i).getNum_staff() == numm) {
				int escolha = 1;
				do {
					System.out.println(ginasio.get(num).getStaff().get(i).toString()+ "\n");
					System.out.println("O que pretende alterar:\n1 - Nome\n2 - NIF\n3 - Data de Nascimento\n4 - Altura\n5 - Peso\n6 - Sexo\n7 - Tipo\n8 - Escalão\n9 - Sair");
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
										
										ginasio.get(num).getStaff().get(i).setP_nome(p_nome); // set Primeiro nome
								break;
								
								case 2: System.out.println("Insira o novo Último nome: ");
										String u_nome = Ler.umaString();
										
										ginasio.get(num).getStaff().get(i).setU_nome(u_nome); // set Último nome
								break;
								
								case 3: System.out.println("Insira o novo Primeiro nome: ");
										String p_nome2 = Ler.umaString();
										System.out.println("Insira o novo Último nome: ");
										String u_nome2 = Ler.umaString();
										
										ginasio.get(num).getStaff().get(i).setP_nome(p_nome2); // set Primeiro nome
										ginasio.get(num).getStaff().get(i).setU_nome(u_nome2); // set Último nome
								}
								
							} while(escnome != 4);
					break;
					
					// --------------- mudar o nif ------------------
					case 2:	int escnif = 1;
							while(escnif == 1) {
								System.out.println("Insira o novo NIF: ");
								int nif = Ler.umInt();
							
								for(int l = 0; l < ginasio.get(num).getStaff().size(); l++) {
									if(nif == ginasio.get(num).getStaff().get(l).getNif()) {
										System.out.println("Já existe um NIF igual registado!");
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
								System.out.println("Deseja alterar:\n1 - Dia\n2 - Mês\n3 - Ano\n4 - Sair");
								escidade = Ler.umInt();
								switch(escidade) {
								case 1:	System.out.println("Insira o novo dia: ");
										int dia = Ler.umInt();
										
										ginasio.get(num).getStaff().get(i).setDataNasc(ginasio.get(num).getMembros().get(i).getDataNasc().getYear(), ginasio.get(num).getMembros().get(i).getDataNasc().getMonthValue(), dia);
								break;
						
								case 2: System.out.println("Insira o novo mês (1-12): ");
										int mes = Ler.umInt();
										while(mes >= 1 && mes <= 12) {
											ginasio.get(num).getStaff().get(i).setDataNasc(ginasio.get(num).getMembros().get(i).getDataNasc().getYear(), mes, ginasio.get(num).getMembros().get(i).getDataNasc().getDayOfMonth());
										}
								break;
						
								case 3:	System.out.println("Insira o novo ano (1900 - 2022): ");
										int ano = Ler.umInt();
										while(ano >= 1900 && ano <= 2022) {
											ginasio.get(num).getStaff().get(i).setDataNasc(ano, ginasio.get(num).getMembros().get(i).getDataNasc().getMonthValue(), ginasio.get(num).getMembros().get(i).getDataNasc().getDayOfMonth());
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
					
					// --------------- mudar o tipo --------------------
					case 7:
					break;
					
					// --------------- mudar o escalao -----------------
					case 8:
					break;
					
					// --------------- sair ----------------------------
					case 9:
					break;
					
					default: System.out.println("Opção inválida! Tente novamente");
					}
					
				} while(escolha != 9);
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
}

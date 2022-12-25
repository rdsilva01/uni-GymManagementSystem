import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import myinputs.Ler;

public class GerirGinasio {
	
	//+-------------------------------------------------------------+
	//| * * * * * * * * * * * * MENUS * * * * * * * * * * * * * * * |
	//| * * * * * * * * * * * * MENUS * * * * * * * * * * * * * * * |
	//+-------------------------------------------------------------+ 
	
	// menu4
	public static int menu4() {
		int escolh4;
		System.out.println("Qual das seguintes opções deseja ver?");
		System.out.println("1 - Membros");
		System.out.println("2 - Staff");
		System.out.println("3 - Aulas");
		System.out.println("4 - Pessoas");
		System.out.println("5 - Estatísticas");
		System.out.println("6 - Voltar");
		escolh4 = Ler.umInt();
		return escolh4;
	}
	
	// menu3
	public static int menu3() {
		int escolh3;
		System.out.println("Deseja ver Membros, Staff, Aulas, Estatísticas, etc?");
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		escolh3 = Ler.umInt();
		return escolh3;
	}
	
	// menu para a classe Ginasio (principal)
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
		System.out.println("2 - Listar membros");
		System.out.println("3 - Consultar membro, dado o nome, número ou NIF");
		System.out.println("4 - Alterar membro");
		System.out.println("5 - Apagar membro");
		System.out.println("6 - Voltar");
		System.out.println("Qual a sua opção? ");
		opcaomem = Ler.umInt();
		return opcaomem;
	}
	
	// menu para a classe Staff
	public static int menustaff() {
		int opcaostaff;
		System.out.println("1 - Criar STAFF");
		System.out.println("2 - Listar STAFF");
		System.out.println("3 - Consultar STAFF, dado o nome, NIF, cargo ou número");
		System.out.println("4 - Alterar STAFF");
		System.out.println("5 - Apagar STAFF");
		System.out.println("6 - Voltar");
		System.out.println("Qual a sua opção? ");
		opcaostaff = Ler.umInt();
		return opcaostaff;
	}
	
	// menu para a classe Aula
	public static int menuaula() {
		int opcaoaula;
		System.out.println("1 - Criar aula");
		System.out.println("2 - Consultar aulas");
		System.out.println("3 - Consultar aula, dado o nome, horas ou código");
		System.out.println("4 - Inscrever numa aula");
		System.out.println("5 - Alterar aula");
		System.out.println("6 - Apagar aula");
		System.out.println("7 - Voltar");
		System.out.println("Qual a sua opção? ");
		opcaoaula = Ler.umInt();
		return opcaoaula;
	}
	
	// menu para a classe Pessoa
	public static int menupessoa() {
		int opcaoaula;
		System.out.println("1 - Ver aniversários");
		System.out.println("2 - Ver total de pessoas");
		System.out.println("3 - Consultar aula, dado o nome");
		System.out.println("4 - Consultar aula, dando a hora");
		System.out.println("5 - Alterar aula");
		System.out.println("6 - Apagar aula");
		System.out.println("7 - Voltar");
		System.out.println("Qual a sua opção? ");
		opcaoaula = Ler.umInt();
		return opcaoaula;
	}
	
	public static int menustats() {
		int opcaostat;
		System.out.println("Deseja ver que estatísticas?");
		System.out.println("1 - Membros");
		System.out.println("2 - STAFF");
		System.out.println("3 - Aulas");
		System.out.println("4 - Voltar");
		opcaostat = Ler.umInt();
		return opcaostat;
	}
	
	
		//+--------------------------------------------------------------+
		//| * * * * * * * * * * * * * MAIN * * * * * * * * * * * * * * * |
		//| * * * * * * * * * * * * * MAIN * * * * * * * * * * * * * * * |
		//+--------------------------------------------------------------+ 
	
	public static void main (String[] args) {
		int escolha, escolha2, escolha3, escolha4;
		
		// ARRAYLISTS
		ArrayList<Ginasio> ginasios = new ArrayList<Ginasio>();
		
		// Ler ficheiro
		try {
	
			ObjectInputStream is = new ObjectInputStream( new FileInputStream("/Users/rdsilva/Developer/java/GinásioProject/gymdata.md"));
			int ult = is.readInt();
			Ginasio.setUltimo(ult);
			ginasios = (ArrayList<Ginasio>) is.readObject();
			is.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		catch(ClassNotFoundException c) {
			System.out.println(c.getMessage());
		}
	
		System.out.println(" 				.--.");
		System.out.println("				|__| .-------.");
		System.out.println("+-----+ +-------+ +-----+	|=.| |.-----.|");
		System.out.println("|G Y M| |T O O L| |P R O|	|--| || GTP ||");
		System.out.println("+-----+ +-------+ +-----+	|  | |'-----'|");
		System.out.println("				|__|~')_____('");
		
		do {
			escolha = menu();
			switch(escolha) {
			
			// ************************** criar ginásio ****************************
			// *********************************************************************
			case 1: FuncGinasio.criarGinasio(ginasios);
			break;
			
			// ************************** listar ginásios **************************
			// *********************************************************************
			case 2: FuncGinasio.listarGinasio(ginasios); // o toString é dado automaticamente, mas o efeito é de ginasios.toString()
			break;
			
			// ************************** consultar 1 ginásio **********************
			// *********************************************************************
			case 3: int ginum = FuncGinasio.consultarGinasio(ginasios); // consultar o ginasio dado o nome, também dará a opçao de vermos os membros, aulas, staff, etc... desse ginásio em específico.
					escolha2 = menu3(); // mostra o menu a perguntar se o utilizar quer ver as opçoes de Membro, Staff, etc...
					do {
						switch(escolha2) {
						
						case 1:  do {
									escolha3 = menu4(); // mostra o menu com as opções de Membro, Staff, etc...
									switch(escolha3) {
									
									// --------- opções dos membros ------------------
									case 1: escolha4 = 1;
								     			do {
												escolha4 = menumembro();
												switch(escolha4) {
												
												// ------ criar membro ----------
												case 1: FuncMembro.criarMembro(ginasios, ginum);
												break;
												
												// ------ listar membros ----------
												case 2: FuncMembro.listarMembro(ginasios, ginum);
												break;
												
												// ------ consultar membro dado nome ou nº ou nif ----------
												case 3: FuncMembro.consultarMembro(ginasios, ginum);
												break;
												
												// ------ alterar membro ----------
												case 4: FuncMembro.alterarMembro(ginasios, ginum);
												break;
												
												// ------ apagar membro ----------
												case 5: FuncMembro.apagarMembro(ginasios, ginum);
												break;
												
												// ------ sair ----------
												case 6:	System.out.println("A sair...");
												break;
												
												default: System.out.println("Opção inválida! Tente novamente");
												}
											} while(escolha4 != 6);
									break;
									
									// --------- opções da staff ------------------
									case 2: escolha4 = 1;
											do {
												escolha4 = menustaff();
												switch(escolha4) {
												
												// ------ criar staff ----------
												case 1: FuncStaff.criarStaff(ginasios, ginum);
												break;
												
												// ------ listar staff ----------
												case 2:	FuncStaff.listarStaff(ginasios, ginum);
												break;
												
												// ------ consultar staff, dado nome, etc... ----------
												case 3:	FuncStaff.consultarStaff(ginasios, ginum);
												break;
												
												// ------ alterar staff ----------
												case 4:	FuncStaff.alterarStaff(ginasios, ginum);
												break;
												
												// ------ apagar staff ----------
												case 5:	FuncStaff.apagarStaff(ginasios, ginum);
												break;
												
												// ------ sair ---------
												case 6:	System.out.println("A sair...");
												break;
												
												}
											} while(escolha4 != 6);
									break;
									
									// --------- opções das aulas ------------------
									case 3: escolha4 = 1;
											do {
												escolha4 = menuaula();
												switch(escolha4) {
												
												// ------ criar aula ----------
												case 1: FuncAula.criarAula(ginasios, ginum);
												break;
												
												// ------ listar aula ----------
												case 2: FuncAula.listarAula(ginasios, ginum);
												break;

												
												case 3:
												break;
												
												case 4:
												break;
												
												case 5:
												break;
												
												// ------ inscrever membro ----------
												case 6: FuncAula.inscreverAula(ginasios, ginum);
												break;
												
												// ------ sair ----------
												case 7:	System.out.println("A voltar...");
												break;
												}
											} while(escolha4 != 7);
									break;
									
									// --------- opções das pessoas ------------------
									case 4: escolha4 = 1;
											do {
												escolha4 = 0; // futuro menu pessoa
											} while(escolha4 != 5);
									break;
									
									// --------- opções das estatísticas ------------------
									case 5:	escolha4 = 1;
											do {
												escolha4 = menustats();
												int escolha5;
												switch(escolha4) {
												
												// ------ membros ----------
												case 1:	do {
															escolha5 = FuncStats.menuMembro();
															switch(escolha5) {
															
															// ------ nº total de membros ----------
															case 1: 
															break;
															
															// ------ nº de membros inscritos em aulas ----------
															case 2:	FuncStats.membrosInscAula(ginasios, ginum);
															break;
															
															// ------  ----------
															case 3:
															break;
															
															// ------  ----------
															case 4:
															break;
															
															// ------ sair ----------
															case 5:	
															break;
															
															default: System.out.println("Opção errada! Tente novamente!");
															}
														} while(escolha5 != 5);
														
												break;
												
												// ------ staff ----------
												case 2:
												break;
												
												// ------ aulas ----------
												case 3:
												break;
												
												// ------ sair ----------
												case 4:
												break;
												}
											} while(escolha4 != 4);
									break;
									
									// --------- sair ------------------
									case 6: System.out.println("A sair...");
											escolha2 = 2;
									break;
									
									default: System.out.println("Opção errada! Tente novamente!");
									}
							} while(escolha3 != 6);
								
						
						break;
						
						// --------- sair ------------------
						case 2: System.out.println("A sair...");
						break;
						
						default: System.out.println("Opção Errada! Tente novamente!");
						}
							
					} while(escolha2 != 2);
			break;
			
			// ************************** alterar ginásio **************************
			// *********************************************************************
			case 4:
			break;
			
			// ************************** apagar ginásio ***************************
			// *********************************************************************
			case 5:	
			break;
			
			// terminar
			case 6:	
			break;
			}
		} while(escolha != 6);
	}
}

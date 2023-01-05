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
		System.out.println("****************************************************");
		System.out.println("Qual das seguintes opções deseja ver?");
		System.out.println("  1 - Membros");
		System.out.println("  2 - Staff");
		System.out.println("  3 - Aulas");
		System.out.println("  4 - Estatísticas");
		System.out.println("  5 - Voltar");
		System.out.println("****************************************************");
		System.out.print("  Opção: ");
		escolh4 = Ler.umInt();
		return escolh4;
	}
	
	// menu3
	public static int menu3() {
		int escolh3;
		System.out.println("*************************************************************");
		System.out.println("Deseja ver Membros, Staff, Aulas, Estatísticas, etc?");
		System.out.println("  1 - Sim");
		System.out.println("  2 - Não");
		System.out.println("****************************************************");
		System.out.print("  Opção: ");
		escolh3 = Ler.umInt();
		return escolh3;
	}
	
	// menu para a classe Ginasio (principal)
	public static int menu() {
		int opcao;
		System.out.println("\n********************** Menu **********************");
		System.out.println("  1 - Criar ginásio");
		System.out.println("  2 - Listar ginásios");
		System.out.println("  3 - Consultar ginásio, dado o nome ou número");
		System.out.println("  4 - Alterar ginásio");
		System.out.println("  5 - Apagar um ginásio");
		System.out.println("  6 - Terminar");
		System.out.println("**************************************************");
		System.out.print("  Opção: ");
		opcao = Ler.umInt();
		return opcao;
	}
	
	// menu para a classe Membro
	public static int menumembro() {
		int opcaomem;
		System.out.println("\n********************* Membros *********************");
		System.out.println("  1 - Criar membro");
		System.out.println("  2 - Listar membros");
		System.out.println("  3 - Consultar membro, dado o nome, número ou NIF");
		System.out.println("  4 - Alterar membro");
		System.out.println("  5 - Apagar membro");
		System.out.println("  6 - Voltar");
		System.out.println("*****************************************************");
		System.out.print("  Opção: ");
		opcaomem = Ler.umInt();
		return opcaomem;
	}
	
	// menu para a classe Staff
	public static int menustaff() {
		int opcaostaff;
		System.out.println("\n********************** STAFF **********************");
		System.out.println("  1 - Criar STAFF");
		System.out.println("  2 - Listar STAFF");
		System.out.println("  3 - Consultar STAFF, dado o nome, NIF, ou número");
		System.out.println("  4 - Alterar STAFF");
		System.out.println("  5 - Apagar STAFF");
		System.out.println("  6 - Voltar");
		System.out.println("*****************************************************");
		System.out.print("  Opção: ");
		opcaostaff = Ler.umInt();
		return opcaostaff;
	}
	
	// menu para a classe Aula
	public static int menuaula() {
		int opcaoaula;
		System.out.println("\n********************** Aulas **********************");
		System.out.println("  1 - Criar aula");
		System.out.println("  2 - Consultar aulas");
		System.out.println("  3 - Consultar aula, dado o nome, horas ou código");
		System.out.println("  4 - Inscrever membro numa aula");
		System.out.println("  5 - Remover membro de uma aula");
		System.out.println("  6 - Atribuir instrutor a uma aula");
		System.out.println("  7 - Remover instrutor de uma aula");
		System.out.println("  8 - Alterar aula");
		System.out.println("  9 - Apagar aula");
		System.out.println("  10 - Voltar");
		System.out.println("*****************************************************");
		System.out.print("  Opção: ");
		opcaoaula = Ler.umInt();
		return opcaoaula;
	}
	
	public static int menustats() {
		int opcaostat;
		System.out.println("\n****************** Estatísticas ******************");
		System.out.println("  1 - Membros");
		System.out.println("  2 - STAFF");
		System.out.println("  3 - Aulas");
		System.out.println("  4 - Voltar");
		System.out.println("****************************************************");
		System.out.print("Opção: ");
		opcaostat = Ler.umInt();
		return opcaostat;
	}
	
	
	//+--------------------------------------------------------------+
	//| * * * * * * * * * * * * * MAIN * * * * * * * * * * * * * * * |
	//| * * * * * * * * * * * * * MAIN * * * * * * * * * * * * * * * |
	//+--------------------------------------------------------------+ 
	
	public static void main (String[] args) {
		int escolha, escolha2, escolha3, escolha4;
		
		// ArrayList dos Ginásios (todos)
		ArrayList<Ginasio> ginasios = new ArrayList<Ginasio>();
		
		// Ler ficheiro
		try {
	
			ObjectInputStream is = new ObjectInputStream( new FileInputStream("gymdata.md"));
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
					do {
						escolha2 = menu3(); // mostra o menu a perguntar se o utilizar quer ver as opçoes de Membro, Staff, etc...
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
												case 6:	System.out.println("A voltar...");
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

												// ------ consultar aula, dado codigo, etc... ----------
												case 3:	FuncAula.consultarAula(ginasios, ginum);
												break;
												
												// ------ inscrever membro ----------
												case 4: FuncAula.inscreverAula(ginasios, ginum);
												break;
												
												// ------ remover membro -----------
												case 5: FuncAula.removerMembro(ginasios, ginum);
												break;
												
												// ------ atribuir instrutor ----------
												case 6:	FuncAula.atribuirAula(ginasios, ginum);
												break;
												
												// ------ remover instrutor ----------
												case 7: FuncAula.removerInstrutor(ginasios, ginum);
												break;
												
												// ------ alterar aula ----------
												case 8: FuncAula.alterarAula(ginasios, ginum);
												break;
												
												// ------ apagar aula ----------
												case 9:	FuncAula.apagarAula(ginasios, ginum);
												break;
												
												// ------ sair ----------
												case 10:	System.out.println("A voltar...");
												break;
												
												default: System.out.println("Opção errada! Tente novamente!");
												}
											} while(escolha4 != 10);
									break;
									
									// --------- opções das estatísticas ------------------
									case 4:	escolha4 = 1;
											do {
												escolha4 = menustats();
												int escolha5 = 1;
												switch(escolha4) {
												
												// ------ membros ----------
												case 1:	do {
															escolha5 = FuncStats.menuMembro();
															switch(escolha5) {
															
															// ------ nº total de membros ----------
															case 1: FuncStats.numMembros(ginasios, ginum);
															break;
															
															// ------ nº de membros inscritos em aulas ----------
															case 2:	FuncStats.membrosInscAula(ginasios, ginum);
															break;
															
															// ------ membros com X idade ----------
															case 3: FuncStats.memVerIdade(ginasios, ginum);
															break;
															
															// ------ membros inscritos em duas ou mais aulas ----------
															case 4:	FuncStats.memInscAula(ginasios, ginum);
															break;
															
															// ------ género em percentagem ----------
															case 5: FuncStats.membrosGenero(ginasios, ginum);
															break;
															
															// ------ sair ----------
															case 6:	
															break;
															
															default: System.out.println("Opção errada! Tente novamente!");
															}
														} while(escolha5 != 6);
														
												break;
												
												// ------ staff ----------
												case 2:	do {
														escolha5 = FuncStats.menuStaff();
														switch(escolha5) {
														
														// ------ nº total de staff ----------
														case 1: FuncStats.numStaff(ginasios, ginum);
														break;
														
														// ------ staff com X escalão ----------
														case 2:	FuncStats.escalaoStaff(ginasios, ginum);
														break;
														
														// ------ staff com X posição ----------
														case 3:	FuncStats.posicaoStaff(ginasios, ginum);
														break;
														
														// ------ staff com X anos ----------
														case 4:	FuncStats.idadeStaff(ginasios, ginum);
														break;
														
														// ------ nº de staff que dá uma ou mais aulas ----------
														case 5: FuncStats.aulasStaff(ginasios, ginum);
														break;
														
														// ------ staff por género
														case 6:	FuncStats.generoStaff(ginasios, ginum);
														break;
														
														// ------ sair ----------
														case 7:	
														break;
														
														default: System.out.println("Opção errada! Tente novamente!");
														}
													} while(escolha5 != 7);
		
												break;
												
												// ------ aulas ----------
												case 3: do {
														escolha5 = FuncStats.menuAula();
														switch(escolha5) {
														
														// ------ nº de aulas ----------
														case 1:	FuncStats.aulasTotal(ginasios, ginum);
														break;
														
														// ------ dia de semana ----------
														case 2:	FuncStats.aulasDDS(ginasios, ginum);
														break;
														
														// ------ manha/tarde ----------
														case 3: FuncStats.aulasManhaTarde(ginasios, ginum);
														break;
														
														// ------ voltar ----------
														case 4: System.out.println("  A voltar...");
														break;
														
														default: System.out.println("  Opção errada! Tente novamente!");
														}
													} while(escolha5 != 4);
												
												break;
												
												// ------ sair ----------
												case 4:
												break;
												}
											} while(escolha4 != 4);
									break;
									
									// --------- sair ------------------
									case 5: System.out.println("  A voltar...");
											escolha2 = 2;
									break;
									
									default: System.out.println("  Opção errada! Tente novamente!");
									}
							} while(escolha3 != 5);
								
						
						break;
						
						// --------- sair ------------------
						case 2: System.out.println("  A voltar...");
						break;
						
						default: System.out.println("  Opção Errada! Tente novamente!");
						}
							
					} while(escolha2 != 2);
			break;	
			
			// ************************** alterar ginásio **************************
			// *********************************************************************
			case 4: FuncGinasio.alterarGinasio(ginasios);
			break;
			
			// ************************** apagar ginásio ***************************
			// *********************************************************************
			case 5:	FuncGinasio.apagarGinasio(ginasios);
			break;
			
			// terminar
			case 6:	
			break;
			}
		} while(escolha != 6);
	}
}

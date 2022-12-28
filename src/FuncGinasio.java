import java.io.*;
import java.util.ArrayList;

import myinputs.Ler;

public class FuncGinasio {
	
	/* ------------------- CRIAR GINÁSIO --------------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void criarGinasio(ArrayList<Ginasio> ginasio) {
		System.out.print("  Insira o nome do Ginásio: ");
		String nome = Ler.umaString(); 
		
		// não podem existir nomes iguais
		for (int i = 0; i < ginasio.size(); i++) {
			if (ginasio.get(i).getNome().equals(nome)) {
				System.out.println("  Um ginásio com esse nome já existe!");
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
	
	/* ------------------- CONSULTAR GINÁSIO ESPECÍFICO ------------------------ *
	 * ------------------------------------------------------------------------- */
	public static int consultarGinasio(ArrayList<Ginasio> ginasios) {
		int escolha = 0;
		int gimnum = -1;
		do {
			System.out.println("*************************************");
			System.out.println("  Deseja consultar o ginásio dado:\n  1 - Nome\n  2 - Número\n  3 - Voltar");
			System.out.print("*************************************\n  Opção: ");
			escolha = Ler.umInt();
			switch(escolha) {
			
			case 1: System.out.println("  Insira o nome do Ginásio: ");
					String nome = Ler.umaString();
					
					// verificar se existe o Ginásio
					for(int i = 0; i < ginasios.size(); i++) {
						if(ginasios.get(i).getNome().equals(nome)) {
							System.out.println(ginasios.get(i).toString());
							gimnum = i;
						}
					}
			break;
			
			case 2:	System.out.println("  Insira o número do Ginásio: ");
					int num = Ler.umInt();
					
					// verificar se existe o Ginásio
					for(int i = 0; i < ginasios.size(); i++) {
						if(ginasios.get(i).getNum() == num) {
							System.out.println(ginasios.get(i).toString());
							gimnum = i;
						}
					}
			break;
			
			case 3:	System.out.println("  A sair...");
					escolha = 2;
			break;
			
			default: System.out.println("  Opção errada! Tente novamente!");
			}
		} while(escolha != 1 && escolha !=2);
		
		return gimnum; 
	}
	
	/* ------------------- ALTERAR GINÁSIO ------------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void alterarGinasio(ArrayList<Ginasio> ginasio) {
		boolean verif = true;
		
		System.out.println("  Insira o nome do Ginásio que pretende alterar");
		String nome = Ler.umaString();
		
		// verificar se existe o ginásio com o nome dado
		for(int i = 0; i < ginasio.size(); i++) {
			if(ginasio.get(i).getNome().equals(nome)) {
				int escolha = 1;
				do {
					System.out.println("*************************************");
					System.out.println("O que pretende alterar?\n  1 - Nome\n  2 - Precos\n  3 - Aulas\n  4 - Membros\n  5 - Staff\n  6 - Voltar");
					System.out.print("*************************************\n  Opção: ");
					escolha = Ler.umInt();
					switch(escolha) {
					
					// alterar nome
					case 1:	
								int escnome = 1;
								while(escnome != 0) {
									System.out.println("  Insira o novo nome");
									String nomenovo = Ler.umaString();
									for(int j = 0; j < ginasio.size(); j++) {
										if(ginasio.get(i).getNome().equals(nomenovo)) {
											System.out.println("  O nome que pretende introduzir já existe!");
											return;
										}
									}
									escnome = 0;
								}
					break;
					
					// alterar precos
					case 2:	
							int escolhpreco = 1;
							do {
								System.out.println("  Os preços atuais são: " + ginasio.get(i).getPrecos().toString());
								System.out.println("  A quota anual é de: " + ginasio.get(i).getQuotas().toString());
								System.out.println("  Deseja alterar:\n1 - Preços\n2 - Quota\n3 - Voltar");
								escolhpreco = Ler.umInt();
								switch(escolhpreco) {
								// preco
								case 1: System.out.println("  Os preços funcionam da seguinte maneira:\nO primeiro preço é o preço base - " + ginasio.get(i).getPrecos().get(0));
										System.out.println("  Os restantes são modificadores, em relação à idade, etc...");
										String rest = "";
										for(int k = 1; k < ginasio.get(i).getPrecos().size(); k++) {
											rest += k + " - " + ginasio.get(i).getPrecos().get(k) + "\n";
										}
										System.out.println(rest);
										System.out.print("*******************************");
										System.out.println("  O que deseja alterar?\n1 - Preço Base\n2 - Modificadores\n3 - Voltar");
										System.out.print("*******************************\n  Opção: ");
										int escolhpreco2 = 1;
										do {
											escolhpreco2 = Ler.umInt();
											switch(escolhpreco) {
											
											// preço base
											case 1:	System.out.println("  Preço Base atual = " + ginasio.get(i).getPrecos().get(0));
													System.out.println("  Insira o novo valor ( valor < 0): ");
													double valor = 1;
													do {
														valor = Ler.umDouble();
													} while(valor < 0);
											break;
											
											// modificadores
											case 2:	for(int l = 1; l < ginasio.get(i).getPrecos().size(); l++) {
														rest += "  " + l + " - " + ginasio.get(i).getPrecos().get(l) + "\n";
													}
													System.out.print("*************************************");
													System.out.println("  Modificadores atuais:\n" + rest);
													System.out.println("  Deseja:\n1 - Alterar modificadores\n  2 - Voltar");
													System.out.print("*************************************\n  Opção: ");
													int escolhmod = 1;
													do {
														escolhmod = Ler.umInt();
														switch(escolhmod) {
														// alterar mod
														case 1: System.out.println("  Qual dos seguintes modificadores deseja alterar?\n" + rest + "" + ginasio.get(i).getPrecos().size() + " - Voltar");
																int escolhmod2 = 1;
																do {
																	escolhmod2 = Ler.umInt();
																	System.out.println("  Insira o novo modificador");
																	double mod = Ler.umDouble();
																	ginasio.get(i).getPrecos().set(escolhmod, mod);
																	
																} while(escolhmod2 != ginasio.get(i).getPrecos().size());
														break;
														
														// voltar
														case 2: 
														break;
														
														
														default: System.out.println("  Opção errada! Tente novamente!");
														}
													} while(escolhmod != 2);
													
											
											break;
											
											// voltar
											case 3:
											break; 
											
											default: System.out.println("  Opção errada! Tente novamente");
											}
										} while(escolhpreco2 != 3);
								break;
								
								// quota
								case 2: System.out.println("*************************************************************");
										System.out.println("  A quota é valor pago anualmente para ser sócio do ginásio");
										System.out.println("  A quota atual é de: " + ginasio.get(i).getQuotas().toString());
										System.out.println("  Deseja:\n1 - Alterar valor da quota\n  2 - Voltar");
										System.out.print("*************************************************************\n  Opção: ");
										int escolhquota = 1;
										do {
											escolhquota = Ler.umInt();
											switch(escolhquota) {
											
											// alterar quota
											case 1:	if(ginasio.get(i).getQuotas().size() == 1) {
														System.out.println("  Introduza o novo valor da quota");
														double novovalor = Ler.umDouble();
														ginasio.get(i).getQuotas().set(0, novovalor);
														escolhquota = 3;
													}
													else {
														String quotastr = "";
														for(int m = 0; m < ginasio.get(i).getQuotas().size(); m++) {
															quotastr += "  " + (m+1) + " - " + ginasio.get(i).getQuotas().get(m) + "\n";
														}
														System.out.println("*************************************");
														System.out.println("  Qual das quotas deseja alterar:\n" + quotastr);
														System.out.print("*************************************\n  Opção: ");
														int escolhquota2 = 1;
														do {
															escolhquota2 = Ler.umInt();
															System.out.println("  Insira o novo valor");
															double novovalor = 0.1;
															do {
																novovalor  = Ler.umDouble();
																ginasio.get(i).getQuotas().set(escolhquota2, novovalor);
															} while(novovalor < 0 || novovalor >= 1);
															System.out.println("  Novo valor: " + novovalor);
															
														} while(escolhquota2 != ginasio.get(i).getQuotas().size()+1);
													}
											break;
											
											// voltar
											case 2:	
											break;
											
											default: System.out.println("  Opção errada! Tente novamente!");
											}
										} while(escolhquota != 2);
								break;
								
								// voltar
								case 3:
								break;
								
								default: System.out.println("  Opção errada! Tente novamente!");
								}
								
							} while(escolhpreco != 3);
							
							
					break;
					
					// alterar aulas
					case 3:
					break;
					
					// alterar membros
					case 4:
					break;
					
					// alterar staff
					case 5:
					break;
					
					// voltar
					case 6:
					break;
					
					default: System.out.println("  Opção errada! Tente novamente!");
					}
				} while(escolha != 6);
				
			}
		}
		System.out.println("  Não existe nenhum ginásio com esse nome!");
		
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
			System.out.println("  Insira o nº do Ginásio que pretende apagar: ");
			int num = Ler.umInt();
		
			for(int i = 0; i < ginasio.size(); i++) {
				if(ginasio.get(i).getNum() == num) {
					System.out.println("  Deseja apagar o seguinte ginásio?\n" + ginasio.get(i).getNome() + "\n1 - Sim\n2 - Não");
						apagar = Ler.umInt();
						switch(apagar) {
						case 1: ginasio.remove(i);
								System.out.println("  Ginásio removido com sucesso!");
								apagar = 2;
						break;
						
						case 2:
						break;
						
						default: System.out.println("  Opção errada! Tente novamente!");
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

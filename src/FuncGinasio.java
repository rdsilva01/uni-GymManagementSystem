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
		int cont1 = 1;
		while(cont1 == 1) {
			for (int i = 0; i < ginasio.size(); i++) {
				if (ginasio.get(i).getNome().equals(nome)) {
					System.out.println("  Um ginásio com esse nome já existe!");
					System.out.print("  Insira o nome do Ginásio: ");
					nome = Ler.umaString(); 
					cont1++;
				}
			}
			if(cont1 == 1) {
				cont1 = 0;
			}
			else {
				cont1 = 1;
			}
		}
		
		Ginasio g = new Ginasio(nome);
		ginasio.add(g);
		
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
		boolean verif2 = false;
		
		System.out.println("  Insira o nome do Ginásio que pretende alterar");
		String nome = Ler.umaString();
		
		
		// verificar se existe o ginásio com o nome dado
		for(int i = 0; i < ginasio.size(); i++) {
			if(ginasio.get(i).getNome().equals(nome)) {
				verif2 = true;
				int escolha = 1;
				do {
					System.out.println("*************************************");
					System.out.println("O que pretende alterar?\n  1 - Nome\n  2 - Precos\n  3 - Voltar");
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
								String precosstring =  "\n  - " + ginasio.get(i).getPrecos().get(0) + "€";
								for(int l = 1; l < ginasio.get(i).getPrecos().size(); l++) {
									precosstring += "\n  - " + (ginasio.get(i).getPrecos().get(l) * ginasio.get(i).getPrecos().get(0)) + " €";
								}
								
								System.out.println("  Os preços atuais são: " + precosstring);
								System.out.println("  A quota anual é de: " + ginasio.get(i).getQuota());
								System.out.println("  Deseja alterar:\n1 - Preços\n2 - Quota\n3 - Voltar");
								escolhpreco = Ler.umInt();
								switch(escolhpreco) {
								// preco
								case 1: System.out.println("  Os preços funcionam da seguinte maneira:\nO primeiro preço é o preço base - " + ginasio.get(i).getPrecos().get(0));
										System.out.println("  Os restantes são modificados, em relação à idade:");
										System.out.println("  1 - " + ginasio.get(i).getPrecos().get(1));
										System.out.println("  2 - " + ginasio.get(i).getPrecos().get(2));
										
										int escolhpreco2 = 1;
										do {
											System.out.print("*******************************");
											System.out.println("  O que deseja alterar?\n1 - Preço Base\n2 - Modificadores\n3 - Voltar");
											System.out.print("*******************************\n  Opção: ");
											escolhpreco2 = Ler.umInt();
											switch(escolhpreco2) {
											
											// preço base
											case 1:	System.out.println("  Preço Base atual = " + ginasio.get(i).getPrecos().get(0));
													System.out.println("  Insira o novo valor ( valor < 0): ");
													double valor = 1;
													valor = Ler.umDouble();
													verif = true;
													while(verif) {
														if(valor < 0) {
															System.out.print("  Insira um valor superior a 0");
															valor = Ler.umDouble();
														}
														else {
															System.out.println("  Preço alterado com sucesso!");
															ginasio.get(i).getPrecos().set(0, valor);
															verif = false;
														}
													}
											break;
											
											// modificadores
											case 2:	
													int escolhmod = 1;
													do {
														System.out.print("*************************************");
														System.out.println("  Modificadores atuais:");
														System.out.println("  1 - " + ginasio.get(i).getPrecos().get(1));
														System.out.println("  2 - " + ginasio.get(i).getPrecos().get(2));
														System.out.println("  Deseja:\n1 - Alterar modificadores\n  2 - Voltar");
														System.out.print("*************************************\n  Opção: ");
														escolhmod = Ler.umInt();
														switch(escolhmod) {
														// alterar mod
														case 1: System.out.println("\n  Qual dos seguintes modificadores deseja alterar?");
																System.out.println("  1 - " + ginasio.get(i).getPrecos().get(1));
																System.out.println("  2 - " + ginasio.get(i).getPrecos().get(2));
																System.out.println("  3 - Voltar");
														
																int escolhmod2 = 1;
																verif = true;
																do {
																	escolhmod2 = Ler.umInt();
																	while(verif) {
																		if(escolhmod2 != 1 && escolhmod2 != 2) {
																			System.out.println("  Modificador introduzido não foi encontrado! Tente novamente");
																			System.out.println("  Modificadores atuais:");
																			System.out.println("  1 - " + ginasio.get(i).getPrecos().get(1));
																			System.out.println("  2 - " + ginasio.get(i).getPrecos().get(2));
																			
																			escolhmod2 = Ler.umInt();
																		}
																		else {
																			System.out.println("  Insira o novo modificador (em percentagem)");
																			double mod = Ler.umDouble();
																			if(mod < 0) {
																				System.out.println("  Tem de inserir um valor maior que 0, recorde-se que o valor é uma percentagem!");
																				System.out.println("  Insira o novo modificador (em percentagem)");
																				mod = Ler.umDouble();
																			}
																			else {
																				ginasio.get(i).getPrecos().set(escolhmod2, mod/100);
																				verif = false;
																			}
																		}
																	}
																} while(verif);
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
								case 2: int escolhquota = 1;
										do {
											System.out.println("*************************************************************");
											System.out.println("  A quota é valor pago anualmente para ser sócio do ginásio");
											System.out.println("  A quota atual é de: " + ginasio.get(i).getQuota());
											System.out.println("  Deseja:\n  1 - Alterar valor da quota\n  2 - Voltar");
											System.out.print("*************************************************************\n  Opção: ");
											escolhquota = Ler.umInt();
											switch(escolhquota) {
											
											// alterar quota
											case 1:	System.out.println("  Quota atual: " + ginasio.get(i).getQuota());
													System.out.print("  Insira a nova quota ( valor < 0): ");
													double novaquota = 1;
													novaquota = Ler.umDouble();
													verif = true;
													while(verif) {
														if(novaquota < 0) {
															System.out.print("  Insira um valor superior a 0");
															novaquota = Ler.umDouble();
														}
														else {
															System.out.println("  Preço alterado com sucesso!");
															ginasio.get(i).setQuota(novaquota);
															verif = false;
														}
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
					
					// voltar
					case 3:
					break;
					
					default: System.out.println("  Opção errada! Tente novamente!");
					}
				} while(escolha != 3);
				
			}
			if(verif2 == false) {
				System.out.println("Não existe nenhum ginásio com esse nome");
			}
		}
		
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
	
	/* ------------------- APAGAR GINÁSIO -------------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void apagarGinasio(ArrayList<Ginasio> ginasio) {
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

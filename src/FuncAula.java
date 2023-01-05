import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import myinputs.Ler;

public class FuncAula {
	
	/* ------------------- CRIAR AULA ------------------------------------------ *
	 * ------------------------------------------------------------------------- */
	public static void criarAula(ArrayList<Ginasio> ginasio, int num) {
		boolean verif = true;
		int cont1 = 1, cont2 = 1;
		
		
		
		System.out.println("  Insira o nome da Aula: ");
		String nome = Ler.umaString();
		
		
		System.out.println("  Insira o código da aula");
		int codigo = Ler.umInt();
		
		while(cont1 == 1) {
			for(int j = 0; j < ginasio.get(num).getAulas().size(); j++) {
					if(ginasio.get(num).getAulas().get(j).getCodigo() == codigo) {
						System.out.println("  Já existe um aula com esse código -> " + ginasio.get(num).getAulas().get(j).getNome());
						System.out.println("  Insira o código da aula");
						codigo = Ler.umInt();
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
	
		
		int ddscont = 1;
		String dds = "";
		do {
			System.out.println("  Escolha o dia de semana em que se vai realizar a aula:\n  1 - Segunda-Feira\n  2 - Terça-Feira\n  3 - Quarta-Feira\n  4 - Quinta-Feira\n  5 - Sexta-Feira\n  6 - Sábado\n  7- Domingo");
			int ddsesc = Ler.umInt();
			switch(ddsesc) {
			case 1: dds = "Segunda-Feira";
					ddscont = 2;
			break;
			
			case 2: dds = "Terça-Feira";
					ddscont = 2;
			break;
			
			case 3: dds = "Quarta-Feira";
					ddscont = 2;
			break;
			
			case 4: dds = "Quinta-Feira";
					ddscont = 2;
			break;
			
			case 5: dds = "Sexta-Feira";
					ddscont = 2;
			break;
			
			case 6: dds = "Sábado";
					ddscont = 2;
			break;
			
			case 7: dds = "Domingo";
					ddscont = 2;
			break;
			
			default: System.out.println("  Opção errada! Tente novamente!");
			}
			
		} while(ddscont != 2);
		
		int horas;
		int minutos;
		
		
		System.out.println("  Insira as horas da aula: ");
		horas = Ler.umInt();
		System.out.println("  Insira os minutos da aula: ");
		minutos = Ler.umInt();
		
		int cont = 1;
		
		while(cont == 1) {
			for(int i = 0; i < ginasio.get(num).getAulas().size(); i++) {
					if(((ginasio.get(num).getAulas().get(i).getHora() == horas && ginasio.get(num).getAulas().get(i).getMinuto() == minutos && ginasio.get(num).getAulas().get(i).getDds().equals(dds))) || ((ginasio.get(num).getAulas().get(i).getHora() == horas && ginasio.get(num).getAulas().get(i).getMinuto() == (minutos - 30) && ginasio.get(num).getAulas().get(i).getDds().equals(dds))) || ((ginasio.get(num).getAulas().get(i).getHora() == horas && ginasio.get(num).getAulas().get(i).getMinuto() == (minutos + 30) && ginasio.get(num).getAulas().get(i).getDds().equals(dds)))) {
						System.out.println("  Tem um aula marcada para as " + horas + ":" + minutos + "! ( Tem de ter pelo menos 1 hora de diferença!");
						System.out.println("  Insira as horas da aula: ");
						horas = Ler.umInt();
						System.out.println("  Insira os minutos da aula: ");
						minutos = Ler.umInt();
						cont++;
					}
			}
			if(cont == 1) {
				cont = 0;
			}
			else {
				cont = 1;
			}
		}
		
		System.out.println("  Insira o nº máximo de pessoas: ");
		int numpaxmax = Ler.umInt();
		
		Aula a = new Aula(codigo, horas, minutos, nome, dds, numpaxmax);
		
		ginasio.get(num).addAula(a);
		
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
	
	/* ------------------- LISTAR AULAS ---------------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void listarAula(ArrayList<Ginasio> ginasio, int num) {
		String listaraula = "";
		for(int i = 0; i < ginasio.get(num).getAulas().size(); i++) {
			listaraula += ginasio.get(num).getAulas().get(i).toString() + "\n";
		}
		System.out.println("  [" + ginasio.get(num).getAulas().size() + "] aulas");
		System.out.println(listaraula);
		
	}
	
	
	/* ------------------- CONSULTAR AULA -------------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void consultarAula(ArrayList<Ginasio> ginasio, int num) {
		// dado nome, dado instrutor, dado hora
		boolean verif = true;
		int cont1 = 1;
		int escolha = 1;
		String totalaula;
		
		do {
			totalaula = "";
			System.out.println("*************************************");
			System.out.println("Deseja consultar dado:\n  1 - Código de aula\n  2 - Instrutor\n  3 - Dia e/ou horas\n  4 - Voltar");
			System.out.print("*************************************\n  Opção: ");
			escolha = Ler.umInt();
			switch(escolha) {
			
			// dado o código
			case 1: int codigo = 1000;
					do {
						System.out.print("  Insira o código: ");
						codigo = Ler.umInt();
						for(int i = 0; i < ginasio.get(num).getAulas().size(); i++) {
							if(codigo == ginasio.get(num).getAulas().get(i).getCodigo()) {
								totalaula += "\n" + ginasio.get(num).getAulas().get(i).toString();
							}
						}
					} while(codigo < 1000 && codigo > 9999);
					
					if(totalaula.equals("")) {
						System.out.println("  Não existem aulas com esse código!");
					}
					else {
						System.out.println(totalaula + "\n");
						escolha = 4;
					}
			break;
			
			// dado o instrutor
			case 2:	System.out.println("  Insira o nº do instrutor (STAFF): ");
					int numinst = Ler.umInt();
						for(int i = 0; i < ginasio.get(num).getStaff().size(); i++) {
							if(numinst == ginasio.get(num).getStaff().get(i).getNum_staff()) {
								System.out.println("  Aulas do instrutor:\n nº[" + ginasio.get(num).getStaff().get(i).getNum_staff() + "] " + ginasio.get(num).getStaff().get(i).getP_nome() + " " + ginasio.get(num).getStaff().get(i).getU_nome());
								System.out.println(ginasio.get(num).getStaff().get(i).getInstaula());
							}
						}
			break;
			
			// dado o dia e/ou horas
			case 3: int escolhsemana = 1;
					String aulas = "";
					String[] dds = {"Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado", "Domingo"};
					while(cont1 == 1) {	
						System.out.println("  Qual o dia de semana que deseja ver?:\n  1 - Segunda-Feira\n  2 - Terça-Feira\n  3 - Quarta-Feira\n  4 - Quinta-Feira\n  5 - Sexta-Feira\n  6 - Sábado\n  7 - Domingo");
						escolhsemana = Ler.umInt();
						for(int i = 0; i < ginasio.get(num).getAulas().size(); i++) {
							if(dds[escolhsemana-1].equals(ginasio.get(num).getAulas().get(i).getDds())) {
								aulas += ginasio.get(num).getAulas().get(i).toString() + "\n";
							}
						}
						if(aulas.equals("")) {
							cont1 = 1;
							System.out.println("  Não tem aulas!");
						}
						else {
							cont1 = 0;
							System.out.println(aulas);
						}
						
					}
				
			
			break;
			
			// voltar
			case 4: System.out.println("A voltar...");
			break;
			
			default: System.out.println("  Opção errada! Tente novamente!");
			}
		} while(escolha !=4);
	}
	
	
	/* ------------------- INSCREVER NUMA AULA --------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void inscreverAula(ArrayList<Ginasio> ginasio, int num) {
		boolean verif = true;
		
		// pedir o nº
		System.out.println("  Insira o número de membro: ");
		String totalnum = "";
		int numinscrito = -1;
		int numm = Ler.umInt();
		
		for(int j = 0; j < ginasio.get(num).getMembros().size(); j++) {
			if(numm == ginasio.get(num).getMembros().get(j).getNum_membro()) {
				totalnum = ginasio.get(num).getMembros().get(j).toString();
				numinscrito = j;
			}
		}
		
		if(totalnum.equals("")) {
			System.out.println("  Não existe nenhum membro registado com esse número!");
		}
		else {
			System.out.println("  Deseja inscrever o seguinte membro?\n" + totalnum + "\n  1 - Sim\n  2 - Não");
			int escins = 1;
			do {
				escins = Ler.umInt();
				switch(escins) {
				case 1: String aulatot = "";
						
						
						do {
							System.out.println("  Em qual das seguintes aulas pretende inscrever o membro? (Insira o código da aula)");
							String listaraula = "";
							for(int i = 0; i < ginasio.get(num).getAulas().size(); i++) {
								listaraula += "\n" + ginasio.get(num).getAulas().get(i).toString() + "\n";
							}
							System.out.print(listaraula + "\n  Insira o código da aula: ");
							// codigo da aula
							int aula = Ler.umInt();
							for(int j = 0; j < ginasio.get(num).getAulas().size(); j++) {
								if(aula == ginasio.get(num).getAulas().get(j).getCodigo()) {
									aulatot = ginasio.get(num).getAulas().get(j).toString();
									for(int k = 0; k < ginasio.get(num).getMembros().get(numinscrito).getAulas().size(); k++) {
										if(ginasio.get(num).getMembros().get(numinscrito).getAulas().get(k).getCodigo() == ginasio.get(num).getAulas().get(j).getCodigo()){
											System.out.println("  O membro que está a tentar inscrever na aula já está inscrito!");
											return;
										}
									}
									
									if(ginasio.get(num).getAulas().get(j).getNumpaxmax() - ginasio.get(num).getAulas().get(j).getInscritos().size() <= 0) {
										System.out.println("A aula já está cheia!");
										return;
									}
									
									
									System.out.println("  Deseja inscrever na aula?\n" + ginasio.get(num).getAulas().get(j).toString() + "\n1 - Sim\n2 - Não");
									int escoaula = Ler.umInt();
									switch(escoaula) {
									
									case 1:	ginasio.get(num).getAulas().get(j).addInscritos(ginasio.get(num).getMembros().get(numinscrito));
											ginasio.get(num).getMembros().get(numinscrito).addAula(ginasio.get(num).getAulas().get(j));
									
											System.out.println("  Membro ["+ ginasio.get(num).getMembros().get(numinscrito).getNum_membro() + "] " + ginasio.get(num).getMembros().get(numinscrito).getP_nome() + " " 
												+ ginasio.get(num).getMembros().get(numinscrito).getU_nome() + " está inscrito em " + ginasio.get(num).getAulas().get(j).getNome() + ", estando marcada para " 
												+ ginasio.get(num).getAulas().get(j).getDds() + " às " + ginasio.get(num).getAulas().get(j).getHora() + ":" + ginasio.get(num).getAulas().get(j).getMinuto());
											escins = 2;
											verif = false;
									break;
									
									case 2:	System.out.println("  A voltar...");
									break;
									
									default: System.out.println("  Opção errada! Tente novamente!");
									}
								}
							}
						} while(verif);
						
				break;
				
				case 2: System.out.println("  A sair...");
						escins = 2;
				break;
				
				default: System.out.println("  Opção errada! Tente novamente!");
						
				}
			} while(escins != 2);
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
	
	/* ------------------- ATRIBUIR INSTRUTOR ---------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void atribuirAula(ArrayList<Ginasio> ginasio, int num) {
		
		
		// pedir o nº do instrutor
		String totalnum = "";
		boolean verif = true;
		do {
			System.out.println("  Insira o número de STAFF: ");
			totalnum = "";
			int numatribuido = -1;
			int numm = Ler.umInt();
			
			if(ginasio.get(num).getStaff().size() == 0) {
				System.out.println("Não existe STAFF!");
				totalnum = " ";
			}
			else {
				for(int j = 0; j < ginasio.get(num).getStaff().size(); j++) {
					if(numm == ginasio.get(num).getStaff().get(j).getNum_staff()) {
						totalnum = ginasio.get(num).getStaff().get(j).toString();
						numatribuido = j;
					}
				}
					
				if(totalnum.equals("")) {
					System.out.println("  Não existe nenhum STAFF registado com esse número!");
				}
				else {
					do {
						System.out.println("  Introduza o código da aula que deseja atribuir o instrutor");
						int codigo = Ler.umInt();
						
						for(int i = 0; i < ginasio.get(num).getAulas().size(); i++) {
							if(codigo == ginasio.get(num).getAulas().get(i).getCodigo()){
								if(ginasio.get(num).getAulas().get(i).getInstrutor().size() < 2) {
									System.out.println("  Instrutor atribuído à aula " + ginasio.get(num).getAulas().get(i).getNome());
									ginasio.get(num).getAulas().get(i).addInstrutor(ginasio.get(num).getStaff().get(numatribuido));
									ginasio.get(num).getStaff().get(numatribuido).addAula(ginasio.get(num).getAulas().get(i));
									verif = false;
								}
								else if(ginasio.get(num).getAulas().get(i).getInstrutor().size() == 2) {
									System.out.println("  Já estão atribuídos 2 instrutores a essa aula");
								}
							}
						}
						
					} while(verif != false);
				}
			}
		} while(totalnum.equals(""));
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
	
	/* ------------------- ALTERAR AULA ---------------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void alterarAula(ArrayList<Ginasio> ginasio, int num) {
		boolean verif = true;
		
		System.out.print("\nIntroduza o código da aula que deseja alterar: ");
		int codigo = Ler.umInt();
		
		for(int i = 0; i < ginasio.get(num).getAulas().size(); i++) {
			if(codigo == ginasio.get(num).getAulas().get(i).getCodigo()) {
				int escolha = 1;
				do {
					System.out.println("*************************************");
					System.out.println("  Aula: " + ginasio.get(num).getAulas().get(i).toString());
					System.out.println("  O que pretende alterar:\n  1 - Horas\n  2 - Código\n  3 - Nome\n  4 - Nº Máximo de Pessoas\n  5 - Dia de Semana\n  6 - Voltar");
					System.out.print("*************************************\n  Opção:");
					escolha = Ler.umInt();
					int escolha2 = 1;
					
					switch(escolha) {
					
					// horas
					case 1:	do {
								System.out.println("  Deseja alterar:\n  1 - Horas\n  2 - Minutos\n  3 - Voltar");
								escolha2 = Ler.umInt();
								switch(escolha2) {
								
								// horas
								case 1:		System.out.println("  Hora atual: " + ginasio.get(num).getAulas().get(i).getHora());
											int horas = Ler.umInt();
											int cont1 = 1;
											int minutos = ginasio.get(num).getAulas().get(i).getMinuto();
											String dds = ginasio.get(num).getAulas().get(i).getDds();
											while(cont1 == 1) {
												for(int j = 0; j < ginasio.get(num).getAulas().size(); j++) {
														if(ginasio.get(num).getAulas().get(j).getHora() == horas && ginasio.get(num).getAulas().get(j).getMinuto() == minutos && ginasio.get(num).getAulas().get(j).getDds().equals(dds)) {
															System.out.println("  Já tem um aula marcada para as " + horas + ":" + minutos + "!");
															System.out.println("  Insira as horas da aula: ");
															horas = Ler.umInt();
															cont1++;
														}
													}	
												if(cont1 == 1) {
													System.out.println("  Horário mudado para: "+ dds + " às "  + horas + "h" + minutos + "min");
													ginasio.get(num).getAulas().get(i).setHora(horas);
													cont1 = 0;
												}
												else {
													cont1 = 1;
												}
											}
										
								break;
								
								// minutos
								case 2:	System.out.println("  Minuto atual: " + ginasio.get(num).getAulas().get(i).getMinuto());
										int horas1 = ginasio.get(num).getAulas().get(i).getHora();
										int minutos1 = Ler.umInt();
										int cont2 = 1;
										String dds1 = ginasio.get(num).getAulas().get(i).getDds();
										while(cont2 == 1) {
											for(int j = 0; j < ginasio.get(num).getAulas().size(); j++) {
													if(ginasio.get(num).getAulas().get(j).getHora() == horas1 && ginasio.get(num).getAulas().get(j).getMinuto() == minutos1 && ginasio.get(num).getAulas().get(j).getDds().equals(dds1)) {
														System.out.println("  Já tem um aula marcada para as " + horas1 + ":" + minutos1 + "!");
														System.out.println("  Insira os minutos da aula: ");
														minutos1 = Ler.umInt();
														cont2++;
														}
												}
												if(cont2 == 1) {
													System.out.println("  Horário mudado para: "+ dds1 + " às "  + horas1 + "h" + minutos1 + "min");
													ginasio.get(num).getAulas().get(i).setMinuto(minutos1);
													cont2 = 0;
												}
												else {
													cont2 = 1;
												}
										}
								break;
								
								// voltar
								case 3:
								break;
								
								
								default: System.out.println("Opção errada! Tente novamente!");
								}
								
							} while(escolha2 != 3); 
					break;
					
					// codigo
					case 2:	System.out.println("  Código atual: " + ginasio.get(num).getAulas().get(i).getCodigo());
							int novocodigo = Ler.umInt();
							int cont3 = 1;
							while(cont3 == 1) {
								for(int j = 0; j < ginasio.get(num).getAulas().size(); j++) {
									if(ginasio.get(num).getAulas().get(j).getCodigo() == novocodigo) {
											System.out.println("  Já tem um aula com o código " + novocodigo + "!");
											System.out.println("  Insira o código: ");
											novocodigo = Ler.umInt();
											cont3++;
									}
								}
								if(cont3 == 1) {
										System.out.println("  Novo código: " + novocodigo);
										ginasio.get(num).getAulas().get(i).setCodigo(novocodigo);
										cont3 = 0;
								}
								else {
									cont3 = 1;
								}
										
									
							}
					break;
					
					// nome
					case 3:	System.out.println("  Nome atual: " + ginasio.get(num).getAulas().get(i).getNome());
							String novonome = Ler.umaString();
							System.out.println("  Novo nome: " + novonome);
							ginasio.get(num).getAulas().get(i).setNome(novonome);
							
					break;
					
					// num pax max
					case 4:	System.out.println("  Número máximo de pessoas atual: " + ginasio.get(num).getAulas().get(i).getNumpaxmax());
							int novonumpaxmax = Ler.umInt();
							verif = true;
							while(verif) {
								if(novonumpaxmax < 0) {
									System.out.println("Valor tem de ser maior que 0");
									novonumpaxmax = Ler.umInt();
								}
								else {
									verif = false;
								}
							}
							ginasio.get(num).getAulas().get(i).setNumpaxmax(novonumpaxmax);
							
					break;
					
					// dia de semana
					case 5:	int escolha3 = 0;
							int escolhadds;
							String[] novodds = {"Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado", "Domingo"};
							do {
								System.out.println("  Dia de Semana atual: " + ginasio.get(num).getAulas().get(i).getDds());
								System.out.println("  Novo dia de semana:\n  1 - Segunda-Feira\n  2 - Terça-Feira\n  3 - Quarta-Feira\n  4 - Quinta-Feira\n  5 - Sexta-Feira\n  6 - Sábado\n  7- Domingo");
								escolhadds = Ler.umInt();
								if(escolhadds < 1 || escolhadds > 7) {
									System.out.println("  Opção errada! Tente novamente!");
								}
								else {
									escolha3 = 1;
								}
								
							} while(escolha3 != 1);
							System.out.println("  Novo dia de semana: " + novodds[escolhadds-1]);
							ginasio.get(num).getAulas().get(i).setDds(novodds[escolhadds-1]);
					break;
					
					// voltar
					case 6:
					break;
		
					default: System.out.println("Opção errada!");
					}
				} while(escolha != 6);
				
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
	
	/* ------------------- APAGAR AULA ----------------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void apagarAula(ArrayList<Ginasio> ginasio, int num) {
		System.out.println("*************************************");
		String listaraula = "";
		for(int i = 0; i < ginasio.get(num).getAulas().size(); i++) {
			listaraula += "\n" + ginasio.get(num).getAulas().get(i).toString() + "\n";
		}
		
		System.out.println(listaraula);
		System.out.println("*************************************");
		System.out.print("  Introduza o código da aula que pretende apagar: ");
		int codigoaula = Ler.umInt();
		int cont1 = 1;
		while(cont1 == 1) {
			for(int j = 0; j < ginasio.get(num).getAulas().size(); j++) {
				if(ginasio.get(num).getAulas().get(j).getCodigo() == codigoaula) {
					int escolhapagar = 1;
					do {
						System.out.println("  Deseja apagar a seguinte aula:");
						System.out.println(ginasio.get(num).getAulas().get(j).toString());
						System.out.println("  1 - Sim\n  2 - Não");
						escolhapagar = Ler.umInt();
						switch(escolhapagar) {
						
						// sim
						case 1: System.out.println("  Aula apagada!");
								for(int i = 0; i < ginasio.get(num).getMembros().size(); i++) {
									for(int k = 0; k < ginasio.get(num).getMembros().get(i).getAulas().size(); k++) {
										if(ginasio.get(num).getMembros().get(i).getAulas().get(k).getCodigo() == codigoaula) {
											ginasio.get(num).getMembros().get(i).getAulas().remove(k);
										}
									}
								}
								for(int i = 0; i < ginasio.get(num).getStaff().size(); i++) {
									for(int k = 0; k < ginasio.get(num).getStaff().get(i).getInstaula().size(); k++) {
										if(ginasio.get(num).getStaff().get(i).getInstaula().get(k).getCodigo() == codigoaula) {
											ginasio.get(num).getStaff().get(i).getInstaula().remove(k);
										}
									}
								}
								
								ginasio.get(num).getAulas().remove(j);
								escolhapagar = 2;
								cont1 = 0;
								
						break;
						
						// não
						case 2:	System.out.println("  A voltar...");
						break;
						
						default: System.out.println("  Opção errada! Tente novamente!");
						
						}
					} while(escolhapagar != 2);
				}
			}
			if(cont1 == 1) {
				System.out.println("  Código introduzido não corresponde a nenhuma aula! Tente novamente!");
				System.out.print("  Introduza o código da aula que pretende apagar: ");
				codigoaula = Ler.umInt();
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
	
	/* ------------------- REMOVER MEMBRO -------------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void removerMembro(ArrayList<Ginasio> ginasio, int num) {
		System.out.println("*************************************");
		System.out.println("  Lista de aulas:");
		String listaraula = "";
		for(int i = 0; i < ginasio.get(num).getAulas().size(); i++) {
			listaraula += "\n\n" + ginasio.get(num).getAulas().get(i).toString() + "\n";
			for(int j = 0; j < ginasio.get(num).getAulas().get(i).getInscritos().size(); j++) {
				listaraula +=  "  nº [" + ginasio.get(num).getAulas().get(i).getInscritos().get(j).getNum_membro() + "] Nome: " + ginasio.get(num).getAulas().get(i).getInscritos().get(j).getP_nome() + " " + ginasio.get(num).getAulas().get(i).getInscritos().get(j).getU_nome() + "\n";
			}
		}
		System.out.println(listaraula);
		int cont1 = 1;
		do {
			System.out.println("*************************************");
			System.out.print("  De qual aula pretende remover o membro (Insira o código da aula: ");
			int codigoaula = Ler.umInt();
			String listaraula2 = "";
			for(int i = 0; i < ginasio.get(num).getAulas().size(); i++) {
				if(codigoaula == ginasio.get(num).getAulas().get(i).getCodigo()) {
					System.out.println("  Aula: " + ginasio.get(num).getAulas().get(i).toString());
					for(int j = 0; j < ginasio.get(num).getAulas().get(i).getInscritos().size(); j++) {
						listaraula2 +=  "  nº [" + ginasio.get(num).getAulas().get(i).getInscritos().get(j).getNum_membro() + "] Nome: " + ginasio.get(num).getAulas().get(i).getInscritos().get(j).getP_nome() + " " + ginasio.get(num).getAulas().get(i).getInscritos().get(j).getU_nome() + "\n";
					}
					do {
						System.out.println(listaraula2);
						System.out.println("  Qual dos membros deseja alterar? Introduza o número de membro");
						int membro = Ler.umInt();
	
						for(int k = 0; k < ginasio.get(num).getAulas().get(i).getInscritos().size(); k++) {
							if(ginasio.get(num).getAulas().get(i).getInscritos().get(k).getNum_membro() == membro) {
			
								cont1++;
							}
						}
						if(cont1 == 1) {
							System.out.println("  Membro errado!");
							cont1 = 1;
						}
						else {
							for(int l = 0; l < ginasio.get(num).getMembros().size(); l++) {
								if(ginasio.get(num).getMembros().get(l).getNum_membro() == membro) {
									ginasio.get(num).getMembros().get(l).removeAula(ginasio.get(num).getAulas().get(i).getCodigo());
								}
							}
							ginasio.get(num).getAulas().get(i).removeInscritos(membro);
							System.out.println("  Membro removido");
							cont1 = 0;
						}
					} while(cont1 == 1);
				}
			}
		} while (cont1 == 1);
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
	
	/* ------------------- REMOVER INSTRUTOR ----------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void removerInstrutor(ArrayList<Ginasio> ginasio, int num) {
		System.out.println("*************************************");
		System.out.println("  Lista de aulas:");
		String listaraula = "";
		for(int i = 0; i < ginasio.get(num).getAulas().size(); i++) {
			listaraula += "\n\n" + ginasio.get(num).getAulas().get(i).toString() + "\n";
			for(int j = 0; j < ginasio.get(num).getAulas().get(i).getInstrutor().size(); j++) {
				listaraula +=  "  nº [" + ginasio.get(num).getAulas().get(i).getInstrutor().get(j).getNum_staff() + "] Nome: " + ginasio.get(num).getAulas().get(i).getInstrutor().get(j).getP_nome() + " " + ginasio.get(num).getAulas().get(i).getInstrutor().get(j).getU_nome() + "\n";
			}
		}
		System.out.println(listaraula);
		int cont1 = 1;
		do {
			System.out.println("*************************************");
			System.out.print("  De qual aula pretende remover o instrutor (Insira o código da aula: ");
			int codigoaula = Ler.umInt();
			String listaraula2 = "";
			for(int i = 0; i < ginasio.get(num).getAulas().size(); i++) {
				if(codigoaula == ginasio.get(num).getAulas().get(i).getCodigo()) {
					System.out.println("  Aula: " + ginasio.get(num).getAulas().get(i).toString());
					for(int j = 0; j < ginasio.get(num).getAulas().get(i).getInstrutor().size(); j++) {
						listaraula2 +=  "  nº [" + ginasio.get(num).getAulas().get(i).getInstrutor().get(j).getNum_staff() + "] Nome: " + ginasio.get(num).getAulas().get(i).getInstrutor().get(j).getP_nome() + " " + ginasio.get(num).getAulas().get(i).getInstrutor().get(j).getU_nome() + "\n";
					}
					do {
						System.out.println(listaraula2);
						System.out.println("  Qual dos instrutores deseja alterar? Introduza o número de STAFF");
						int membro = Ler.umInt();
						int kk = 0;
						
						for(int k = 0; k < ginasio.get(num).getAulas().get(i).getInstrutor().size(); k++) {
							if(ginasio.get(num).getAulas().get(i).getInstrutor().get(k).getNum_staff() == membro) {
								kk = k;
								cont1++;
							}
						}
						if(cont1 == 1) {
							System.out.println("  Instrutor errado!");
							System.out.println(ginasio.get(num).getAulas().get(i).getInstrutor().get(kk).getNum_staff());
							cont1 = 1;
						}
						else {
							for(int l = 0; l < ginasio.get(num).getStaff().size(); l++) {
								if(ginasio.get(num).getStaff().get(l).getNum_staff() == membro) {
									ginasio.get(num).getStaff().get(l).removeAula(ginasio.get(num).getAulas().get(i).getCodigo());
								}
							}
							ginasio.get(num).getAulas().get(i).removeInstrutor(membro);
							System.out.println("  Instrutor removido");
							cont1 = 0;
						}
					} while(cont1 == 1);
				}
			}
		} while (cont1 == 1);
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
	
	
}

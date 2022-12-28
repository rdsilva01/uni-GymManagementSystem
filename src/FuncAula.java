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
		
		
		
		System.out.println("  Insira o nome da Aula: ");
		String nome = Ler.umaString();
		
		
		System.out.println("  Insira o código da aula");
		int codigo = Ler.umInt();
		for(int j = 0; j < ginasio.get(num).getAulas().size(); j++) {
			// verir = true
			while(verif) {
				if(ginasio.get(num).getAulas().get(j).getCodigo() == codigo) {
					System.out.println("  Já existe um aula com esse código -> " + ginasio.get(num).getAulas().get(j).getNome());
					System.out.println("  Insira o código da aula");
					codigo = Ler.umInt();
				}
				verif = !verif;
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
		for(int i = 0; i < ginasio.get(num).getAulas().size(); i++) {
			verif = true;
			while(verif) {
				if(ginasio.get(num).getAulas().get(i).getHora() == horas && ginasio.get(num).getAulas().get(i).getMinuto() == minutos && ginasio.get(num).getAulas().get(i).getDds().equals(dds)) {
					System.out.println("  Já tem um aula marcada para as " + horas + ":" + minutos + "!");
					System.out.println("  Insira as horas da aula: ");
					horas = Ler.umInt();
					System.out.println("  Insira os minutos da aula: ");
					minutos = Ler.umInt();
				}
				verif = !verif;
			}
		}
		
		System.out.println("  Insira o nº máximo de pessoas: ");
		int numpaxmax = Ler.umInt();
		
		Aula a = new Aula(codigo, horas, minutos, nome, dds, numpaxmax);
		
		ginasio.get(num).addAula(a);
		
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
	/*
	System.out.println("1 - Criar aula");
	System.out.println("2 - Listar aulas");
	System.out.println("3 - Consultar aula, dado o nome");
	System.out.println("4 - Consultar aula, dando a hora");
	System.out.println("5 - Inscrever numa aula");
	System.out.println("6 - Alterar aula");
	System.out.println("7 - Apagar aula");
	System.out.println("8 - Terminar");
	System.out.println("Qual a sua opção? ");
	opcaoaula = Ler.umInt();*/
	
	
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
					}
			break;
			
			// dado o instrutor
			case 2:
			break;
			
			// dado o dia e/ou horas
			case 3:
			break;
			
			// voltar
			case 4:
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
				case 1: System.out.println("  Em qual das seguintes aulas pretende inscrever o membro? (Insira o código da aula)");
						String listaraula = "";
						for(int i = 0; i < ginasio.get(num).getAulas().size(); i++) {
							listaraula += ginasio.get(num).getAulas().get(i).toString() + "\n";
						}
						System.out.println(listaraula);
						// codigo da aula
						int aula = Ler.umInt();
						
						do {
							for(int j = 0; j < ginasio.get(num).getAulas().size(); j++) {
								if(aula == ginasio.get(num).getAulas().get(j).getCodigo()) {
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
					System.out.println("  Escolha o dia de semana da aula desejada:\n1 - Segunda-feira\n2 - Terça-feira\n3 - Quarta-feira\n4 - Quinta-feira\n5 - Sexta-feira\n6 - Sábado\n7 - Domingo");
					int diasdesemanacod = Ler.umInt();
					
					String[] diasdesemana = {"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado", "Domingo"};
					
					for(int i = 0; i < ginasio.get(num).getAulas().size(); i++) {
						if(codigo == ginasio.get(num).getAulas().get(i).getCodigo() && (diasdesemana[diasdesemanacod].equals(ginasio.get(num).getAulas().get(i).getDds()))){
							if(ginasio.get(num).getAulas().get(i).getInstrutor().size() < 2) {
								System.out.println("  Instrutor atribuído à aula " + ginasio.get(num).getAulas().get(i).getNome());
								ginasio.get(num).getAulas().get(i).addInstrutor(ginasio.get(num).getStaff().get(numatribuido));
								ginasio.get(num).getStaff().get(numatribuido).addAula(ginasio.get(num).getAulas().get(i));
								verif = false;
							}
							else if(ginasio.get(num).getAulas().get(i).getInstrutor().size() >= 2) {
								System.out.println("  Já estão atribuídos 2 instrutores a essa aula");
							}
						}
					}
					
				} while(verif != false);
			}
		} while(totalnum.equals(""));
	}
	
	/* ------------------- ALTERAR AULA ---------------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void alterarAula(ArrayList<Ginasio> ginasio, int num) {
		System.out.println("");
	}
	
	/* ------------------- APAGAR AULA ----------------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void apagarAula(ArrayList<Ginasio> ginasio, int num) {
		// dado código
	}
}

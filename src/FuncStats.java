import java.util.ArrayList;
import java.time.LocalDate;

import myinputs.Ler;

public class FuncStats {
	// *********************************************************************
	// ***************************** MEMBROS *******************************
	// *********************************************************************
	public static int menuMembro() {
		int opcaomembro;
		System.out.println("***********************************************");
		System.out.println("Deseja ver que estatística?");
		System.out.println("  1 - Total de membros");
		System.out.println("  2 - Nº de membros inscritos em aulas");
		System.out.println("  3 - Membros com X anos");
		System.out.println("  4 - Membros inscritos em duas ou mais aulas");
		System.out.println("  5 - Percentagem por Género");
		System.out.println("  6 - Sair");
		System.out.print("***********************************************\n  Opção: ");
		opcaomembro = Ler.umInt();
		return opcaomembro;
	}
	
	
	// ---------------- nº de membros --------------------------
	public static void numMembros(ArrayList<Ginasio> ginasio, int num) {
		System.out.println("  O ginásio tem um total de [" + ginasio.get(num).getMembros().size() + "] membros");
	}
	
	
	// ---------------- nº de membros inscritos --------------------------
	public static void membrosInscAula(ArrayList<Ginasio> ginasio, int num) {
		int num_membros = 0;
		int num_membros_total = ginasio.get(num).getMembros().size();
		
		for(int i = 0; i < ginasio.get(num).getMembros().size(); i++) {
			if(ginasio.get(num).getMembros().get(i).getAulas().size() > 0) {
				num_membros++;
			}
		}
		
		if(num_membros > 0) {
			double percentagem = ((double)num_membros / (double)num_membros_total) * 100;
			System.out.println("*********************************************************");
			System.out.println("  O número inscritos é de: " + num_membros + " membro(s)");
			System.out.println("  De um total de " + num_membros_total + " membro(s)");
			System.out.println("  Em percentagem: " + percentagem + "% inscritos");
			
			if(percentagem > 0 && percentagem <= 10) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |   |"); // 6
				System.out.println("   +---+\n40 |   |"); // 7
				System.out.println("   +---+\n30 |   |"); // 8
				System.out.println("   +---+\n20 |   |"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 10 && percentagem <= 20) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |   |"); // 6
				System.out.println("   +---+\n40 |   |"); // 7
				System.out.println("   +---+\n30 |   |"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 20 && percentagem <= 30) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |   |"); // 6
				System.out.println("   +---+\n40 |   |"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 30 && percentagem <= 40) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |   |"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 40 && percentagem <= 50) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 50 && percentagem <= 60) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 60 && percentagem <= 70) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |***|"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 70 && percentagem <= 80) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |***|"); // 3
				System.out.println("   +---+\n70 |***|"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 80 && percentagem <= 90) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |***|"); // 2
				System.out.println("   +---+\n80 |***|"); // 3
				System.out.println("   +---+\n70 |***|"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem == 100) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|***|"); // 1
				System.out.println("   +---+\n90 |***|"); // 2
				System.out.println("   +---+\n80 |***|"); // 3
				System.out.println("   +---+\n70 |***|"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			
		}
		else {
			System.out.println("  Não tem inscritos nas aulas!");
		}
	}
	
	// ---------------- membros com X anos --------------------------
	public static void memVerIdade(ArrayList<Ginasio> ginasio, int num) {
		System.out.println("  Introduza a idade que deseja ver:\n(Por exemplo: 28 (anos) -> Mostra os membros com 28 anos (feitos ou por fazer)");
		int idade = Ler.umInt();
		int num_membros = 0;
		int num_membros_total = ginasio.get(num).getMembros().size();
		String totalmem = "";
		
		for(int i = 0; i < ginasio.get(num).getMembros().size(); i++) {
			if(ginasio.get(num).getMembros().get(i).getDataNasc().getYear() == LocalDate.now().getYear() - idade) {
				num_membros++;
				totalmem += "\n  nº Membro [" + ginasio.get(num).getMembros().get(i).getNum_membro() + "] Nome: " + ginasio.get(num).getMembros().get(i).getP_nome() + " " + ginasio.get(num).getMembros().get(i).getU_nome();
			}
		}
		
		if(num_membros > 0) {
			double percentagem = ((double)num_membros / (double)num_membros_total) * 100;
			System.out.println("*********************************************************");
			System.out.println("O número de membros com " + idade + " ano(s) é de: " + num_membros + " membro(s)");
			System.out.println("De um total de " + num_membros_total + " membro(s)");
			System.out.println("Em percentagem: " + percentagem + "%");
			System.out.println("Os membros são:" + totalmem);
			
			if(percentagem > 0 && percentagem <= 10) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |   |"); // 6
				System.out.println("   +---+\n40 |   |"); // 7
				System.out.println("   +---+\n30 |   |"); // 8
				System.out.println("   +---+\n20 |   |"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 10 && percentagem <= 20) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |   |"); // 6
				System.out.println("   +---+\n40 |   |"); // 7
				System.out.println("   +---+\n30 |   |"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 20 && percentagem <= 30) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |   |"); // 6
				System.out.println("   +---+\n40 |   |"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 30 && percentagem <= 40) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |   |"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 40 && percentagem <= 50) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 50 && percentagem <= 60) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 60 && percentagem <= 70) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |***|"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 70 && percentagem <= 80) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |***|"); // 3
				System.out.println("   +---+\n70 |***|"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 80 && percentagem <= 90) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |***|"); // 2
				System.out.println("   +---+\n80 |***|"); // 3
				System.out.println("   +---+\n70 |***|"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem == 100) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|***|"); // 1
				System.out.println("   +---+\n90 |***|"); // 2
				System.out.println("   +---+\n80 |***|"); // 3
				System.out.println("   +---+\n70 |***|"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			
		}
		else {
			System.out.println("  Não tem membros com " + idade + " ano(s)!");
		}
	}
	
	// ---------------- membros inscritos em 2 ou mais aulas --------------------------
	public static void memInscAula(ArrayList<Ginasio> ginasio, int num) {
		int num_membros = 0;
		int num_membros_total = ginasio.get(num).getMembros().size();
		String totalmem = "";
		
		for(int i = 0; i < ginasio.get(num).getMembros().size(); i++) {
			if(ginasio.get(num).getMembros().get(i).getAulas().size() >= 2) {
				num_membros++;
				totalmem += "\n  nº Membro [" + ginasio.get(num).getMembros().get(i).getNum_membro() + "] Nome: " + ginasio.get(num).getMembros().get(i).getP_nome() + " " + ginasio.get(num).getMembros().get(i).getU_nome();
			}
		}
		
		if(num_membros > 0) {
			double percentagem = ((double)num_membros / (double)num_membros_total) * 100;
			System.out.println("*********************************************************");
			System.out.println("O número de membros inscritos em duas ou mais aulas é de: " + num_membros + " membro(s)");
			System.out.println("De um total de " + num_membros_total + " membro(s)");
			System.out.println("Em percentagem: " + percentagem + "% inscritos em duas ou mais aulas");
			System.out.println("Os membros são:" + totalmem);
			
			if(percentagem > 0 && percentagem <= 10) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |   |"); // 6
				System.out.println("   +---+\n40 |   |"); // 7
				System.out.println("   +---+\n30 |   |"); // 8
				System.out.println("   +---+\n20 |   |"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 10 && percentagem <= 20) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |   |"); // 6
				System.out.println("   +---+\n40 |   |"); // 7
				System.out.println("   +---+\n30 |   |"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 20 && percentagem <= 30) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |   |"); // 6
				System.out.println("   +---+\n40 |   |"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 30 && percentagem <= 40) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |   |"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 40 && percentagem <= 50) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 50 && percentagem <= 60) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 60 && percentagem <= 70) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |***|"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 70 && percentagem <= 80) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |***|"); // 3
				System.out.println("   +---+\n70 |***|"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 80 && percentagem <= 90) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |***|"); // 2
				System.out.println("   +---+\n80 |***|"); // 3
				System.out.println("   +---+\n70 |***|"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem == 100) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|***|"); // 1
				System.out.println("   +---+\n90 |***|"); // 2
				System.out.println("   +---+\n80 |***|"); // 3
				System.out.println("   +---+\n70 |***|"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			
		}
		else {
			System.out.println("Não tem membros inscritos em duas ou mais aulas!");
		}
	}
	
	// ---------------- nº de membros inscritos --------------------------
		public static void membrosGenero(ArrayList<Ginasio> ginasio, int num) {
			int num_membros = 0;
			int num_membros_total = ginasio.get(num).getMembros().size();
			
			for(int i = 0; i < ginasio.get(num).getMembros().size(); i++) {
				if(ginasio.get(num).getMembros().get(i).getSexo() == 'F' || ginasio.get(num).getMembros().get(i).getSexo() == 'f') {
					num_membros++;
				}
			}
			
			if(num_membros_total > 0) {
				double percentagemF = ((double)num_membros / (double)num_membros_total) * 100;
				double percentagemM = ((double)(num_membros_total - num_membros) / (double)num_membros_total) * 100;
				System.out.println("*********************************************************");
				System.out.println("  O número de membros do sexo Feminino é de: " + num_membros + " membro(s)");
				System.out.println("  O número de membros do sexo Masculino é de: " + (num_membros_total - num_membros) + " membro(s)");
				System.out.println("  De um total de " + num_membros_total + " membro(s)");
				System.out.println("  Em percentagem: " + percentagemF + "% membros femininos");
				System.out.println("  Em percentagem: " + percentagemM + "% membros masculinos");
				}
			else {
				System.out.println("  Não tem membros!");
			}
		}
	
	// *********************************************************************
	// ***************************** STAFF *********************************
	// *********************************************************************
	public static int menuStaff() {
		int opcaostaff;
		System.out.println("*********************************************");
		System.out.println("Deseja ver que estatística?");
		System.out.println("  1 - Total de STAFF");
		System.out.println("  2 - STAFF com X escalão");
		System.out.println("  3 - STAFF com X posição");
		System.out.println("  4 - STAFF com X anos");
		System.out.println("  5 - Nº de STAFF que dá pelo menos 1 aula");
		System.out.println("  6 - Percentagem por Género");
		System.out.println("  7 - Voltar");
		System.out.print("*********************************************\n  Opção: ");
		opcaostaff = Ler.umInt();
		return opcaostaff;
	}
	
	// ---------------- nº de staff --------------------------
	public static void numStaff(ArrayList<Ginasio> ginasio, int num) {
		System.out.println("  O ginásio tem um total de [" + ginasio.get(num).getStaff().size() + "] STAFF");
	}
		
	// ---------------- staff com X escalão --------------------------
	public static void escalaoStaff(ArrayList<Ginasio> ginasio, int num) {
		System.out.println("  Introduza o escalão que deseja ver:");
		int escalao = Ler.umInt();
		int num_staff = 0;
		int num_staff_total = ginasio.get(num).getStaff().size();
		String totalstaff = "";
		
		for(int i = 0; i < ginasio.get(num).getStaff().size(); i++) {
			if(ginasio.get(num).getStaff().get(i).getEscalao() == escalao) {
				num_staff++;
				totalstaff += "\n  nº Membro [" + ginasio.get(num).getStaff().get(i).getNum_staff() + "] Nome: " + ginasio.get(num).getStaff().get(i).getP_nome() + " " + ginasio.get(num).getStaff().get(i).getU_nome();
			}
		}
		
		if(num_staff > 0) {
			double percentagem = ((double)num_staff / (double)num_staff_total) * 100;
			System.out.println("**********************************************************");
			System.out.println("O número de STAFF com escalão " + escalao + " é de: " + num_staff + " STAFF(s)");
			System.out.println("De um total de " + num_staff_total + " STAFF(s)");
			System.out.println("Em percentagem: " + percentagem + "%");
			System.out.println("Os STAFF são:" + totalstaff);
			
			if(percentagem > 0 && percentagem <= 10) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |   |"); // 6
				System.out.println("   +---+\n40 |   |"); // 7
				System.out.println("   +---+\n30 |   |"); // 8
				System.out.println("   +---+\n20 |   |"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 10 && percentagem <= 20) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |   |"); // 6
				System.out.println("   +---+\n40 |   |"); // 7
				System.out.println("   +---+\n30 |   |"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 20 && percentagem <= 30) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |   |"); // 6
				System.out.println("   +---+\n40 |   |"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 30 && percentagem <= 40) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |   |"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 40 && percentagem <= 50) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 50 && percentagem <= 60) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 60 && percentagem <= 70) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |***|"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 70 && percentagem <= 80) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |***|"); // 3
				System.out.println("   +---+\n70 |***|"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 80 && percentagem <= 90) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |***|"); // 2
				System.out.println("   +---+\n80 |***|"); // 3
				System.out.println("   +---+\n70 |***|"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem == 100) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|***|"); // 1
				System.out.println("   +---+\n90 |***|"); // 2
				System.out.println("   +---+\n80 |***|"); // 3
				System.out.println("   +---+\n70 |***|"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			
		}
		else {
			System.out.println("  Não tem STAFF com escalão " + escalao + "!");
		}
	}
	
	// ---------------- staff com X posição --------------------------
	public static void posicaoStaff(ArrayList<Ginasio> ginasio, int num) {
		System.out.println("  Introduza a posição que deseja ver:\n(Por exemplo: Personal Trainer -> Mostra todos os Personal Trainer");
		String posicao = Ler.umaString();
		int num_staff = 0;
		int num_staff_total = ginasio.get(num).getStaff().size();
		String totalstaff = "";
		
		for(int i = 0; i < ginasio.get(num).getStaff().size(); i++) {
			if(ginasio.get(num).getStaff().get(i).getTipo().equals(posicao)) {
				num_staff++;
				totalstaff += "\n  nº Membro [" + ginasio.get(num).getStaff().get(i).getNum_staff() + "] Nome: " + ginasio.get(num).getStaff().get(i).getP_nome() + " " + ginasio.get(num).getStaff().get(i).getU_nome() + "\nPosição: " + ginasio.get(num).getStaff().get(i).getTipo();
			}
		}
		
		if(num_staff > 0) {
			double percentagem = ((double)num_staff / (double)num_staff_total) * 100;
			System.out.println("*********************************************************");
			System.out.println("O número de STAFF com a posição de " + posicao + " é de: " + num_staff + " STAFF(s)");
			System.out.println("De um total de " + num_staff_total + " STAFF(s)");
			System.out.println("Em percentagem: " + percentagem + "%");
			System.out.println("Os STAFF são:" + totalstaff);
			
			if(percentagem > 0 && percentagem <= 10) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |   |"); // 6
				System.out.println("   +---+\n40 |   |"); // 7
				System.out.println("   +---+\n30 |   |"); // 8
				System.out.println("   +---+\n20 |   |"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 10 && percentagem <= 20) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |   |"); // 6
				System.out.println("   +---+\n40 |   |"); // 7
				System.out.println("   +---+\n30 |   |"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 20 && percentagem <= 30) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |   |"); // 6
				System.out.println("   +---+\n40 |   |"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 30 && percentagem <= 40) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |   |"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 40 && percentagem <= 50) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 50 && percentagem <= 60) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 60 && percentagem <= 70) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |***|"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 70 && percentagem <= 80) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |***|"); // 3
				System.out.println("   +---+\n70 |***|"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 80 && percentagem <= 90) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |***|"); // 2
				System.out.println("   +---+\n80 |***|"); // 3
				System.out.println("   +---+\n70 |***|"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem == 100) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|***|"); // 1
				System.out.println("   +---+\n90 |***|"); // 2
				System.out.println("   +---+\n80 |***|"); // 3
				System.out.println("   +---+\n70 |***|"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			
		}
		else {
			System.out.println("  Não existem STAFF com a posição " + posicao + "!");
		}
	}
	
	// ---------------- staff com X anos --------------------------
	public static void idadeStaff(ArrayList<Ginasio> ginasio, int num) {
		System.out.println("  Introduza a idade que deseja ver:\n(Por exemplo: 28 (anos) -> Mostra os STAFF com 28 anos (feitos ou por fazer)");
		int idade = Ler.umInt();
		int num_staff = 0;
		int num_staff_total = ginasio.get(num).getStaff().size();
		String totalstaff = "";
		
		for(int i = 0; i < ginasio.get(num).getStaff().size(); i++) {
			if(ginasio.get(num).getStaff().get(i).getDataNasc().getYear() == LocalDate.now().getYear() - idade) {
				num_staff++;
				totalstaff += "\n  nº STAFF [" + ginasio.get(num).getStaff().get(i).getNum_staff() + "] Nome: " + ginasio.get(num).getStaff().get(i).getP_nome() + " " + ginasio.get(num).getStaff().get(i).getU_nome();
			}
		}
		
		if(num_staff > 0) {
			double percentagem = ((double)num_staff / (double)num_staff_total) * 100;
			System.out.println("*********************************************************");
			System.out.println("O número de STAFF com " + idade + " ano(s) é de: " + num_staff + " STAFF(s)");
			System.out.println("De um total de " + num_staff_total + " STAFF(s)");
			System.out.println("Em percentagem: " + percentagem + "%");
			System.out.println("Os STAFF são:" + totalstaff);
			
			if(percentagem > 0 && percentagem <= 10) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |   |"); // 6
				System.out.println("   +---+\n40 |   |"); // 7
				System.out.println("   +---+\n30 |   |"); // 8
				System.out.println("   +---+\n20 |   |"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 10 && percentagem <= 20) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |   |"); // 6
				System.out.println("   +---+\n40 |   |"); // 7
				System.out.println("   +---+\n30 |   |"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 20 && percentagem <= 30) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |   |"); // 6
				System.out.println("   +---+\n40 |   |"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 30 && percentagem <= 40) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |   |"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 40 && percentagem <= 50) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 50 && percentagem <= 60) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 60 && percentagem <= 70) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |***|"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 70 && percentagem <= 80) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |***|"); // 3
				System.out.println("   +---+\n70 |***|"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 80 && percentagem <= 90) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |***|"); // 2
				System.out.println("   +---+\n80 |***|"); // 3
				System.out.println("   +---+\n70 |***|"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem == 100) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|***|"); // 1
				System.out.println("   +---+\n90 |***|"); // 2
				System.out.println("   +---+\n80 |***|"); // 3
				System.out.println("   +---+\n70 |***|"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			
		}
		else {
			System.out.println("Não tem STAFF com " + idade + " ano(s)!");
		}
	}
	
	// ---------------- staff que dá pelo menos 1 aula --------------------------
	public static void aulasStaff(ArrayList<Ginasio> ginasio, int num) {
		int num_staff = 0;
		int num_staff_total = ginasio.get(num).getStaff().size();
		String totalstaff = "";
		
		for(int i = 0; i < ginasio.get(num).getStaff().size(); i++) {
			if(ginasio.get(num).getStaff().get(i).getInstaula().size() >= 1) {
				num_staff++;
				totalstaff += "\nnº STAFF [" + ginasio.get(num).getStaff().get(i).getNum_staff() + "] Nome: " + ginasio.get(num).getStaff().get(i).getP_nome() + " " + ginasio.get(num).getStaff().get(i).getU_nome();
			}
		}
		
		if(num_staff > 0) {
			double percentagem = ((double)num_staff / (double)num_staff_total) * 100;
			
			System.out.println("O número de STAFF que dá pelo menos 1 aula é de: " + num_staff + " STAFF(s)");
			System.out.println("De um total de " + num_staff_total + " STAFF(s)");
			System.out.println("Em percentagem: " + percentagem + "%");
			System.out.println("Os STAFF são:" + totalstaff);
			
			if(percentagem > 0 && percentagem <= 10) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |   |"); // 6
				System.out.println("   +---+\n40 |   |"); // 7
				System.out.println("   +---+\n30 |   |"); // 8
				System.out.println("   +---+\n20 |   |"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 10 && percentagem <= 20) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |   |"); // 6
				System.out.println("   +---+\n40 |   |"); // 7
				System.out.println("   +---+\n30 |   |"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 20 && percentagem <= 30) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |   |"); // 6
				System.out.println("   +---+\n40 |   |"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 30 && percentagem <= 40) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |   |"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 40 && percentagem <= 50) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |   |"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 50 && percentagem <= 60) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |   |"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 60 && percentagem <= 70) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |   |"); // 3
				System.out.println("   +---+\n70 |***|"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 70 && percentagem <= 80) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |   |"); // 2
				System.out.println("   +---+\n80 |***|"); // 3
				System.out.println("   +---+\n70 |***|"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem > 80 && percentagem <= 90) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|   |"); // 1
				System.out.println("   +---+\n90 |***|"); // 2
				System.out.println("   +---+\n80 |***|"); // 3
				System.out.println("   +---+\n70 |***|"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			else if(percentagem == 100) {
				System.out.println("\n[%] ");
				System.out.println("   +---+\n100|***|"); // 1
				System.out.println("   +---+\n90 |***|"); // 2
				System.out.println("   +---+\n80 |***|"); // 3
				System.out.println("   +---+\n70 |***|"); // 4
				System.out.println("   +---+\n60 |***|"); // 5
				System.out.println("   +---+\n50 |***|"); // 6
				System.out.println("   +---+\n40 |***|"); // 7
				System.out.println("   +---+\n30 |***|"); // 8
				System.out.println("   +---+\n20 |***|"); // 9
				System.out.println("   +---+\n10 |***|\n   +---+"); // 10
			}
			
			
		}
		else {
			System.out.println("Não existe STAFF que dê pelo menos 1 aula");
		}
	}
	
	// ---------------- staff percentagem género --------------------------
	public static void generoStaff(ArrayList<Ginasio> ginasio, int num) {
		int num_staff = 0;
		int num_staff_total = ginasio.get(num).getStaff().size();
		
		for(int i = 0; i < ginasio.get(num).getStaff().size(); i++) {
			if(ginasio.get(num).getStaff().get(i).getSexo() == 'F' || ginasio.get(num).getStaff().get(i).getSexo() == 'f') {
				num_staff++;
			}
		}
		
		if(num_staff_total > 0) {
			double percentagemF = ((double)num_staff / (double)num_staff_total) * 100;
			double percentagemM = ((double)(num_staff_total - num_staff) / (double)num_staff_total) * 100;
			System.out.println("*********************************************************");
			System.out.println("  O número de STAFF do sexo Feminino é de: " + num_staff + " STAFF");
			System.out.println("  O número de STAFF do sexo Masculino é de: " + (num_staff_total - num_staff) + " STAFF");
			System.out.println("  De um total de " + num_staff_total + " membro(s)");
			System.out.println("  Em percentagem: " + percentagemF + "% STAFF femininos");
			System.out.println("  Em percentagem: " + percentagemM + "% STAFF masculinos");
			}
		else {
			System.out.println("  Não tem STAFF!");
		}
	}
		
		
	
	// *********************************************************************
	// ***************************** AULA **********************************
	// *********************************************************************
	public static int menuAula() {
		int opcaoaula;
		System.out.println("*************************************");
		System.out.println("  Deseja ver que estatística?");
		System.out.println("  1 - Total de Aulas");
		System.out.println("  2 - Dia de semana com mais aulas"); //f
		System.out.println("  3 - Percentagem de horas manhã/tarde");
		System.out.println("  4 - Sair");
		System.out.print("*************************************\n  Opção: ");
		opcaoaula = Ler.umInt();
		return opcaoaula;
	}
	
	// ---------------- dia de semana com mais aulas --------------------------
		public static void aulasDDS(ArrayList<Ginasio> ginasio, int num) {
			String[] dds = {"Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado", "Domingo"};
			int[] contdds = {0,0,0,0,0,0,0};
				for(int i = 0; i < ginasio.get(num).getAulas().size(); i++) {
					if(ginasio.get(num).getAulas().get(i).getDds() == dds[0]) {
						contdds[0]++;
					}
					else if(ginasio.get(num).getAulas().get(i).getDds().equals(dds[1])) {
						contdds[1]++;
					}
					else if(ginasio.get(num).getAulas().get(i).getDds().equals(dds[2])) {
						contdds[2]++;
					}
					else if(ginasio.get(num).getAulas().get(i).getDds().equals(dds[3])) {
						contdds[3]++;
					}
					else if(ginasio.get(num).getAulas().get(i).getDds().equals(dds[4])) {
						contdds[4]++;
					}
					else if(ginasio.get(num).getAulas().get(i).getDds().equals(dds[5])) {
						contdds[5]++;
					}
					else if(ginasio.get(num).getAulas().get(i).getDds().equals(dds[6])) {
						contdds[6]++;
					}
				}
				
				int max = 0;
				int maxletra = 0;
				for(int j = 0; j < contdds.length; j++) {
					if(contdds[j] > max) {
						max = contdds[j];
						maxletra = j;
					}
				}
				
				int totalcont = 0;
				
				for(int l = 0; l < 7; l++) {
					totalcont += contdds[l];
				}	
				
				System.out.println("  O dia de semana com mais aulas é: " + dds[maxletra] + ", com " + max + " aula(s)");
				double percentagem0 = ((double)contdds[0] / (double)totalcont) * 100;
				double percentagem1 = ((double)contdds[1] / (double)totalcont) * 100;
				double percentagem2 = ((double)contdds[2] / (double)totalcont) * 100;
				double percentagem3 = ((double)contdds[3] / (double)totalcont) * 100;
				double percentagem4 = ((double)contdds[4] / (double)totalcont) * 100;
				double percentagem5 = ((double)contdds[5] / (double)totalcont) * 100;
				double percentagem6 = ((double)contdds[6] / (double)totalcont) * 100;
				
				double[] percentarray = {percentagem0, percentagem1, percentagem2, percentagem3, percentagem4, percentagem5, percentagem6};
				
				String percenstr = "";
				for(int j = 0; j < 7; j++) {
					percenstr += "  " + dds[j] + " - " + percentarray[j] + "% [ ";
					for(int k = 0; k < contdds[j]; k++) {
						percenstr += "*";
					}
					percenstr += " ]\n";
				}
				
				System.out.println("  As percentagens são:\n" + percenstr);
				
				
			}
	
		// ---------------- total de aulas --------------------------
		public static void aulasTotal(ArrayList<Ginasio> ginasio, int num) {
			if(ginasio.get(num).getAulas().size() == 0) {
				System.out.println(" Não há aulas!");
			}
			else {
				System.out.println("  O número de aulas é: " + ginasio.get(num).getAulas().size());
			}
			
		}
		
		// ---------------- manhã/tarde --------------------------
		public static void aulasManhaTarde(ArrayList<Ginasio> ginasio, int num) {
			int contmanha = 0;
			int conttarde = 0;
			
			for(int i = 0; i < ginasio.get(num).getAulas().size(); i++) {
				if(ginasio.get(num).getAulas().get(i).getHora() < 14) {
					contmanha++;
				}
				else {
					conttarde++;
				}
			}
			
			double percenmanha = ((double)contmanha/(double)ginasio.get(num).getAulas().size()) * 100;
			double percentarde = ((double)conttarde/(double)ginasio.get(num).getAulas().size()) * 100;
			
			System.out.println("  O número de aulas de manhã é de: " + contmanha);
			System.out.println("  O número de aulas de tarde é de: " + conttarde);
			System.out.println("\n  Em percentagem: ");
			
			String percenmanhastr = "[";
			String percentardestr = "[";
			for(int j = 0; j < contmanha; j++){
				percenmanhastr += "*";
			}
			percenmanhastr += "]";
			for(int j = 0; j < conttarde; j++){
				percentardestr += "*";
			}
			percentardestr += "]";
			
			System.out.println("  Manhã -> [" + percenmanha + "]% -> " + percenmanhastr);
			System.out.println("  Tarde -> [" + percentarde + "]% -> " + percentardestr);
		}
		
}

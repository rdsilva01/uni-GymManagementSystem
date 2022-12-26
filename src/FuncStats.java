import java.util.ArrayList;
import java.time.LocalDate;

import myinputs.Ler;

public class FuncStats {
	// *********************************************************************
	// ***************************** MEMBROS *******************************
	// *********************************************************************
	public static int menuMembro() {
		int opcaomembro;
		System.out.println("Deseja ver que estatística?");
		System.out.println("1 - Total de membros");
		System.out.println("2 - Nº de membros inscritos em aulas");
		System.out.println("3 - Membros com X anos");
		System.out.println("4 - Membros inscritos em duas ou mais aulas");
		System.out.println("5 - Sair");
		opcaomembro = Ler.umInt();
		return opcaomembro;
	}
	
	
	// ---------------- nº de membros --------------------------
	public static void numMembros(ArrayList<Ginasio> ginasio, int num) {
		System.out.println("O ginásio tem um total de [" + ginasio.get(num).getMembros().size() + "] membros");
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
			
			System.out.println("O número inscritos é de: " + num_membros + " membro(s)");
			System.out.println("De um total de " + num_membros_total + " membro(s)");
			System.out.println("Em percentagem: " + percentagem + "% inscritos");
			
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
			System.out.println("Não tem inscritos nas aulas!");
		}
	}
	
	// ---------------- membros com X anos --------------------------
	public static void memVerIdade(ArrayList<Ginasio> ginasio, int num) {
		System.out.println("Introduza a idade que deseja ver:\n(Por exemplo: 28 (anos) -> Mostra os membros com 28 anos (feitos ou por fazer)");
		int idade = Ler.umInt();
		int num_membros = 0;
		int num_membros_total = ginasio.get(num).getMembros().size();
		String totalmem = "";
		
		for(int i = 0; i < ginasio.get(num).getMembros().size(); i++) {
			if(ginasio.get(num).getMembros().get(i).getDataNasc().getYear() == LocalDate.now().getYear() - idade) {
				num_membros++;
				totalmem += "\nnº Membro [" + ginasio.get(num).getMembros().get(i).getNum_membro() + "] Nome: " + ginasio.get(num).getMembros().get(i).getP_nome() + " " + ginasio.get(num).getMembros().get(i).getU_nome();
			}
		}
		
		if(num_membros > 0) {
			double percentagem = ((double)num_membros / (double)num_membros_total) * 100;
			
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
			System.out.println("Não tem membros com " + idade + " ano(s)!");
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
				totalmem += "\nnº Membro [" + ginasio.get(num).getMembros().get(i).getNum_membro() + "] Nome: " + ginasio.get(num).getMembros().get(i).getP_nome() + " " + ginasio.get(num).getMembros().get(i).getU_nome();
			}
		}
		
		if(num_membros > 0) {
			double percentagem = ((double)num_membros / (double)num_membros_total) * 100;
			
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
	
	// *********************************************************************
	// ***************************** STAFF *********************************
	// *********************************************************************
	public static int menuStaff() {
		int opcaostaff;
		System.out.println("Deseja ver que estatística?");
		System.out.println("1 - Total de STAFF");
		System.out.println("2 - STAFF com X escalão");
		System.out.println("3 - STAFF com X posição");
		System.out.println("4 - STAFF com X anos");
		System.out.println("5 - Nº de STAFF que dá pelo menos 1 aula");
		System.out.println("6 - Sair");
		opcaostaff = Ler.umInt();
		return opcaostaff;
	}
	
	// ---------------- nº de staff --------------------------
	public static void numStaff(ArrayList<Ginasio> ginasio, int num) {
		System.out.println("O ginásio tem um total de [" + ginasio.get(num).getStaff().size() + "] STAFF");
	}
		
	// ---------------- staff com X escalão --------------------------
	public static void escalaoStaff(ArrayList<Ginasio> ginasio, int num) {
		System.out.println("Introduza o escalão que deseja ver:");
		int escalao = Ler.umInt();
		int num_staff = 0;
		int num_staff_total = ginasio.get(num).getStaff().size();
		String totalstaff = "";
		
		for(int i = 0; i < ginasio.get(num).getStaff().size(); i++) {
			if(ginasio.get(num).getStaff().get(i).getEscalao() == escalao) {
				num_staff++;
				totalstaff += "\nnº Membro [" + ginasio.get(num).getStaff().get(i).getNum_staff() + "] Nome: " + ginasio.get(num).getStaff().get(i).getP_nome() + " " + ginasio.get(num).getStaff().get(i).getU_nome();
			}
		}
		
		if(num_staff > 0) {
			double percentagem = ((double)num_staff / (double)num_staff_total) * 100;
			
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
			System.out.println("Não tem STAFF com escalão " + escalao + "!");
		}
	}
	
	// ---------------- staff com X posição --------------------------
	public static void posicaoStaff(ArrayList<Ginasio> ginasio, int num) {
		System.out.println("Introduza a posição que deseja ver:\n(Por exemplo: Personal Trainer -> Mostra todos os Personal Trainer");
		String posicao = Ler.umaString();
		int num_staff = 0;
		int num_staff_total = ginasio.get(num).getStaff().size();
		String totalstaff = "";
		
		for(int i = 0; i < ginasio.get(num).getStaff().size(); i++) {
			if(ginasio.get(num).getStaff().get(i).getTipo().equals(posicao)) {
				num_staff++;
				totalstaff += "\nnº Membro [" + ginasio.get(num).getStaff().get(i).getNum_staff() + "] Nome: " + ginasio.get(num).getStaff().get(i).getP_nome() + " " + ginasio.get(num).getStaff().get(i).getU_nome() + "\nPosição: " + ginasio.get(num).getStaff().get(i).getTipo();
			}
		}
		
		if(num_staff > 0) {
			double percentagem = ((double)num_staff / (double)num_staff_total) * 100;
			
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
			System.out.println("Não existem STAFF com a posição " + posicao + "!");
		}
	}
	
	// ---------------- staff com X anos --------------------------
	public static void idadeStaff(ArrayList<Ginasio> ginasio, int num) {
		System.out.println("Introduza a idade que deseja ver:\n(Por exemplo: 28 (anos) -> Mostra os STAFF com 28 anos (feitos ou por fazer)");
		int idade = Ler.umInt();
		int num_staff = 0;
		int num_staff_total = ginasio.get(num).getStaff().size();
		String totalstaff = "";
		
		for(int i = 0; i < ginasio.get(num).getStaff().size(); i++) {
			if(ginasio.get(num).getStaff().get(i).getDataNasc().getYear() == LocalDate.now().getYear() - idade) {
				num_staff++;
				totalstaff += "\nnº STAFF [" + ginasio.get(num).getStaff().get(i).getNum_staff() + "] Nome: " + ginasio.get(num).getStaff().get(i).getP_nome() + " " + ginasio.get(num).getStaff().get(i).getU_nome();
			}
		}
		
		if(num_staff > 0) {
			double percentagem = ((double)num_staff / (double)num_staff_total) * 100;
			
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
		/*int num_staff = 0;
		int num_staff_total = ginasio.get(num).getStaff().size();
		String totalstaff = "";
		
		for(int i = 0; i < ginasio.get(num).getStaff().size(); i++) {
			if(ginasio.get(num).getStaff().get(i).get) {
				num_staff++;
				totalstaff += "\nnº STAFF [" + ginasio.get(num).getStaff().get(i).getNum_staff() + "] Nome: " + ginasio.get(num).getStaff().get(i).getP_nome() + " " + ginasio.get(num).getStaff().get(i).getU_nome();
			}
		}
		
		if(num_staff > 0) {
			double percentagem = ((double)num_staff / (double)num_staff_total) * 100;
			
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
			System.out.println("Não existe STAFF que dê pelo menos 1 aula");
		}*/
	}
		
		
	
	// *********************************************************************
	// ***************************** AULA **********************************
	// *********************************************************************
}

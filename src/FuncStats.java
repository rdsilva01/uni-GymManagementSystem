import java.util.ArrayList;

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
		System.out.println("3 - Membros com mais de 65 anos");
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
			
			if(percentagem == 0) {
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
				System.out.println("   +---+\n10 |   |\n   +---+"); // 10
			}
			else if(percentagem > 0 && percentagem <= 10) {
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
	
	
	// *********************************************************************
	// ***************************** STAFF *********************************
	// *********************************************************************
	
	
	// *********************************************************************
	// ***************************** AULA **********************************
	// *********************************************************************
}

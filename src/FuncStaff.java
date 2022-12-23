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
		
		/* mem.setNum_membro(ginasio.get(num).getMembros().size() + 1);
		
		for(int j = 0; j < ginasio.get(num).getMembros().size(); j++) {
			if(mem.getNum_membro() == ginasio.get(num).getMembros().get(j).getNum_membro()) {
				mem.setNum_membro(mem.getNum_membro() + 1);
			}
		}*/
		
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
	
	/* ------------------- ALTERAR STAFF --------------------------------------- *
	 * ------------------------------------------------------------------------- */
	public static void alterarStaff(ArrayList<Ginasio> ginasio, int num) {
		
	}
	
	/* ------------------- APAGAR STAFF ---------------------------------------- *
	 * ------------------------------------------------------------------------- */
	
	
	/* ------------------- LISTA STAFF ----------------------------------------- *
	 * ------------------------------------------------------------------------- */
}

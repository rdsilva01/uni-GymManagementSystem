import java.io.*;
import java.util.ArrayList;

import myinputs.Ler;

public class FuncGinasio {
	
	public static void criarGinasio(ArrayList<Ginasio> ginasios) {
		System.out.println("Insira o nome do Ginásio: ");
		String nome = Ler.umaString();
		
		// não podem existir nomes iguais
		for (int i = 0; i < ginasios.size(); i++) {
			if (ginasios.get(i).getNome().equals(nome)) {
				System.out.println("Um ginásio com esse nome já existe!");
				return;
			}
		}
		
		// obter os parâmetros para criar o objeto Ginásio
		System.out.println("Qual o preço base?");
		double preco = Ler.umDouble();
		
		
		
		
	}
}

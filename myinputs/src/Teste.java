package myinputs;

public class Teste {

	public static void main(String[] args) {
		// String
		System.out.println("Introduza uma String: ");
		String s = Ler.umaString();
		
		// Integer
		System.out.println("Introduza um número inteiro: ");
		int i = Ler.umInt();
		
		// Char
		System.out.println("Introduza um caracter: ");
		char c = Ler.umChar();
		
		// Double
		System.out.println("Introduza um double: ");
		double d = Ler.umDouble();
		
		// Short
		System.out.println("Introduza um short: ");
		short sh = Ler.umShort();
		
		// Float
		System.out.println("Introduza um float: ");
		float f = Ler.umFloat();
		
		// Boolean
		System.out.println("Introduza um boolean: ");
		boolean b = Ler.umBoolean();
		
		// Byte
		System.out.println("Introduza um byte: ");
		byte by = Ler.umByte();
		
		// Long
		System.out.println("Introduza um long: ");
		long l = Ler.umLong();
		
		
		// Outputs
		System.out.println("A string que introduziu foi: " + s);
		System.out.println("O inteiro que introduziu foi: " + i);
		System.out.println("O caracter que introduziu foi: " + c);
		System.out.println("O double que introduziu foi: " + d);
		System.out.println("O short que introduziu foi: " + sh);
		System.out.println("O float que introduziu foi: " + f);
		System.out.println("O boolean que introduziu foi: " + b);
		System.out.println("O byte que introduziu foi: " + by);
		System.out.println("O long que introduziu foi: " + l);

	}

}

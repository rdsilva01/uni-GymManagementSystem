package myinputs;


public class LerInteiros {

	public static void main(String[] args) {
		int i = 0, min = 0, max = 0;
		
		System.out.println("Introduz um inteiro: ");
		int val = Ler.umInt();
		min = val;

		while(i < 2) {
			 System.out.println("Introduz um inteiro: ");
			 val = Ler.umInt();
			 min = (val <= min) ? val : min;
			 max = (val >= max) ? val : max;
			 i++;
		}
		System.out.println("MIN: " + min);
		System.out.println("MAX: " + max);
			

	}

}

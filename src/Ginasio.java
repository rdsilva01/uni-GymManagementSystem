import java.io.Serializable;
import java.util.ArrayList;

public class Ginasio implements Serializable{
	private static int ultimo = 0;
	// private static ArrayList<Membro>[] lista = new ArrayList<Membro>[ultimo];
	private int num;
	private String nome;
	private ArrayList<Double> precos;
	private ArrayList<Double> quotas;
	private ArrayList<Aula> aulas;
	private ArrayList<Membro> membros;
	private ArrayList<Pessoa> totalpax;
	private ArrayList<Staff> staff;
	
	public Ginasio(String nome) {
		ultimo++;
		this.nome = nome;
		precos = new ArrayList<Double>();
		quotas = new ArrayList<Double>();
		aulas = new ArrayList<Aula>();
		membros = new ArrayList<Membro>();
		totalpax = new ArrayList<Pessoa>();
		staff = new ArrayList<Staff>();
		num = ultimo;
		// 	lista[ultimo-1] = membros;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Double> getPrecos() {
		return precos;
	}

	public void setPrecos(ArrayList<Double> precos) {
		this.precos = precos;
	}

	public ArrayList<Double> getQuotas() {
		return quotas;
	}

	public void setQuotas(ArrayList<Double> quotas) {
		this.quotas = quotas;
	}

	public ArrayList<Aula> getAulas() {
		return aulas;
	}

	public void setAulas(ArrayList<Aula> aulas) {
		this.aulas = aulas;
	}

	public ArrayList<Membro> getMembros() {
		return membros;
	}

	public void setMembros(ArrayList<Membro> membros) {
		this.membros = membros;
	}
	
	public void addMembros(Membro membro) {
		membros.add(membro);	
	}

	public ArrayList<Pessoa> getTotalpax() {
		return totalpax;
	}

	public void setTotalpax(ArrayList<Pessoa> totalpax) {
		this.totalpax = totalpax;
	}
	
	public void addTotalpax(Pessoa pax) {
		totalpax.add(pax);
	}

	public ArrayList<Staff> getStaff() {
		return staff;
	}

	public void setStaff(ArrayList<Staff> staff) {
		this.staff = staff;
	}
	
	public static int getUltimo() {
		return ultimo;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Ginasio [num=" + num + ", nome=" + nome + ", precos=" + precos + ", quotas=" + quotas + ", aulas="
				+ aulas + ", membros=" + membros + ", totalpax=" + totalpax + ", staff=" + staff + "]";
	}

	public static void setUltimo(int ult) {
		ultimo = ult;
	}

	
	
	
	
	
}

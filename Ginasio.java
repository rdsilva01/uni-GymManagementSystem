import java.util.ArrayList;

public class Ginasio {
	private String nome;
	private ArrayList<Float> precos;
	private ArrayList<Float> quotas;
	private ArrayList<Aula> aulas;
	private ArrayList<Membro> membros;
	private ArrayList<Pessoa> totalpax;
	private ArrayList<Staff> staff;
	
	public Ginasio(String nome) {
		this.nome = nome;
		precos = new ArrayList<Float>();
		quotas = new ArrayList<Float>();
		aulas = new ArrayList<Aula>();
		membros = new ArrayList<Membro>();
		totalpax = new ArrayList<Pessoa>();
		staff = new ArrayList<Staff>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Float> getPrecos() {
		return precos;
	}

	public void setPrecos(ArrayList<Float> precos) {
		this.precos = precos;
	}

	public ArrayList<Float> getQuotas() {
		return quotas;
	}

	public void setQuotas(ArrayList<Float> quotas) {
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

	public ArrayList<Pessoa> getTotalpax() {
		return totalpax;
	}

	public void setTotalpax(ArrayList<Pessoa> totalpax) {
		this.totalpax = totalpax;
	}

	public ArrayList<Staff> getStaff() {
		return staff;
	}

	public void setStaff(ArrayList<Staff> staff) {
		this.staff = staff;
	}

	@Override
	public String toString() {
		return "Ginasio [nome=" + nome + ", precos=" + precos + ", quotas=" + quotas + ", aulas=" + aulas + ", membros="
				+ membros + ", totalpax=" + totalpax + ", staff=" + staff + "]";
	}
	
	
	
	
}

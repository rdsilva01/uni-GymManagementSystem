import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Ginasio implements Serializable{
	private static int ultimo = 0; // static do valor do nº do ginásio
	private int num;
	private String nome;
	private ArrayList<Double> precos;
	private Double quota;
	private ArrayList<Aula> aulas;
	private ArrayList<Membro> membros;
	private ArrayList<Pessoa> totalpax;
	private ArrayList<Staff> staff;
	
	public Ginasio(String nome) {
		ultimo++;
		this.nome = nome;
		precos = new ArrayList<Double>();
		precos.add((double) 30); // preço base
		precos.add(0.5); // multiplicador do preco pela idade
		precos.add(0.5); // multiplicador do preco pela idade
		quota = 0.5 * precos.get(0);
		aulas = new ArrayList<Aula>();
		membros = new ArrayList<Membro>();
		totalpax = new ArrayList<Pessoa>();
		staff = new ArrayList<Staff>();
		num = ultimo;
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

	public Double getQuota() {
		return quota;
	}

	public void setQuota(Double quota) {
		this.quota = quota;
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
	
	public void addStaff(Staff staffs) {
		staff.add(staffs);
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
		String memstring = "";
		String staffstring = "";
		String aulastring = "";
		String precosstring =  "\n  - " + precos.get(0) + "€";
		
		for(int i = 0; i < membros.size(); i++) {
			memstring += "+---------------------------------+\n" + membros.get(i).toString();
		}
		
		for(int j = 0; j < staff.size(); j++) {
			staffstring += "+---------------------------------+\n" + staff.get(j).toString();
		}
		
		for(int k = 0; k < aulas.size(); k++) {
			aulastring += "\n" + aulas.get(k).toString() + "\n";
		}
		
		for(int l = 1; l < precos.size(); l++) {
			precosstring += "\n  - " + (precos.get(l) * precos.get(0)) + " €";
		}
		
		
		String nomenum = num + nome;
		String nomenum2 = "+";
		for(int m = 0; m < nomenum.length() + 15; m++) {
			nomenum2 += "-";
		}
		
		
		
		return "\n" + nomenum2 + "+\n| Nº[" + num + "] - NOME: " + nome + " |\n" + nomenum2 + "+\n\n\n +--------+\n | Preços |\n +--------+\n" + precosstring + "\n  - Quota: " + quota + "\n\n +-------+\n | Aulas |\n +-------+\n"
				+ aulastring + "\n\n +---------+\n | Membros |\n +---------+\n" + memstring + " +-------+\n | Staff |\n +-------+\n" + staffstring + "\n  Total de Pessoas [" + (membros.size()+staff.size()) + "]\n****************************************\n";
	}									

	public static void setUltimo(int ult) {
		ultimo = ult;
	}

	public void addPax(Staff mem) {
		totalpax.add(mem);
	}
	
	public void addAula(Aula a) {
		aulas.add(a);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ginasio other = (Ginasio) obj;
		return Objects.equals(aulas, other.aulas) && Objects.equals(membros, other.membros)
				&& Objects.equals(nome, other.nome) && num == other.num && Objects.equals(precos, other.precos)
				&& Objects.equals(quota, other.quota) && Objects.equals(staff, other.staff)
				&& Objects.equals(totalpax, other.totalpax);
	}
	
	
}

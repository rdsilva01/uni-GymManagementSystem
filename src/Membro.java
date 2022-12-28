
import java.io.Serializable;
import java.util.ArrayList;

public class Membro extends Pessoa implements Serializable{
	private int num_membro;
	private ArrayList<Aula> aulas;
	private double preco;
	private double quota_mem;
	
	public Membro(Pessoa p) {
		super(p.getP_nome(), p.getU_nome(), p.getNif(), p.getDataNasc().getDayOfMonth(), p.getDataNasc().getMonthValue(), p.getDataNasc().getYear(), p.getAltura(), p.getPeso(), p.getSexo(), p.getProfissao()); // String p_nome, String u_nome,int nif, int dia, int mes, int ano, float altura, float peso
		num_membro = 0;
		preco = 0.0;
		quota_mem = 0.0;
		aulas = new ArrayList<Aula>();
	}

	public int getNum_membro() {
		return num_membro;
	}

	public void setNum_membro(int num_membro) {
		this.num_membro = num_membro;
	}

	public ArrayList<Aula> getAulas() {
		return aulas;
	}

	public void setAulas(ArrayList<Aula> aulas) {
		this.aulas = (ArrayList<Aula>) aulas.clone();
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getQuota_mem() {
		return quota_mem;
	}

	public void setQuota_mem(double quota_mem) {
		this.quota_mem = quota_mem;
	}
	
	public void addAula(Aula a) {
		aulas.add(a);
	}
	
	public void removeAula(Aula a) {
		aulas.remove(a);
	}

	@Override
	public String toString() {
		return "  Nº[" + num_membro + "]\n" + super.toString() + "\n  Aulas: " + aulas + "\n  Preço: " + preco + " €\n  Quota: " + quota_mem +" €\n\n";
	}
	
	// equals
	
	// clone

}

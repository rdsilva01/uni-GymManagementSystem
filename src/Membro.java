
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

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
	
	public void removeAula(int num) {
		for(int i = 0; i < aulas.size(); i++) {
			if(aulas.get(i).getCodigo() == num) {
				aulas.remove(i);
			}
		}
	}

	@Override
	public String toString() {
		return "  Nº[" + num_membro + "]\n" + super.toString() + "\n  Aulas: " + aulas + "\n  Preço: " + preco + " €\n  Quota: " + quota_mem +" €\n\n";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Membro other = (Membro) obj;
		return Objects.equals(aulas, other.aulas) && num_membro == other.num_membro
				&& Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco)
				&& Double.doubleToLongBits(quota_mem) == Double.doubleToLongBits(other.quota_mem);
	}
	
}

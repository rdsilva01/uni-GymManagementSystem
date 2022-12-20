import java.util.ArrayList;

public class Membro extends Pessoa{
	private static int ultimo = 0;
	private int num_membro;
	private ArrayList<Aula> aulas;
	private double preco;
	private double quota_mem;
	
	public Membro(Pessoa p) {
		super(p.getP_nome(), p.getU_nome(), p.getNif(), p.getDataNasc().getDayOfMonth(), p.getDataNasc().getMonthValue(), p.getDataNasc().getYear(), p.getAltura(), p.getPeso()); // String p_nome, String u_nome,int nif, int dia, int mes, int ano, float altura, float peso
		ultimo++;
		num_membro = ultimo;
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
		this.aulas = aulas;
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

	@Override
	public String toString() {
		return "Membro [num_membro=" + num_membro + ", aulas=" + aulas + ", preco=" + preco + ", quota_mem=" + quota_mem
				+ "]";
	}
	
	
}

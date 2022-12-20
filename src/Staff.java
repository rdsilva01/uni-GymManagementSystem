
public class Staff extends Pessoa{
	private String tipo;
	private int escalao;
	
	public Staff(Pessoa p, String tipo) {
		super(p.getP_nome(), p.getU_nome(), p.getNif(), p.getDataNasc().getDayOfMonth(), p.getDataNasc().getMonthValue(), p.getDataNasc().getYear(), p.getAltura(), p.getPeso());
		escalao = 1;
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getEscalao() {
		return escalao;
	}

	public void setEscalao(int escalao) {
		this.escalao = escalao;
	}
	
	@Override
	public String toString() {
		return "Staff [tipo=" + tipo + ", escalao=" + escalao + "]";
	}
}

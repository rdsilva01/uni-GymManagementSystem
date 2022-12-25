import java.io.Serializable;

public class Staff extends Pessoa implements Serializable{
	private String tipo;
	private int escalao;
	private int num_staff;
	
	public Staff(Pessoa p, String tipo) {
		super(p.getP_nome(), p.getU_nome(), p.getNif(), p.getDataNasc().getDayOfMonth(), p.getDataNasc().getMonthValue(), p.getDataNasc().getYear(), p.getAltura(), p.getPeso(), p.getSexo());
		escalao = 1;
		this.tipo = tipo;
		num_staff = 0;
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
	
	public int getNum_staff() {
		return num_staff;
	}

	public void setNum_staff(int num_staff) {
		this.num_staff = num_staff;
	}

	@Override
	public String toString() {
		return "Nº [" + num_staff + "]" +  super.toString() + "\nTipo: " + tipo + " com Escalão [" + escalao + "]\n";
	}
	
	// equals
	
	// clone
}

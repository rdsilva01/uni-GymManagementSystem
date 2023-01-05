import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Staff extends Pessoa implements Serializable{
	private String tipo;
	private int escalao;
	private int num_staff;
	private ArrayList<Aula> instaula;
	
	public Staff(Pessoa p, String tipo) {
		super(p.getP_nome(), p.getU_nome(), p.getNif(), p.getDataNasc().getDayOfMonth(), p.getDataNasc().getMonthValue(), p.getDataNasc().getYear(), p.getAltura(), p.getPeso(), p.getSexo(), p.getProfissao());
		escalao = 1;
		this.tipo = tipo;
		num_staff = 0;
		instaula = new ArrayList<Aula>();
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
		return "  Nº [" + num_staff + "]\n" +  super.toString() + "\n  Tipo: " + tipo + " com Escalão [" + escalao + "]\n";
	}

	public ArrayList<Aula> getInstaula() {
		return instaula;
	}

	public void setInstaula(ArrayList<Aula> instaula) {
		this.instaula =(ArrayList<Aula>) instaula.clone();
	}
	
	public void addAula(Aula a) {
		instaula.add(a);
	}
	
	public void removeAula(int num) {
		for(int i = 0; i < instaula.size(); i++) {
			if(instaula.get(i).getCodigo() == num) {
				instaula.remove(i);
			}
		}
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Staff other = (Staff) obj;
		return escalao == other.escalao && Objects.equals(instaula, other.instaula) && num_staff == other.num_staff
				&& Objects.equals(tipo, other.tipo);
	}

	
}

import java.io.Serializable;
import java.util.ArrayList;

public class Aula implements Serializable{
	private int hora;
	private int minuto;
	private String nome;
	private int numpaxmax;
	private ArrayList<Membro> inscritos;
	private String dds;
	private int codigo;
	
	public Aula(int codigo, int hora, int minuto, String nome, String dds, int numpaxmax) {
		this.hora = hora;
		this.minuto = minuto;
		this.nome = nome;
		this.dds = dds;
		inscritos = new ArrayList<Membro>();
		this.numpaxmax = numpaxmax;
		this.codigo = codigo;
		
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumpaxmax() {
		return numpaxmax;
	}

	public void setNumpaxmax(int numpaxmax) {
		this.numpaxmax = numpaxmax;
	}

	public ArrayList<Membro> getInscritos() {
		return inscritos;
	}

	public void setInscritos(ArrayList<Membro> inscritos) {
		this.inscritos = inscritos;
	}
	
	public void addInscritos(Membro mem) {
		inscritos.add(mem);
	}
	
	public void removeInscritos(Membro mem) {
		inscritos.remove(mem);
	}

	@Override
	public String toString() {
		return "CÓDIGO [" + codigo + "] - Aula de " + nome + "\nHorário: " + dds + " às " + hora + "h" + minuto + "min\nVagas disponíveis: [" + (numpaxmax - inscritos.size()) + "]";
	}

	public String getDds() {
		return dds;
	}

	public void setDds(String dds) {
		this.dds = dds;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	// equals
	
	// clone

}

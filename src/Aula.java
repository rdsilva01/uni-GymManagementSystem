import java.io.Serializable;
import java.util.ArrayList;

public class Aula implements Serializable{
	private int hora;
	private int minuto;
	private String nome;
	private int numpaxmax;
	private ArrayList<Membro> inscritos;
	private ArrayList<Staff> instrutor;
	private String dds;
	private int codigo;
	
	public Aula(int codigo, int hora, int minuto, String nome, String dds, int numpaxmax) {
		this.hora = hora;
		this.minuto = minuto;
		this.nome = nome;
		this.dds = dds;
		inscritos = new ArrayList<Membro>();
		instrutor = new ArrayList<Staff>();
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
		String instruct = "";
		try {
			for(int i = 0; i < instrutor.size(); i++) {
				instruct += "\n[" + instrutor.get(i).getNum_staff() + "] " + instrutor.get(i).getP_nome() + " " + instrutor.get(i).getU_nome();
			}
		}
		catch(NullPointerException n) {
			instruct = " SEM INSTRUTOR";
		}
		
		return "  CÓDIGO [" + codigo + "] - Aula de " + nome + "\n  Horário: " + dds + " às " + hora + "h" + minuto + "min\n  Instrutor(es):" + instruct + "\n  Vagas disponíveis: [" + (numpaxmax - inscritos.size()) + "]";
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

	public ArrayList<Staff> getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(ArrayList<Staff> instrutor) {
		this.instrutor = (ArrayList<Staff>) instrutor.clone();
	}
	
	public void addInstrutor(Staff instruct) {
		instrutor.add(instruct);
	}
	
	
	
	
	
	// equals
	
	// clone

}

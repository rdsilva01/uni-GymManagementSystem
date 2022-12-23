
public class Aula {
	private int hora;
	private int minuto;
	private String nome;
	private String numpaxmax;
	
	public Aula(int hora, int minuto, String nome) {
		this.hora = hora;
		this.minuto = minuto;
		this.nome = nome;
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

	public String getNumpaxmax() {
		return numpaxmax;
	}

	public void setNumpaxmax(String numpaxmax) {
		this.numpaxmax = numpaxmax;
	}

	@Override
	public String toString() {
		return "Aula [horario= " + hora + ": " + minuto + ", nome=" + nome + ", numpaxmax=" + numpaxmax + "]";
	}
	
	// equals
	
	// clone

}

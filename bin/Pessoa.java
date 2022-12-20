import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
	private String p_nome; // primeiro nome
	private String u_nome; // último nome
	private int nif; // nº de identificação fiscal
	private String profissao; // profissão
	private LocalDate data_nasc; // data de nascimento
	private float altura;
	private float peso;
	
	public Pessoa(String p_nome, String u_nome,int nif, int dia, int mes, int ano, float altura, float peso) {
		this.p_nome = p_nome;
		this.u_nome = u_nome;
		this.nif = nif;
		profissao = "";
		data_nasc = LocalDate.of(ano, mes, dia);
		this.altura = altura;
		this.peso = peso;
	}
	
	public String getP_nome() {
		return p_nome;
	}
	
	public String getU_nome() {
		return u_nome;
	}
	
	public int getNif() {
		return nif;
	}
	
	public LocalDate getDataNasc() {
		return data_nasc;
	}
	
	
	public String getProfissao() {
		return profissao;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public void setP_nome(String p_nome) {
		this.p_nome = p_nome;
	}
	
	public void setU_nome(String u_nome) {
		this.u_nome = u_nome;
	}
	
	public void setNif(int nif) {
		this.nif = nif;
	}
	
	public void setDataNasc(int ano, int mes, int dia) {
		data_nasc = LocalDate.of(ano, mes, dia);
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
		
		return "Primeiro nome: " + p_nome + "; Último nome: " + u_nome + "; NIF: " + nif + "; Profissão: " + profissao + "; Data de nascimento: " + (data_nasc.format(formatter)) + "; Altura: " + altura + "; Peso: " + peso;
	}
	
	// equals
	
	// clone
	
	
	
}

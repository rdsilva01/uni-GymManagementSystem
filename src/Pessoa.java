import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa implements Serializable{
	private String p_nome; // primeiro nome
	private String u_nome; // último nome
	private int nif; // nº de identificação fiscal
	private String profissao; // profissão
	private LocalDate data_nasc; // data de nascimento
	private int altura; // altura em cm
	private double peso; // peso em kg
	private char sexo;
	
	public Pessoa(String p_nome, String u_nome,int nif, int dia, int mes, int ano, int altura, double peso, char sexo) {
		this.p_nome = p_nome;
		this.u_nome = u_nome;
		this.nif = nif;
		profissao = "";
		data_nasc = LocalDate.of(ano, mes, dia);
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
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
	
	public int getAltura() {
		return altura;
	}
	
	public double getPeso() {
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
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		return "Primeiro nome: " + p_nome + "\nÚltimo nome: " + u_nome + "\nNIF: " + nif + "\nProfissão: " + profissao + "\nData de nascimento: " + (data_nasc.format(formatter)) + "\nAltura: " + altura + "\nPeso: " + peso;
	}
	
	// equals
	
	// clone
	
	
	
}

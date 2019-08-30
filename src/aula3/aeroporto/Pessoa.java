package aula3.aeroporto;

public class Pessoa {
	
	private String nome;
	
	private String dtNasc;
	
	private String rg;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void falar() {
		System.out.println("Olá!");
	}
	
}

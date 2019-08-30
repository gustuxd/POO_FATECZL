package aula3.aeroporto;

public class Piloto extends Pessoa {
	
	private String licenca;
	
	private String dtContratacao;
	
	public Piloto(String nome) {
		setNome(nome);
	}

	public String getLicenca() {
		return licenca;
	}

	public void setLicenca(String licenca) {
		this.licenca = licenca;
	}

	public String getDtContratacao() {
		return dtContratacao;
	}

	public void setDtContratacao(String dtContratacao) {
		this.dtContratacao = dtContratacao;
	}

	@Override
	public void falar() {
		System.out.println(getNome() + " diz: Estamos entrando numa turbulência!");
	}
	
}

package aula3.aeroporto;

import java.util.List;

public class Aeronave {
	
	private String modelo;
	
	private String anoFabric;
	
	private String dtUltManut;
	
	private List<Pessoa> tripulacao;
	
	private Pessoa piloto;
	
	public void decolar() {
		System.out.println("*** Aeronave decolando ***");
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnoFabric() {
		return anoFabric;
	}

	public void setAnoFabric(String anoFabric) {
		this.anoFabric = anoFabric;
	}

	public String getDtUltManut() {
		return dtUltManut;
	}

	public void setDtUltManut(String dtUltManut) {
		this.dtUltManut = dtUltManut;
	}

	public List<Pessoa> getTripulacao() {
		return tripulacao;
	}

	public void setTripulacao(List<Pessoa> tripulacao) {
		this.tripulacao = tripulacao;
	}

	public Pessoa getPiloto() {
		return piloto;
	}

	public void setPiloto(Pessoa piloto) {
		this.piloto = piloto;
	}

}

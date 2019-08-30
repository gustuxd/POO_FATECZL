package aula3.aeroporto;

public class Passageiro extends Pessoa {

	private int assento;
	
	private String passaporte;
	
	private String ticket;
	
	public Passageiro(String nome) {
		this.setNome(nome);
	}
	
	public int getAssento() {
		return assento;
	}

	public void setAssento(int assento) {
		this.assento = assento;
	}

	public String getPassaporte() {
		return passaporte;
	}
	
	public String getTicket() {
		return ticket;
	}
	
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public void setPassaporte(String passaporte) {
		this.passaporte = passaporte;
	}

	@Override
	public void falar() {
		System.out.println(getNome() + " diz: A gente já chegou?");
	}
	
}

package aula3.aeroporto;

import java.util.List;
import java.util.ArrayList;

public class Aeroporto {
	
	public static void main(String[] args) {
		
		Aeronave aeronave = new Aeronave();
		
		int qtdTripulacao = 9;
		
		List<Pessoa> tripulacao = getTripulacao(qtdTripulacao);
		
		Piloto piloto = new Piloto("Piloto Joaquim");
		
		aeronave.setPiloto(piloto);
		aeronave.setTripulacao(tripulacao);
		
		aeronave.decolar();
		
		wait(2000);
		
		aeronave.getTripulacao().get(getPassageiroRandom(qtdTripulacao)).falar();

		wait(2000);
		
		piloto.falar();
		
		wait(2000);

		aeronave.getTripulacao().get(getPassageiroRandom(qtdTripulacao)).falar();
		
	}
	
	public static List<Pessoa> getTripulacao(int qtd) {
		List<Pessoa> tripulacao = new ArrayList<Pessoa>();
		
		for(int i = 0; i < qtd; i++)
			tripulacao.add(new Passageiro("Passageiro " + (i + 1)));
		
		return tripulacao;
	}
	
	public static int getPassageiroRandom(int qtdTripulacao) {
		return (int) (Math.random() * qtdTripulacao);
	}
	
	public static void wait(int tempoMilis) {
		try {
			Thread.sleep(tempoMilis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

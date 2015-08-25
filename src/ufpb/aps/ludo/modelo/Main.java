package ufpb.aps.ludo.modelo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Casa inicio = new Casa("inicio");
		Casa c1 = new Casa("c1");
		Casa c2 = new Casa("c2");
		Casa c3 = new Casa("c3");
		Casa c4 = new Casa("c4");
		Casa c5 = new Casa("C5");
		Casa fim = new Casa("fim");
		
		 
		inicio.setAnterior(null); // anteriores
		c1.setAnterior(inicio);
		c2.setAnterior(c1);
		c3.setAnterior(c2);
		c4.setAnterior(c3);
		c5.setAnterior(c4);
		fim.setAnterior(c5);
		
		
		inicio.setAcao(new AcaoSimples(c1)); //set acao (proximos)
		
		c1.setAcao(new AcaoSimples(c2));
		
		c2.setAcao(new AcaoSimples(c3));
		
		ArrayList<Casa> proximos = new ArrayList<Casa>();
		proximos.add(c4);
		proximos.add(c5);
		c3.setAcao(new AcaoDirecao(proximos));

		c4.setAcao(new AcaoSimples(c5));
		
		fim.setAcao(new AcaoSimples(null));
		
		
		
		
		
	}
}

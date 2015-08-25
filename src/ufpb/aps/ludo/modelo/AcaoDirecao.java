package ufpb.aps.ludo.modelo;

import java.util.ArrayList;

public class AcaoDirecao implements Acao{
	
	private ArrayList<Casa> proximos;
	
	public AcaoDirecao(ArrayList<Casa> proximos){
		this.proximos = proximos;
	}

	@Override
	public ResultadoAcao executar(int dado, Jogador jogador) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

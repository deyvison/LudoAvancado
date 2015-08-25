package ufpb.aps.ludo.modelo;

public class AcaoSimples implements Acao {
	
	private Casa proximo;
	
	
	public AcaoSimples(Casa proximo){
		this.proximo = proximo;
	}
	@Override
	public ResultadoAcao executar(int dado, Jogador jogador) {
		// TODO Auto-generated method stub
		return null;
	}

}

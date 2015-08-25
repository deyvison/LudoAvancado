package ufpb.aps.ludo.modelo;

public class Casa {
	
	private String id;
	private Casa anterior;
	private Acao acao;
	
	
	public Casa(String id){
		this.id = id;
		this.anterior = null;
		this.acao = null;
	}


	public void setAnterior(Casa casa) {
		
		this.anterior = casa;
		
	}


	public void setAcao(Acao acao) {
		this.acao = acao;
	}
	
}

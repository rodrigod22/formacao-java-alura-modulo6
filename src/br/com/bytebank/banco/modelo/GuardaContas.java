package br.com.bytebank.banco.modelo;

public class GuardaContas {

	private Conta[] referencias;
	private int posicaoLivre;
	
	
	public GuardaContas() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}

	public void adiciona(Conta conta) {
		this.referencias[this.posicaoLivre] = conta;
		this.posicaoLivre++;
	}

	public int getTamanho() {		
		return posicaoLivre;
	}

	public Conta getReferencia(int pos) {		
		return referencias[pos];
	}
	
	
}

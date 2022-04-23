package br.com.healthtrack;

public class ContaPremium extends Usuario{
	protected int nrCartao;
	protected int pinCartao;
	
	public int getNrCartao() {
		return nrCartao;
	}
	public void setNrCartao(int nrCartao) {
		this.nrCartao = nrCartao;
	}
	public int getPinCartao() {
		return pinCartao;
	}
	public void setPinCartao(int pinCartao) {
		this.pinCartao = pinCartao;
	}

}

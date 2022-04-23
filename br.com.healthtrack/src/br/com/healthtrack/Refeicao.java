package br.com.healthtrack;

/* A classe Refeicao armazena as informações do tipo de refeicao, quantidade de kcal e data de refeição
 */

public class Refeicao {
	private String tipoRefeicao;
	private int qtdCalorias;
	private String dataRefeicao;
	private int qtdKcalDiarias;
	
	public String getTipoRefeicao() {
		return tipoRefeicao;
	}
	public void setTipoRefeicao(String tipoRefeicao) {
		this.tipoRefeicao = tipoRefeicao;
	}
	public int getQtdCalorias() {
		return qtdCalorias;
	}
	public void setQtdCalorias(int qtdCalorias) {
		this.qtdCalorias = qtdCalorias;
	}
	public String getDataRefeicao() {
		return dataRefeicao;
	}
	public void setDataRefeicao(String dataRefeicao) {
		this.dataRefeicao = dataRefeicao;
	}
	public int getQtdKcalDiarias() {
		return qtdKcalDiarias;
	}
	public void setQtdKcalDiarias(int qtdKcalDiarias) {
		this.qtdKcalDiarias = qtdKcalDiarias;
	}
	protected void somarKcalDiarias() {
		if (dataRefeicao == dataRefeicao)qtdKcalDiarias = qtdCalorias ++;
	}
	

}

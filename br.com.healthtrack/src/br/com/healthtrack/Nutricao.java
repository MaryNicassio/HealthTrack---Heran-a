package br.com.healthtrack;

/*  A classe Nutricao armazena as informa��es de dieta e refei��es al�m das kcal */

public class Nutricao {
	private String dieta;
	Refeicao tiporefeicao = new Refeicao();
	Usuario usuarioUm = new Usuario();

	public String getDieta() {
		return dieta;
	}

	public void setDieta(String dieta) {
		this.dieta = dieta;
	}

	public Refeicao getTiporefeicao() {
		return tiporefeicao;
	}

	public void setTiporefeicao(Refeicao tiporefeicao) {
		this.tiporefeicao = tiporefeicao;
	}
/* O met�do adicionarDietas() recebe a informa��o de dieta escolhida e devolve a informa��o
	 */
	public void adicionarDietas(String dieta) {
		System.out.println("Foi adicionado a dieta " + dieta);
	}
	

}

package br.com.healthtrack;

/* A classe peso armazena as informa??es de descri??o do peso, quilos perdidos, total dos quilos perdidos e a data
 */

public class Medidas {
	private float peso;
	private float novoPeso;
	private float totalQuilosPerdidos;
	private String dataPesagem;
	private float altura;
	private float imc;
	Usuario usuarioUm = new Usuario();
	
	public float getImc() {
		return imc;
	}
	public void setImc(float imc) {
		this.imc = imc;
	}
	public Usuario getUsuarioUm() {
		return usuarioUm;
	}
	public void setUsuarioUm(Usuario usuarioUm) {
		this.usuarioUm = usuarioUm;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getNovoPeso() {
		return novoPeso;
	}
	public void setNovoPeso(float novoPeso) {
		this.novoPeso = novoPeso;
	}
	public float getTotalQuilosPerdidos() {
		return totalQuilosPerdidos;
	}
	public void setTotalQuilosPerdidos(float totalQuilosPerdidos) {
		this.totalQuilosPerdidos = totalQuilosPerdidos;
	}
	public String getDataPesagem() {
		return dataPesagem;
	}
	public void setDataPesagem(String dataPesagem) {
		this.dataPesagem = dataPesagem;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	/* O met?do CalcularPeso() recebe os dados de descricaoPeso, quilosPerdidos e calcula o total de quilos perdidos na vari?vel totalQuilosPerdidos
	 */
		public void calcularPeso(float peso, float novoPeso,float totalQuilosPerdidos, float setTotalQuilosPerdidos) {
		    float y = peso - novoPeso;
		    setTotalQuilosPerdidos(y);
			if (totalQuilosPerdidos < 0) {
			System.out.println("Voce Ganhou " + getTotalQuilosPerdidos() + " Kg");}
			else if (totalQuilosPerdidos == 0) {
			System.out.println("Voce N?o perdeu nem ganhou quilos");}
			if (totalQuilosPerdidos > 0) {
			System.out.println("Voce Perdeu " + getTotalQuilosPerdidos() + " Kg");}
		}
	/*O met?do adicionarDataPeso recebe a informa??o de data do dia*/

		public void adicionarDataPeso(String getDataPesagem) {
			System.out.println("Foi adicionado a data " + getDataPesagem());
		}
	/* Metodo para calculo do IMC */
		
		public void calcularImc (float peso, float altura, float setImc) {
			float t = altura*altura;
			float w = peso/t;
			setImc(w);
			System.out.println("Seu IMC ? " + getImc());
		}

}
